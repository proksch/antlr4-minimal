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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypeNamingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, UNKNOWN=13, POSNUM=14, LETTER=15, SIGN=16, 
		WS=17, EOL=18;
	public static final int
		RULE_typeEOL = 0, RULE_type = 1, RULE_typeParameter = 2, RULE_regularType = 3, 
		RULE_delegateType = 4, RULE_arrayPart = 5, RULE_resolvedType = 6, RULE_namespace = 7, 
		RULE_typeName = 8, RULE_simpleTypeName = 9, RULE_genericTypePart = 10, 
		RULE_genericParam = 11, RULE_assembly = 12, RULE_assemblyVersion = 13, 
		RULE_method = 14, RULE_formalParam = 15, RULE_id = 16, RULE_num = 17;
	public static final String[] ruleNames = {
		"typeEOL", "type", "typeParameter", "regularType", "delegateType", "arrayPart", 
		"resolvedType", "namespace", "typeName", "simpleTypeName", "genericTypePart", 
		"genericParam", "assembly", "assemblyVersion", "method", "formalParam", 
		"id", "num"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'d:'", "'['", "']'", "'+'", "'.'", "'''", "'->'", "'].'", 
		"'('", "')'", "'0'", "'?'", null, null, null, null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "UNKNOWN", "POSNUM", "LETTER", "SIGN", "WS", "EOL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TypeNaming.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TypeNamingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypeEOLContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EOL() { return getToken(TypeNamingParser.EOL, 0); }
		public TypeEOLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeEOL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterTypeEOL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitTypeEOL(this);
		}
	}

	public final TypeEOLContext typeEOL() throws RecognitionException {
		TypeEOLContext _localctx = new TypeEOLContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_typeEOL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			type();
			setState(37);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode UNKNOWN() { return getToken(TypeNamingParser.UNKNOWN, 0); }
		public TypeParameterContext typeParameter() {
			return getRuleContext(TypeParameterContext.class,0);
		}
		public RegularTypeContext regularType() {
			return getRuleContext(RegularTypeContext.class,0);
		}
		public DelegateTypeContext delegateType() {
			return getRuleContext(DelegateTypeContext.class,0);
		}
		public ArrayPartContext arrayPart() {
			return getRuleContext(ArrayPartContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			setState(48);
			switch (_input.LA(1)) {
			case UNKNOWN:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(UNKNOWN);
				}
				break;
			case T__1:
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(40);
					typeParameter();
					}
					break;
				case 2:
					{
					setState(41);
					regularType();
					}
					break;
				case 3:
					{
					setState(42);
					delegateType();
					}
					break;
				}
				setState(46);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(45);
					arrayPart();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularTypeContext extends ParserRuleContext {
		public ResolvedTypeContext resolvedType() {
			return getRuleContext(ResolvedTypeContext.class,0);
		}
		public AssemblyContext assembly() {
			return getRuleContext(AssemblyContext.class,0);
		}
		public TerminalNode WS() { return getToken(TypeNamingParser.WS, 0); }
		public RegularTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterRegularType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitRegularType(this);
		}
	}

	public final RegularTypeContext regularType() throws RecognitionException {
		RegularTypeContext _localctx = new RegularTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_regularType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			resolvedType();
			setState(53);
			match(T__0);
			setState(55);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(54);
				match(WS);
				}
			}

			setState(57);
			assembly();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelegateTypeContext extends ParserRuleContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public DelegateTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegateType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterDelegateType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitDelegateType(this);
		}
	}

	public final DelegateTypeContext delegateType() throws RecognitionException {
		DelegateTypeContext _localctx = new DelegateTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_delegateType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__1);
			setState(60);
			method();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayPartContext extends ParserRuleContext {
		public ArrayPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterArrayPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitArrayPart(this);
		}
	}

	public final ArrayPartContext arrayPart() throws RecognitionException {
		ArrayPartContext _localctx = new ArrayPartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__2);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(63);
				match(T__0);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResolvedTypeContext extends ParserRuleContext {
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public ResolvedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resolvedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterResolvedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitResolvedType(this);
		}
	}

	public final ResolvedTypeContext resolvedType() throws RecognitionException {
		ResolvedTypeContext _localctx = new ResolvedTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_resolvedType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(71);
				namespace();
				}
				break;
			}
			setState(74);
			typeName();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(75);
				match(T__4);
				setState(76);
				typeName();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitNamespace(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_namespace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(82);
					id();
					setState(83);
					match(T__5);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(87); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public GenericTypePartContext genericTypePart() {
			return getRuleContext(GenericTypePartContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			simpleTypeName();
			setState(91);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(90);
				genericTypePart();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitSimpleTypeName(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericTypePartContext extends ParserRuleContext {
		public TerminalNode POSNUM() { return getToken(TypeNamingParser.POSNUM, 0); }
		public List<GenericParamContext> genericParam() {
			return getRuleContexts(GenericParamContext.class);
		}
		public GenericParamContext genericParam(int i) {
			return getRuleContext(GenericParamContext.class,i);
		}
		public GenericTypePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterGenericTypePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitGenericTypePart(this);
		}
	}

	public final GenericTypePartContext genericTypePart() throws RecognitionException {
		GenericTypePartContext _localctx = new GenericTypePartContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_genericTypePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__6);
			setState(96);
			match(POSNUM);
			setState(97);
			match(T__2);
			setState(98);
			genericParam();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(99);
				match(T__0);
				setState(100);
				genericParam();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericParamContext extends ParserRuleContext {
		public TypeParameterContext typeParameter() {
			return getRuleContext(TypeParameterContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TypeNamingParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TypeNamingParser.WS, i);
		}
		public GenericParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterGenericParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitGenericParam(this);
		}
	}

	public final GenericParamContext genericParam() throws RecognitionException {
		GenericParamContext _localctx = new GenericParamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_genericParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__2);
			setState(109);
			typeParameter();
			setState(118);
			_la = _input.LA(1);
			if (_la==T__7 || _la==WS) {
				{
				setState(111);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(110);
					match(WS);
					}
				}

				setState(113);
				match(T__7);
				setState(115);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(114);
					match(WS);
					}
				}

				setState(117);
				type();
				}
			}

			setState(120);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AssemblyVersionContext assemblyVersion() {
			return getRuleContext(AssemblyVersionContext.class,0);
		}
		public TerminalNode WS() { return getToken(TypeNamingParser.WS, 0); }
		public AssemblyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assembly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterAssembly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitAssembly(this);
		}
	}

	public final AssemblyContext assembly() throws RecognitionException {
		AssemblyContext _localctx = new AssemblyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assembly);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			id();
			setState(128);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(123);
				match(T__0);
				setState(125);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(124);
					match(WS);
					}
				}

				setState(127);
				assemblyVersion();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyVersionContext extends ParserRuleContext {
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public AssemblyVersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyVersion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterAssemblyVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitAssemblyVersion(this);
		}
	}

	public final AssemblyVersionContext assemblyVersion() throws RecognitionException {
		AssemblyVersionContext _localctx = new AssemblyVersionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assemblyVersion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			num();
			setState(131);
			match(T__5);
			setState(132);
			num();
			setState(133);
			match(T__5);
			setState(134);
			num();
			setState(135);
			match(T__5);
			setState(136);
			num();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TypeNamingParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TypeNamingParser.WS, i);
		}
		public List<FormalParamContext> formalParam() {
			return getRuleContexts(FormalParamContext.class);
		}
		public FormalParamContext formalParam(int i) {
			return getRuleContext(FormalParamContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_method);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__2);
			setState(139);
			type();
			setState(140);
			match(T__3);
			setState(142);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(141);
				match(WS);
				}
			}

			setState(144);
			match(T__2);
			setState(145);
			type();
			setState(146);
			match(T__8);
			setState(147);
			id();
			setState(148);
			match(T__9);
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(149);
				match(WS);
				}
				break;
			}
			setState(166);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(152);
				formalParam();
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(154);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(153);
							match(WS);
							}
						}

						setState(156);
						match(T__0);
						setState(158);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(157);
							match(WS);
							}
						}

						setState(160);
						formalParam();
						}
						} 
					}
					setState(165);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
			}

			setState(169);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(168);
				match(WS);
				}
			}

			setState(171);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode WS() { return getToken(TypeNamingParser.WS, 0); }
		public FormalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterFormalParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitFormalParam(this);
		}
	}

	public final FormalParamContext formalParam() throws RecognitionException {
		FormalParamContext _localctx = new FormalParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_formalParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__2);
			setState(174);
			type();
			setState(175);
			match(T__3);
			setState(177);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(176);
				match(WS);
				}
			}

			setState(179);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(TypeNamingParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(TypeNamingParser.LETTER, i);
		}
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public List<TerminalNode> SIGN() { return getTokens(TypeNamingParser.SIGN); }
		public TerminalNode SIGN(int i) {
			return getToken(TypeNamingParser.SIGN, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(LETTER);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << POSNUM) | (1L << LETTER) | (1L << SIGN))) != 0)) {
				{
				setState(185);
				switch (_input.LA(1)) {
				case LETTER:
					{
					setState(182);
					match(LETTER);
					}
					break;
				case T__11:
				case POSNUM:
					{
					setState(183);
					num();
					}
					break;
				case SIGN:
					{
					setState(184);
					match(SIGN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumContext extends ParserRuleContext {
		public TerminalNode POSNUM() { return getToken(TypeNamingParser.POSNUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeNamingListener ) ((TypeNamingListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==POSNUM) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24\u00c3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\5\3\61\n\3\5\3\63"+
		"\n\3\3\4\3\4\3\5\3\5\3\5\5\5:\n\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\7\7C\n\7"+
		"\f\7\16\7F\13\7\3\7\3\7\3\b\5\bK\n\b\3\b\3\b\3\b\7\bP\n\b\f\b\16\bS\13"+
		"\b\3\t\3\t\3\t\6\tX\n\t\r\t\16\tY\3\n\3\n\5\n^\n\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\7\fh\n\f\f\f\16\fk\13\f\3\f\3\f\3\r\3\r\3\r\5\rr\n\r\3"+
		"\r\3\r\5\rv\n\r\3\r\5\ry\n\r\3\r\3\r\3\16\3\16\3\16\5\16\u0080\n\16\3"+
		"\16\5\16\u0083\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\5\20\u0091\n\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0099\n"+
		"\20\3\20\3\20\5\20\u009d\n\20\3\20\3\20\5\20\u00a1\n\20\3\20\7\20\u00a4"+
		"\n\20\f\20\16\20\u00a7\13\20\5\20\u00a9\n\20\3\20\5\20\u00ac\n\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\5\21\u00b4\n\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\7\22\u00bc\n\22\f\22\16\22\u00bf\13\22\3\23\3\23\3\23\2\2\24\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3\4\2\16\16\20\20\u00cb\2&\3\2\2"+
		"\2\4\62\3\2\2\2\6\64\3\2\2\2\b\66\3\2\2\2\n=\3\2\2\2\f@\3\2\2\2\16J\3"+
		"\2\2\2\20W\3\2\2\2\22[\3\2\2\2\24_\3\2\2\2\26a\3\2\2\2\30n\3\2\2\2\32"+
		"|\3\2\2\2\34\u0084\3\2\2\2\36\u008c\3\2\2\2 \u00af\3\2\2\2\"\u00b7\3\2"+
		"\2\2$\u00c0\3\2\2\2&\'\5\4\3\2\'(\7\24\2\2(\3\3\2\2\2)\63\7\17\2\2*.\5"+
		"\6\4\2+.\5\b\5\2,.\5\n\6\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\60\3\2\2\2/"+
		"\61\5\f\7\2\60/\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62)\3\2\2\2\62-\3"+
		"\2\2\2\63\5\3\2\2\2\64\65\5\"\22\2\65\7\3\2\2\2\66\67\5\16\b\2\679\7\3"+
		"\2\28:\7\23\2\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\5\32\16\2<\t\3\2\2\2="+
		">\7\4\2\2>?\5\36\20\2?\13\3\2\2\2@D\7\5\2\2AC\7\3\2\2BA\3\2\2\2CF\3\2"+
		"\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\6\2\2H\r\3\2\2\2IK\5"+
		"\20\t\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LQ\5\22\n\2MN\7\7\2\2NP\5\22\n\2"+
		"OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\17\3\2\2\2SQ\3\2\2\2TU\5\"\22"+
		"\2UV\7\b\2\2VX\3\2\2\2WT\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\21\3\2"+
		"\2\2[]\5\24\13\2\\^\5\26\f\2]\\\3\2\2\2]^\3\2\2\2^\23\3\2\2\2_`\5\"\22"+
		"\2`\25\3\2\2\2ab\7\t\2\2bc\7\20\2\2cd\7\5\2\2di\5\30\r\2ef\7\3\2\2fh\5"+
		"\30\r\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm"+
		"\7\6\2\2m\27\3\2\2\2no\7\5\2\2ox\5\6\4\2pr\7\23\2\2qp\3\2\2\2qr\3\2\2"+
		"\2rs\3\2\2\2su\7\n\2\2tv\7\23\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wy\5\4"+
		"\3\2xq\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\6\2\2{\31\3\2\2\2|\u0082\5\"\22"+
		"\2}\177\7\3\2\2~\u0080\7\23\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0083\5\34\17\2\u0082}\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\33\3\2\2\2\u0084\u0085\5$\23\2\u0085\u0086\7\b\2\2\u0086\u0087\5$\23"+
		"\2\u0087\u0088\7\b\2\2\u0088\u0089\5$\23\2\u0089\u008a\7\b\2\2\u008a\u008b"+
		"\5$\23\2\u008b\35\3\2\2\2\u008c\u008d\7\5\2\2\u008d\u008e\5\4\3\2\u008e"+
		"\u0090\7\6\2\2\u008f\u0091\7\23\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\5\2\2\u0093\u0094\5\4\3\2\u0094"+
		"\u0095\7\13\2\2\u0095\u0096\5\"\22\2\u0096\u0098\7\f\2\2\u0097\u0099\7"+
		"\23\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a8\3\2\2\2\u009a"+
		"\u00a5\5 \21\2\u009b\u009d\7\23\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\7\3\2\2\u009f\u00a1\7\23\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\5 "+
		"\21\2\u00a3\u009c\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u009a\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\7\23\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\r"+
		"\2\2\u00ae\37\3\2\2\2\u00af\u00b0\7\5\2\2\u00b0\u00b1\5\4\3\2\u00b1\u00b3"+
		"\7\6\2\2\u00b2\u00b4\7\23\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\u00b6\5\"\22\2\u00b6!\3\2\2\2\u00b7\u00bd\7"+
		"\21\2\2\u00b8\u00bc\7\21\2\2\u00b9\u00bc\5$\23\2\u00ba\u00bc\7\22\2\2"+
		"\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be#\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c1\t\2\2\2\u00c1%\3\2\2\2\33-\60\629DJQY]iqux"+
		"\177\u0082\u0090\u0098\u009c\u00a0\u00a5\u00a8\u00ab\u00b3\u00bb\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}