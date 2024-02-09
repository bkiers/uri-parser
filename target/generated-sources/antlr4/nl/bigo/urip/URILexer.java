// Generated from nl/bigo/urip/URI.g4 by ANTLR 4.13.1
package nl.bigo.urip;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class URILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, VL=24, A_F=25, 
		G_Z=26, D1=27, D2=28, D3=29, D4=30, D5=31, D6=32, D7=33, D8=34, D9=35, 
		D0=36, OTHER=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "VL", "A_F", "G_Z", 
			"D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D0", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'?'", "'#'", "'/'", "'+'", "'-'", "'.'", "'@'", "'['", 
			"']'", "'%'", "'_'", "'~'", "'!'", "'$'", "'&'", "'''", "'('", "')'", 
			"'*'", "','", "';'", "'='", "'v'", null, null, "'1'", "'2'", "'3'", "'4'", 
			"'5'", "'6'", "'7'", "'8'", "'9'", "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"VL", "A_F", "G_Z", "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", 
			"D0", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public URILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "URI.g4"; }

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
		"\u0004\u0000%\u0095\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0000\u0000"+
		"%\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%"+
		"\u0001\u0000\u0002\u0002\u0000AFaf\u0003\u0000GZguwz\u0094\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000"+
		"\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000"+
		"C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001"+
		"\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0001K\u0001\u0000\u0000"+
		"\u0000\u0003M\u0001\u0000\u0000\u0000\u0005O\u0001\u0000\u0000\u0000\u0007"+
		"Q\u0001\u0000\u0000\u0000\tS\u0001\u0000\u0000\u0000\u000bU\u0001\u0000"+
		"\u0000\u0000\rW\u0001\u0000\u0000\u0000\u000fY\u0001\u0000\u0000\u0000"+
		"\u0011[\u0001\u0000\u0000\u0000\u0013]\u0001\u0000\u0000\u0000\u0015_"+
		"\u0001\u0000\u0000\u0000\u0017a\u0001\u0000\u0000\u0000\u0019c\u0001\u0000"+
		"\u0000\u0000\u001be\u0001\u0000\u0000\u0000\u001dg\u0001\u0000\u0000\u0000"+
		"\u001fi\u0001\u0000\u0000\u0000!k\u0001\u0000\u0000\u0000#m\u0001\u0000"+
		"\u0000\u0000%o\u0001\u0000\u0000\u0000\'q\u0001\u0000\u0000\u0000)s\u0001"+
		"\u0000\u0000\u0000+u\u0001\u0000\u0000\u0000-w\u0001\u0000\u0000\u0000"+
		"/y\u0001\u0000\u0000\u00001{\u0001\u0000\u0000\u00003}\u0001\u0000\u0000"+
		"\u00005\u007f\u0001\u0000\u0000\u00007\u0081\u0001\u0000\u0000\u00009"+
		"\u0083\u0001\u0000\u0000\u0000;\u0085\u0001\u0000\u0000\u0000=\u0087\u0001"+
		"\u0000\u0000\u0000?\u0089\u0001\u0000\u0000\u0000A\u008b\u0001\u0000\u0000"+
		"\u0000C\u008d\u0001\u0000\u0000\u0000E\u008f\u0001\u0000\u0000\u0000G"+
		"\u0091\u0001\u0000\u0000\u0000I\u0093\u0001\u0000\u0000\u0000KL\u0005"+
		":\u0000\u0000L\u0002\u0001\u0000\u0000\u0000MN\u0005?\u0000\u0000N\u0004"+
		"\u0001\u0000\u0000\u0000OP\u0005#\u0000\u0000P\u0006\u0001\u0000\u0000"+
		"\u0000QR\u0005/\u0000\u0000R\b\u0001\u0000\u0000\u0000ST\u0005+\u0000"+
		"\u0000T\n\u0001\u0000\u0000\u0000UV\u0005-\u0000\u0000V\f\u0001\u0000"+
		"\u0000\u0000WX\u0005.\u0000\u0000X\u000e\u0001\u0000\u0000\u0000YZ\u0005"+
		"@\u0000\u0000Z\u0010\u0001\u0000\u0000\u0000[\\\u0005[\u0000\u0000\\\u0012"+
		"\u0001\u0000\u0000\u0000]^\u0005]\u0000\u0000^\u0014\u0001\u0000\u0000"+
		"\u0000_`\u0005%\u0000\u0000`\u0016\u0001\u0000\u0000\u0000ab\u0005_\u0000"+
		"\u0000b\u0018\u0001\u0000\u0000\u0000cd\u0005~\u0000\u0000d\u001a\u0001"+
		"\u0000\u0000\u0000ef\u0005!\u0000\u0000f\u001c\u0001\u0000\u0000\u0000"+
		"gh\u0005$\u0000\u0000h\u001e\u0001\u0000\u0000\u0000ij\u0005&\u0000\u0000"+
		"j \u0001\u0000\u0000\u0000kl\u0005\'\u0000\u0000l\"\u0001\u0000\u0000"+
		"\u0000mn\u0005(\u0000\u0000n$\u0001\u0000\u0000\u0000op\u0005)\u0000\u0000"+
		"p&\u0001\u0000\u0000\u0000qr\u0005*\u0000\u0000r(\u0001\u0000\u0000\u0000"+
		"st\u0005,\u0000\u0000t*\u0001\u0000\u0000\u0000uv\u0005;\u0000\u0000v"+
		",\u0001\u0000\u0000\u0000wx\u0005=\u0000\u0000x.\u0001\u0000\u0000\u0000"+
		"yz\u0005v\u0000\u0000z0\u0001\u0000\u0000\u0000{|\u0007\u0000\u0000\u0000"+
		"|2\u0001\u0000\u0000\u0000}~\u0007\u0001\u0000\u0000~4\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u00051\u0000\u0000\u00806\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u00052\u0000\u0000\u00828\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"3\u0000\u0000\u0084:\u0001\u0000\u0000\u0000\u0085\u0086\u00054\u0000"+
		"\u0000\u0086<\u0001\u0000\u0000\u0000\u0087\u0088\u00055\u0000\u0000\u0088"+
		">\u0001\u0000\u0000\u0000\u0089\u008a\u00056\u0000\u0000\u008a@\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u00057\u0000\u0000\u008cB\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u00058\u0000\u0000\u008eD\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u00059\u0000\u0000\u0090F\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		"0\u0000\u0000\u0092H\u0001\u0000\u0000\u0000\u0093\u0094\t\u0000\u0000"+
		"\u0000\u0094J\u0001\u0000\u0000\u0000\u0001\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}