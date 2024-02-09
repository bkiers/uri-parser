// Generated from nl/bigo/urip/URI.g4 by ANTLR 4.13.1
package nl.bigo.urip;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class URIParser extends Parser {
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
	public static final int
		RULE_parse = 0, RULE_uri_reference = 1, RULE_absolute_uri = 2, RULE_uri = 3, 
		RULE_hier_part = 4, RULE_relative_ref = 5, RULE_relative_part = 6, RULE_scheme = 7, 
		RULE_authority = 8, RULE_userinfo = 9, RULE_host = 10, RULE_port = 11, 
		RULE_ip_literal = 12, RULE_ipvfuture = 13, RULE_ipv6address = 14, RULE_h16 = 15, 
		RULE_ls32 = 16, RULE_ipv4address = 17, RULE_dec_octet = 18, RULE_reg_name = 19, 
		RULE_path_abempty = 20, RULE_path_absolute = 21, RULE_path_noscheme = 22, 
		RULE_path_rootless = 23, RULE_path_empty = 24, RULE_segment = 25, RULE_segment_nz = 26, 
		RULE_segment_nz_nc = 27, RULE_pchar = 28, RULE_query = 29, RULE_fragment_ = 30, 
		RULE_pct_encoded = 31, RULE_unreserved = 32, RULE_sub_delims = 33, RULE_alpha = 34, 
		RULE_digit = 35, RULE_hexdigit = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "uri_reference", "absolute_uri", "uri", "hier_part", "relative_ref", 
			"relative_part", "scheme", "authority", "userinfo", "host", "port", "ip_literal", 
			"ipvfuture", "ipv6address", "h16", "ls32", "ipv4address", "dec_octet", 
			"reg_name", "path_abempty", "path_absolute", "path_noscheme", "path_rootless", 
			"path_empty", "segment", "segment_nz", "segment_nz_nc", "pchar", "query", 
			"fragment_", "pct_encoded", "unreserved", "sub_delims", "alpha", "digit", 
			"hexdigit"
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

	@Override
	public String getGrammarFileName() { return "URI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public URIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(URIParser.EOF, 0); }
		public Uri_referenceContext uri_reference() {
			return getRuleContext(Uri_referenceContext.class,0);
		}
		public Absolute_uriContext absolute_uri() {
			return getRuleContext(Absolute_uriContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(74);
				uri_reference();
				}
				break;
			case 2:
				{
				setState(75);
				absolute_uri();
				}
				break;
			}
			setState(78);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Uri_referenceContext extends ParserRuleContext {
		public UriContext uri() {
			return getRuleContext(UriContext.class,0);
		}
		public Relative_refContext relative_ref() {
			return getRuleContext(Relative_refContext.class,0);
		}
		public Uri_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uri_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterUri_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitUri_reference(this);
		}
	}

	public final Uri_referenceContext uri_reference() throws RecognitionException {
		Uri_referenceContext _localctx = new Uri_referenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_uri_reference);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				uri();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				relative_ref();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Absolute_uriContext extends ParserRuleContext {
		public SchemeContext scheme() {
			return getRuleContext(SchemeContext.class,0);
		}
		public Hier_partContext hier_part() {
			return getRuleContext(Hier_partContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public Absolute_uriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absolute_uri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterAbsolute_uri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitAbsolute_uri(this);
		}
	}

	public final Absolute_uriContext absolute_uri() throws RecognitionException {
		Absolute_uriContext _localctx = new Absolute_uriContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_absolute_uri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			scheme();
			setState(85);
			match(T__0);
			setState(86);
			hier_part();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(87);
				match(T__1);
				setState(88);
				query();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UriContext extends ParserRuleContext {
		public SchemeContext scheme() {
			return getRuleContext(SchemeContext.class,0);
		}
		public Hier_partContext hier_part() {
			return getRuleContext(Hier_partContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public Fragment_Context fragment_() {
			return getRuleContext(Fragment_Context.class,0);
		}
		public UriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterUri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitUri(this);
		}
	}

	public final UriContext uri() throws RecognitionException {
		UriContext _localctx = new UriContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_uri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			scheme();
			setState(92);
			match(T__0);
			setState(93);
			hier_part();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(94);
				match(T__1);
				setState(95);
				query();
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(98);
				match(T__2);
				setState(99);
				fragment_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Hier_partContext extends ParserRuleContext {
		public AuthorityContext authority() {
			return getRuleContext(AuthorityContext.class,0);
		}
		public Path_abemptyContext path_abempty() {
			return getRuleContext(Path_abemptyContext.class,0);
		}
		public Path_absoluteContext path_absolute() {
			return getRuleContext(Path_absoluteContext.class,0);
		}
		public Path_rootlessContext path_rootless() {
			return getRuleContext(Path_rootlessContext.class,0);
		}
		public Path_emptyContext path_empty() {
			return getRuleContext(Path_emptyContext.class,0);
		}
		public Hier_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hier_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterHier_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitHier_part(this);
		}
	}

	public final Hier_partContext hier_part() throws RecognitionException {
		Hier_partContext _localctx = new Hier_partContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_hier_part);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__3);
				setState(103);
				match(T__3);
				setState(104);
				authority();
				setState(105);
				path_abempty();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				path_absolute();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				path_rootless();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				path_empty();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Relative_refContext extends ParserRuleContext {
		public Relative_partContext relative_part() {
			return getRuleContext(Relative_partContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public Fragment_Context fragment_() {
			return getRuleContext(Fragment_Context.class,0);
		}
		public Relative_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relative_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterRelative_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitRelative_ref(this);
		}
	}

	public final Relative_refContext relative_ref() throws RecognitionException {
		Relative_refContext _localctx = new Relative_refContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relative_ref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			relative_part();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(113);
				match(T__1);
				setState(114);
				query();
				}
			}

			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(117);
				match(T__2);
				setState(118);
				fragment_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Relative_partContext extends ParserRuleContext {
		public AuthorityContext authority() {
			return getRuleContext(AuthorityContext.class,0);
		}
		public Path_abemptyContext path_abempty() {
			return getRuleContext(Path_abemptyContext.class,0);
		}
		public Path_absoluteContext path_absolute() {
			return getRuleContext(Path_absoluteContext.class,0);
		}
		public Path_noschemeContext path_noscheme() {
			return getRuleContext(Path_noschemeContext.class,0);
		}
		public Path_emptyContext path_empty() {
			return getRuleContext(Path_emptyContext.class,0);
		}
		public Relative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterRelative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitRelative_part(this);
		}
	}

	public final Relative_partContext relative_part() throws RecognitionException {
		Relative_partContext _localctx = new Relative_partContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relative_part);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__3);
				setState(122);
				match(T__3);
				setState(123);
				authority();
				setState(124);
				path_abempty();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				path_absolute();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				path_noscheme();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				path_empty();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class SchemeContext extends ParserRuleContext {
		public List<AlphaContext> alpha() {
			return getRuleContexts(AlphaContext.class);
		}
		public AlphaContext alpha(int i) {
			return getRuleContext(AlphaContext.class,i);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public SchemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterScheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitScheme(this);
		}
	}

	public final SchemeContext scheme() throws RecognitionException {
		SchemeContext _localctx = new SchemeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scheme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			alpha();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137422176480L) != 0)) {
				{
				setState(137);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VL:
				case A_F:
				case G_Z:
					{
					setState(132);
					alpha();
					}
					break;
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
				case D0:
					{
					setState(133);
					digit();
					}
					break;
				case T__4:
					{
					setState(134);
					match(T__4);
					}
					break;
				case T__5:
					{
					setState(135);
					match(T__5);
					}
					break;
				case T__6:
					{
					setState(136);
					match(T__6);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(141);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AuthorityContext extends ParserRuleContext {
		public HostContext host() {
			return getRuleContext(HostContext.class,0);
		}
		public UserinfoContext userinfo() {
			return getRuleContext(UserinfoContext.class,0);
		}
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public AuthorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authority; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterAuthority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitAuthority(this);
		}
	}

	public final AuthorityContext authority() throws RecognitionException {
		AuthorityContext _localctx = new AuthorityContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_authority);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(142);
				userinfo();
				setState(143);
				match(T__7);
				}
				break;
			}
			setState(147);
			host();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(148);
				match(T__0);
				setState(149);
				port();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UserinfoContext extends ParserRuleContext {
		public List<UnreservedContext> unreserved() {
			return getRuleContexts(UnreservedContext.class);
		}
		public UnreservedContext unreserved(int i) {
			return getRuleContext(UnreservedContext.class,i);
		}
		public List<Pct_encodedContext> pct_encoded() {
			return getRuleContexts(Pct_encodedContext.class);
		}
		public Pct_encodedContext pct_encoded(int i) {
			return getRuleContext(Pct_encodedContext.class,i);
		}
		public List<Sub_delimsContext> sub_delims() {
			return getRuleContexts(Sub_delimsContext.class);
		}
		public Sub_delimsContext sub_delims(int i) {
			return getRuleContext(Sub_delimsContext.class,i);
		}
		public UserinfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userinfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterUserinfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitUserinfo(this);
		}
	}

	public final UserinfoContext userinfo() throws RecognitionException {
		UserinfoContext _localctx = new UserinfoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_userinfo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438951650L) != 0)) {
				{
				setState(156);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__6:
				case T__11:
				case T__12:
				case VL:
				case A_F:
				case G_Z:
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
				case D0:
					{
					setState(152);
					unreserved();
					}
					break;
				case T__10:
					{
					setState(153);
					pct_encoded();
					}
					break;
				case T__4:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
					{
					setState(154);
					sub_delims();
					}
					break;
				case T__0:
					{
					setState(155);
					match(T__0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(160);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HostContext extends ParserRuleContext {
		public Ip_literalContext ip_literal() {
			return getRuleContext(Ip_literalContext.class,0);
		}
		public Ipv4addressContext ipv4address() {
			return getRuleContext(Ipv4addressContext.class,0);
		}
		public Reg_nameContext reg_name() {
			return getRuleContext(Reg_nameContext.class,0);
		}
		public HostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterHost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitHost(this);
		}
	}

	public final HostContext host() throws RecognitionException {
		HostContext _localctx = new HostContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_host);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				ip_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				ipv4address();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				reg_name();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class PortContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterPort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitPort(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_port);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137304735744L) != 0)) {
				{
				{
				setState(166);
				digit();
				}
				}
				setState(171);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ip_literalContext extends ParserRuleContext {
		public Ipv6addressContext ipv6address() {
			return getRuleContext(Ipv6addressContext.class,0);
		}
		public IpvfutureContext ipvfuture() {
			return getRuleContext(IpvfutureContext.class,0);
		}
		public Ip_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterIp_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitIp_literal(this);
		}
	}

	public final Ip_literalContext ip_literal() throws RecognitionException {
		Ip_literalContext _localctx = new Ip_literalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ip_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__8);
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case A_F:
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case D0:
				{
				setState(173);
				ipv6address();
				}
				break;
			case VL:
				{
				setState(174);
				ipvfuture();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(177);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IpvfutureContext extends ParserRuleContext {
		public TerminalNode VL() { return getToken(URIParser.VL, 0); }
		public List<HexdigitContext> hexdigit() {
			return getRuleContexts(HexdigitContext.class);
		}
		public HexdigitContext hexdigit(int i) {
			return getRuleContext(HexdigitContext.class,i);
		}
		public List<UnreservedContext> unreserved() {
			return getRuleContexts(UnreservedContext.class);
		}
		public UnreservedContext unreserved(int i) {
			return getRuleContext(UnreservedContext.class,i);
		}
		public List<Sub_delimsContext> sub_delims() {
			return getRuleContexts(Sub_delimsContext.class);
		}
		public Sub_delimsContext sub_delims(int i) {
			return getRuleContext(Sub_delimsContext.class,i);
		}
		public IpvfutureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipvfuture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterIpvfuture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitIpvfuture(this);
		}
	}

	public final IpvfutureContext ipvfuture() throws RecognitionException {
		IpvfutureContext _localctx = new IpvfutureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ipvfuture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(VL);
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				hexdigit();
				}
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137338290176L) != 0) );
			setState(185);
			match(T__6);
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(189);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__6:
				case T__11:
				case T__12:
				case VL:
				case A_F:
				case G_Z:
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
				case D0:
					{
					setState(186);
					unreserved();
					}
					break;
				case T__4:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
					{
					setState(187);
					sub_delims();
					}
					break;
				case T__0:
					{
					setState(188);
					match(T__0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137438949602L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ipv6addressContext extends ParserRuleContext {
		public List<H16Context> h16() {
			return getRuleContexts(H16Context.class);
		}
		public H16Context h16(int i) {
			return getRuleContext(H16Context.class,i);
		}
		public Ls32Context ls32() {
			return getRuleContext(Ls32Context.class,0);
		}
		public Ipv6addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv6address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterIpv6address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitIpv6address(this);
		}
	}

	public final Ipv6addressContext ipv6address() throws RecognitionException {
		Ipv6addressContext _localctx = new Ipv6addressContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ipv6address);
		int _la;
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				h16();
				setState(194);
				match(T__0);
				setState(195);
				h16();
				setState(196);
				match(T__0);
				setState(197);
				h16();
				setState(198);
				match(T__0);
				setState(199);
				h16();
				setState(200);
				match(T__0);
				setState(201);
				h16();
				setState(202);
				match(T__0);
				setState(203);
				h16();
				setState(204);
				match(T__0);
				setState(205);
				ls32();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(T__0);
				setState(208);
				match(T__0);
				setState(209);
				h16();
				setState(210);
				match(T__0);
				setState(211);
				h16();
				setState(212);
				match(T__0);
				setState(213);
				h16();
				setState(214);
				match(T__0);
				setState(215);
				h16();
				setState(216);
				match(T__0);
				setState(217);
				h16();
				setState(218);
				match(T__0);
				setState(219);
				ls32();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137338290176L) != 0)) {
					{
					setState(221);
					h16();
					}
				}

				setState(224);
				match(T__0);
				setState(225);
				match(T__0);
				setState(226);
				h16();
				setState(227);
				match(T__0);
				setState(228);
				h16();
				setState(229);
				match(T__0);
				setState(230);
				h16();
				setState(231);
				match(T__0);
				setState(232);
				h16();
				setState(233);
				match(T__0);
				setState(234);
				ls32();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137338290176L) != 0)) {
					{
					setState(239);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(236);
						h16();
						setState(237);
						match(T__0);
						}
						break;
					}
					setState(241);
					h16();
					}
				}

				setState(244);
				match(T__0);
				setState(245);
				match(T__0);
				setState(246);
				h16();
				setState(247);
				match(T__0);
				setState(248);
				h16();
				setState(249);
				match(T__0);
				setState(250);
				h16();
				setState(251);
				match(T__0);
				setState(252);
				ls32();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137338290176L) != 0)) {
					{
					setState(262);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(257);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
						case 1:
							{
							setState(254);
							h16();
							setState(255);
							match(T__0);
							}
							break;
						}
						setState(259);
						h16();
						setState(260);
						match(T__0);
						}
						break;
					}
					setState(264);
					h16();
					}
				}

				setState(267);
				match(T__0);
				setState(268);
				match(T__0);
				setState(269);
				h16();
				setState(270);
				match(T__0);
				setState(271);
				h16();
				setState(272);
				match(T__0);
				setState(273);
				ls32();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137338290176L) != 0)) {
					{
					setState(288);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(283);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(278);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
							case 1:
								{
								setState(275);
								h16();
								setState(276);
								match(T__0);
								}
								break;
							}
							setState(280);
							h16();
							setState(281);
							match(T__0);
							}
							break;
						}
						setState(285);
						h16();
						setState(286);
						match(T__0);
						}
						break;
					}
					setState(290);
					h16();
					}
				}

				setState(293);
				match(T__0);
				setState(294);
				match(T__0);
				setState(295);
				h16();
				setState(296);
				match(T__0);
				setState(297);
				ls32();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137338290176L) != 0)) {
					{
					setState(317);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(312);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(307);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
							case 1:
								{
								setState(302);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
								case 1:
									{
									setState(299);
									h16();
									setState(300);
									match(T__0);
									}
									break;
								}
								setState(304);
								h16();
								setState(305);
								match(T__0);
								}
								break;
							}
							setState(309);
							h16();
							setState(310);
							match(T__0);
							}
							break;
						}
						setState(314);
						h16();
						setState(315);
						match(T__0);
						}
						break;
					}
					setState(319);
					h16();
					}
				}

				setState(322);
				match(T__0);
				setState(323);
				match(T__0);
				setState(324);
				ls32();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137338290176L) != 0)) {
					{
					setState(348);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(343);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
						case 1:
							{
							setState(338);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
							case 1:
								{
								setState(333);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
								case 1:
									{
									setState(328);
									_errHandler.sync(this);
									switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
									case 1:
										{
										setState(325);
										h16();
										setState(326);
										match(T__0);
										}
										break;
									}
									setState(330);
									h16();
									setState(331);
									match(T__0);
									}
									break;
								}
								setState(335);
								h16();
								setState(336);
								match(T__0);
								}
								break;
							}
							setState(340);
							h16();
							setState(341);
							match(T__0);
							}
							break;
						}
						setState(345);
						h16();
						setState(346);
						match(T__0);
						}
						break;
					}
					setState(350);
					h16();
					}
				}

				setState(353);
				match(T__0);
				setState(354);
				match(T__0);
				setState(355);
				h16();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137338290176L) != 0)) {
					{
					setState(384);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(379);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
						case 1:
							{
							setState(374);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
							case 1:
								{
								setState(369);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
								case 1:
									{
									setState(364);
									_errHandler.sync(this);
									switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
									case 1:
										{
										setState(359);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
										case 1:
											{
											setState(356);
											h16();
											setState(357);
											match(T__0);
											}
											break;
										}
										setState(361);
										h16();
										setState(362);
										match(T__0);
										}
										break;
									}
									setState(366);
									h16();
									setState(367);
									match(T__0);
									}
									break;
								}
								setState(371);
								h16();
								setState(372);
								match(T__0);
								}
								break;
							}
							setState(376);
							h16();
							setState(377);
							match(T__0);
							}
							break;
						}
						setState(381);
						h16();
						setState(382);
						match(T__0);
						}
						break;
					}
					setState(386);
					h16();
					}
				}

				setState(389);
				match(T__0);
				setState(390);
				match(T__0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class H16Context extends ParserRuleContext {
		public List<HexdigitContext> hexdigit() {
			return getRuleContexts(HexdigitContext.class);
		}
		public HexdigitContext hexdigit(int i) {
			return getRuleContext(HexdigitContext.class,i);
		}
		public H16Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h16; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterH16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitH16(this);
		}
	}

	public final H16Context h16() throws RecognitionException {
		H16Context _localctx = new H16Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_h16);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(394);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						setState(393);
						hexdigit();
						}
						break;
					}
					setState(396);
					hexdigit();
					}
					break;
				}
				setState(399);
				hexdigit();
				}
				break;
			}
			setState(402);
			hexdigit();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ls32Context extends ParserRuleContext {
		public List<H16Context> h16() {
			return getRuleContexts(H16Context.class);
		}
		public H16Context h16(int i) {
			return getRuleContext(H16Context.class,i);
		}
		public Ipv4addressContext ipv4address() {
			return getRuleContext(Ipv4addressContext.class,0);
		}
		public Ls32Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ls32; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterLs32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitLs32(this);
		}
	}

	public final Ls32Context ls32() throws RecognitionException {
		Ls32Context _localctx = new Ls32Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_ls32);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				h16();
				setState(405);
				match(T__0);
				setState(406);
				h16();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				ipv4address();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ipv4addressContext extends ParserRuleContext {
		public List<Dec_octetContext> dec_octet() {
			return getRuleContexts(Dec_octetContext.class);
		}
		public Dec_octetContext dec_octet(int i) {
			return getRuleContext(Dec_octetContext.class,i);
		}
		public Ipv4addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterIpv4address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitIpv4address(this);
		}
	}

	public final Ipv4addressContext ipv4address() throws RecognitionException {
		Ipv4addressContext _localctx = new Ipv4addressContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ipv4address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			dec_octet();
			setState(412);
			match(T__6);
			setState(413);
			dec_octet();
			setState(414);
			match(T__6);
			setState(415);
			dec_octet();
			setState(416);
			match(T__6);
			setState(417);
			dec_octet();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_octetContext extends ParserRuleContext {
		public TerminalNode D1() { return getToken(URIParser.D1, 0); }
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public List<TerminalNode> D2() { return getTokens(URIParser.D2); }
		public TerminalNode D2(int i) {
			return getToken(URIParser.D2, i);
		}
		public TerminalNode D0() { return getToken(URIParser.D0, 0); }
		public TerminalNode D3() { return getToken(URIParser.D3, 0); }
		public TerminalNode D4() { return getToken(URIParser.D4, 0); }
		public List<TerminalNode> D5() { return getTokens(URIParser.D5); }
		public TerminalNode D5(int i) {
			return getToken(URIParser.D5, i);
		}
		public TerminalNode D6() { return getToken(URIParser.D6, 0); }
		public TerminalNode D7() { return getToken(URIParser.D7, 0); }
		public TerminalNode D8() { return getToken(URIParser.D8, 0); }
		public TerminalNode D9() { return getToken(URIParser.D9, 0); }
		public Dec_octetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_octet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterDec_octet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitDec_octet(this);
		}
	}

	public final Dec_octetContext dec_octet() throws RecognitionException {
		Dec_octetContext _localctx = new Dec_octetContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dec_octet);
		int _la;
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(D1);
				setState(420);
				digit();
				setState(421);
				digit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(D2);
				setState(424);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 70732742656L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(425);
				digit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				match(D2);
				setState(427);
				match(D5);
				setState(428);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 72880226304L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(429);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 68585259008L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(430);
				digit();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(431);
				digit();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Reg_nameContext extends ParserRuleContext {
		public List<UnreservedContext> unreserved() {
			return getRuleContexts(UnreservedContext.class);
		}
		public UnreservedContext unreserved(int i) {
			return getRuleContext(UnreservedContext.class,i);
		}
		public List<Pct_encodedContext> pct_encoded() {
			return getRuleContexts(Pct_encodedContext.class);
		}
		public Pct_encodedContext pct_encoded(int i) {
			return getRuleContext(Pct_encodedContext.class,i);
		}
		public List<Sub_delimsContext> sub_delims() {
			return getRuleContexts(Sub_delimsContext.class);
		}
		public Sub_delimsContext sub_delims(int i) {
			return getRuleContext(Sub_delimsContext.class,i);
		}
		public Reg_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reg_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterReg_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitReg_name(this);
		}
	}

	public final Reg_nameContext reg_name() throws RecognitionException {
		Reg_nameContext _localctx = new Reg_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_reg_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438951648L) != 0)) {
				{
				setState(437);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__6:
				case T__11:
				case T__12:
				case VL:
				case A_F:
				case G_Z:
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
				case D0:
					{
					setState(434);
					unreserved();
					}
					break;
				case T__10:
					{
					setState(435);
					pct_encoded();
					}
					break;
				case T__4:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
					{
					setState(436);
					sub_delims();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(441);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Path_abemptyContext extends ParserRuleContext {
		public List<SegmentContext> segment() {
			return getRuleContexts(SegmentContext.class);
		}
		public SegmentContext segment(int i) {
			return getRuleContext(SegmentContext.class,i);
		}
		public Path_abemptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_abempty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterPath_abempty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitPath_abempty(this);
		}
	}

	public final Path_abemptyContext path_abempty() throws RecognitionException {
		Path_abemptyContext _localctx = new Path_abemptyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_path_abempty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(442);
				match(T__3);
				setState(443);
				segment();
				}
				}
				setState(448);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Path_absoluteContext extends ParserRuleContext {
		public Segment_nzContext segment_nz() {
			return getRuleContext(Segment_nzContext.class,0);
		}
		public Path_absoluteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_absolute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterPath_absolute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitPath_absolute(this);
		}
	}

	public final Path_absoluteContext path_absolute() throws RecognitionException {
		Path_absoluteContext _localctx = new Path_absoluteContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_path_absolute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(T__3);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438951906L) != 0)) {
				{
				setState(450);
				segment_nz();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Path_noschemeContext extends ParserRuleContext {
		public Segment_nz_ncContext segment_nz_nc() {
			return getRuleContext(Segment_nz_ncContext.class,0);
		}
		public List<SegmentContext> segment() {
			return getRuleContexts(SegmentContext.class);
		}
		public SegmentContext segment(int i) {
			return getRuleContext(SegmentContext.class,i);
		}
		public Path_noschemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_noscheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterPath_noscheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitPath_noscheme(this);
		}
	}

	public final Path_noschemeContext path_noscheme() throws RecognitionException {
		Path_noschemeContext _localctx = new Path_noschemeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_path_noscheme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			segment_nz_nc();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(454);
				match(T__3);
				setState(455);
				segment();
				}
				}
				setState(460);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Path_rootlessContext extends ParserRuleContext {
		public Segment_nzContext segment_nz() {
			return getRuleContext(Segment_nzContext.class,0);
		}
		public List<SegmentContext> segment() {
			return getRuleContexts(SegmentContext.class);
		}
		public SegmentContext segment(int i) {
			return getRuleContext(SegmentContext.class,i);
		}
		public Path_rootlessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_rootless; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterPath_rootless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitPath_rootless(this);
		}
	}

	public final Path_rootlessContext path_rootless() throws RecognitionException {
		Path_rootlessContext _localctx = new Path_rootlessContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_path_rootless);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			segment_nz();
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(462);
				match(T__3);
				setState(463);
				segment();
				}
				}
				setState(468);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Path_emptyContext extends ParserRuleContext {
		public Path_emptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterPath_empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitPath_empty(this);
		}
	}

	public final Path_emptyContext path_empty() throws RecognitionException {
		Path_emptyContext _localctx = new Path_emptyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_path_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	@SuppressWarnings("CheckReturnValue")
	public static class SegmentContext extends ParserRuleContext {
		public List<PcharContext> pchar() {
			return getRuleContexts(PcharContext.class);
		}
		public PcharContext pchar(int i) {
			return getRuleContext(PcharContext.class,i);
		}
		public SegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitSegment(this);
		}
	}

	public final SegmentContext segment() throws RecognitionException {
		SegmentContext _localctx = new SegmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438951906L) != 0)) {
				{
				{
				setState(471);
				pchar();
				}
				}
				setState(476);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Segment_nzContext extends ParserRuleContext {
		public List<PcharContext> pchar() {
			return getRuleContexts(PcharContext.class);
		}
		public PcharContext pchar(int i) {
			return getRuleContext(PcharContext.class,i);
		}
		public Segment_nzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_nz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterSegment_nz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitSegment_nz(this);
		}
	}

	public final Segment_nzContext segment_nz() throws RecognitionException {
		Segment_nzContext _localctx = new Segment_nzContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_segment_nz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(477);
				pchar();
				}
				}
				setState(480); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137438951906L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Segment_nz_ncContext extends ParserRuleContext {
		public List<UnreservedContext> unreserved() {
			return getRuleContexts(UnreservedContext.class);
		}
		public UnreservedContext unreserved(int i) {
			return getRuleContext(UnreservedContext.class,i);
		}
		public List<Pct_encodedContext> pct_encoded() {
			return getRuleContexts(Pct_encodedContext.class);
		}
		public Pct_encodedContext pct_encoded(int i) {
			return getRuleContext(Pct_encodedContext.class,i);
		}
		public List<Sub_delimsContext> sub_delims() {
			return getRuleContexts(Sub_delimsContext.class);
		}
		public Sub_delimsContext sub_delims(int i) {
			return getRuleContext(Sub_delimsContext.class,i);
		}
		public Segment_nz_ncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_nz_nc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterSegment_nz_nc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitSegment_nz_nc(this);
		}
	}

	public final Segment_nz_ncContext segment_nz_nc() throws RecognitionException {
		Segment_nz_ncContext _localctx = new Segment_nz_ncContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_segment_nz_nc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(486);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__6:
				case T__11:
				case T__12:
				case VL:
				case A_F:
				case G_Z:
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
				case D0:
					{
					setState(482);
					unreserved();
					}
					break;
				case T__10:
					{
					setState(483);
					pct_encoded();
					}
					break;
				case T__4:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
					{
					setState(484);
					sub_delims();
					}
					break;
				case T__7:
					{
					setState(485);
					match(T__7);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(488); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137438951904L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class PcharContext extends ParserRuleContext {
		public UnreservedContext unreserved() {
			return getRuleContext(UnreservedContext.class,0);
		}
		public Pct_encodedContext pct_encoded() {
			return getRuleContext(Pct_encodedContext.class,0);
		}
		public Sub_delimsContext sub_delims() {
			return getRuleContext(Sub_delimsContext.class,0);
		}
		public PcharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pchar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterPchar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitPchar(this);
		}
	}

	public final PcharContext pchar() throws RecognitionException {
		PcharContext _localctx = new PcharContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pchar);
		try {
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__11:
			case T__12:
			case VL:
			case A_F:
			case G_Z:
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case D0:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				unreserved();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				pct_encoded();
				}
				break;
			case T__4:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				sub_delims();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				match(T__0);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
				match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public List<PcharContext> pchar() {
			return getRuleContexts(PcharContext.class);
		}
		public PcharContext pchar(int i) {
			return getRuleContext(PcharContext.class,i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438951926L) != 0)) {
				{
				setState(500);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case VL:
				case A_F:
				case G_Z:
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
				case D0:
					{
					setState(497);
					pchar();
					}
					break;
				case T__3:
					{
					setState(498);
					match(T__3);
					}
					break;
				case T__1:
					{
					setState(499);
					match(T__1);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(504);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fragment_Context extends ParserRuleContext {
		public List<PcharContext> pchar() {
			return getRuleContexts(PcharContext.class);
		}
		public PcharContext pchar(int i) {
			return getRuleContext(PcharContext.class,i);
		}
		public Fragment_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragment_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterFragment_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitFragment_(this);
		}
	}

	public final Fragment_Context fragment_() throws RecognitionException {
		Fragment_Context _localctx = new Fragment_Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_fragment_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438951926L) != 0)) {
				{
				setState(508);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case VL:
				case A_F:
				case G_Z:
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
				case D0:
					{
					setState(505);
					pchar();
					}
					break;
				case T__3:
					{
					setState(506);
					match(T__3);
					}
					break;
				case T__1:
					{
					setState(507);
					match(T__1);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(512);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pct_encodedContext extends ParserRuleContext {
		public List<HexdigitContext> hexdigit() {
			return getRuleContexts(HexdigitContext.class);
		}
		public HexdigitContext hexdigit(int i) {
			return getRuleContext(HexdigitContext.class,i);
		}
		public Pct_encodedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pct_encoded; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterPct_encoded(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitPct_encoded(this);
		}
	}

	public final Pct_encodedContext pct_encoded() throws RecognitionException {
		Pct_encodedContext _localctx = new Pct_encodedContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_pct_encoded);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(T__10);
			setState(514);
			hexdigit();
			setState(515);
			hexdigit();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnreservedContext extends ParserRuleContext {
		public AlphaContext alpha() {
			return getRuleContext(AlphaContext.class,0);
		}
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public UnreservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterUnreserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitUnreserved(this);
		}
	}

	public final UnreservedContext unreserved() throws RecognitionException {
		UnreservedContext _localctx = new UnreservedContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unreserved);
		try {
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VL:
			case A_F:
			case G_Z:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				alpha();
				}
				break;
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case D0:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				digit();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(519);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(520);
				match(T__6);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(521);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(522);
				match(T__12);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sub_delimsContext extends ParserRuleContext {
		public Sub_delimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_delims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterSub_delims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitSub_delims(this);
		}
	}

	public final Sub_delimsContext sub_delims() throws RecognitionException {
		Sub_delimsContext _localctx = new Sub_delimsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sub_delims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16760864L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AlphaContext extends ParserRuleContext {
		public TerminalNode A_F() { return getToken(URIParser.A_F, 0); }
		public TerminalNode G_Z() { return getToken(URIParser.G_Z, 0); }
		public TerminalNode VL() { return getToken(URIParser.VL, 0); }
		public AlphaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterAlpha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitAlpha(this);
		}
	}

	public final AlphaContext alpha() throws RecognitionException {
		AlphaContext _localctx = new AlphaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_alpha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class DigitContext extends ParserRuleContext {
		public TerminalNode D1() { return getToken(URIParser.D1, 0); }
		public TerminalNode D2() { return getToken(URIParser.D2, 0); }
		public TerminalNode D3() { return getToken(URIParser.D3, 0); }
		public TerminalNode D4() { return getToken(URIParser.D4, 0); }
		public TerminalNode D5() { return getToken(URIParser.D5, 0); }
		public TerminalNode D6() { return getToken(URIParser.D6, 0); }
		public TerminalNode D7() { return getToken(URIParser.D7, 0); }
		public TerminalNode D8() { return getToken(URIParser.D8, 0); }
		public TerminalNode D9() { return getToken(URIParser.D9, 0); }
		public TerminalNode D0() { return getToken(URIParser.D0, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitDigit(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 137304735744L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class HexdigitContext extends ParserRuleContext {
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public TerminalNode A_F() { return getToken(URIParser.A_F, 0); }
		public HexdigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexdigit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).enterHexdigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URIListener ) ((URIListener)listener).exitHexdigit(this);
		}
	}

	public final HexdigitContext hexdigit() throws RecognitionException {
		HexdigitContext _localctx = new HexdigitContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_hexdigit);
		try {
			setState(533);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case D0:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				digit();
				}
				break;
			case A_F:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				match(A_F);
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

	public static final String _serializedATN =
		"\u0004\u0001%\u0218\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0003\u0000M\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001S\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002Z\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003a\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003e\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004o\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005t\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005x\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0082\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u008a\b\u0007\n"+
		"\u0007\f\u0007\u008d\t\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u0092\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u0097\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u009d\b\t\n\t\f\t\u00a0\t\t\u0001\n\u0001\n\u0001\n\u0003\n"+
		"\u00a5\b\n\u0001\u000b\u0005\u000b\u00a8\b\u000b\n\u000b\f\u000b\u00ab"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00b0\b\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0004\r\u00b6\b\r\u000b\r\f\r\u00b7\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0004\r\u00be\b\r\u000b\r\f\r\u00bf\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00df\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00f0\b\u000e\u0001\u000e\u0003\u000e\u00f3"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0102\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0107\b\u000e\u0001\u000e\u0003\u000e\u010a\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0117\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u011c\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0121\b\u000e\u0001"+
		"\u000e\u0003\u000e\u0124\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u012f\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0134"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0139\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u013e\b\u000e\u0001\u000e"+
		"\u0003\u000e\u0141\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0149\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u014e\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0153\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0158\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u015d\b"+
		"\u000e\u0001\u000e\u0003\u000e\u0160\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0168\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u016d\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0172\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0177\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u017c\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0181"+
		"\b\u000e\u0001\u000e\u0003\u000e\u0184\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0188\b\u000e\u0001\u000f\u0003\u000f\u018b\b\u000f\u0001"+
		"\u000f\u0003\u000f\u018e\b\u000f\u0001\u000f\u0003\u000f\u0191\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u019a\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u01b1\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u01b6\b\u0013\n\u0013\f\u0013\u01b9\t\u0013\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u01bd\b\u0014\n\u0014\f\u0014\u01c0\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u01c4\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u01c9\b\u0016\n\u0016\f\u0016\u01cc\t\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u01d1\b\u0017\n\u0017\f\u0017\u01d4\t\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0005\u0019\u01d9\b\u0019\n\u0019\f\u0019\u01dc"+
		"\t\u0019\u0001\u001a\u0004\u001a\u01df\b\u001a\u000b\u001a\f\u001a\u01e0"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0004\u001b\u01e7\b\u001b"+
		"\u000b\u001b\f\u001b\u01e8\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u01f0\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u01f5\b\u001d\n\u001d\f\u001d\u01f8\t\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u01fd\b\u001e\n\u001e\f\u001e\u0200\t\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0003 \u020c\b \u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001$\u0001$\u0003$\u0216\b$\u0001$\u0000\u0000%\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFH\u0000\u0006\u0002\u0000\u001b\u001e$$\u0002\u0000"+
		"\u001b\u001f$$\u0001\u0000\u001b#\u0002\u0000\u0005\u0005\u000e\u0017"+
		"\u0001\u0000\u0018\u001a\u0001\u0000\u001b$\u025b\u0000L\u0001\u0000\u0000"+
		"\u0000\u0002R\u0001\u0000\u0000\u0000\u0004T\u0001\u0000\u0000\u0000\u0006"+
		"[\u0001\u0000\u0000\u0000\bn\u0001\u0000\u0000\u0000\np\u0001\u0000\u0000"+
		"\u0000\f\u0081\u0001\u0000\u0000\u0000\u000e\u0083\u0001\u0000\u0000\u0000"+
		"\u0010\u0091\u0001\u0000\u0000\u0000\u0012\u009e\u0001\u0000\u0000\u0000"+
		"\u0014\u00a4\u0001\u0000\u0000\u0000\u0016\u00a9\u0001\u0000\u0000\u0000"+
		"\u0018\u00ac\u0001\u0000\u0000\u0000\u001a\u00b3\u0001\u0000\u0000\u0000"+
		"\u001c\u0187\u0001\u0000\u0000\u0000\u001e\u0190\u0001\u0000\u0000\u0000"+
		" \u0199\u0001\u0000\u0000\u0000\"\u019b\u0001\u0000\u0000\u0000$\u01b0"+
		"\u0001\u0000\u0000\u0000&\u01b7\u0001\u0000\u0000\u0000(\u01be\u0001\u0000"+
		"\u0000\u0000*\u01c1\u0001\u0000\u0000\u0000,\u01c5\u0001\u0000\u0000\u0000"+
		".\u01cd\u0001\u0000\u0000\u00000\u01d5\u0001\u0000\u0000\u00002\u01da"+
		"\u0001\u0000\u0000\u00004\u01de\u0001\u0000\u0000\u00006\u01e6\u0001\u0000"+
		"\u0000\u00008\u01ef\u0001\u0000\u0000\u0000:\u01f6\u0001\u0000\u0000\u0000"+
		"<\u01fe\u0001\u0000\u0000\u0000>\u0201\u0001\u0000\u0000\u0000@\u020b"+
		"\u0001\u0000\u0000\u0000B\u020d\u0001\u0000\u0000\u0000D\u020f\u0001\u0000"+
		"\u0000\u0000F\u0211\u0001\u0000\u0000\u0000H\u0215\u0001\u0000\u0000\u0000"+
		"JM\u0003\u0002\u0001\u0000KM\u0003\u0004\u0002\u0000LJ\u0001\u0000\u0000"+
		"\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0005\u0000"+
		"\u0000\u0001O\u0001\u0001\u0000\u0000\u0000PS\u0003\u0006\u0003\u0000"+
		"QS\u0003\n\u0005\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"S\u0003\u0001\u0000\u0000\u0000TU\u0003\u000e\u0007\u0000UV\u0005\u0001"+
		"\u0000\u0000VY\u0003\b\u0004\u0000WX\u0005\u0002\u0000\u0000XZ\u0003:"+
		"\u001d\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0005"+
		"\u0001\u0000\u0000\u0000[\\\u0003\u000e\u0007\u0000\\]\u0005\u0001\u0000"+
		"\u0000]`\u0003\b\u0004\u0000^_\u0005\u0002\u0000\u0000_a\u0003:\u001d"+
		"\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ad\u0001\u0000"+
		"\u0000\u0000bc\u0005\u0003\u0000\u0000ce\u0003<\u001e\u0000db\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000e\u0007\u0001\u0000\u0000\u0000"+
		"fg\u0005\u0004\u0000\u0000gh\u0005\u0004\u0000\u0000hi\u0003\u0010\b\u0000"+
		"ij\u0003(\u0014\u0000jo\u0001\u0000\u0000\u0000ko\u0003*\u0015\u0000l"+
		"o\u0003.\u0017\u0000mo\u00030\u0018\u0000nf\u0001\u0000\u0000\u0000nk"+
		"\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000"+
		"\u0000o\t\u0001\u0000\u0000\u0000ps\u0003\f\u0006\u0000qr\u0005\u0002"+
		"\u0000\u0000rt\u0003:\u001d\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tw\u0001\u0000\u0000\u0000uv\u0005\u0003\u0000\u0000vx\u0003"+
		"<\u001e\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u000b"+
		"\u0001\u0000\u0000\u0000yz\u0005\u0004\u0000\u0000z{\u0005\u0004\u0000"+
		"\u0000{|\u0003\u0010\b\u0000|}\u0003(\u0014\u0000}\u0082\u0001\u0000\u0000"+
		"\u0000~\u0082\u0003*\u0015\u0000\u007f\u0082\u0003,\u0016\u0000\u0080"+
		"\u0082\u00030\u0018\u0000\u0081y\u0001\u0000\u0000\u0000\u0081~\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\r\u0001\u0000\u0000\u0000\u0083\u008b\u0003D"+
		"\"\u0000\u0084\u008a\u0003D\"\u0000\u0085\u008a\u0003F#\u0000\u0086\u008a"+
		"\u0005\u0005\u0000\u0000\u0087\u008a\u0005\u0006\u0000\u0000\u0088\u008a"+
		"\u0005\u0007\u0000\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u0089\u0085"+
		"\u0001\u0000\u0000\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008d"+
		"\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u000f\u0001\u0000\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0003\u0012\t\u0000\u008f\u0090\u0005"+
		"\b\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008e\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0096\u0003\u0014\n\u0000\u0094\u0095\u0005\u0001\u0000"+
		"\u0000\u0095\u0097\u0003\u0016\u000b\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0011\u0001\u0000\u0000"+
		"\u0000\u0098\u009d\u0003@ \u0000\u0099\u009d\u0003>\u001f\u0000\u009a"+
		"\u009d\u0003B!\u0000\u009b\u009d\u0005\u0001\u0000\u0000\u009c\u0098\u0001"+
		"\u0000\u0000\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001"+
		"\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\u0013\u0001\u0000\u0000\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a5\u0003\u0018\f\u0000\u00a2\u00a5\u0003\""+
		"\u0011\u0000\u00a3\u00a5\u0003&\u0013\u0000\u00a4\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a5\u0015\u0001\u0000\u0000\u0000\u00a6\u00a8\u0003F#\u0000\u00a7"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u0017\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac"+
		"\u00af\u0005\t\u0000\u0000\u00ad\u00b0\u0003\u001c\u000e\u0000\u00ae\u00b0"+
		"\u0003\u001a\r\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"\n\u0000\u0000\u00b2\u0019\u0001\u0000\u0000\u0000\u00b3\u00b5\u0005\u0018"+
		"\u0000\u0000\u00b4\u00b6\u0003H$\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bd\u0005\u0007\u0000\u0000\u00ba\u00be\u0003@ \u0000\u00bb\u00be"+
		"\u0003B!\u0000\u00bc\u00be\u0005\u0001\u0000\u0000\u00bd\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u001b\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0003\u001e\u000f\u0000\u00c2\u00c3\u0005\u0001"+
		"\u0000\u0000\u00c3\u00c4\u0003\u001e\u000f\u0000\u00c4\u00c5\u0005\u0001"+
		"\u0000\u0000\u00c5\u00c6\u0003\u001e\u000f\u0000\u00c6\u00c7\u0005\u0001"+
		"\u0000\u0000\u00c7\u00c8\u0003\u001e\u000f\u0000\u00c8\u00c9\u0005\u0001"+
		"\u0000\u0000\u00c9\u00ca\u0003\u001e\u000f\u0000\u00ca\u00cb\u0005\u0001"+
		"\u0000\u0000\u00cb\u00cc\u0003\u001e\u000f\u0000\u00cc\u00cd\u0005\u0001"+
		"\u0000\u0000\u00cd\u00ce\u0003 \u0010\u0000\u00ce\u0188\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0005\u0001\u0000\u0000\u00d0\u00d1\u0005\u0001\u0000"+
		"\u0000\u00d1\u00d2\u0003\u001e\u000f\u0000\u00d2\u00d3\u0005\u0001\u0000"+
		"\u0000\u00d3\u00d4\u0003\u001e\u000f\u0000\u00d4\u00d5\u0005\u0001\u0000"+
		"\u0000\u00d5\u00d6\u0003\u001e\u000f\u0000\u00d6\u00d7\u0005\u0001\u0000"+
		"\u0000\u00d7\u00d8\u0003\u001e\u000f\u0000\u00d8\u00d9\u0005\u0001\u0000"+
		"\u0000\u00d9\u00da\u0003\u001e\u000f\u0000\u00da\u00db\u0005\u0001\u0000"+
		"\u0000\u00db\u00dc\u0003 \u0010\u0000\u00dc\u0188\u0001\u0000\u0000\u0000"+
		"\u00dd\u00df\u0003\u001e\u000f\u0000\u00de\u00dd\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0005\u0001\u0000\u0000\u00e1\u00e2\u0005\u0001\u0000\u0000"+
		"\u00e2\u00e3\u0003\u001e\u000f\u0000\u00e3\u00e4\u0005\u0001\u0000\u0000"+
		"\u00e4\u00e5\u0003\u001e\u000f\u0000\u00e5\u00e6\u0005\u0001\u0000\u0000"+
		"\u00e6\u00e7\u0003\u001e\u000f\u0000\u00e7\u00e8\u0005\u0001\u0000\u0000"+
		"\u00e8\u00e9\u0003\u001e\u000f\u0000\u00e9\u00ea\u0005\u0001\u0000\u0000"+
		"\u00ea\u00eb\u0003 \u0010\u0000\u00eb\u0188\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0003\u001e\u000f\u0000\u00ed\u00ee\u0005\u0001\u0000\u0000\u00ee"+
		"\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ec\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f3\u0003\u001e\u000f\u0000\u00f2\u00ef\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0005\u0001\u0000\u0000\u00f5\u00f6\u0005\u0001\u0000\u0000\u00f6"+
		"\u00f7\u0003\u001e\u000f\u0000\u00f7\u00f8\u0005\u0001\u0000\u0000\u00f8"+
		"\u00f9\u0003\u001e\u000f\u0000\u00f9\u00fa\u0005\u0001\u0000\u0000\u00fa"+
		"\u00fb\u0003\u001e\u000f\u0000\u00fb\u00fc\u0005\u0001\u0000\u0000\u00fc"+
		"\u00fd\u0003 \u0010\u0000\u00fd\u0188\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0003\u001e\u000f\u0000\u00ff\u0100\u0005\u0001\u0000\u0000\u0100\u0102"+
		"\u0001\u0000\u0000\u0000\u0101\u00fe\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0003\u001e\u000f\u0000\u0104\u0105\u0005\u0001\u0000\u0000\u0105\u0107"+
		"\u0001\u0000\u0000\u0000\u0106\u0101\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010a"+
		"\u0003\u001e\u000f\u0000\u0109\u0106\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0005\u0001\u0000\u0000\u010c\u010d\u0005\u0001\u0000\u0000\u010d\u010e"+
		"\u0003\u001e\u000f\u0000\u010e\u010f\u0005\u0001\u0000\u0000\u010f\u0110"+
		"\u0003\u001e\u000f\u0000\u0110\u0111\u0005\u0001\u0000\u0000\u0111\u0112"+
		"\u0003 \u0010\u0000\u0112\u0188\u0001\u0000\u0000\u0000\u0113\u0114\u0003"+
		"\u001e\u000f\u0000\u0114\u0115\u0005\u0001\u0000\u0000\u0115\u0117\u0001"+
		"\u0000\u0000\u0000\u0116\u0113\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0003"+
		"\u001e\u000f\u0000\u0119\u011a\u0005\u0001\u0000\u0000\u011a\u011c\u0001"+
		"\u0000\u0000\u0000\u011b\u0116\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0003"+
		"\u001e\u000f\u0000\u011e\u011f\u0005\u0001\u0000\u0000\u011f\u0121\u0001"+
		"\u0000\u0000\u0000\u0120\u011b\u0001\u0000\u0000\u0000\u0120\u0121\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0124\u0003"+
		"\u001e\u000f\u0000\u0123\u0120\u0001\u0000\u0000\u0000\u0123\u0124\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0005"+
		"\u0001\u0000\u0000\u0126\u0127\u0005\u0001\u0000\u0000\u0127\u0128\u0003"+
		"\u001e\u000f\u0000\u0128\u0129\u0005\u0001\u0000\u0000\u0129\u012a\u0003"+
		" \u0010\u0000\u012a\u0188\u0001\u0000\u0000\u0000\u012b\u012c\u0003\u001e"+
		"\u000f\u0000\u012c\u012d\u0005\u0001\u0000\u0000\u012d\u012f\u0001\u0000"+
		"\u0000\u0000\u012e\u012b\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0003\u001e"+
		"\u000f\u0000\u0131\u0132\u0005\u0001\u0000\u0000\u0132\u0134\u0001\u0000"+
		"\u0000\u0000\u0133\u012e\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0136\u0003\u001e"+
		"\u000f\u0000\u0136\u0137\u0005\u0001\u0000\u0000\u0137\u0139\u0001\u0000"+
		"\u0000\u0000\u0138\u0133\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b\u0003\u001e"+
		"\u000f\u0000\u013b\u013c\u0005\u0001\u0000\u0000\u013c\u013e\u0001\u0000"+
		"\u0000\u0000\u013d\u0138\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0141\u0003\u001e"+
		"\u000f\u0000\u0140\u013d\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u0001"+
		"\u0000\u0000\u0143\u0144\u0005\u0001\u0000\u0000\u0144\u0188\u0003 \u0010"+
		"\u0000\u0145\u0146\u0003\u001e\u000f\u0000\u0146\u0147\u0005\u0001\u0000"+
		"\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0145\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0003\u001e\u000f\u0000\u014b\u014c\u0005\u0001\u0000"+
		"\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u0148\u0001\u0000\u0000"+
		"\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0003\u001e\u000f\u0000\u0150\u0151\u0005\u0001\u0000"+
		"\u0000\u0151\u0153\u0001\u0000\u0000\u0000\u0152\u014d\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0003\u001e\u000f\u0000\u0155\u0156\u0005\u0001\u0000"+
		"\u0000\u0156\u0158\u0001\u0000\u0000\u0000\u0157\u0152\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u0003\u001e\u000f\u0000\u015a\u015b\u0005\u0001\u0000"+
		"\u0000\u015b\u015d\u0001\u0000\u0000\u0000\u015c\u0157\u0001\u0000\u0000"+
		"\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000"+
		"\u0000\u015e\u0160\u0003\u001e\u000f\u0000\u015f\u015c\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u0005\u0001\u0000\u0000\u0162\u0163\u0005\u0001\u0000"+
		"\u0000\u0163\u0188\u0003\u001e\u000f\u0000\u0164\u0165\u0003\u001e\u000f"+
		"\u0000\u0165\u0166\u0005\u0001\u0000\u0000\u0166\u0168\u0001\u0000\u0000"+
		"\u0000\u0167\u0164\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0003\u001e\u000f"+
		"\u0000\u016a\u016b\u0005\u0001\u0000\u0000\u016b\u016d\u0001\u0000\u0000"+
		"\u0000\u016c\u0167\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0003\u001e\u000f"+
		"\u0000\u016f\u0170\u0005\u0001\u0000\u0000\u0170\u0172\u0001\u0000\u0000"+
		"\u0000\u0171\u016c\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0003\u001e\u000f"+
		"\u0000\u0174\u0175\u0005\u0001\u0000\u0000\u0175\u0177\u0001\u0000\u0000"+
		"\u0000\u0176\u0171\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0003\u001e\u000f"+
		"\u0000\u0179\u017a\u0005\u0001\u0000\u0000\u017a\u017c\u0001\u0000\u0000"+
		"\u0000\u017b\u0176\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017e\u0003\u001e\u000f"+
		"\u0000\u017e\u017f\u0005\u0001\u0000\u0000\u017f\u0181\u0001\u0000\u0000"+
		"\u0000\u0180\u017b\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000"+
		"\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0003\u001e\u000f"+
		"\u0000\u0183\u0180\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0005\u0001\u0000"+
		"\u0000\u0186\u0188\u0005\u0001\u0000\u0000\u0187\u00c1\u0001\u0000\u0000"+
		"\u0000\u0187\u00cf\u0001\u0000\u0000\u0000\u0187\u00de\u0001\u0000\u0000"+
		"\u0000\u0187\u00f2\u0001\u0000\u0000\u0000\u0187\u0109\u0001\u0000\u0000"+
		"\u0000\u0187\u0123\u0001\u0000\u0000\u0000\u0187\u0140\u0001\u0000\u0000"+
		"\u0000\u0187\u015f\u0001\u0000\u0000\u0000\u0187\u0183\u0001\u0000\u0000"+
		"\u0000\u0188\u001d\u0001\u0000\u0000\u0000\u0189\u018b\u0003H$\u0000\u018a"+
		"\u0189\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b"+
		"\u018c\u0001\u0000\u0000\u0000\u018c\u018e\u0003H$\u0000\u018d\u018a\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0001"+
		"\u0000\u0000\u0000\u018f\u0191\u0003H$\u0000\u0190\u018d\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000"+
		"\u0000\u0192\u0193\u0003H$\u0000\u0193\u001f\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u0003\u001e\u000f\u0000\u0195\u0196\u0005\u0001\u0000\u0000\u0196"+
		"\u0197\u0003\u001e\u000f\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198"+
		"\u019a\u0003\"\u0011\u0000\u0199\u0194\u0001\u0000\u0000\u0000\u0199\u0198"+
		"\u0001\u0000\u0000\u0000\u019a!\u0001\u0000\u0000\u0000\u019b\u019c\u0003"+
		"$\u0012\u0000\u019c\u019d\u0005\u0007\u0000\u0000\u019d\u019e\u0003$\u0012"+
		"\u0000\u019e\u019f\u0005\u0007\u0000\u0000\u019f\u01a0\u0003$\u0012\u0000"+
		"\u01a0\u01a1\u0005\u0007\u0000\u0000\u01a1\u01a2\u0003$\u0012\u0000\u01a2"+
		"#\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005\u001b\u0000\u0000\u01a4\u01a5"+
		"\u0003F#\u0000\u01a5\u01a6\u0003F#\u0000\u01a6\u01b1\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0005\u001c\u0000\u0000\u01a8\u01a9\u0007\u0000\u0000"+
		"\u0000\u01a9\u01b1\u0003F#\u0000\u01aa\u01ab\u0005\u001c\u0000\u0000\u01ab"+
		"\u01ac\u0005\u001f\u0000\u0000\u01ac\u01b1\u0007\u0001\u0000\u0000\u01ad"+
		"\u01ae\u0007\u0002\u0000\u0000\u01ae\u01b1\u0003F#\u0000\u01af\u01b1\u0003"+
		"F#\u0000\u01b0\u01a3\u0001\u0000\u0000\u0000\u01b0\u01a7\u0001\u0000\u0000"+
		"\u0000\u01b0\u01aa\u0001\u0000\u0000\u0000\u01b0\u01ad\u0001\u0000\u0000"+
		"\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1%\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b6\u0003@ \u0000\u01b3\u01b6\u0003>\u001f\u0000\u01b4\u01b6"+
		"\u0003B!\u0000\u01b5\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b8\'\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0005\u0004\u0000\u0000\u01bb\u01bd\u00032\u0019\u0000"+
		"\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01c0\u0001\u0000\u0000\u0000"+
		"\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000"+
		"\u01bf)\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c3\u0005\u0004\u0000\u0000\u01c2\u01c4\u00034\u001a\u0000\u01c3\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4+\u0001"+
		"\u0000\u0000\u0000\u01c5\u01ca\u00036\u001b\u0000\u01c6\u01c7\u0005\u0004"+
		"\u0000\u0000\u01c7\u01c9\u00032\u0019\u0000\u01c8\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c9\u01cc\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb-\u0001\u0000\u0000\u0000"+
		"\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cd\u01d2\u00034\u001a\u0000\u01ce"+
		"\u01cf\u0005\u0004\u0000\u0000\u01cf\u01d1\u00032\u0019\u0000\u01d0\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d4\u0001\u0000\u0000\u0000\u01d2\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3/\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d61\u0001\u0000\u0000\u0000\u01d7\u01d9\u00038\u001c"+
		"\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000"+
		"\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000"+
		"\u0000\u01db3\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000"+
		"\u01dd\u01df\u00038\u001c\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01df"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e15\u0001\u0000\u0000\u0000\u01e2\u01e7"+
		"\u0003@ \u0000\u01e3\u01e7\u0003>\u001f\u0000\u01e4\u01e7\u0003B!\u0000"+
		"\u01e5\u01e7\u0005\b\u0000\u0000\u01e6\u01e2\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9"+
		"7\u0001\u0000\u0000\u0000\u01ea\u01f0\u0003@ \u0000\u01eb\u01f0\u0003"+
		">\u001f\u0000\u01ec\u01f0\u0003B!\u0000\u01ed\u01f0\u0005\u0001\u0000"+
		"\u0000\u01ee\u01f0\u0005\b\u0000\u0000\u01ef\u01ea\u0001\u0000\u0000\u0000"+
		"\u01ef\u01eb\u0001\u0000\u0000\u0000\u01ef\u01ec\u0001\u0000\u0000\u0000"+
		"\u01ef\u01ed\u0001\u0000\u0000\u0000\u01ef\u01ee\u0001\u0000\u0000\u0000"+
		"\u01f09\u0001\u0000\u0000\u0000\u01f1\u01f5\u00038\u001c\u0000\u01f2\u01f5"+
		"\u0005\u0004\u0000\u0000\u01f3\u01f5\u0005\u0002\u0000\u0000\u01f4\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f8\u0001\u0000\u0000\u0000\u01f6\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7;\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f9\u01fd\u0003"+
		"8\u001c\u0000\u01fa\u01fd\u0005\u0004\u0000\u0000\u01fb\u01fd\u0005\u0002"+
		"\u0000\u0000\u01fc\u01f9\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fd\u0200\u0001\u0000"+
		"\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000"+
		"\u0000\u0000\u01ff=\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000"+
		"\u0000\u0201\u0202\u0005\u000b\u0000\u0000\u0202\u0203\u0003H$\u0000\u0203"+
		"\u0204\u0003H$\u0000\u0204?\u0001\u0000\u0000\u0000\u0205\u020c\u0003"+
		"D\"\u0000\u0206\u020c\u0003F#\u0000\u0207\u020c\u0005\u0006\u0000\u0000"+
		"\u0208\u020c\u0005\u0007\u0000\u0000\u0209\u020c\u0005\f\u0000\u0000\u020a"+
		"\u020c\u0005\r\u0000\u0000\u020b\u0205\u0001\u0000\u0000\u0000\u020b\u0206"+
		"\u0001\u0000\u0000\u0000\u020b\u0207\u0001\u0000\u0000\u0000\u020b\u0208"+
		"\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020a"+
		"\u0001\u0000\u0000\u0000\u020cA\u0001\u0000\u0000\u0000\u020d\u020e\u0007"+
		"\u0003\u0000\u0000\u020eC\u0001\u0000\u0000\u0000\u020f\u0210\u0007\u0004"+
		"\u0000\u0000\u0210E\u0001\u0000\u0000\u0000\u0211\u0212\u0007\u0005\u0000"+
		"\u0000\u0212G\u0001\u0000\u0000\u0000\u0213\u0216\u0003F#\u0000\u0214"+
		"\u0216\u0005\u0019\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0215"+
		"\u0214\u0001\u0000\u0000\u0000\u0216I\u0001\u0000\u0000\u0000HLRY`dns"+
		"w\u0081\u0089\u008b\u0091\u0096\u009c\u009e\u00a4\u00a9\u00af\u00b7\u00bd"+
		"\u00bf\u00de\u00ef\u00f2\u0101\u0106\u0109\u0116\u011b\u0120\u0123\u012e"+
		"\u0133\u0138\u013d\u0140\u0148\u014d\u0152\u0157\u015c\u015f\u0167\u016c"+
		"\u0171\u0176\u017b\u0180\u0183\u0187\u018a\u018d\u0190\u0199\u01b0\u01b5"+
		"\u01b7\u01be\u01c3\u01ca\u01d2\u01da\u01e0\u01e6\u01e8\u01ef\u01f4\u01f6"+
		"\u01fc\u01fe\u020b\u0215";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}