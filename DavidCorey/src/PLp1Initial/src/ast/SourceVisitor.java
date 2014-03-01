/**
 *
 */
package ast;

import java.util.List;

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
    public String visit(LetNode n) throws PLp1Exception {
        String let = "let (";
        if (n.getLetVarDecls() != null)
            let += (String) n.getLetVarDecls().accept(this);
        
        let += ") {" + (String) n.getBody().accept(this) + "}";
        
        return let;
    }

    @Override
    public String visit(AndNode n) throws PLp1Exception {
        return n.getLeftOperand().accept(this) + " & " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(ArgumentListNode n) throws PLp1Exception {
        String args = "(";
        
        if (n.getArguments() != null) {
            for (ASTNode a : n.getArguments())
                args += (String) a.accept(this) + ", ";
        }
        args = args.substring(0, args.length() - 2);
        args += ")";
        
        return args;
    }

    @Override
    public String visit(AssignNode n) throws PLp1Exception {
        return n.getLhs() + " = " + (String) n.getRhs().accept(this);
    }

    @Override
    public String visit(BodyNode n) throws PLp1Exception {
        String ret = "";
        for (ASTNode b : n.getBody()) {
            ret += " " + (String) b.accept(this) + " ";
        }
        
        return ret;
    }

    @Override
    public String visit(BooleanNode n) throws PLp1Exception {
        return String.valueOf(n.getVal());
    }

    @Override
    public String visit(CallNode n) throws PLp1Exception {
        String call = (String) n.getFunc().accept(this) + "->"; 
        if (n.getArgs() != null)
            call += (String) n.getArgs().accept(this);
        else
            call += "()";
        
        return call;
    }

    @Override
    public String visit(ClassNode n) throws PLp1Exception {
        return "class " + n.getName() + " {"
                + (String) n.getClassVars().accept(this) 
                + (String) n.getConstructor().accept(this) 
                + (String) n.getMethods().accept(this)
        + "}";
    }

    @Override
    public String visit(CreateNode n) throws PLp1Exception {
        return "create " + n.getClassName();
    }

    @Override
    public String visit(EqualNode n) throws PLp1Exception {
        return n.getLeftOperand().accept(this) + " == " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(FloatNode n) throws PLp1Exception {
        return String.valueOf(n.getVal());
    }

    @Override
    public String visit(FunctionDefinitionNode n) throws PLp1Exception {
        String func = "";
        if (!n.getName().equalsIgnoreCase("init"))
            func += "function ";
        func += n.getName();
        func += "(";
        if (n.getParams() != null)
            func += (String) n.getParams().accept(this);
        func += ") {";
        func += (String) n.getBody().accept(this);
        func += "} ";
        
        return func;
    }

    @Override
    public String visit(GreaterEqualNode n) throws PLp1Exception {
        return n.getLeftOperand().accept(this) + " >= " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(GreaterNode n) throws PLp1Exception {
        return n.getLeftOperand().accept(this) + " > " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(IfNode n) throws PLp1Exception {
        String ifexp = "if ";
        
        ifexp += (String) n.getTestExpr().accept(this);
        if (n.getThenExpr() != null) {
            ifexp += " then ";
            ifexp += (String) n.getThenExpr().accept(this);
        }
        if (n.getElseExpr() != null) {
            ifexp += " else ";
            ifexp += (String) n.getElseExpr().accept(this);
        }
        ifexp += " endif";
        
        return ifexp;
    }

    @Override
    public String visit(InstanceVariableListNode n) throws PLp1Exception {
        String ids = "";
        for (String v : n.getVars())
            ids += v + " ";
        
        return ids;
    }

    @Override
    public String visit(IntegerNode n) throws PLp1Exception {
        return String.valueOf(n.getVal());
    }

    @Override
    public String visit(LambdaNode n) throws PLp1Exception {
        String lambda = "lambda(";
        if (n.getParams() != null)
            lambda += (String) n.getParams().accept(this);
        lambda += ") {";
        if (n.getBody() != null)
            lambda += (String) n.getBody().accept(this);
        lambda += ")";
        
        return lambda;
    }

    @Override
    public String visit(LessEqualNode n) throws PLp1Exception {
        return n.getLeftOperand().accept(this) + " <= " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(LessNode n) throws PLp1Exception {
        return n.getLeftOperand().accept(this) + " < " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(LetDeclListNode n) throws PLp1Exception {
        String let = "";
        for (ASTNode ld : n.getDecls()) {
            let += "[";
            let += ld.accept(this);
            let += "]";
        }
        
        return let;
    }

    @Override
    public String visit(LetDeclNode n) throws PLp1Exception {
        return n.getVar() + " " + (String) n.getValueExpr().accept(this);
    }

    @Override
    public String visit(ListNode n) throws PLp1Exception {
        String list = "[";
        
        for (ASTNode l : n.getList()) {
            list += (String) l.accept(this) + ", ";
        }
        list = list.substring(0, list.length() - 2);
        list += "]";
        
        return list;
    }

    @Override
    public String visit(MethodListNode n) throws PLp1Exception {
       String mlist = "";
       for (ASTNode m : n.getMethods())
           mlist += (String) m.accept(this);
       
       return mlist;
    }

    @Override
    public String visit(MethodNode n) throws PLp1Exception {
        String func = "method ";
        func += n.getName();
        func += "(";
        if (n.getParams() != null)
            func += (String) n.getParams().accept(this);
        func += ") {";
        func += (String) n.getBody().accept(this);
        func += "} ";
        
        return func;
    }

    @Override
    public String visit(MethodRefNode n) throws PLp1Exception {
        return n.getObjectName() + "." + n.getMethodName();
    }

    @Override
    public String visit(NotEqualNode n) throws PLp1Exception {
        return n.getLeftOperand().accept(this) + " != " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(NotNode n) throws PLp1Exception {
        return "!" + (String) n.getOperand().accept(this);
    }

    @Override
    public String visit(NullNode n) throws PLp1Exception {
        return "null";
    }

    @Override
    public String visit(OrNode n) throws PLp1Exception {
        return n.getLeftOperand().accept(this) + " | " + n.getRightOperand().accept(this);
    }

    @Override
    public String visit(ParameterListNode n) throws PLp1Exception {
        String plist = "";
        for (String s : n.getIdList())
            plist += s + ", ";
        plist = plist.substring(0, plist.length() - 2);
        
        return plist;
    }

    @Override
    public String visit(ParenNode n) throws PLp1Exception {
        return "(" + (String) n.getExpr().accept(this) + ")";
    }

    @Override
    public String visit(ProgramNode n) throws PLp1Exception {
        if (n.getProgram().isEmpty())
            return null;
        
        String prog = "";
        for (ASTNode p : n.getProgram()) {
            if (p != null)
                prog += (String) p.accept(this);
        }
        
        return prog;
    }

    @Override
    public String visit(StringNode n) throws PLp1Exception {
        return n.getString();
    }

    @Override
    public String visit(SwitchCaseListNode n) throws PLp1Exception {
        String swlist = "";
        for (ASTNode s : n.getSwitchCases())
            swlist += (String) s.accept(this) + " ";
        
        return swlist;
    }

    @Override
    public String visit(SwitchCaseNode n) throws PLp1Exception {
        return "case " + (String) n.getTestExpr().accept(this) + ": " + (String) n.getResultExpr().accept(this);
    }

    @Override
    public String visit(SwitchNode n) throws PLp1Exception {
        String switchexpr = "switch {";
        switchexpr += (String) n.getCases().accept(this);
        switchexpr += "default: " + (String) n.getDefaultCase().accept(this);
        switchexpr += "}";
        
        return switchexpr;
    }
    
    @Override
    public String visit(VarDefNode n) throws PLp1Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visit(VarRefNode n) throws PLp1Exception {
        return n.getId();
    }
}
