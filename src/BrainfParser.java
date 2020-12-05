// Generated from C:/Users/peran/code/brainf/src\Brainf.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BrainfParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GREAT=1, LESS=2, PLUS=3, MINUS=4, DOT=5, COMMA=6, LBRAK=7, RBRAK=8, DISCARD=9;
	public static final int
		RULE_main = 0, RULE_prog = 1, RULE_cmd = 2, RULE_group = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "prog", "cmd", "group"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", "'<'", "'+'", "'-'", "'.'", "','", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GREAT", "LESS", "PLUS", "MINUS", "DOT", "COMMA", "LBRAK", "RBRAK", 
			"DISCARD"
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
	public String getGrammarFileName() { return "Brainf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BrainfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BrainfParser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfVisitor ) return ((BrainfVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			prog();
			setState(9);
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

	public static class ProgContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfVisitor ) return ((BrainfVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREAT) | (1L << LESS) | (1L << PLUS) | (1L << MINUS) | (1L << DOT) | (1L << COMMA) | (1L << LBRAK))) != 0)) {
				{
				{
				setState(11);
				cmd();
				}
				}
				setState(16);
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

	public static class CmdContext extends ParserRuleContext {
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	 
		public CmdContext() { }
		public void copyFrom(CmdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MinusContext extends CmdContext {
		public TerminalNode MINUS() { return getToken(BrainfParser.MINUS, 0); }
		public MinusContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfVisitor ) return ((BrainfVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommaContext extends CmdContext {
		public TerminalNode COMMA() { return getToken(BrainfParser.COMMA, 0); }
		public CommaContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfVisitor ) return ((BrainfVisitor<? extends T>)visitor).visitComma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotContext extends CmdContext {
		public TerminalNode DOT() { return getToken(BrainfParser.DOT, 0); }
		public DotContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfVisitor ) return ((BrainfVisitor<? extends T>)visitor).visitDot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessContext extends CmdContext {
		public TerminalNode LESS() { return getToken(BrainfParser.LESS, 0); }
		public LessContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfVisitor ) return ((BrainfVisitor<? extends T>)visitor).visitLess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreatContext extends CmdContext {
		public TerminalNode GREAT() { return getToken(BrainfParser.GREAT, 0); }
		public GreatContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfVisitor ) return ((BrainfVisitor<? extends T>)visitor).visitGreat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Group_labContext extends CmdContext {
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public Group_labContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfVisitor ) return ((BrainfVisitor<? extends T>)visitor).visitGroup_lab(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends CmdContext {
		public TerminalNode PLUS() { return getToken(BrainfParser.PLUS, 0); }
		public PlusContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfVisitor ) return ((BrainfVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GREAT:
				_localctx = new GreatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(GREAT);
				}
				break;
			case LESS:
				_localctx = new LessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(LESS);
				}
				break;
			case PLUS:
				_localctx = new PlusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(19);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(20);
				match(MINUS);
				}
				break;
			case DOT:
				_localctx = new DotContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(21);
				match(DOT);
				}
				break;
			case COMMA:
				_localctx = new CommaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(22);
				match(COMMA);
				}
				break;
			case LBRAK:
				_localctx = new Group_labContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(23);
				group();
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

	public static class GroupContext extends ParserRuleContext {
		public TerminalNode LBRAK() { return getToken(BrainfParser.LBRAK, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode RBRAK() { return getToken(BrainfParser.RBRAK, 0); }
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfVisitor ) return ((BrainfVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(LBRAK);
			setState(27);
			prog();
			setState(28);
			match(RBRAK);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13!\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\7\3\17\n\3\f\3\16\3\22\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\33\n\4\3\5\3\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2"+
		"\2#\2\n\3\2\2\2\4\20\3\2\2\2\6\32\3\2\2\2\b\34\3\2\2\2\n\13\5\4\3\2\13"+
		"\f\7\2\2\3\f\3\3\2\2\2\r\17\5\6\4\2\16\r\3\2\2\2\17\22\3\2\2\2\20\16\3"+
		"\2\2\2\20\21\3\2\2\2\21\5\3\2\2\2\22\20\3\2\2\2\23\33\7\3\2\2\24\33\7"+
		"\4\2\2\25\33\7\5\2\2\26\33\7\6\2\2\27\33\7\7\2\2\30\33\7\b\2\2\31\33\5"+
		"\b\5\2\32\23\3\2\2\2\32\24\3\2\2\2\32\25\3\2\2\2\32\26\3\2\2\2\32\27\3"+
		"\2\2\2\32\30\3\2\2\2\32\31\3\2\2\2\33\7\3\2\2\2\34\35\7\t\2\2\35\36\5"+
		"\4\3\2\36\37\7\n\2\2\37\t\3\2\2\2\4\20\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}