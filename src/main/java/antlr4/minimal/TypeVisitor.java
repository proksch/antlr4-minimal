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

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr4.minimal.generated.TypeNamingListener;
import antlr4.minimal.generated.TypeNamingParser.ArrayPartContext;
import antlr4.minimal.generated.TypeNamingParser.AssemblyContext;
import antlr4.minimal.generated.TypeNamingParser.AssemblyVersionContext;
import antlr4.minimal.generated.TypeNamingParser.DelegateTypeContext;
import antlr4.minimal.generated.TypeNamingParser.FormalParamContext;
import antlr4.minimal.generated.TypeNamingParser.GenericParamContext;
import antlr4.minimal.generated.TypeNamingParser.GenericTypePartContext;
import antlr4.minimal.generated.TypeNamingParser.IdContext;
import antlr4.minimal.generated.TypeNamingParser.MethodContext;
import antlr4.minimal.generated.TypeNamingParser.NamespaceContext;
import antlr4.minimal.generated.TypeNamingParser.NumContext;
import antlr4.minimal.generated.TypeNamingParser.RegularTypeContext;
import antlr4.minimal.generated.TypeNamingParser.ResolvedTypeContext;
import antlr4.minimal.generated.TypeNamingParser.SimpleTypeNameContext;
import antlr4.minimal.generated.TypeNamingParser.TypeContext;
import antlr4.minimal.generated.TypeNamingParser.TypeEOLContext;
import antlr4.minimal.generated.TypeNamingParser.TypeNameContext;
import antlr4.minimal.generated.TypeNamingParser.TypeParameterContext;

public class TypeVisitor implements TypeNamingListener {

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterTypeEOL(TypeEOLContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTypeEOL(TypeEOLContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterType(TypeContext ctx) {
        String text = ctx.getText();

        TerminalNode unknown = ctx.UNKNOWN();
        TypeParameterContext typeParameter = ctx.typeParameter();
        RegularTypeContext regularType = ctx.regularType();
        if(regularType != null) {
            AssemblyContext assembly = regularType.assembly();
            String asmtxt = assembly.getText();
            System.out.println();
        }
        DelegateTypeContext delegateType = ctx.delegateType();
        if (delegateType != null) {
            MethodContext method = delegateType.method();
            TypeContext t0 = method.type(0);
            TypeContext t1 = method.type(1);
        }

        ArrayPartContext ap = ctx.arrayPart();

        System.out.println();
    }

    @Override
    public void exitType(TypeContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterTypeParameter(TypeParameterContext ctx) {
        // System.out.printf("TypeParameter: '%s'\n", ctx.getText());
    }

    @Override
    public void exitTypeParameter(TypeParameterContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterRegularType(RegularTypeContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitRegularType(RegularTypeContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterDelegateType(DelegateTypeContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitDelegateType(DelegateTypeContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterArrayPart(ArrayPartContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitArrayPart(ArrayPartContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterResolvedType(ResolvedTypeContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitResolvedType(ResolvedTypeContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterNamespace(NamespaceContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitNamespace(NamespaceContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterTypeName(TypeNameContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTypeName(TypeNameContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterSimpleTypeName(SimpleTypeNameContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitSimpleTypeName(SimpleTypeNameContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterGenericTypePart(GenericTypePartContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitGenericTypePart(GenericTypePartContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterGenericParam(GenericParamContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitGenericParam(GenericParamContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterAssembly(AssemblyContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitAssembly(AssemblyContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterAssemblyVersion(AssemblyVersionContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitAssemblyVersion(AssemblyVersionContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterMethod(MethodContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitMethod(MethodContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterFormalParam(FormalParamContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitFormalParam(FormalParamContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterId(IdContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitId(IdContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterNum(NumContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitNum(NumContext ctx) {
        // TODO Auto-generated method stub

    }

}
