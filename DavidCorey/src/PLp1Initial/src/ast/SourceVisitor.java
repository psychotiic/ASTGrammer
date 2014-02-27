/**
 *
 */
package ast;

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


    @Override
    public String visit(AddNode n) throws PLp1Exception{

        return n.getLeftOperand().accept(this) + " + " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(SubNode n) throws PLp1Exception{
        return n.getLeftOperand().accept(this) + " - " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(MultiplyNode n) throws PLp1Exception{
        return n.getLeftOperand().accept(this) + " * " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(DivideNode n) throws PLp1Exception {
        return n.getLeftOperand().accept(this) + " / " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(NumNode n) throws PLp1Exception {
        return n.getLabel();
    }

    @Override
    public String visit(IdNode n) throws PLp1Exception {
        return n.getLabel();
    }

    @Override
    public String visit(LetNode n) throws PLp1Exception {
        return "let (["+ n.getVar()+ " " + n.getDefinition().accept(this)+"]) {"
          + (String)n.getBody().accept(this) + " }";
    }

    @Override
    public String visit(AndNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(ArgumentListNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(AssignNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(BodyNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(BooleanNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(CallNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(ClassNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(CreateNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(EqualNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(FloatNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(FunctionDefinitionNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(GreaterEqualNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(GreaterNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(IfNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(InstanceVariableListNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(IntegerNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(LambdaNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(LessEqualNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(LessNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(LetDeclListNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(LetDeclNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(ListNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(MethodListNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(MethodNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(MethodRefNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(NotEqualNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(NotNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(NullNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(OrNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(ParameterListNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(ParenNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(ProgramNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(StringNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(SwitchCaseListNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(SwitchCaseNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(VarDefNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(VarRefNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(SwitchNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
