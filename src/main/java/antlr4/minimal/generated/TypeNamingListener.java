// Generated from TypeNaming.g4 by ANTLR 4.5.2

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
package antlr4.minimal.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypeNamingParser}.
 */
public interface TypeNamingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#typeEOL}.
	 * @param ctx the parse tree
	 */
	void enterTypeEOL(TypeNamingParser.TypeEOLContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#typeEOL}.
	 * @param ctx the parse tree
	 */
	void exitTypeEOL(TypeNamingParser.TypeEOLContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TypeNamingParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TypeNamingParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(TypeNamingParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(TypeNamingParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#regularType}.
	 * @param ctx the parse tree
	 */
	void enterRegularType(TypeNamingParser.RegularTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#regularType}.
	 * @param ctx the parse tree
	 */
	void exitRegularType(TypeNamingParser.RegularTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#delegateType}.
	 * @param ctx the parse tree
	 */
	void enterDelegateType(TypeNamingParser.DelegateTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#delegateType}.
	 * @param ctx the parse tree
	 */
	void exitDelegateType(TypeNamingParser.DelegateTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#arrayPart}.
	 * @param ctx the parse tree
	 */
	void enterArrayPart(TypeNamingParser.ArrayPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#arrayPart}.
	 * @param ctx the parse tree
	 */
	void exitArrayPart(TypeNamingParser.ArrayPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#resolvedType}.
	 * @param ctx the parse tree
	 */
	void enterResolvedType(TypeNamingParser.ResolvedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#resolvedType}.
	 * @param ctx the parse tree
	 */
	void exitResolvedType(TypeNamingParser.ResolvedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(TypeNamingParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(TypeNamingParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(TypeNamingParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(TypeNamingParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(TypeNamingParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(TypeNamingParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#genericTypePart}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypePart(TypeNamingParser.GenericTypePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#genericTypePart}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypePart(TypeNamingParser.GenericTypePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#genericParam}.
	 * @param ctx the parse tree
	 */
	void enterGenericParam(TypeNamingParser.GenericParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#genericParam}.
	 * @param ctx the parse tree
	 */
	void exitGenericParam(TypeNamingParser.GenericParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterAssembly(TypeNamingParser.AssemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitAssembly(TypeNamingParser.AssemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#assemblyVersion}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyVersion(TypeNamingParser.AssemblyVersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#assemblyVersion}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyVersion(TypeNamingParser.AssemblyVersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(TypeNamingParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(TypeNamingParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void enterFormalParam(TypeNamingParser.FormalParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void exitFormalParam(TypeNamingParser.FormalParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(TypeNamingParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(TypeNamingParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeNamingParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(TypeNamingParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeNamingParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(TypeNamingParser.NumContext ctx);
}