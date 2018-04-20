// Generated from Hello.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code boolStatement}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 */
	void enterBoolStatement(HelloParser.BoolStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolStatement}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 */
	void exitBoolStatement(HelloParser.BoolStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithStatement}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 */
	void enterArithStatement(HelloParser.ArithStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithStatement}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 */
	void exitArithStatement(HelloParser.ArithStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code controlStatement}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 */
	void enterControlStatement(HelloParser.ControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code controlStatement}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 */
	void exitControlStatement(HelloParser.ControlStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(HelloParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(HelloParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outStatement}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 */
	void enterOutStatement(HelloParser.OutStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outStatement}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 */
	void exitOutStatement(HelloParser.OutStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilon}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 */
	void enterEpsilon(HelloParser.EpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilon}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 */
	void exitEpsilon(HelloParser.EpsilonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(HelloParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(HelloParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(HelloParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(HelloParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code t_eval}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterT_eval(HelloParser.T_evalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code t_eval}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitT_eval(HelloParser.T_evalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link HelloParser#t}.
	 * @param ctx the parse tree
	 */
	void enterDiv(HelloParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link HelloParser#t}.
	 * @param ctx the parse tree
	 */
	void exitDiv(HelloParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link HelloParser#t}.
	 * @param ctx the parse tree
	 */
	void enterMul(HelloParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link HelloParser#t}.
	 * @param ctx the parse tree
	 */
	void exitMul(HelloParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code f_eval}
	 * labeled alternative in {@link HelloParser#t}.
	 * @param ctx the parse tree
	 */
	void enterF_eval(HelloParser.F_evalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code f_eval}
	 * labeled alternative in {@link HelloParser#t}.
	 * @param ctx the parse tree
	 */
	void exitF_eval(HelloParser.F_evalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprId}
	 * labeled alternative in {@link HelloParser#f}.
	 * @param ctx the parse tree
	 */
	void enterExprId(HelloParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprId}
	 * labeled alternative in {@link HelloParser#f}.
	 * @param ctx the parse tree
	 */
	void exitExprId(HelloParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link HelloParser#f}.
	 * @param ctx the parse tree
	 */
	void enterNumber(HelloParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link HelloParser#f}.
	 * @param ctx the parse tree
	 */
	void exitNumber(HelloParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link HelloParser#f}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(HelloParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link HelloParser#f}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(HelloParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterNot(HelloParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitNot(HelloParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterOr(HelloParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitOr(HelloParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterAnd(HelloParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitAnd(HelloParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rel}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterRel(HelloParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rel}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitRel(HelloParser.RelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterTrue(HelloParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitTrue(HelloParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterFalse(HelloParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitFalse(HelloParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolId}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolId(HelloParser.BoolIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolId}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolId(HelloParser.BoolIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link HelloParser#control}.
	 * @param ctx the parse tree
	 */
	void enterIf(HelloParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link HelloParser#control}.
	 * @param ctx the parse tree
	 */
	void exitIf(HelloParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link HelloParser#control}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(HelloParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link HelloParser#control}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(HelloParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link HelloParser#control}.
	 * @param ctx the parse tree
	 */
	void enterWhile(HelloParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link HelloParser#control}.
	 * @param ctx the parse tree
	 */
	void exitWhile(HelloParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assigExpr}
	 * labeled alternative in {@link HelloParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssigExpr(HelloParser.AssigExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assigExpr}
	 * labeled alternative in {@link HelloParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssigExpr(HelloParser.AssigExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assigBool}
	 * labeled alternative in {@link HelloParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssigBool(HelloParser.AssigBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assigBool}
	 * labeled alternative in {@link HelloParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssigBool(HelloParser.AssigBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#out}.
	 * @param ctx the parse tree
	 */
	void enterOut(HelloParser.OutContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#out}.
	 * @param ctx the parse tree
	 */
	void exitOut(HelloParser.OutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilonOutput}
	 * labeled alternative in {@link HelloParser#outputs}.
	 * @param ctx the parse tree
	 */
	void enterEpsilonOutput(HelloParser.EpsilonOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilonOutput}
	 * labeled alternative in {@link HelloParser#outputs}.
	 * @param ctx the parse tree
	 */
	void exitEpsilonOutput(HelloParser.EpsilonOutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOutput}
	 * labeled alternative in {@link HelloParser#outputs}.
	 * @param ctx the parse tree
	 */
	void enterExprOutput(HelloParser.ExprOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOutput}
	 * labeled alternative in {@link HelloParser#outputs}.
	 * @param ctx the parse tree
	 */
	void exitExprOutput(HelloParser.ExprOutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatenatedOutput}
	 * labeled alternative in {@link HelloParser#outputs}.
	 * @param ctx the parse tree
	 */
	void enterConcatenatedOutput(HelloParser.ConcatenatedOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatenatedOutput}
	 * labeled alternative in {@link HelloParser#outputs}.
	 * @param ctx the parse tree
	 */
	void exitConcatenatedOutput(HelloParser.ConcatenatedOutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringOutput}
	 * labeled alternative in {@link HelloParser#outputs}.
	 * @param ctx the parse tree
	 */
	void enterStringOutput(HelloParser.StringOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringOutput}
	 * labeled alternative in {@link HelloParser#outputs}.
	 * @param ctx the parse tree
	 */
	void exitStringOutput(HelloParser.StringOutputContext ctx);
}