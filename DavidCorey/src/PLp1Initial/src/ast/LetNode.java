/**
 * 
 */
package ast;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import visitor.Visitor;
import util.PLp1Error;

/**
 * This class represents a with expression in L485
 * 
 * @author carr
 *
 */
public class LetNode extends ASTNode {
 
        List<String> vars;
        List<ASTNode> defs;
        
	public LetNode() {
	}

        public ASTNode getLetVarDecls() {
            return getChild(0);
        }

        private void buildVarList() {
            vars = new LinkedList<String>();
            defs = new LinkedList<ASTNode>();
            for (ASTNode n: ((LetDeclListNode)getChild(0)).getDecls()) {
                vars.add(((LetDeclNode)n).getVar());
                defs.add(((LetDeclNode)n).getValueExpr());
            }
        }
	/**
	 * @return the set of variables defined in this with node
	 */
	public List<String> getVariables() {
            if (vars == null) 
                buildVarList();
            
            return vars;
	}
        
        public List<ASTNode> getValueExprs() {
            if (defs == null)
                buildVarList();
            
            return defs;
        }
	
	/**
	 * @param var a variable name
	 * @return the defining expression for var
	 */
	public ASTNode getValueExpr(String var) {
            if (vars == null)
                buildVarList();
            return defs.get(vars.indexOf(var));
	}

	/**
	 * @return the body of the let expression
	 */
	public ASTNode getBody() {
		return getChild(1);
	}

	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(patterns.Visitor)
	 */
	@Override
	public Object accept(Visitor visitor) throws PLp1Error {
		return visitor.visit(this);
	}

}
