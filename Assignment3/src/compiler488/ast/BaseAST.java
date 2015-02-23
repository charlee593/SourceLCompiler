package compiler488.ast;

/**
 * Base class implementation for the AST hierarchy.
 *
 * This is a convenient place to add common behaviours.
 *
 * @author Dave Wortman, Marsha Chechik, Danny House, Peter McCormick
 */
public abstract class BaseAST implements AST {
    /**
     * Default constructor.
     *
     * <p>Add additional information to your AST tree nodes here.</p>
     */
	public BaseAST() {
	}

    /**
     * A default pretty-printer implementation that uses <code>toString</code>.
     *
     * @param p the printer to use
     */
    @Override
    public void prettyPrint(PrettyPrinter p) {
        p.print(toString());
    }

}
