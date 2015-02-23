package compiler488.ast.decl;

import compiler488.ast.ASTList;
import compiler488.ast.PrettyPrinter;
import compiler488.ast.type.Type;

/**
 * Holds the declaration of multiple elements.
 */
public class MultiDeclarations extends Declaration {
    /** The parts being declared */
    private ASTList<DeclarationPart> elements;

    public MultiDeclarations(Type type, ASTList<DeclarationPart> elements) {
        super(null, type);

        this.elements = elements;
    }

    public ASTList<DeclarationPart> getParts() {
        return elements;
    }

    public void prettyPrint(PrettyPrinter p) {
        p.print(type + " ");
        elements.prettyPrintCommas(p);
    }

}
