package compiler488.ast;

import java.io.PrintStream;

/**
 * A basic <code>PrettyPrinter</code> implementation that outputs to any {@link java.io.PrintStream}
 *
 *  @author Peter McCormick
 */
public class BasePrettyPrinter implements PrettyPrinter {
    /** Left margin whitespace, repeated up to the current depth level. */
    private static final String IDENT_PER_DEPTH = "    ";

    /** The current output destination */
    private PrintStream output;

    /** The current nesting depth. Must be non-negative. */
    private int depth;

    /** True iff nothing has been output, or if the last character was a newline. */
    private boolean line_start;

    /**
     * Construct a context that will produce output to the given stream.
     *
     * @param output where to print to
     */
    public BasePrettyPrinter(PrintStream output) {
        this.output = output;
        depth = 0;
        line_start = true;
    }

    /**
     * Prints to the system output.
     */
    public BasePrettyPrinter() {
        this(System.out);
    }

    /**
     * Print a string without newlines.
     *
     * Handles the case when starting at the beginning of a new line and
     * includes the correct left-side indentation for the current depth level.
     *
     * @param str what to output
     */
    public void print(String str) {
        if (line_start) {
            for (int i = 0; i < depth; i++) {
                output.print(IDENT_PER_DEPTH);
            }

            line_start = false;
        }

        output.print(str);
    }

    /**
     * Output a newline
     */
    public void newline() {
        output.println();
        line_start = true;
    }

    /**
     * Combination of print with newline.
     *
     * @param str what to output
     */
    public void println(String str) {
        print(str);
        newline();
    }

    /**
     * Enter into a nesting block.
     */
    public void enterBlock() {
        line_start = true;
        depth += 1;
        assert depth > 0;
    }

    /**
     * Exit out of a previously entered nesting block.
     */
    public void exitBlock() {
        line_start = true;
        depth -= 1;
        assert depth >= 0;
    }
}
