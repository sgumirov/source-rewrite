// Generated from com/gumirov/shamil/renamer/E.g4 by ANTLR 4.7.1

package com.gumirov.shamil.renamer;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, OPEN_CURLY=14, CLOSE_CURLY=15, 
		SQSTR=16, DQSTR=17, Name=18, FileName=19, WS=20, FILTER=21;
	public static final int
		RULE_file = 0, RULE_interfaces1 = 1, RULE_imports1 = 2, RULE_what1 = 3, 
		RULE_wherefrom = 4, RULE_body1 = 5, RULE_def = 6, RULE_anondef = 7, RULE_props = 8, 
		RULE_name1 = 9, RULE_reacttype = 10, RULE_template = 11, RULE_propname = 12, 
		RULE_constR = 13, RULE_body2 = 14, RULE_block = 15, RULE_block2 = 16;
	public static final String[] ruleNames = {
		"file", "interfaces1", "imports1", "what1", "wherefrom", "body1", "def", 
		"anondef", "props", "name1", "reacttype", "template", "propname", "constR", 
		"body2", "block", "block2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'interface '", "'import '", "'from '", "'export '", "'='", "'('", 
		"')'", "'=>'", "':'", "'React.FC'", "'<'", "'>'", "'const '", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "OPEN_CURLY", "CLOSE_CURLY", "SQSTR", "DQSTR", "Name", "FileName", 
		"WS", "FILTER"
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
	public String getGrammarFileName() { return "E.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EParser.EOF, 0); }
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public List<Imports1Context> imports1() {
			return getRuleContexts(Imports1Context.class);
		}
		public Imports1Context imports1(int i) {
			return getRuleContext(Imports1Context.class,i);
		}
		public List<Interfaces1Context> interfaces1() {
			return getRuleContexts(Interfaces1Context.class);
		}
		public Interfaces1Context interfaces1(int i) {
			return getRuleContext(Interfaces1Context.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(EParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(EParser.WS, i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(34);
					def();
					}
					break;
				case T__1:
					{
					setState(35);
					imports1();
					}
					break;
				case T__0:
					{
					setState(36);
					interfaces1();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(40); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(39);
						match(WS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(42); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3))) != 0) );
			setState(48);
			match(EOF);
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

	public static class Interfaces1Context extends ParserRuleContext {
		public Name1Context name1() {
			return getRuleContext(Name1Context.class,0);
		}
		public Body1Context body1() {
			return getRuleContext(Body1Context.class,0);
		}
		public TerminalNode WS() { return getToken(EParser.WS, 0); }
		public Interfaces1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaces1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).enterInterfaces1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).exitInterfaces1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitInterfaces1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interfaces1Context interfaces1() throws RecognitionException {
		Interfaces1Context _localctx = new Interfaces1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_interfaces1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(51);
			name1();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(52);
				match(WS);
				}
			}

			setState(55);
			body1();
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

	public static class Imports1Context extends ParserRuleContext {
		public WherefromContext wherefrom() {
			return getRuleContext(WherefromContext.class,0);
		}
		public What1Context what1() {
			return getRuleContext(What1Context.class,0);
		}
		public Imports1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).enterImports1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).exitImports1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitImports1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Imports1Context imports1() throws RecognitionException {
		Imports1Context _localctx = new Imports1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_imports1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__1);
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CURLY:
			case Name:
				{
				{
				setState(58);
				what1();
				setState(59);
				match(T__2);
				setState(60);
				wherefrom();
				}
				}
				break;
			case SQSTR:
			case DQSTR:
				{
				setState(62);
				wherefrom();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class What1Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(EParser.Name, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WS() { return getToken(EParser.WS, 0); }
		public What1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_what1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).enterWhat1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).exitWhat1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitWhat1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final What1Context what1() throws RecognitionException {
		What1Context _localctx = new What1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_what1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Name:
				{
				setState(65);
				match(Name);
				}
				break;
			case OPEN_CURLY:
				{
				setState(66);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(69);
				match(WS);
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

	public static class WherefromContext extends ParserRuleContext {
		public TerminalNode SQSTR() { return getToken(EParser.SQSTR, 0); }
		public TerminalNode DQSTR() { return getToken(EParser.DQSTR, 0); }
		public WherefromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wherefrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).enterWherefrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).exitWherefrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitWherefrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WherefromContext wherefrom() throws RecognitionException {
		WherefromContext _localctx = new WherefromContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_wherefrom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !(_la==SQSTR || _la==DQSTR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Body1Context extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Body1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).enterBody1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).exitBody1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitBody1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body1Context body1() throws RecognitionException {
		Body1Context _localctx = new Body1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_body1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			block();
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

	public static class DefContext extends ParserRuleContext {
		public ConstRContext constR() {
			return getRuleContext(ConstRContext.class,0);
		}
		public Name1Context name1() {
			return getRuleContext(Name1Context.class,0);
		}
		public ReacttypeContext reacttype() {
			return getRuleContext(ReacttypeContext.class,0);
		}
		public AnondefContext anondef() {
			return getRuleContext(AnondefContext.class,0);
		}
		public Body2Context body2() {
			return getRuleContext(Body2Context.class,0);
		}
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__3);
			setState(77);
			constR();
			setState(78);
			name1();
			setState(79);
			reacttype();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(80);
				template();
				}
			}

			setState(83);
			anondef();
			setState(84);
			body2();
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

	public static class AnondefContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(EParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(EParser.WS, i);
		}
		public PropsContext props() {
			return getRuleContext(PropsContext.class,0);
		}
		public AnondefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anondef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).enterAnondef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).exitAnondef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitAnondef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnondefContext anondef() throws RecognitionException {
		AnondefContext _localctx = new AnondefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_anondef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(86);
				match(WS);
				}
			}

			setState(89);
			match(T__4);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(90);
				match(WS);
				}
			}

			setState(93);
			match(T__5);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_CURLY) {
				{
				setState(94);
				props();
				}
			}

			setState(97);
			match(T__6);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(98);
				match(WS);
				}
			}

			setState(101);
			match(T__7);
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

	public static class PropsContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_CURLY() { return getTokens(EParser.OPEN_CURLY); }
		public TerminalNode OPEN_CURLY(int i) {
			return getToken(EParser.OPEN_CURLY, i);
		}
		public List<TerminalNode> CLOSE_CURLY() { return getTokens(EParser.CLOSE_CURLY); }
		public TerminalNode CLOSE_CURLY(int i) {
			return getToken(EParser.CLOSE_CURLY, i);
		}
		public List<PropsContext> props() {
			return getRuleContexts(PropsContext.class);
		}
		public PropsContext props(int i) {
			return getRuleContext(PropsContext.class,i);
		}
		public PropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_props; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).enterProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).exitProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitProps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropsContext props() throws RecognitionException {
		PropsContext _localctx = new PropsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_props);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(OPEN_CURLY);
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(106);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case SQSTR:
				case DQSTR:
				case Name:
				case FileName:
				case WS:
				case FILTER:
					{
					setState(104);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==OPEN_CURLY || _la==CLOSE_CURLY) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case OPEN_CURLY:
					{
					setState(105);
					props();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << OPEN_CURLY) | (1L << SQSTR) | (1L << DQSTR) | (1L << Name) | (1L << FileName) | (1L << WS) | (1L << FILTER))) != 0) );
			setState(110);
			match(CLOSE_CURLY);
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

	public static class Name1Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(EParser.Name, 0); }
		public Name1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).enterName1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).exitName1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitName1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name1Context name1() throws RecognitionException {
		Name1Context _localctx = new Name1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_name1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(Name);
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

	public static class ReacttypeContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(EParser.WS, 0); }
		public ReacttypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reacttype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).enterReacttype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).exitReacttype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitReacttype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReacttypeContext reacttype() throws RecognitionException {
		ReacttypeContext _localctx = new ReacttypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_reacttype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__8);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(115);
				match(WS);
				}
			}

			setState(118);
			match(T__9);
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

	public static class TemplateContext extends ParserRuleContext {
		public PropnameContext propname() {
			return getRuleContext(PropnameContext.class,0);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__10);
			setState(121);
			propname();
			setState(122);
			match(T__11);
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

	public static class PropnameContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(EParser.Name, 0); }
		public PropnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).enterPropname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).exitPropname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitPropname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropnameContext propname() throws RecognitionException {
		PropnameContext _localctx = new PropnameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_propname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(Name);
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

	public static class ConstRContext extends ParserRuleContext {
		public ConstRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).enterConstR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).exitConstR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitConstR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstRContext constR() throws RecognitionException {
		ConstRContext _localctx = new ConstRContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__12);
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

	public static class Body2Context extends ParserRuleContext {
		public Block2Context block2() {
			return getRuleContext(Block2Context.class,0);
		}
		public Body2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).enterBody2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).exitBody2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitBody2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body2Context body2() throws RecognitionException {
		Body2Context _localctx = new Body2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_body2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			block2();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(EParser.OPEN_CURLY, 0); }
		public List<TerminalNode> CLOSE_CURLY() { return getTokens(EParser.CLOSE_CURLY); }
		public TerminalNode CLOSE_CURLY(int i) {
			return getToken(EParser.CLOSE_CURLY, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(OPEN_CURLY);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << OPEN_CURLY) | (1L << SQSTR) | (1L << DQSTR) | (1L << Name) | (1L << FileName) | (1L << WS) | (1L << FILTER))) != 0)) {
				{
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(131);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==CLOSE_CURLY) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case 2:
					{
					setState(132);
					block();
					}
					break;
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(CLOSE_CURLY);
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

	public static class Block2Context extends ParserRuleContext {
		public List<TerminalNode> OPEN_CURLY() { return getTokens(EParser.OPEN_CURLY); }
		public TerminalNode OPEN_CURLY(int i) {
			return getToken(EParser.OPEN_CURLY, i);
		}
		public List<Block2Context> block2() {
			return getRuleContexts(Block2Context.class);
		}
		public Block2Context block2(int i) {
			return getRuleContext(Block2Context.class,i);
		}
		public List<TerminalNode> CLOSE_CURLY() { return getTokens(EParser.CLOSE_CURLY); }
		public TerminalNode CLOSE_CURLY(int i) {
			return getToken(EParser.CLOSE_CURLY, i);
		}
		public Block2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).enterBlock2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EListener ) ((EListener)listener).exitBlock2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitBlock2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block2Context block2() throws RecognitionException {
		Block2Context _localctx = new Block2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_block2);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(145);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_CURLY:
						{
						setState(140);
						match(OPEN_CURLY);
						setState(141);
						block2();
						setState(142);
						match(CLOSE_CURLY);
						}
						break;
					case T__0:
					case T__1:
					case T__2:
					case T__3:
					case T__4:
					case T__5:
					case T__6:
					case T__7:
					case T__8:
					case T__9:
					case T__10:
					case T__11:
					case T__12:
					case SQSTR:
					case DQSTR:
					case Name:
					case FileName:
					case WS:
					case FILTER:
						{
						setState(144);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==OPEN_CURLY || _la==CLOSE_CURLY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(147); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u0098\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\5\2(\n\2\3\2\6\2+\n\2\r\2\16\2,\6\2/\n\2\r\2\16\2\60\3\2"+
		"\3\2\3\3\3\3\3\3\5\38\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\5"+
		"\3\5\5\5F\n\5\3\5\5\5I\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bT\n"+
		"\b\3\b\3\b\3\b\3\t\5\tZ\n\t\3\t\3\t\5\t^\n\t\3\t\3\t\5\tb\n\t\3\t\3\t"+
		"\5\tf\n\t\3\t\3\t\3\n\3\n\3\n\6\nm\n\n\r\n\16\nn\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\5\fw\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\21\7\21\u0088\n\21\f\21\16\21\u008b\13\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\6\22\u0094\n\22\r\22\16\22\u0095\3\22\3,\2\23\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\3\2\22\23\3\2\20\21\3\2\21\21"+
		"\2\u009a\2.\3\2\2\2\4\64\3\2\2\2\6;\3\2\2\2\bE\3\2\2\2\nJ\3\2\2\2\fL\3"+
		"\2\2\2\16N\3\2\2\2\20Y\3\2\2\2\22i\3\2\2\2\24r\3\2\2\2\26t\3\2\2\2\30"+
		"z\3\2\2\2\32~\3\2\2\2\34\u0080\3\2\2\2\36\u0082\3\2\2\2 \u0084\3\2\2\2"+
		"\"\u0093\3\2\2\2$(\5\16\b\2%(\5\6\4\2&(\5\4\3\2\'$\3\2\2\2\'%\3\2\2\2"+
		"\'&\3\2\2\2(*\3\2\2\2)+\7\26\2\2*)\3\2\2\2+,\3\2\2\2,-\3\2\2\2,*\3\2\2"+
		"\2-/\3\2\2\2.\'\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3"+
		"\2\2\2\62\63\7\2\2\3\63\3\3\2\2\2\64\65\7\3\2\2\65\67\5\24\13\2\668\7"+
		"\26\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\f\7\2:\5\3\2\2\2;A\7\4"+
		"\2\2<=\5\b\5\2=>\7\5\2\2>?\5\n\6\2?B\3\2\2\2@B\5\n\6\2A<\3\2\2\2A@\3\2"+
		"\2\2B\7\3\2\2\2CF\7\24\2\2DF\5 \21\2EC\3\2\2\2ED\3\2\2\2FH\3\2\2\2GI\7"+
		"\26\2\2HG\3\2\2\2HI\3\2\2\2I\t\3\2\2\2JK\t\2\2\2K\13\3\2\2\2LM\5 \21\2"+
		"M\r\3\2\2\2NO\7\6\2\2OP\5\34\17\2PQ\5\24\13\2QS\5\26\f\2RT\5\30\r\2SR"+
		"\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\5\20\t\2VW\5\36\20\2W\17\3\2\2\2XZ\7\26"+
		"\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[]\7\7\2\2\\^\7\26\2\2]\\\3\2\2\2]^"+
		"\3\2\2\2^_\3\2\2\2_a\7\b\2\2`b\5\22\n\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2"+
		"ce\7\t\2\2df\7\26\2\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\n\2\2h\21\3\2"+
		"\2\2il\7\20\2\2jm\n\3\2\2km\5\22\n\2lj\3\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2op\3\2\2\2pq\7\21\2\2q\23\3\2\2\2rs\7\24\2\2s\25\3\2\2"+
		"\2tv\7\13\2\2uw\7\26\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\f\2\2y\27\3"+
		"\2\2\2z{\7\r\2\2{|\5\32\16\2|}\7\16\2\2}\31\3\2\2\2~\177\7\24\2\2\177"+
		"\33\3\2\2\2\u0080\u0081\7\17\2\2\u0081\35\3\2\2\2\u0082\u0083\5\"\22\2"+
		"\u0083\37\3\2\2\2\u0084\u0089\7\20\2\2\u0085\u0088\n\4\2\2\u0086\u0088"+
		"\5 \21\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008c\u008d\7\21\2\2\u008d!\3\2\2\2\u008e\u008f\7\20\2\2\u008f\u0090"+
		"\5\"\22\2\u0090\u0091\7\21\2\2\u0091\u0094\3\2\2\2\u0092\u0094\n\3\2\2"+
		"\u0093\u008e\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096#\3\2\2\2\25\',\60\67AEHSY]aelnv\u0087"+
		"\u0089\u0093\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}