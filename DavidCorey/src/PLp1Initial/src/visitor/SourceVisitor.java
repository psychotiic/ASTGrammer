/**
 *
 */
package visitor;

import util.PLp1Error;
import ast.ASTNode;
import ast.BodyNode;
import ast.AddNode;
import ast.AndNode;
import ast.ArgumentListNode;
import ast.AssignNode;
import ast.BooleanNode;
import ast.CallNode;
import ast.ClassNode;
import ast.SwitchCaseNode;
import ast.SwitchNode;
import ast.FunctionDefinitionNode;
import ast.DivideNode;
import ast.EqualNode;
import ast.FloatNode;
import ast.LambdaNode;
import ast.GreaterEqualNode;
import ast.GreaterNode;
import ast.IfNode;
import ast.IntegerNode;
import ast.LessEqualNode;
import ast.LessNode;
import ast.ListNode;
import ast.MethodNode;
import ast.MethodRefNode;
import ast.MultiplyNode;
import ast.CreateNode;
import ast.InstanceVariableListNode;
import ast.LetDeclListNode;
import ast.LetDeclNode;
import ast.NotEqualNode;
import ast.NotNode;
import ast.OrNode;
import ast.StringNode;
import ast.SubNode;
import ast.VarRefNode;
import ast.LetNode;
import ast.MethodListNode;
import ast.NullNode;
import ast.ParameterListNode;
import ast.ParenNode;
import ast.ProgramNode;
import ast.SwitchCaseListNode;
import ast.VarDefNode;

/**
 * @author carr
 *
 */
public class SourceVisitor implements Visitor<String> {

    /**
     *
     */
    public SourceVisitor() {
    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.ArgumentListNode)
     */
    @Override
    public String visit(ArgumentListNode n) throws PLp1Error {
        String source = "";
        for (ASTNode node : n.getArguments()) {
            source += ((String) node.accept(this) + ", ");
        }

        if (source.length() > 1) {
            return source.substring(0, source.length() - 2);
        } else {
            return source;
        }
    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.AssignNode)
     */
    @Override
    public String visit(AssignNode n) throws PLp1Error {
        return n.getLhs() + " = " + (String) n.getRhs().accept(this);
    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.BodyNode)
     */
    @Override
    public String visit(BodyNode n) throws PLp1Error {
        String source = "";
        for (ASTNode node : n.getBody()) {
            source += ((String) node.accept(this) + "\n");
        }

        return source;
    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.CallNode)
     */
    @Override
    public String visit(CallNode n) throws PLp1Error {
        return (String) n.getFunc().accept(this) + "->(" + n.getArgs().accept(this) + ")";
    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.ClassNode)
     */
    @Override
    public String visit(ClassNode n) throws PLp1Error {
       return "class " + (String) n.getName()
               + "{ \n\t"
               + n.getClassVars().accept(this)
               + "\n"
               + n.getConstructor().accept(this)
               + "\n"
               + n.getMethods().accept(this)
               + "\n}";
    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.SwitchCaseNode)
     */
    @Override
    public String visit(SwitchCaseNode n) throws PLp1Error {
	return "case " + n.getTestExpr().accept(this) + ": " + n.getResultExpr().accept(this);
    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.SwitchNode)
     */
    @Override
    public String visit(SwitchNode n) throws PLp1Error {
        String src = "switch {";
        for (ASTNode node : n.getCases().getSwitchCases()) {
            src += node.accept(this);
        }
        
        src += n.getDefaultCase().accept(this);

        return src + "}";
    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.FunctionDefinitionNode)
     */
    @Override
    public String visit(FunctionDefinitionNode n) throws PLp1Error {
        return "function " + n.getName() + "(" + n.getParams().accept(this) + ") {\n" + n.getBody().accept(this) + "\n}";

    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.FloatNode)
     */
    @Override
    public String visit(FloatNode n) throws PLp1Error {
        return Float.toString(n.getVal());
    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.LambdaNode)
     */
    @Override
    public String visit(LambdaNode n) throws PLp1Error {
        return "lambda (" + n.getParams().accept(this) + ") {\n" + n.getBody().accept(this) + "\n}";

    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.IfNode)
     */
    @Override
    public String visit(IfNode n) throws PLp1Error {
        return "if " + n.getTestExpr().accept(this) + " then " + n.getThenExpr().accept(this)
                + " else " + n.getElseExpr().accept(this) + "fi";
    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.IntegerNode)
     */
    @Override
    public String visit(IntegerNode n) throws PLp1Error {
        return Integer.toString(n.getVal());
    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.ListNode)
     */
    @Override
    public String visit(ListNode n) throws PLp1Error {

        String lStr = "";
        for (ASTNode node : n.getList()) {
            lStr += (node.accept(this) + ", ");
        }

        if (lStr.length() != 0)
            return "[" + lStr.substring(0, lStr.length() - 2) + "]";
        else
            return "[]";
    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.MethodNode)
     */
    @Override
    public String visit(MethodNode n) throws PLp1Error {
        return "method " + n.getName() + "(" + n.getParams().accept(this) + ") {\n" + n.getBody().accept(this) + "\n}";
    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.MethodRefNode)
     */
    @Override
    public String visit(MethodRefNode n) throws PLp1Error {
        return n.getObjectName() + "." + n.getMethodName();
    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.CreateNode)
     */
    @Override
    public String visit(CreateNode n) throws PLp1Error {
        return "create " + n.getClassName();
    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.StringNode)
     */
    @Override
    public String visit(StringNode n) throws PLp1Error {
        return n.getLabel();
    }

