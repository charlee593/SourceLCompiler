package compiler488.ast.stmt;

import compiler488.ast.ASTList;

/**
 * Placeholder for the scope that is the entire program
 */
public class Program extends Scope {
    public Program(ASTList<Stmt> body) {
        super(body);
    }

    public Program(Scope scope) {
        super(scope.getBody());
    }

}
