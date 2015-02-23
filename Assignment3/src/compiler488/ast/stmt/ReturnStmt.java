package compiler488.ast.stmt;

import compiler488.ast.PrettyPrinter;
import compiler488.ast.expn.Expn;

/**
 * The command to return from a function.
 */
public class ReturnStmt extends Stmt {
    /* The value to be returned by the function (if any.) */
    private Expn value = null;

    /**
     * Construct a function <code>return <em>value</em></code> statement with a value expression.
     *   @param  value  AST for the return expression
     */
    public ReturnStmt(Expn value) {
        super();

        this.value = value;
    }

    /**
     * Construct a procedure <code>return</code> statement (with no return value)
     */
    public ReturnStmt() {
        this(null);
    }

    public Expn getValue() {
        return value;
    }

    public void prettyPrint(PrettyPrinter p) {
        p.print("return");

        if (value != null) {
            p.print(" (");
            value.prettyPrint(p);
            p.print(")");
        }
    }

}