    /* (non-Javadoc)
     * @see visitor.Visitor#visit(ast.VarRefNode)
     */
    @Override
    public String visit(VarRefNode n) throws PLp1Error {
        return n.getId();
    }

    @Override
    public String visit(LetNode n) throws PLp1Error {
        return "let " + n.getLetVarDecls().accept(this) + "{ \n" + n.getBody().accept(this) + "\n}\n";
    }

    @Override
    public String visit(BooleanNode n) throws PLp1Error {
        return Boolean.toString(n.getVal());
    }

    @Override
    public String visit(AddNode n) throws PLp1Error {

        return n.getLeftOperand().accept(this) + " + " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(SubNode n) throws PLp1Error {
        return n.getLeftOperand().accept(this) + " - " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(MultiplyNode n) throws PLp1Error {
        return n.getLeftOperand().accept(this) + " * " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(DivideNode n) throws PLp1Error {
        return n.getLeftOperand().accept(this) + " / " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(NotNode n) throws PLp1Error {
        return "!" + n.getOperand().accept(this);
    }

    @Override
    public String visit(OrNode n) throws PLp1Error {
        return n.getLeftOperand().accept(this) + " || " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(AndNode n) throws PLp1Error {
        return n.getLeftOperand().accept(this) + " && " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(EqualNode n) throws PLp1Error {
        return n.getLeftOperand().accept(this) + " == " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(NotEqualNode n) throws PLp1Error {
        return n.getLeftOperand().accept(this) + " != " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(LessNode n) throws PLp1Error {
        return n.getLeftOperand().accept(this) + " < " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(LessEqualNode n) throws PLp1Error {
        return n.getLeftOperand().accept(this) + " <= " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(GreaterNode n) throws PLp1Error {
        return n.getLeftOperand().accept(this) + " >= " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(GreaterEqualNode n) throws PLp1Error {
        return n.getLeftOperand().accept(this) + " >= " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(ParenNode n) throws PLp1Error {
        return "(" + n.getExpr().accept(this) + ")";
    }

    @Override
    public String visit(ParameterListNode pln) throws PLp1Error {
        String pl = "";

        for (ASTNode n : pln.getIdList()) {
            pl += (n.accept(this) + ", ");
        }

        if (pl.length() > 0) {
            return pl.substring(0, pl.length() - 2);
        } else {
            return pl;
        }
    }

    @Override
    public String visit(LetDeclNode n) throws PLp1Error {
        return "[" + n.getVar() + " " + n.getValueExpr().accept(this) + "]";
    }

    @Override
    public String visit(LetDeclListNode n) throws PLp1Error {
        String source = "(\n";
        for (ASTNode ldn : n.getDecls()) {
            source += ldn.accept(this) + "\n";
        }

        return source + ")";
    }

    @Override
    public String visit(SwitchCaseListNode n) throws PLp1Error {
        String source = "";
        for (ASTNode scn : n.getSwitchCases()) {
            source += scn.accept(this) + "\n";
        }

        return source;
    }

    @Override
    public String visit(NullNode n) throws PLp1Error {
        return "null";
    }

    @Override
    public String visit(ProgramNode n) throws PLp1Error {
        String source = "";

        for (ASTNode an : n.getProgram()) {
            source += (an.accept(this) + "\n");
        }

        return source;
    }

    @Override
    public String visit(InstanceVariableListNode n) throws PLp1Error {
        String source = "";

        for (ASTNode ivn : n.getVars()) {
            source += (ivn.accept(this) + " ");
        }

        return source;
    }

    @Override
    public String visit(MethodListNode n) throws PLp1Error {
        String source = "";

        for (ASTNode mn : n.getMethods()) {
            source += (mn.accept(this) + "\n ");
        }

        return source;
    }

    @Override
    public String visit(VarDefNode n) throws PLp1Error {
        return n.getLabel();
    }
}
