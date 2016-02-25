/**
 * Copyright 2016 Sebastian Proksch
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package antlr4.minimal;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import antlr4.minimal.generated.TypeNamingLexer;
import antlr4.minimal.generated.TypeNamingParser;
import antlr4.minimal.generated.TypeNamingParser.TypeEOLContext;

public class TypeValidation {

    public boolean validate(String input) {
        MyErrorListener el = new MyErrorListener();
        ANTLRInputStream is = new ANTLRInputStream(input + "\n");
        TypeNamingLexer lexer = new TypeNamingLexer(is);
        // lexer.removeErrorListeners();
        lexer.addErrorListener(el);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TypeNamingParser parser = new TypeNamingParser(tokens);
        // parser.removeErrorListeners();
        parser.addErrorListener(el);

        // try to parse (required!)
        TypeEOLContext typeEOL = parser.typeEOL();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new TypeVisitor(), typeEOL);
        
        return !el.hasError;
    }

    private static class MyErrorListener extends BaseErrorListener {
        private boolean hasError;

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                String msg, RecognitionException e) {
            hasError = true;
        }
    }
}