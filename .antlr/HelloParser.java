// Generated from c:\Users\i2771\Desktop\compilers\Hello.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, COMA=2, QOUTES=3, SIMI_COL=4, OR=5, AND=6, NOT=7, REL=8, TRUE=9, 
		FALSE=10, ADD=11, MINUS=12, MUL=13, DIV=14, EQUAL=15, IF=16, ELSE=17, 
		WHILE=18, OPEN_PAR=19, CLOSED_PAR=20, OPEN_CURL=21, CLOSED_CURL=22, ID=23, 
		NUMBER=24, WS=25, COMMENT=26;
	public static final int
		RULE_s = 0, RULE_expr = 1, RULE_t = 2, RULE_f = 3, RULE_bool = 4, RULE_control = 5, 
		RULE_assign = 6, RULE_out = 7, RULE_outputs = 8;
	public static final String[] ruleNames = {
		"s", "expr", "t", "f", "bool", "control", "assign", "out", "outputs"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'print'", "','", "'\"'", "';'", "'||'", "'&&'", "'!'", null, "'true'", 
		"'false'", "'+'", "'-'", "'*'", "'/'", "'='", "'if'", "'else'", "'while'", 
		"'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "COMA", "QOUTES", "SIMI_COL", "OR", "AND", "NOT", "REL", "TRUE", 
		"FALSE", "ADD", "MINUS", "MUL", "DIV", "EQUAL", "IF", "ELSE", "WHILE", 
		"OPEN_PAR", "CLOSED_PAR", "OPEN_CURL", "CLOSED_CURL", "ID", "NUMBER", 
		"WS", "COMMENT"
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
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	 
		public SContext() { }
		public void copyFrom(SContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EpsilonContext extends SContext {
		public EpsilonContext(SContext ctx) { copyFrom(ctx); }
	}
	public static class ControlStatementContext extends SContext {
		public ControlContext control() {
			return getRuleContext(ControlContext.class,0);
		}
		public TerminalNode SIMI_COL() { return getToken(HelloParser.SIMI_COL, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public ControlStatementContext(SContext ctx) { copyFrom(ctx); }
	}
	public static class BoolStatementContext extends SContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode SIMI_COL() { return getToken(HelloParser.SIMI_COL, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public BoolStatementContext(SContext ctx) { copyFrom(ctx); }
	}
	public static class AssignStatementContext extends SContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode SIMI_COL() { return getToken(HelloParser.SIMI_COL, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public AssignStatementContext(SContext ctx) { copyFrom(ctx); }
	}
	public static class ArithStatementContext extends SContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SIMI_COL() { return getToken(HelloParser.SIMI_COL, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public ArithStatementContext(SContext ctx) { copyFrom(ctx); }
	}
	public static class OutStatementContext extends SContext {
		public OutContext out() {
			return getRuleContext(OutContext.class,0);
		}
		public TerminalNode SIMI_COL() { return getToken(HelloParser.SIMI_COL, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public OutStatementContext(SContext ctx) { copyFrom(ctx); }
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new BoolStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				bool(0);
				setState(19);
				match(SIMI_COL);
				setState(20);
				s();
				}
				break;
			case 2:
				_localctx = new ArithStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				expr(0);
				setState(23);
				match(SIMI_COL);
				setState(24);
				s();
				}
				break;
			case 3:
				_localctx = new ControlStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				control();
				setState(27);
				match(SIMI_COL);
				setState(28);
				s();
				}
				break;
			case 4:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				assign();
				setState(31);
				match(SIMI_COL);
				setState(32);
				s();
				}
				break;
			case 5:
				_localctx = new OutStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				out();
				setState(35);
				match(SIMI_COL);
				setState(36);
				s();
				}
				break;
			case 6:
				_localctx = new EpsilonContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(HelloParser.ADD, 0); }
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SubContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(HelloParser.MINUS, 0); }
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class T_evalContext extends ExprContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public T_evalContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new T_evalContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(42);
			t(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(50);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(44);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(45);
						match(ADD);
						setState(46);
						t(0);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(47);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(48);
						match(MINUS);
						setState(49);
						t(0);
						}
						break;
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TContext extends ParserRuleContext {
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
	 
		public TContext() { }
		public void copyFrom(TContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends TContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode DIV() { return getToken(HelloParser.DIV, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public DivContext(TContext ctx) { copyFrom(ctx); }
	}
	public static class MulContext extends TContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode MUL() { return getToken(HelloParser.MUL, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public MulContext(TContext ctx) { copyFrom(ctx); }
	}
	public static class F_evalContext extends TContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public F_evalContext(TContext ctx) { copyFrom(ctx); }
	}

	public final TContext t() throws RecognitionException {
		return t(0);
	}

	private TContext t(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TContext _localctx = new TContext(_ctx, _parentState);
		TContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_t, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new F_evalContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(56);
			f();
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(64);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new TContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t);
						setState(58);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(59);
						match(MUL);
						setState(60);
						f();
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new TContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t);
						setState(61);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(62);
						match(DIV);
						setState(63);
						f();
						}
						break;
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	 
		public FContext() { }
		public void copyFrom(FContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberContext extends FContext {
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public NumberContext(FContext ctx) { copyFrom(ctx); }
	}
	public static class ParExprContext extends FContext {
		public TerminalNode OPEN_PAR() { return getToken(HelloParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSED_PAR() { return getToken(HelloParser.CLOSED_PAR, 0); }
		public ParExprContext(FContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIdContext extends FContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public ExprIdContext(FContext ctx) { copyFrom(ctx); }
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_f);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ExprIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(ID);
				}
				break;
			case NUMBER:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(NUMBER);
				}
				break;
			case OPEN_PAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(OPEN_PAR);
				setState(72);
				expr(0);
				setState(73);
				match(CLOSED_PAR);
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	 
		public BoolContext() { }
		public void copyFrom(BoolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends BoolContext {
		public TerminalNode NOT() { return getToken(HelloParser.NOT, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public NotContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class OrContext extends BoolContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public TerminalNode OR() { return getToken(HelloParser.OR, 0); }
		public OrContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class AndContext extends BoolContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public TerminalNode AND() { return getToken(HelloParser.AND, 0); }
		public AndContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class RelContext extends BoolContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode REL() { return getToken(HelloParser.REL, 0); }
		public RelContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class TrueContext extends BoolContext {
		public TerminalNode TRUE() { return getToken(HelloParser.TRUE, 0); }
		public TrueContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class FalseContext extends BoolContext {
		public TerminalNode FALSE() { return getToken(HelloParser.FALSE, 0); }
		public FalseContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class BoolIdContext extends BoolContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public BoolIdContext(BoolContext ctx) { copyFrom(ctx); }
	}

	public final BoolContext bool() throws RecognitionException {
		return bool(0);
	}

	private BoolContext bool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolContext _localctx = new BoolContext(_ctx, _parentState);
		BoolContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_bool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(78);
				match(NOT);
				setState(79);
				bool(5);
				}
				break;
			case 2:
				{
				_localctx = new RelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				expr(0);
				setState(81);
				match(REL);
				setState(82);
				expr(0);
				}
				break;
			case 3:
				{
				_localctx = new BoolIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(TRUE);
				}
				break;
			case 5:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(95);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new OrContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(89);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(90);
						match(OR);
						setState(91);
						bool(8);
						}
						break;
					case 2:
						{
						_localctx = new AndContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(92);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(93);
						match(AND);
						setState(94);
						bool(7);
						}
						break;
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ControlContext extends ParserRuleContext {
		public ControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control; }
	 
		public ControlContext() { }
		public void copyFrom(ControlContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileContext extends ControlContext {
		public TerminalNode WHILE() { return getToken(HelloParser.WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(HelloParser.OPEN_PAR, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode CLOSED_PAR() { return getToken(HelloParser.CLOSED_PAR, 0); }
		public TerminalNode OPEN_CURL() { return getToken(HelloParser.OPEN_CURL, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode CLOSED_CURL() { return getToken(HelloParser.CLOSED_CURL, 0); }
		public WhileContext(ControlContext ctx) { copyFrom(ctx); }
	}
	public static class IfContext extends ControlContext {
		public TerminalNode IF() { return getToken(HelloParser.IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(HelloParser.OPEN_PAR, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode CLOSED_PAR() { return getToken(HelloParser.CLOSED_PAR, 0); }
		public TerminalNode OPEN_CURL() { return getToken(HelloParser.OPEN_CURL, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode CLOSED_CURL() { return getToken(HelloParser.CLOSED_CURL, 0); }
		public IfContext(ControlContext ctx) { copyFrom(ctx); }
	}
	public static class IfElseContext extends ControlContext {
		public TerminalNode IF() { return getToken(HelloParser.IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(HelloParser.OPEN_PAR, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode CLOSED_PAR() { return getToken(HelloParser.CLOSED_PAR, 0); }
		public List<TerminalNode> OPEN_CURL() { return getTokens(HelloParser.OPEN_CURL); }
		public TerminalNode OPEN_CURL(int i) {
			return getToken(HelloParser.OPEN_CURL, i);
		}
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public List<TerminalNode> CLOSED_CURL() { return getTokens(HelloParser.CLOSED_CURL); }
		public TerminalNode CLOSED_CURL(int i) {
			return getToken(HelloParser.CLOSED_CURL, i);
		}
		public TerminalNode ELSE() { return getToken(HelloParser.ELSE, 0); }
		public IfElseContext(ControlContext ctx) { copyFrom(ctx); }
	}

	public final ControlContext control() throws RecognitionException {
		ControlContext _localctx = new ControlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_control);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(IF);
				setState(101);
				match(OPEN_PAR);
				setState(102);
				bool(0);
				setState(103);
				match(CLOSED_PAR);
				setState(104);
				match(OPEN_CURL);
				setState(105);
				s();
				setState(106);
				match(CLOSED_CURL);
				}
				break;
			case 2:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(IF);
				setState(109);
				match(OPEN_PAR);
				setState(110);
				bool(0);
				setState(111);
				match(CLOSED_PAR);
				setState(112);
				match(OPEN_CURL);
				setState(113);
				s();
				setState(114);
				match(CLOSED_CURL);
				setState(115);
				match(ELSE);
				setState(116);
				match(OPEN_CURL);
				setState(117);
				s();
				setState(118);
				match(CLOSED_CURL);
				}
				break;
			case 3:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(WHILE);
				setState(121);
				match(OPEN_PAR);
				setState(122);
				bool(0);
				setState(123);
				match(CLOSED_PAR);
				setState(124);
				match(OPEN_CURL);
				setState(125);
				s();
				setState(126);
				match(CLOSED_CURL);
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

	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	 
		public AssignContext() { }
		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssigBoolContext extends AssignContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(HelloParser.EQUAL, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public AssigBoolContext(AssignContext ctx) { copyFrom(ctx); }
	}
	public static class AssigExprContext extends AssignContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(HelloParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssigExprContext(AssignContext ctx) { copyFrom(ctx); }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AssigExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(ID);
				setState(131);
				match(EQUAL);
				setState(132);
				expr(0);
				}
				break;
			case 2:
				_localctx = new AssigBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(ID);
				setState(134);
				match(EQUAL);
				setState(135);
				bool(0);
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

	public static class OutContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(HelloParser.OPEN_PAR, 0); }
		public OutputsContext outputs() {
			return getRuleContext(OutputsContext.class,0);
		}
		public TerminalNode CLOSED_PAR() { return getToken(HelloParser.CLOSED_PAR, 0); }
		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out; }
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_out);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__0);
			setState(139);
			match(OPEN_PAR);
			setState(140);
			outputs(0);
			setState(141);
			match(CLOSED_PAR);
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

	public static class OutputsContext extends ParserRuleContext {
		public OutputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputs; }
	 
		public OutputsContext() { }
		public void copyFrom(OutputsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EpsilonOutputContext extends OutputsContext {
		public EpsilonOutputContext(OutputsContext ctx) { copyFrom(ctx); }
	}
	public static class ExprOutputContext extends OutputsContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprOutputContext(OutputsContext ctx) { copyFrom(ctx); }
	}
	public static class ConcatenatedOutputContext extends OutputsContext {
		public List<OutputsContext> outputs() {
			return getRuleContexts(OutputsContext.class);
		}
		public OutputsContext outputs(int i) {
			return getRuleContext(OutputsContext.class,i);
		}
		public TerminalNode COMA() { return getToken(HelloParser.COMA, 0); }
		public ConcatenatedOutputContext(OutputsContext ctx) { copyFrom(ctx); }
	}
	public static class StringOutputContext extends OutputsContext {
		public List<TerminalNode> QOUTES() { return getTokens(HelloParser.QOUTES); }
		public TerminalNode QOUTES(int i) {
			return getToken(HelloParser.QOUTES, i);
		}
		public StringOutputContext(OutputsContext ctx) { copyFrom(ctx); }
	}

	public final OutputsContext outputs() throws RecognitionException {
		return outputs(0);
	}

	private OutputsContext outputs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OutputsContext _localctx = new OutputsContext(_ctx, _parentState);
		OutputsContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_outputs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new ExprOutputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(144);
				expr(0);
				}
				break;
			case 2:
				{
				_localctx = new StringOutputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(QOUTES);
				setState(146);
				matchWildcard();
				setState(147);
				match(QOUTES);
				}
				break;
			case 3:
				{
				_localctx = new EpsilonOutputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatenatedOutputContext(new OutputsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_outputs);
					setState(151);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(152);
					match(COMA);
					setState(153);
					outputs(5);
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 2:
			return t_sempred((TContext)_localctx, predIndex);
		case 4:
			return bool_sempred((BoolContext)_localctx, predIndex);
		case 8:
			return outputs_sempred((OutputsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean t_sempred(TContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bool_sempred(BoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean outputs_sempred(OutputsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00a2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2*\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\65\n\3\f\3\16"+
		"\38\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4C\n\4\f\4\16\4F\13\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6Z\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6b\n\6\f\6\16\6e\13\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0083\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u008b\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0098\n"+
		"\n\3\n\3\n\3\n\7\n\u009d\n\n\f\n\16\n\u00a0\13\n\3\n\2\6\4\6\n\22\13\2"+
		"\4\6\b\n\f\16\20\22\2\2\2\u00af\2)\3\2\2\2\4+\3\2\2\2\69\3\2\2\2\bM\3"+
		"\2\2\2\nY\3\2\2\2\f\u0082\3\2\2\2\16\u008a\3\2\2\2\20\u008c\3\2\2\2\22"+
		"\u0097\3\2\2\2\24\25\5\n\6\2\25\26\7\6\2\2\26\27\5\2\2\2\27*\3\2\2\2\30"+
		"\31\5\4\3\2\31\32\7\6\2\2\32\33\5\2\2\2\33*\3\2\2\2\34\35\5\f\7\2\35\36"+
		"\7\6\2\2\36\37\5\2\2\2\37*\3\2\2\2 !\5\16\b\2!\"\7\6\2\2\"#\5\2\2\2#*"+
		"\3\2\2\2$%\5\20\t\2%&\7\6\2\2&\'\5\2\2\2\'*\3\2\2\2(*\3\2\2\2)\24\3\2"+
		"\2\2)\30\3\2\2\2)\34\3\2\2\2) \3\2\2\2)$\3\2\2\2)(\3\2\2\2*\3\3\2\2\2"+
		"+,\b\3\1\2,-\5\6\4\2-\66\3\2\2\2./\f\5\2\2/\60\7\r\2\2\60\65\5\6\4\2\61"+
		"\62\f\4\2\2\62\63\7\16\2\2\63\65\5\6\4\2\64.\3\2\2\2\64\61\3\2\2\2\65"+
		"8\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\5\3\2\2\28\66\3\2\2\29:\b\4\1"+
		"\2:;\5\b\5\2;D\3\2\2\2<=\f\5\2\2=>\7\17\2\2>C\5\b\5\2?@\f\4\2\2@A\7\20"+
		"\2\2AC\5\b\5\2B<\3\2\2\2B?\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\7\3"+
		"\2\2\2FD\3\2\2\2GN\7\31\2\2HN\7\32\2\2IJ\7\25\2\2JK\5\4\3\2KL\7\26\2\2"+
		"LN\3\2\2\2MG\3\2\2\2MH\3\2\2\2MI\3\2\2\2N\t\3\2\2\2OP\b\6\1\2PQ\7\t\2"+
		"\2QZ\5\n\6\7RS\5\4\3\2ST\7\n\2\2TU\5\4\3\2UZ\3\2\2\2VZ\7\31\2\2WZ\7\13"+
		"\2\2XZ\7\f\2\2YO\3\2\2\2YR\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Zc\3\2"+
		"\2\2[\\\f\t\2\2\\]\7\7\2\2]b\5\n\6\n^_\f\b\2\2_`\7\b\2\2`b\5\n\6\ta[\3"+
		"\2\2\2a^\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\13\3\2\2\2ec\3\2\2\2f"+
		"g\7\22\2\2gh\7\25\2\2hi\5\n\6\2ij\7\26\2\2jk\7\27\2\2kl\5\2\2\2lm\7\30"+
		"\2\2m\u0083\3\2\2\2no\7\22\2\2op\7\25\2\2pq\5\n\6\2qr\7\26\2\2rs\7\27"+
		"\2\2st\5\2\2\2tu\7\30\2\2uv\7\23\2\2vw\7\27\2\2wx\5\2\2\2xy\7\30\2\2y"+
		"\u0083\3\2\2\2z{\7\24\2\2{|\7\25\2\2|}\5\n\6\2}~\7\26\2\2~\177\7\27\2"+
		"\2\177\u0080\5\2\2\2\u0080\u0081\7\30\2\2\u0081\u0083\3\2\2\2\u0082f\3"+
		"\2\2\2\u0082n\3\2\2\2\u0082z\3\2\2\2\u0083\r\3\2\2\2\u0084\u0085\7\31"+
		"\2\2\u0085\u0086\7\21\2\2\u0086\u008b\5\4\3\2\u0087\u0088\7\31\2\2\u0088"+
		"\u0089\7\21\2\2\u0089\u008b\5\n\6\2\u008a\u0084\3\2\2\2\u008a\u0087\3"+
		"\2\2\2\u008b\17\3\2\2\2\u008c\u008d\7\3\2\2\u008d\u008e\7\25\2\2\u008e"+
		"\u008f\5\22\n\2\u008f\u0090\7\26\2\2\u0090\21\3\2\2\2\u0091\u0092\b\n"+
		"\1\2\u0092\u0098\5\4\3\2\u0093\u0094\7\5\2\2\u0094\u0095\13\2\2\2\u0095"+
		"\u0098\7\5\2\2\u0096\u0098\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0093\3\2"+
		"\2\2\u0097\u0096\3\2\2\2\u0098\u009e\3\2\2\2\u0099\u009a\f\6\2\2\u009a"+
		"\u009b\7\4\2\2\u009b\u009d\5\22\n\7\u009c\u0099\3\2\2\2\u009d\u00a0\3"+
		"\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\23\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\17)\64\66BDMYac\u0082\u008a\u0097\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}