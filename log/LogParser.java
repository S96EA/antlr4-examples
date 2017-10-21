// Generated from /home/neild47/IdeaProjects/JsonParser/src/log/Log.g4 by ANTLR 4.7
package log;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, STRING=2, INT=3, NEWLINE=4, WS=5;
	public static final int
		RULE_log = 0, RULE_ip = 1;
	public static final String[] ruleNames = {
		"log", "ip"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "STRING", "INT", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Log.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LogContext extends ParserRuleContext {
		public List<IpContext> ip() {
			return getRuleContexts(IpContext.class);
		}
		public IpContext ip(int i) {
			return getRuleContext(IpContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(LogParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LogParser.STRING, i);
		}
		public List<TerminalNode> INT() { return getTokens(LogParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LogParser.INT, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LogParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LogParser.NEWLINE, i);
		}
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogListener ) ((LogListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogListener ) ((LogListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogVisitor ) return ((LogVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(4);
				ip();
				setState(5);
				match(STRING);
				setState(6);
				match(INT);
				setState(7);
				match(NEWLINE);
				}
				}
				setState(13);
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

	public static class IpContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(LogParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LogParser.INT, i);
		}
		public IpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogListener ) ((LogListener)listener).enterIp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogListener ) ((LogListener)listener).exitIp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogVisitor ) return ((LogVisitor<? extends T>)visitor).visitIp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IpContext ip() throws RecognitionException {
		IpContext _localctx = new IpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(INT);
			setState(15);
			match(T__0);
			setState(16);
			match(INT);
			setState(17);
			match(T__0);
			setState(18);
			match(INT);
			setState(19);
			match(T__0);
			setState(20);
			match(INT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\31\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\2\2\4\2\4\2\2\2\27\2\r\3\2\2\2\4\20\3\2\2\2\6\7\5\4"+
		"\3\2\7\b\7\4\2\2\b\t\7\5\2\2\t\n\7\6\2\2\n\f\3\2\2\2\13\6\3\2\2\2\f\17"+
		"\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2\17\r\3\2\2\2\20\21\7\5"+
		"\2\2\21\22\7\3\2\2\22\23\7\5\2\2\23\24\7\3\2\2\24\25\7\5\2\2\25\26\7\3"+
		"\2\2\26\27\7\5\2\2\27\5\3\2\2\2\3\r";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}