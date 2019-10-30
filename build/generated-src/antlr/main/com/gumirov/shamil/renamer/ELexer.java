// Generated from com/gumirov/shamil/renamer/E.g4 by ANTLR 4.7.1

package com.gumirov.shamil.renamer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ELexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, OPEN_CURLY=14, CLOSE_CURLY=15, 
		SQSTR=16, DQSTR=17, Name=18, FileName=19, WS=20, FILTER=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "OPEN_CURLY", "CLOSE_CURLY", "SQSTR", 
		"DQSTR", "Name", "FileName", "WS", "FILTER"
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


	public ELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "E.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\7\21u\n\21\f\21\16\21x\13\21\3\21\3\21\3\22\3\22\3\22\7\22\177\n"+
		"\22\f\22\16\22\u0082\13\22\3\22\3\22\3\23\3\23\7\23\u0088\n\23\f\23\16"+
		"\23\u008b\13\23\3\24\6\24\u008e\n\24\r\24\16\24\u008f\3\25\6\25\u0093"+
		"\n\25\r\25\16\25\u0094\3\26\6\26\u0098\n\26\r\26\16\26\u0099\3\u0099\2"+
		"\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\7\4\2$$))\5\2C\\aac|\6\2\62;C\\"+
		"aac|\6\2\60\60C\\aac|\5\2\13\f\17\17\"\"\2\u00a2\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\58\3\2\2\2\7@\3\2\2\2\tF\3\2\2"+
		"\2\13N\3\2\2\2\rP\3\2\2\2\17R\3\2\2\2\21T\3\2\2\2\23W\3\2\2\2\25Y\3\2"+
		"\2\2\27b\3\2\2\2\31d\3\2\2\2\33f\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!q\3\2"+
		"\2\2#{\3\2\2\2%\u0085\3\2\2\2\'\u008d\3\2\2\2)\u0092\3\2\2\2+\u0097\3"+
		"\2\2\2-.\7k\2\2./\7p\2\2/\60\7v\2\2\60\61\7g\2\2\61\62\7t\2\2\62\63\7"+
		"h\2\2\63\64\7c\2\2\64\65\7e\2\2\65\66\7g\2\2\66\67\7\"\2\2\67\4\3\2\2"+
		"\289\7k\2\29:\7o\2\2:;\7r\2\2;<\7q\2\2<=\7t\2\2=>\7v\2\2>?\7\"\2\2?\6"+
		"\3\2\2\2@A\7h\2\2AB\7t\2\2BC\7q\2\2CD\7o\2\2DE\7\"\2\2E\b\3\2\2\2FG\7"+
		"g\2\2GH\7z\2\2HI\7r\2\2IJ\7q\2\2JK\7t\2\2KL\7v\2\2LM\7\"\2\2M\n\3\2\2"+
		"\2NO\7?\2\2O\f\3\2\2\2PQ\7*\2\2Q\16\3\2\2\2RS\7+\2\2S\20\3\2\2\2TU\7?"+
		"\2\2UV\7@\2\2V\22\3\2\2\2WX\7<\2\2X\24\3\2\2\2YZ\7T\2\2Z[\7g\2\2[\\\7"+
		"c\2\2\\]\7e\2\2]^\7v\2\2^_\7\60\2\2_`\7H\2\2`a\7E\2\2a\26\3\2\2\2bc\7"+
		">\2\2c\30\3\2\2\2de\7@\2\2e\32\3\2\2\2fg\7e\2\2gh\7q\2\2hi\7p\2\2ij\7"+
		"u\2\2jk\7v\2\2kl\7\"\2\2l\34\3\2\2\2mn\7}\2\2n\36\3\2\2\2op\7\177\2\2"+
		"p \3\2\2\2qv\7)\2\2ru\n\2\2\2su\5#\22\2tr\3\2\2\2ts\3\2\2\2ux\3\2\2\2"+
		"vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7)\2\2z\"\3\2\2\2{\u0080\7"+
		"$\2\2|\177\n\2\2\2}\177\5!\21\2~|\3\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0083\u0084\7$\2\2\u0084$\3\2\2\2\u0085\u0089\t\3\2\2\u0086\u0088"+
		"\t\4\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a&\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\t\5\2\2"+
		"\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090(\3\2\2\2\u0091\u0093\t\6\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095*\3\2\2\2"+
		"\u0096\u0098\13\2\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u009a,\3\2\2\2\13\2tv~\u0080\u0089\u008f"+
		"\u0094\u0099\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}