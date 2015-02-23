package compiler488.ast.expn;

import compiler488.ast.PrettyPrinter;
import compiler488.ast.Readable;

/**
 * References to an array element variable
 */
public class SubsExpn extends Expn implements Readable {
    /** Name of the array variable. */
    private String variable;

    /** First subscript. */
    private Expn subscript1;

    /** Second subscript (if any.) */
    private Expn subscript2 = null;

    public SubsExpn(String variable, Expn subscript1, Expn subscript2) {
        super();

        this.variable = variable;
        this.subscript1 = subscript1;
        this.subscript2 = subscript2;
    }

    public SubsExpn(String variable, Expn subscript1) {
        this(variable, subscript1, null);
    }

    public String getVariable() {
        return variable;
    }

    public Expn getSubscript1() {
        return subscript1 ;
    }

    public Expn getSubscript2() {
        return subscript2;
    }

    public int numSubscripts() {
        return 1 + (subscript2 != null ? 1 : 0);
    }

    public void prettyPrint(PrettyPrinter p) {
        p.print(variable + "[");

        subscript1.prettyPrint(p);

        if (subscript2 != null) {
            p.print(", ");
            subscript2.prettyPrint(p);
        }

        p.print("]");
    }

}
