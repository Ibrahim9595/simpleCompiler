// Generated from Hello.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code boolStatement}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolStatement(HelloParser.BoolStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithStatement}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithStatement(HelloParser.ArithStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code controlStatement}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStatement(HelloParser.ControlStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(HelloParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code outStatement}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutStatement(HelloParser.OutStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon}
	 * labeled alternative in {@link HelloParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon(HelloParser.EpsilonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(HelloParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(HelloParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code t_eval}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_eval(HelloParser.T_evalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link HelloParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(HelloParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link HelloParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(HelloParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code f_eval}
	 * labeled alternative in {@link HelloParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_eval(HelloParser.F_evalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprId}
	 * labeled alternative in {@link HelloParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(HelloParser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link HelloParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(HelloParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link HelloParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(HelloParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(HelloParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(HelloParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(HelloParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rel}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel(HelloParser.RelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(HelloParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(HelloParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolId}
	 * labeled alternative in {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolId(HelloParser.BoolIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link HelloParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(HelloParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link HelloParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(HelloParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link HelloParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(HelloParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assigExpr}
	 * labeled alternative in {@link HelloParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigExpr(HelloParser.AssigExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assigBool}
	 * labeled alternative in {@link HelloParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigBool(HelloParser.AssigBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(HelloParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilonOutput}
	 * labeled alternative in {@link HelloParser#outputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilonOutput(HelloParser.EpsilonOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOutput}
	 * labeled alternative in {@link HelloParser#outputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOutput(HelloParser.ExprOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatenatedOutput}
	 * labeled alternative in {@link HelloParser#outputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenatedOutput(HelloParser.ConcatenatedOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringOutput}
	 * labeled alternative in {@link HelloParser#outputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringOutput(HelloParser.StringOutputContext ctx);
}