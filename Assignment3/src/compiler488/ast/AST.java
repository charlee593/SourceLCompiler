package compiler488.ast;

/**
 * Common interface for all Abstract Syntax Tree nodes.
 *
 * <p>Every node must be able to pretty-print itself </p>
 *
 * <p>Consider adding further support for visitor patterns, type checking information and source
 * coordinates here.</p>
 *
 * @author Peter McCormick
 * @see compiler488.ast.BaseAST
 */
public interface AST extends PrettyPrintable {
    public void prettyPrint(PrettyPrinter p);
}
