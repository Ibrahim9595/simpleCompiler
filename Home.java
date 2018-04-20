import java.util.HashMap;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Home {
    public static void main(String[] args) throws Exception {
        ANTLRFileStream str = new ANTLRFileStream(args[0]);
        HelloLexer lex = new HelloLexer(str);
        CommonTokenStream tok = new CommonTokenStream(lex);

        HelloParser parser = new HelloParser(tok);
        ParseTree tree = parser.s();
        new MyVisitor().visit(tree);
    }
}

class MyVisitor extends HelloBaseVisitor<Integer> {
    private HashMap<String, Integer> symbolTable = new HashMap<String, Integer>();
    private int ifCounter = 0;
    private int ifElseCounter = 0;

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitAdd(HelloParser.AddContext ctx) {
        int left = visit(ctx.expr());
        int right = visit(ctx.t());

        //System.out.println("from Add: " + (left + right));
        return left + right;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitSub(HelloParser.SubContext ctx) {
        int left = visit(ctx.expr());
        int right = visit(ctx.t());

        //System.out.println("from Sub: " + (left - right));
        return left - right;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitT_eval(HelloParser.T_evalContext ctx) {
        int number = visit(ctx.t());
        //System.out.println("From T:" + number);
        return number;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitDiv(HelloParser.DivContext ctx) {
        int left = visit(ctx.t());
        int right = visit(ctx.f());

        //System.out.println("from Div " + (left / right));

        return left / right;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitMul(HelloParser.MulContext ctx) {
        int left = visit(ctx.t());
        int right = visit(ctx.f());

        //System.out.println("from Mul " + (left * right));

        return left * right;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitF_eval(HelloParser.F_evalContext ctx) {
        int number = visit(ctx.f());
        //System.out.println("From F: " + number);
        return number;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitExprId(HelloParser.ExprIdContext ctx) {
        //System.out.println("table[" + ctx.ID().getText() + "]=" + symbolTable.get(ctx.ID().getText()));
        return symbolTable.get(ctx.ID().getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitNumber(HelloParser.NumberContext ctx) {
        int number = Integer.parseInt(ctx.NUMBER().getText());
        //System.out.println(number);
        return number;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitParExpr(HelloParser.ParExprContext ctx) {
        int output = visit(ctx.expr());
        return output;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitNot(HelloParser.NotContext ctx) {
        int output = visit(ctx.bool()) == 1 ? 0 : 1;
        return output;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitOr(HelloParser.OrContext ctx) {
        boolean left = visit(ctx.bool(1)) == 1 ? true : false;
        boolean right = visit(ctx.bool(0)) == 1 ? true : false;

        int output = left || right ? 1 : 0;

        return output;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitAnd(HelloParser.AndContext ctx) {
        boolean left = visit(ctx.bool(0)) == 1 ? true : false;
        boolean right = visit(ctx.bool(1)) == 1 ? true : false;

        int output = left && right ? 1 : 0;

        return output;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitRel(HelloParser.RelContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        int output;

        switch (ctx.REL().getText()) {
        case ">":
            output = left > right ? 1 : 0;
            break;

        case "<":
            output = left < right ? 1 : 0;
            break;

        case "==":
            output = left == right ? 1 : 0;
            break;

        case ">=":
            output = left >= right ? 1 : 0;
            break;

        case "<=":
            output = left <= right ? 1 : 0;
            break;

        case "!=":
            output = left != right ? 1 : 0;
            break;

        default:
            output = -1;
        }

        return output;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitTrue(HelloParser.TrueContext ctx) {
        return 1;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitFalse(HelloParser.FalseContext ctx) {
        return 0;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitBoolId(HelloParser.BoolIdContext ctx) {
        int output = symbolTable.get(ctx.ID().getText());
        return output;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitIf(HelloParser.IfContext ctx) {
        boolean bool = visit(ctx.bool()) == 1 ? true : false;
        if (bool) {
            // System.out.println("From If level: " + (ifCounter++));
            visit(ctx.s());
        }
        return 1;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitIfElse(HelloParser.IfElseContext ctx) {
        boolean bool = visit(ctx.bool()) == 1 ? true : false;
        if (bool) {
            //System.out.println("From IFELSE if level: " + (ifElseCounter ++));
            visit(ctx.s(0));
        } else {
            //System.out.println("From IFELSE else level: " + (ifElseCounter ++));
            visit(ctx.s(1));
        }
        return 1;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitWhile(HelloParser.WhileContext ctx) {
        int c = 0;
        while (true) {
            boolean bool = visit(ctx.bool()) == 1 ? true : false;
            if (!bool) {
                break;
            }
            // System.out.println("while: " + (c++));
            visit(ctx.s());
        }
        return 0;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitAssigExpr(HelloParser.AssigExprContext ctx) {
        int output = visit(ctx.expr());
        ////System.out.println(ctx.ID() + "=" + output);
        symbolTable.put(ctx.ID().getText(), output);
        return output;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitAssigBool(HelloParser.AssigBoolContext ctx) {
        int output = visit(ctx.bool());
        String strOutput = output == 1 ? "true" : "false";
        ////System.out.println(ctx.ID() + "=" + strOutput);
        symbolTable.put(ctx.ID().getText(), output);
        return output;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitExprOutput(HelloParser.ExprOutputContext ctx) {
        System.out.print(visit(ctx.expr()));
        return 0;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Integer visitStringOutput(HelloParser.StringOutputContext ctx) {
        String[] text = ctx.getText().split("\"");
        System.out.print(text[1]+" ");
        return 0;
    }
}