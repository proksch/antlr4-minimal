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
import org.antlr.v4.runtime.CommonTokenStream;

import antlr4.minimal.generated.HelloWorldLexer;
import antlr4.minimal.generated.HelloWorldParser;

public class Validation {

    public boolean parse(String input) {
        ANTLRInputStream is = new ANTLRInputStream(input);
        HelloWorldLexer lexer = new HelloWorldLexer(is);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HelloWorldParser parser = new HelloWorldParser(tokens);

        // try to parse (required!)
        parser.expression();

        return parser.getNumberOfSyntaxErrors() == 0;
    }
}