// Generated from parser\PLp1.g4 by ANTLR 4.1

package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PLp1Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTNUM=1, FLOATNUM=2, STRING=3, NEWLINE=4, WS=5, CLASS=6, CREATE=7, ENDIF=8, 
		ELSE=9, FALSE=10, FUNCTION=11, IF=12, LAMBDA=13, LET=14, METHOD=15, NULL=16, 
		SWITCH=17, THEN=18, TRUE=19, DEFAULT=20, INIT=21, CASE=22, RB=23, LB=24, 
		COLON=25, RP=26, AND=27, ASSIGN=28, COMMA=29, DIVIDE=30, DOT=31, EQUAL=32, 
		GREATER=33, GREATEREQUAL=34, INVOKE=35, LBK=36, LESS=37, LESSEQUAL=38, 
		LP=39, MINUS=40, MULTIPLY=41, NOT=42, NOTEQUAL=43, OR=44, PLUS=45, RBK=46, 
		ID=47;
	public static final String[] tokenNames = {
		"<INVALID>", "INTNUM", "FLOATNUM", "STRING", "NEWLINE", "WS", "'class'", 
		"'create'", "'endif'", "'else'", "'false'", "'function'", "'if'", "'lambda'", 
		"'let'", "'method'", "'null'", "'switch'", "'then'", "'true'", "'default'", 
		"'init'", "'case'", "'}'", "'{'", "':'", "')'", "'&'", "'='", "','", "'/'", 
		"'.'", "'=='", "'>'", "'>='", "'->'", "'['", "'<'", "'<='", "'('", "'-'", 
		"'*'", "'!'", "'!='", "'|'", "'+'", "']'", "ID"
	};
	public static final int
		RULE_program = 0, RULE_functionDef = 1, RULE_paramList = 2, RULE_classDef = 3, 
		RULE_variables = 4, RULE_init = 5, RULE_methods = 6, RULE_method = 7, 
		RULE_expressionList = 8, RULE_expression = 9, RULE_varRef = 10, RULE_constantExp = 11, 
		RULE_listExp = 12, RULE_createExpr = 13, RULE_ifExpr = 14, RULE_lambdaExpr = 15, 
		RULE_assignment = 16, RULE_switchExpr = 17, RULE_switchCases = 18, RULE_switchCase = 19, 
		RULE_defaultCase = 20, RULE_letExpr = 21, RULE_letDecls = 22, RULE_letDecl = 23, 
		RULE_argumentList = 24;
	public static final String[] ruleNames = {
		"program", "functionDef", "paramList", "classDef", "variables", "init", 
		"methods", "method", "expressionList", "expression", "varRef", "constantExp", 
		"listExp", "createExpr", "ifExpr", "lambdaExpr", "assignment", "switchExpr", 
		"switchCases", "switchCase", "defaultCase", "letExpr", "letDecls", "letDecl", 
		"argumentList"
	};

	@Override
	public String getGrammarFileName() { return "PLp1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public PLp1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ClassDefContext classDef(int i) {
			return getRuleContext(ClassDefContext.class,i);
		}
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public List<ClassDefContext> classDef() {
			return getRuleContexts(ClassDefContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(53);
				switch (_input.LA(1)) {
				case FUNCTION:
					{
					setState(50); functionDef();
					}
					break;
				case CLASS:
					{
					setState(51); classDef();
					}
					break;
				case INTNUM:
				case FLOATNUM:
				case STRING:
				case CREATE:
				case FALSE:
				case IF:
				case LAMBDA:
				case LET:
				case NULL:
				case SWITCH:
				case TRUE:
				case LBK:
				case LP:
				case NOT:
				case ID:
					{
					setState(52); expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTNUM) | (1L << FLOATNUM) | (1L << STRING) | (1L << CLASS) | (1L << CREATE) | (1L << FALSE) | (1L << FUNCTION) | (1L << IF) | (1L << LAMBDA) | (1L << LET) | (1L << NULL) | (1L << SWITCH) | (1L << TRUE) | (1L << LBK) | (1L << LP) | (1L << NOT) | (1L << ID))) != 0) );
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

	public static class FunctionDefContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode ID() { return getToken(PLp1Parser.ID, 0); }
		public TerminalNode FUNCTION() { return getToken(PLp1Parser.FUNCTION, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(FUNCTION);
			setState(58); match(ID);
			setState(59); match(LP);
			setState(60); paramList();
			setState(61); match(RP);
			setState(62); match(LB);
			setState(63); expressionList();
			setState(64); match(RB);
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

	public static class ParamListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(PLp1Parser.COMMA); }
		public List<TerminalNode> ID() { return getTokens(PLp1Parser.ID); }
		public TerminalNode COMMA(int i) {
			return getToken(PLp1Parser.COMMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(PLp1Parser.ID, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(66); match(ID);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(67); match(COMMA);
					setState(68); match(ID);
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ClassDefContext extends ParserRuleContext {
		public MethodsContext methods() {
			return getRuleContext(MethodsContext.class,0);
		}
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode ID() { return getToken(PLp1Parser.ID, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(PLp1Parser.CLASS, 0); }
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(CLASS);
			setState(77); match(ID);
			setState(78); match(LB);
			setState(79); variables();
			setState(80); init();
			setState(81); methods();
			setState(82); match(RB);
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

	public static class VariablesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PLp1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PLp1Parser.ID, i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(84); match(ID);
				}
				}
				setState(89);
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

	public static class InitContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode INIT() { return getToken(PLp1Parser.INIT, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(INIT);
			setState(91); match(LP);
			setState(92); paramList();
			setState(93); match(RP);
			setState(94); match(LB);
			setState(95); expressionList();
			setState(96); match(RB);
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

	public static class MethodsContext extends ParserRuleContext {
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public MethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitMethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodsContext methods() throws RecognitionException {
		MethodsContext _localctx = new MethodsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methods);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==METHOD) {
				{
				{
				setState(98); method();
				}
				}
				setState(103);
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public TerminalNode METHOD() { return getToken(PLp1Parser.METHOD, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode ID() { return getToken(PLp1Parser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(METHOD);
			setState(105); match(ID);
			setState(106); match(LP);
			setState(107); paramList();
			setState(108); match(RP);
			setState(109); match(LB);
			setState(110); expressionList();
			setState(111); match(RB);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113); expression(0);
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTNUM) | (1L << FLOATNUM) | (1L << STRING) | (1L << CREATE) | (1L << FALSE) | (1L << IF) | (1L << LAMBDA) | (1L << LET) | (1L << NULL) | (1L << SWITCH) | (1L << TRUE) | (1L << LBK) | (1L << LP) | (1L << NOT) | (1L << ID))) != 0) );
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

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public LambdaExprContext lambdaExpr() {
			return getRuleContext(LambdaExprContext.class,0);
		}
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public ConstantExpContext constantExp() {
			return getRuleContext(ConstantExpContext.class,0);
		}
		public TerminalNode AND() { return getToken(PLp1Parser.AND, 0); }
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode DIVIDE() { return getToken(PLp1Parser.DIVIDE, 0); }
		public CreateExprContext createExpr() {
			return getRuleContext(CreateExprContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS() { return getToken(PLp1Parser.LESS, 0); }
		public TerminalNode PLUS() { return getToken(PLp1Parser.PLUS, 0); }
		public TerminalNode GREATER() { return getToken(PLp1Parser.GREATER, 0); }
		public LetExprContext letExpr() {
			return getRuleContext(LetExprContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public TerminalNode GREATEREQUAL() { return getToken(PLp1Parser.GREATEREQUAL, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(PLp1Parser.MINUS, 0); }
		public TerminalNode OR() { return getToken(PLp1Parser.OR, 0); }
		public TerminalNode MULTIPLY() { return getToken(PLp1Parser.MULTIPLY, 0); }
		public TerminalNode EQUAL() { return getToken(PLp1Parser.EQUAL, 0); }
		public TerminalNode INVOKE() { return getToken(PLp1Parser.INVOKE, 0); }
		public TerminalNode NOT() { return getToken(PLp1Parser.NOT, 0); }
		public SwitchExprContext switchExpr() {
			return getRuleContext(SwitchExprContext.class,0);
		}
		public TerminalNode LESSEQUAL() { return getToken(PLp1Parser.LESSEQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(PLp1Parser.NOTEQUAL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(119); match(NOT);
				setState(120); expression(11);
				}
				break;

			case 2:
				{
				setState(121); varRef();
				}
				break;

			case 3:
				{
				setState(122); constantExp();
				}
				break;

			case 4:
				{
				setState(123); createExpr();
				}
				break;

			case 5:
				{
				setState(124); ifExpr();
				}
				break;

			case 6:
				{
				setState(125); lambdaExpr();
				}
				break;

			case 7:
				{
				setState(126); assignment();
				}
				break;

			case 8:
				{
				setState(127); switchExpr();
				}
				break;

			case 9:
				{
				setState(128); letExpr();
				}
				break;

			case 10:
				{
				setState(129); match(LP);
				setState(130); expression(0);
				setState(131); match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(135);
						if (!(23 >= _localctx._p)) throw new FailedPredicateException(this, "23 >= $_p");
						setState(136); match(MULTIPLY);
						setState(137); expression(24);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(22 >= _localctx._p)) throw new FailedPredicateException(this, "22 >= $_p");
						setState(139); match(DIVIDE);
						setState(140); expression(23);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(142); match(PLUS);
						setState(143); expression(22);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(145); match(MINUS);
						setState(146); expression(21);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(148); match(EQUAL);
						setState(149); expression(20);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(151); match(NOTEQUAL);
						setState(152); expression(19);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(154); match(LESS);
						setState(155); expression(18);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(157); match(LESSEQUAL);
						setState(158); expression(17);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(159);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(160); match(GREATER);
						setState(161); expression(16);
						}
						break;

					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(163); match(GREATEREQUAL);
						setState(164); expression(15);
						}
						break;

					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(166); match(OR);
						setState(167); expression(14);
						}
						break;

					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(169); match(AND);
						setState(170); expression(13);
						}
						break;

					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(172); match(INVOKE);
						setState(173); match(LP);
						setState(174); argumentList();
						setState(175); match(RP);
						}
						break;
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class VarRefContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PLp1Parser.DOT, 0); }
		public List<TerminalNode> ID() { return getTokens(PLp1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PLp1Parser.ID, i);
		}
		public VarRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterVarRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitVarRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitVarRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarRefContext varRef() throws RecognitionException {
		VarRefContext _localctx = new VarRefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(ID);
			setState(185);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(183); match(DOT);
				setState(184); match(ID);
				}
				break;
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

	public static class ConstantExpContext extends ParserRuleContext {
		public TerminalNode INTNUM() { return getToken(PLp1Parser.INTNUM, 0); }
		public TerminalNode TRUE() { return getToken(PLp1Parser.TRUE, 0); }
		public ListExpContext listExp() {
			return getRuleContext(ListExpContext.class,0);
		}
		public TerminalNode FLOATNUM() { return getToken(PLp1Parser.FLOATNUM, 0); }
		public TerminalNode NULL() { return getToken(PLp1Parser.NULL, 0); }
		public TerminalNode STRING() { return getToken(PLp1Parser.STRING, 0); }
		public TerminalNode FALSE() { return getToken(PLp1Parser.FALSE, 0); }
		public ConstantExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterConstantExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitConstantExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitConstantExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpContext constantExp() throws RecognitionException {
		ConstantExpContext _localctx = new ConstantExpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constantExp);
		try {
			setState(194);
			switch (_input.LA(1)) {
			case INTNUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(187); match(INTNUM);
				}
				break;
			case FLOATNUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); match(FLOATNUM);
				}
				break;
			case LBK:
				enterOuterAlt(_localctx, 3);
				{
				setState(189); listExp();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(190); match(STRING);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(191); match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(192); match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(193); match(NULL);
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

	public static class ListExpContext extends ParserRuleContext {
		public List<ConstantExpContext> constantExp() {
			return getRuleContexts(ConstantExpContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLp1Parser.COMMA); }
		public ConstantExpContext constantExp(int i) {
			return getRuleContext(ConstantExpContext.class,i);
		}
		public TerminalNode LBK() { return getToken(PLp1Parser.LBK, 0); }
		public TerminalNode RBK() { return getToken(PLp1Parser.RBK, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(PLp1Parser.COMMA, i);
		}
		public ListExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterListExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitListExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitListExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListExpContext listExp() throws RecognitionException {
		ListExpContext _localctx = new ListExpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); match(LBK);
			setState(205);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTNUM) | (1L << FLOATNUM) | (1L << STRING) | (1L << FALSE) | (1L << NULL) | (1L << TRUE) | (1L << LBK))) != 0)) {
				{
				setState(197); constantExp();
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(198); match(COMMA);
					setState(199); constantExp();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(207); match(RBK);
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

	public static class CreateExprContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PLp1Parser.CREATE, 0); }
		public TerminalNode ID() { return getToken(PLp1Parser.ID, 0); }
		public CreateExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterCreateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitCreateExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitCreateExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateExprContext createExpr() throws RecognitionException {
		CreateExprContext _localctx = new CreateExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_createExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(CREATE);
			setState(210); match(ID);
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

	public static class IfExprContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(PLp1Parser.THEN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IF() { return getToken(PLp1Parser.IF, 0); }
		public TerminalNode ELSE() { return getToken(PLp1Parser.ELSE, 0); }
		public TerminalNode ENDIF() { return getToken(PLp1Parser.ENDIF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); match(IF);
			setState(213); expression(0);
			setState(214); match(THEN);
			setState(215); expression(0);
			setState(216); match(ELSE);
			setState(217); expression(0);
			setState(218); match(ENDIF);
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

	public static class LambdaExprContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public TerminalNode LAMBDA() { return getToken(PLp1Parser.LAMBDA, 0); }
		public LambdaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitLambdaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExprContext lambdaExpr() throws RecognitionException {
		LambdaExprContext _localctx = new LambdaExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lambdaExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); match(LAMBDA);
			setState(221); match(LP);
			setState(222); paramList();
			setState(223); match(RP);
			setState(224); match(LB);
			setState(225); expressionList();
			setState(226); match(RB);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(PLp1Parser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(PLp1Parser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); match(ID);
			setState(229); match(ASSIGN);
			setState(230); expression(0);
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

	public static class SwitchExprContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public SwitchCasesContext switchCases() {
			return getRuleContext(SwitchCasesContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(PLp1Parser.SWITCH, 0); }
		public DefaultCaseContext defaultCase() {
			return getRuleContext(DefaultCaseContext.class,0);
		}
		public SwitchExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterSwitchExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitSwitchExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitSwitchExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchExprContext switchExpr() throws RecognitionException {
		SwitchExprContext _localctx = new SwitchExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_switchExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); match(SWITCH);
			setState(233); match(LB);
			setState(234); switchCases();
			setState(235); defaultCase();
			setState(236); match(RB);
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

	public static class SwitchCasesContext extends ParserRuleContext {
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterSwitchCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitSwitchCases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitSwitchCases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCasesContext switchCases() throws RecognitionException {
		SwitchCasesContext _localctx = new SwitchCasesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switchCases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(238); switchCase();
				}
				}
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
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

	public static class SwitchCaseContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode CASE() { return getToken(PLp1Parser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PLp1Parser.COLON, 0); }
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitSwitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_switchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(CASE);
			setState(244); expression(0);
			setState(245); match(COLON);
			setState(246); expressionList();
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

	public static class DefaultCaseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(PLp1Parser.DEFAULT, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PLp1Parser.COLON, 0); }
		public DefaultCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterDefaultCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitDefaultCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitDefaultCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultCaseContext defaultCase() throws RecognitionException {
		DefaultCaseContext _localctx = new DefaultCaseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_defaultCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(DEFAULT);
			setState(249); match(COLON);
			setState(250); expressionList();
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

	public static class LetExprContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public TerminalNode LET() { return getToken(PLp1Parser.LET, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public LetDeclsContext letDecls() {
			return getRuleContext(LetDeclsContext.class,0);
		}
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public LetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterLetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitLetExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitLetExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetExprContext letExpr() throws RecognitionException {
		LetExprContext _localctx = new LetExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_letExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(LET);
			setState(253); match(LP);
			setState(254); letDecls();
			setState(255); match(RP);
			setState(256); match(LB);
			setState(257); expressionList();
			setState(258); match(RB);
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

	public static class LetDeclsContext extends ParserRuleContext {
		public List<LetDeclContext> letDecl() {
			return getRuleContexts(LetDeclContext.class);
		}
		public LetDeclContext letDecl(int i) {
			return getRuleContext(LetDeclContext.class,i);
		}
		public LetDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterLetDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitLetDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitLetDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetDeclsContext letDecls() throws RecognitionException {
		LetDeclsContext _localctx = new LetDeclsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_letDecls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBK) {
				{
				{
				setState(260); letDecl();
				}
				}
				setState(265);
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

	public static class LetDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLp1Parser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBK() { return getToken(PLp1Parser.LBK, 0); }
		public TerminalNode RBK() { return getToken(PLp1Parser.RBK, 0); }
		public LetDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterLetDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitLetDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitLetDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetDeclContext letDecl() throws RecognitionException {
		LetDeclContext _localctx = new LetDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_letDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); match(LBK);
			setState(267); match(ID);
			setState(268); expression(0);
			setState(269); match(RBK);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLp1Parser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(PLp1Parser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTNUM) | (1L << FLOATNUM) | (1L << STRING) | (1L << CREATE) | (1L << FALSE) | (1L << IF) | (1L << LAMBDA) | (1L << LET) | (1L << NULL) | (1L << SWITCH) | (1L << TRUE) | (1L << LBK) | (1L << LP) | (1L << NOT) | (1L << ID))) != 0)) {
				{
				setState(271); expression(0);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(272); match(COMMA);
					setState(273); expression(0);
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 23 >= _localctx._p;

		case 1: return 22 >= _localctx._p;

		case 2: return 21 >= _localctx._p;

		case 3: return 20 >= _localctx._p;

		case 4: return 19 >= _localctx._p;

		case 5: return 18 >= _localctx._p;

		case 6: return 17 >= _localctx._p;

		case 7: return 16 >= _localctx._p;

		case 8: return 15 >= _localctx._p;

		case 9: return 14 >= _localctx._p;

		case 10: return 13 >= _localctx._p;

		case 11: return 12 >= _localctx._p;

		case 12: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\61\u011c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\6\28\n\2\r\2\16\29\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\5\4M\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\7\6X\n\6\f\6\16\6[\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\7\bf\n\b\f\b\16\bi\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\6\nu\n\n\r\n\16\nv\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u0088\n\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b4\n\13\f\13\16"+
		"\13\u00b7\13\13\3\f\3\f\3\f\5\f\u00bc\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00c5\n\r\3\16\3\16\3\16\3\16\7\16\u00cb\n\16\f\16\16\16\u00ce\13"+
		"\16\5\16\u00d0\n\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\6\24\u00f2\n\24\r\24\16\24\u00f3"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\7\30\u0108\n\30\f\30\16\30\u010b\13\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u0115\n\32\f\32\16\32\u0118\13\32"+
		"\5\32\u011a\n\32\3\32\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\2\2\u012d\2\67\3\2\2\2\4;\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\n"+
		"Y\3\2\2\2\f\\\3\2\2\2\16g\3\2\2\2\20j\3\2\2\2\22t\3\2\2\2\24\u0087\3\2"+
		"\2\2\26\u00b8\3\2\2\2\30\u00c4\3\2\2\2\32\u00c6\3\2\2\2\34\u00d3\3\2\2"+
		"\2\36\u00d6\3\2\2\2 \u00de\3\2\2\2\"\u00e6\3\2\2\2$\u00ea\3\2\2\2&\u00f1"+
		"\3\2\2\2(\u00f5\3\2\2\2*\u00fa\3\2\2\2,\u00fe\3\2\2\2.\u0109\3\2\2\2\60"+
		"\u010c\3\2\2\2\62\u0119\3\2\2\2\648\5\4\3\2\658\5\b\5\2\668\5\24\13\2"+
		"\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2"+
		"\2\2:\3\3\2\2\2;<\7\r\2\2<=\7\61\2\2=>\7)\2\2>?\5\6\4\2?@\7\34\2\2@A\7"+
		"\32\2\2AB\5\22\n\2BC\7\31\2\2C\5\3\2\2\2DI\7\61\2\2EF\7\37\2\2FH\7\61"+
		"\2\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LD\3\2"+
		"\2\2LM\3\2\2\2M\7\3\2\2\2NO\7\b\2\2OP\7\61\2\2PQ\7\32\2\2QR\5\n\6\2RS"+
		"\5\f\7\2ST\5\16\b\2TU\7\31\2\2U\t\3\2\2\2VX\7\61\2\2WV\3\2\2\2X[\3\2\2"+
		"\2YW\3\2\2\2YZ\3\2\2\2Z\13\3\2\2\2[Y\3\2\2\2\\]\7\27\2\2]^\7)\2\2^_\5"+
		"\6\4\2_`\7\34\2\2`a\7\32\2\2ab\5\22\n\2bc\7\31\2\2c\r\3\2\2\2df\5\20\t"+
		"\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\17\3\2\2\2ig\3\2\2\2jk\7\21"+
		"\2\2kl\7\61\2\2lm\7)\2\2mn\5\6\4\2no\7\34\2\2op\7\32\2\2pq\5\22\n\2qr"+
		"\7\31\2\2r\21\3\2\2\2su\5\24\13\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2"+
		"\2\2w\23\3\2\2\2xy\b\13\1\2yz\7,\2\2z\u0088\5\24\13\2{\u0088\5\26\f\2"+
		"|\u0088\5\30\r\2}\u0088\5\34\17\2~\u0088\5\36\20\2\177\u0088\5 \21\2\u0080"+
		"\u0088\5\"\22\2\u0081\u0088\5$\23\2\u0082\u0088\5,\27\2\u0083\u0084\7"+
		")\2\2\u0084\u0085\5\24\13\2\u0085\u0086\7\34\2\2\u0086\u0088\3\2\2\2\u0087"+
		"x\3\2\2\2\u0087{\3\2\2\2\u0087|\3\2\2\2\u0087}\3\2\2\2\u0087~\3\2\2\2"+
		"\u0087\177\3\2\2\2\u0087\u0080\3\2\2\2\u0087\u0081\3\2\2\2\u0087\u0082"+
		"\3\2\2\2\u0087\u0083\3\2\2\2\u0088\u00b5\3\2\2\2\u0089\u008a\6\13\2\3"+
		"\u008a\u008b\7+\2\2\u008b\u00b4\5\24\13\2\u008c\u008d\6\13\3\3\u008d\u008e"+
		"\7 \2\2\u008e\u00b4\5\24\13\2\u008f\u0090\6\13\4\3\u0090\u0091\7/\2\2"+
		"\u0091\u00b4\5\24\13\2\u0092\u0093\6\13\5\3\u0093\u0094\7*\2\2\u0094\u00b4"+
		"\5\24\13\2\u0095\u0096\6\13\6\3\u0096\u0097\7\"\2\2\u0097\u00b4\5\24\13"+
		"\2\u0098\u0099\6\13\7\3\u0099\u009a\7-\2\2\u009a\u00b4\5\24\13\2\u009b"+
		"\u009c\6\13\b\3\u009c\u009d\7\'\2\2\u009d\u00b4\5\24\13\2\u009e\u009f"+
		"\6\13\t\3\u009f\u00a0\7(\2\2\u00a0\u00b4\5\24\13\2\u00a1\u00a2\6\13\n"+
		"\3\u00a2\u00a3\7#\2\2\u00a3\u00b4\5\24\13\2\u00a4\u00a5\6\13\13\3\u00a5"+
		"\u00a6\7$\2\2\u00a6\u00b4\5\24\13\2\u00a7\u00a8\6\13\f\3\u00a8\u00a9\7"+
		".\2\2\u00a9\u00b4\5\24\13\2\u00aa\u00ab\6\13\r\3\u00ab\u00ac\7\35\2\2"+
		"\u00ac\u00b4\5\24\13\2\u00ad\u00ae\6\13\16\3\u00ae\u00af\7%\2\2\u00af"+
		"\u00b0\7)\2\2\u00b0\u00b1\5\62\32\2\u00b1\u00b2\7\34\2\2\u00b2\u00b4\3"+
		"\2\2\2\u00b3\u0089\3\2\2\2\u00b3\u008c\3\2\2\2\u00b3\u008f\3\2\2\2\u00b3"+
		"\u0092\3\2\2\2\u00b3\u0095\3\2\2\2\u00b3\u0098\3\2\2\2\u00b3\u009b\3\2"+
		"\2\2\u00b3\u009e\3\2\2\2\u00b3\u00a1\3\2\2\2\u00b3\u00a4\3\2\2\2\u00b3"+
		"\u00a7\3\2\2\2\u00b3\u00aa\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b4\u00b7\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\25\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b8\u00bb\7\61\2\2\u00b9\u00ba\7!\2\2\u00ba\u00bc\7\61\2\2"+
		"\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\27\3\2\2\2\u00bd\u00c5"+
		"\7\3\2\2\u00be\u00c5\7\4\2\2\u00bf\u00c5\5\32\16\2\u00c0\u00c5\7\5\2\2"+
		"\u00c1\u00c5\7\25\2\2\u00c2\u00c5\7\f\2\2\u00c3\u00c5\7\22\2\2\u00c4\u00bd"+
		"\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4"+
		"\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\31\3\2\2"+
		"\2\u00c6\u00cf\7&\2\2\u00c7\u00cc\5\30\r\2\u00c8\u00c9\7\37\2\2\u00c9"+
		"\u00cb\5\30\r\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3"+
		"\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00c7\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\60"+
		"\2\2\u00d2\33\3\2\2\2\u00d3\u00d4\7\t\2\2\u00d4\u00d5\7\61\2\2\u00d5\35"+
		"\3\2\2\2\u00d6\u00d7\7\16\2\2\u00d7\u00d8\5\24\13\2\u00d8\u00d9\7\24\2"+
		"\2\u00d9\u00da\5\24\13\2\u00da\u00db\7\13\2\2\u00db\u00dc\5\24\13\2\u00dc"+
		"\u00dd\7\n\2\2\u00dd\37\3\2\2\2\u00de\u00df\7\17\2\2\u00df\u00e0\7)\2"+
		"\2\u00e0\u00e1\5\6\4\2\u00e1\u00e2\7\34\2\2\u00e2\u00e3\7\32\2\2\u00e3"+
		"\u00e4\5\22\n\2\u00e4\u00e5\7\31\2\2\u00e5!\3\2\2\2\u00e6\u00e7\7\61\2"+
		"\2\u00e7\u00e8\7\36\2\2\u00e8\u00e9\5\24\13\2\u00e9#\3\2\2\2\u00ea\u00eb"+
		"\7\23\2\2\u00eb\u00ec\7\32\2\2\u00ec\u00ed\5&\24\2\u00ed\u00ee\5*\26\2"+
		"\u00ee\u00ef\7\31\2\2\u00ef%\3\2\2\2\u00f0\u00f2\5(\25\2\u00f1\u00f0\3"+
		"\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\'\3\2\2\2\u00f5\u00f6\7\30\2\2\u00f6\u00f7\5\24\13\2\u00f7\u00f8\7\33"+
		"\2\2\u00f8\u00f9\5\22\n\2\u00f9)\3\2\2\2\u00fa\u00fb\7\26\2\2\u00fb\u00fc"+
		"\7\33\2\2\u00fc\u00fd\5\22\n\2\u00fd+\3\2\2\2\u00fe\u00ff\7\20\2\2\u00ff"+
		"\u0100\7)\2\2\u0100\u0101\5.\30\2\u0101\u0102\7\34\2\2\u0102\u0103\7\32"+
		"\2\2\u0103\u0104\5\22\n\2\u0104\u0105\7\31\2\2\u0105-\3\2\2\2\u0106\u0108"+
		"\5\60\31\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2"+
		"\u0109\u010a\3\2\2\2\u010a/\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7"+
		"&\2\2\u010d\u010e\7\61\2\2\u010e\u010f\5\24\13\2\u010f\u0110\7\60\2\2"+
		"\u0110\61\3\2\2\2\u0111\u0116\5\24\13\2\u0112\u0113\7\37\2\2\u0113\u0115"+
		"\5\24\13\2\u0114\u0112\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2"+
		"\u0116\u0117\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u0111"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\63\3\2\2\2\24\679ILYgv\u0087\u00b3"+
		"\u00b5\u00bb\u00c4\u00cc\u00cf\u00f3\u0109\u0116\u0119";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}