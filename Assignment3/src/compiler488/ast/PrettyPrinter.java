package compiler488.ast;

/**
 * A pretty-printing destination.
 *
 * <p>The printer is expected to be able to print strings and newlines in the
 * usual way, as well as step into and out of nested blocks. When nesting
 * blocks, the printer should handle adding identation whitespace at the left
 * hand side of each line.</p>
 *
 *  @author Peter McCormick
 *  @see compiler488.ast.BasePrettyPrinter
 */

public interface PrettyPrinter {
    public void print(String str);
    public void newline();
    public void println(String str);
    public void enterBlock();
    public void exitBlock();
}
