/**
 *
 */
package visitor;

import ast.*;
import functions.BuiltinFunction;
import functions.*;
import java.util.List;
import util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author carr
 *
 */
public class EvalVisitor implements Visitor<Value> {
    
    private Environment env;

    /**
     *
     */
    public EvalVisitor(Environment env) {
        this.env = env;
    }


    @Override
    public Value visit(AddNode n) throws PLp1Error{
        Value left = (Value) n.getLeftOperand().accept(this);
        Value right = (Value) n.getRightOperand().accept(this);

        try {
            if (left instanceof IntegerValue && right instanceof IntegerValue) 
                return new IntegerValue(((IntegerValue) n.getLeftOperand().accept(this)).getVal() 
                    + ((IntegerValue) n.getRightOperand().accept(this)).getVal());

            else if (left instanceof IntegerValue && right instanceof FloatValue) 
                return new FloatValue(((IntegerValue) n.getLeftOperand().accept(this)).getVal() 
                    + ((FloatValue) n.getRightOperand().accept(this)).getVal());
            else if (left instanceof FloatValue && right instanceof IntegerValue) 
                return new FloatValue(((FloatValue) n.getLeftOperand().accept(this)).getVal() 
                    + ((IntegerValue) n.getRightOperand().accept(this)).getVal());
            else
                return new FloatValue(((FloatValue) n.getLeftOperand().accept(this)).getVal() 
                    + ((FloatValue) n.getRightOperand().accept(this)).getVal());
        } catch (ClassCastException cce) {
            throw new PLp1Error("addition error: " + n.accept(new SourceVisitor()));
        }
    }

    @Override
    public Value visit(SubNode n) throws PLp1Error {
        Value left = (Value) n.getLeftOperand().accept(this);
        Value right = (Value) n.getRightOperand().accept(this);
        
        try { 
            if (left instanceof IntegerValue && right instanceof IntegerValue) 
                return new IntegerValue(((IntegerValue) n.getLeftOperand().accept(this)).getVal() 
                    - ((IntegerValue) n.getRightOperand().accept(this)).getVal());

            else if (left instanceof IntegerValue && right instanceof FloatValue) 
                return new FloatValue(((IntegerValue) n.getLeftOperand().accept(this)).getVal() 
                    - ((FloatValue) n.getRightOperand().accept(this)).getVal());
            else if (left instanceof FloatValue && right instanceof IntegerValue) 
                return new FloatValue(((FloatValue) n.getLeftOperand().accept(this)).getVal() 
                    - ((IntegerValue) n.getRightOperand().accept(this)).getVal());
            else
                return new FloatValue(((FloatValue) n.getLeftOperand().accept(this)).getVal() 
                    - ((FloatValue) n.getRightOperand().accept(this)).getVal());
        } catch (ClassCastException cce) {
            throw new PLp1Error("subtraction error: " + n.accept(new SourceVisitor()));
        }
    }

    @Override
    public Value visit(MultiplyNode n) throws PLp1Error{
        Value left = (Value) n.getLeftOperand().accept(this);
        Value right = (Value) n.getRightOperand().accept(this);
        
        try{
        if (left instanceof IntegerValue && right instanceof IntegerValue) 
            return new IntegerValue(((IntegerValue) n.getLeftOperand().accept(this)).getVal() 
                * ((IntegerValue) n.getRightOperand().accept(this)).getVal());
        
        else if (left instanceof IntegerValue && right instanceof FloatValue) 
            return new FloatValue(((IntegerValue) n.getLeftOperand().accept(this)).getVal() 
                * ((FloatValue) n.getRightOperand().accept(this)).getVal());
        else if (left instanceof FloatValue && right instanceof IntegerValue) 
            return new FloatValue(((FloatValue) n.getLeftOperand().accept(this)).getVal() 
                * ((IntegerValue) n.getRightOperand().accept(this)).getVal());
        else
            return new FloatValue(((FloatValue) n.getLeftOperand().accept(this)).getVal() 
                * ((FloatValue) n.getRightOperand().accept(this)).getVal());
        } catch (ClassCastException cce) {
            throw new PLp1Error("multiply error: " + n.accept(new SourceVisitor()));
        }
    }

    @Override
    public Value visit(DivideNode n) throws PLp1Error {
        Value left = (Value) n.getLeftOperand().accept(this);
        Value right = (Value) n.getRightOperand().accept(this);
        
        try {
            if (left instanceof IntegerValue && right instanceof IntegerValue) 
                return new IntegerValue(((IntegerValue) n.getLeftOperand().accept(this)).getVal() 
                    / ((IntegerValue) n.getRightOperand().accept(this)).getVal());

            else if (left instanceof IntegerValue && right instanceof FloatValue) 
                return new FloatValue(((IntegerValue) n.getLeftOperand().accept(this)).getVal() 
                    / ((FloatValue) n.getRightOperand().accept(this)).getVal());
            else if (left instanceof FloatValue && right instanceof IntegerValue) 
                return new FloatValue(((FloatValue) n.getLeftOperand().accept(this)).getVal() 
                    / ((IntegerValue) n.getRightOperand().accept(this)).getVal());
            else
                return new FloatValue(((FloatValue) n.getLeftOperand().accept(this)).getVal() 
                    / ((FloatValue) n.getRightOperand().accept(this)).getVal());
        
        } catch (ClassCastException cce) {
            throw new PLp1Error("divide error: " + n.accept(new SourceVisitor()));
        }
    }
/*
    @Override
    public Value visit(NumNode n)  throws PLp1Error{
        return new IntegerValue(n.getNum());
    }

    @Override
    public Value visit(IdNode n) throws PLp1Error{
        return env.get(n.getName());
    }

    @Override
    public Value visit(LetNode n)  throws PLp1Error{
        String var = n.getVar();
        Value val = (Value)n.getDefinition().accept(this);
        Environment newEnv = new Environment();
        newEnv.put(var, val);
        return (Value)n.getBody().accept(new EvalVisitor(newEnv));
            
    }

    @Override
    public Value visit(MaxNode n) throws PLp1Error {
        try {
            IntegerValue param1 = (IntegerValue)n.getParam(0).accept(this);
            IntegerValue param2 = (IntegerValue)n.getParam(1).accept(this);
        
            return new IntegerValue(Math.max(param1.getVal(), param2.getVal()));
        } catch (ClassCastException e) {
            throw new PLp1Error("Type erorr in max: "+n.accept(new SourceVisitor()));
        }
    }

    @Override
    public Value visit(MinNode n) throws PLp1Error {
        try {
            IntegerValue param1 = (IntegerValue)n.getParam(0).accept(this);
            IntegerValue param2 = (IntegerValue)n.getParam(1).accept(this);
        
            return new IntegerValue(Math.min(param1.getVal(), param2.getVal()));
        } catch (ClassCastException e) {
            throw new PLp1Error("Type erorr in min: "+n.accept(new SourceVisitor()));
        }
    }

    @Override
    public Value visit(IntegerPNode n) throws PLp1Error {
        if (n.getParam().accept(this) instanceof IntegerValue)
            return new BooleanValue(true);
       else
            return new BooleanValue(false);
    }
*/
    @Override
    public Value visit(BooleanNode n) throws PLp1Error {
        return new BooleanValue(n.getVal());
    }

    @Override
    public Value visit(ArgumentListNode n) throws PLp1Error {
        ListValue lv = new ListValue();
        
        for (ASTNode ast : n.getArguments())
            lv.add((Value) ast.accept(this));
        
        return lv;
    }

    @Override
    public Value visit(AssignNode n) throws PLp1Error {
        throw new UnsupportedOperationException("AssignNode: Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Value visit(BodyNode n) throws PLp1Error {
        return (Value) n.getBody().get(n.getBody().size() - 1).accept(this);
    }

    @Override
    public Value visit(CallNode n) throws PLp1Error {
        Value v = (Value) n.getArgs().accept(this);
        List<Value> argvals = (List<Value>)((ListValue)v).getVal();
        
        try {
            return ((BuiltinFunction) n.getFunc().accept(this)).invoke(env, argvals);
        } catch (ClassCastException cce) {
            throw new PLp1Error("function call error: " + n.accept(new SourceVisitor()));
        }
    }

    @Override
    public Value visit(ClassNode n) throws PLp1Error {
        throw new UnsupportedOperationException("ClassNode: Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Value visit(SwitchCaseNode n) throws PLp1Error {
        return (Value) n.getResultExpr().accept(this);
    }

    @Override
    public Value visit(SwitchNode n) throws PLp1Error {
        try {
        for (ASTNode node : n.getCases().getSwitchCases()) {
            SwitchCaseNode sw = (SwitchCaseNode) node;
            
            BooleanValue v = (BooleanValue) sw.getTestExpr().accept(this);
            if (v.getVal() == true) {
                return (Value) sw.accept(this);
            }
        }
        
        return (Value) n.getDefaultCase().accept(this);
        
        } catch (ClassCastException cce) {
            throw new PLp1Error("switch case error: " + n.accept(new SourceVisitor()));
        }
    }

    @Override
    public Value visit(FunctionDefinitionNode n) throws PLp1Error {
        throw new UnsupportedOperationException("FunctionDefinition: Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Value visit(FloatNode n) throws PLp1Error {
        return new FloatValue(n.getVal());
    }

    @Override
    public Value visit(LambdaNode n) throws PLp1Error {
        throw new UnsupportedOperationException("10Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Value visit(IfNode n) throws PLp1Error {
        try {
            if (((BooleanValue)n.getTestExpr().accept(this)).getVal()) {
                return (Value) n.getThenExpr().accept(this);
            } else {
                return (Value) n.getElseExpr().accept(this);
            }
        } catch (ClassCastException cce) {
            throw new PLp1Error("if operation error: " + n.accept(new SourceVisitor()));
        }
    }

    @Override
    public Value visit(IntegerNode n) throws PLp1Error {
        return new IntegerValue(n.getVal());
    }

    @Override
    public Value visit(ListNode n) throws PLp1Error {
        ListValue lv = new ListValue();
        for (ASTNode ast : n.getList()) {
            lv.add((Value) ast.accept(this));
        }
        
        return lv;
    }

    @Override
    public Value visit(MethodNode n) throws PLp1Error {
        throw new UnsupportedOperationException("14Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Value visit(MethodRefNode n) throws PLp1Error {
        throw new UnsupportedOperationException("15Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Value visit(CreateNode n) throws PLp1Error {
        throw new UnsupportedOperationException("16Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Value visit(StringNode n) throws PLp1Error {
        return new StringValue(n.getString());
    }

    @Override
    public Value visit(VarRefNode n) throws PLp1Error {
        switch (n.getId()) {
            case "first":
                return new FirstFunc();
            case "rest":
                return new RestFunc();
            case "insert":
                return new InsertFunc();
            case "list":
                return new ListFunc();
            case "emptyp":
                return new EmptypFunc();
            case "pairp":
                return new PairpFunc();
            case "listp":
                return new ListpFunc();
            case "equalp":
                return new EqualpFunc();
            case "length":
                return new LengthFunc();
            case "numberp":
                return new NumberpFunc();
            case "exit":
                return new ExitFunc();       
        }
        return new NullValue();
    }

    @Override
    public Value visit(LetNode n) throws PLp1Error {
         n.getLetVarDecls().accept(this);
         return (Value) n.getBody().accept(this);
    }

    @Override
    public Value visit(NotNode n) throws PLp1Error {
        try {
            return new BooleanValue(!((BooleanValue) n.getOperand().accept(this)).getVal());
        } catch (ClassCastException cce) {
            throw new PLp1Error("not operation error: " + n.accept(new SourceVisitor()));
        }
    }

    @Override
    public Value visit(OrNode n) throws PLp1Error {
        try {
            return new BooleanValue(((BooleanValue) n.getLeftOperand().accept(this)).getVal() 
                    || ((BooleanValue) n.getRightOperand().accept(this)).getVal());
        } catch (ClassCastException cce) {
            throw new PLp1Error("or operation error: " + n.accept(new SourceVisitor()));
        }
    }

    @Override
    public Value visit(AndNode n) throws PLp1Error {
        try {
            return new BooleanValue(((BooleanValue) n.getLeftOperand().accept(this)).getVal() 
                    && ((BooleanValue) n.getRightOperand().accept(this)).getVal());
        } catch (ClassCastException cce) {
            throw new PLp1Error("and operation error: " + n.accept(new SourceVisitor()));
        }
    }

    @Override
    public Value visit(EqualNode n) throws PLp1Error {
        try {
            return new BooleanValue(((Value) n.getLeftOperand().accept(this)).getVal()
                    .equals(((Value) n.getRightOperand().accept(this)).getVal()));
        } catch (ClassCastException cce) {
            throw new PLp1Error("equal operation error: " + n.accept(new SourceVisitor()));
        }
    }

    @Override
    public Value visit(NotEqualNode n) throws PLp1Error {
        try { 
            return new BooleanValue(!((Value) n.getLeftOperand().accept(this)).getVal()
                    .equals(((Value) n.getRightOperand().accept(this)).getVal()));
        } catch (ClassCastException cce) {
            throw new PLp1Error("notequal operation error: " + n.accept(new SourceVisitor()));
        }
    }

    @Override
    public Value visit(LessNode n) throws PLp1Error {
        Value left = (Value) n.getLeftOperand().accept(this);
        Value right = (Value) n.getRightOperand().accept(this);
        
        try {
        
            if (left instanceof FloatValue && right instanceof FloatValue) 
                return new BooleanValue(((FloatValue) n.getLeftOperand().accept(this)).getVal() 
                    < ((FloatValue) n.getRightOperand().accept(this)).getVal());
            else if (left instanceof IntegerValue && right instanceof FloatValue) 
                return new BooleanValue(((IntegerValue) n.getLeftOperand().accept(this)).getVal() 
                    < ((FloatValue) n.getRightOperand().accept(this)).getVal());
            else if (left instanceof FloatValue && right instanceof IntegerValue) 
                return new BooleanValue(((FloatValue) n.getLeftOperand().accept(this)).getVal() 
                    < ((IntegerValue) n.getRightOperand().accept(this)).getVal());
            else
                return new BooleanValue(((IntegerValue) n.getLeftOperand().accept(this)).getVal() 
                    < ((IntegerValue) n.getRightOperand().accept(this)).getVal());
            
         } catch (ClassCastException cce) {
            throw new PLp1Error("less operation error: " + n.accept(new SourceVisitor()));
        }
    }

    @Override
    public Value visit(LessEqualNode n) throws PLp1Error {
        Value left = (Value) n.getLeftOperand().accept(this);
        Value right = (Value) n.getRightOperand().accept(this);
        
        try {
        
            if (left instanceof FloatValue && right instanceof FloatValue) 
                return new BooleanValue(((FloatValue) n.getLeftOperand().accept(this)).getVal() 
                    <= ((FloatValue) n.getRightOperand().accept(this)).getVal());
            else if (left instanceof IntegerValue && right instanceof FloatValue) 
                return new BooleanValue(((IntegerValue) n.getLeftOperand().accept(this)).getVal() 
                    <= ((FloatValue) n.getRightOperand().accept(this)).getVal());
            else if (left instanceof FloatValue && right instanceof IntegerValue) 
                return new BooleanValue(((FloatValue) n.getLeftOperand().accept(this)).getVal() 
                    <= ((IntegerValue) n.getRightOperand().accept(this)).getVal());
            else
                return new BooleanValue(((IntegerValue) n.getLeftOperand().accept(this)).getVal() 
                    <= ((IntegerValue) n.getRightOperand().accept(this)).getVal());
            
        } catch (ClassCastException cce) {
            throw new PLp1Error("lessequal operation error: " + n.accept(new SourceVisitor()));
        }
    }

    @Override
    public Value visit(GreaterNode n) throws PLp1Error {
        Value left = (Value) n.getLeftOperand().accept(this);
        Value right = (Value) n.getRightOperand().accept(this);
        
        try {
        
            if (left instanceof FloatValue && right instanceof FloatValue) 
                return new BooleanValue(((FloatValue) n.getLeftOperand().accept(this)).getVal() 
                    > ((FloatValue) n.getRightOperand().accept(this)).getVal());
            else if (left instanceof IntegerValue && right instanceof FloatValue) 
                return new BooleanValue(((IntegerValue) n.getLeftOperand().accept(this)).getVal() 
                    > ((FloatValue) n.getRightOperand().accept(this)).getVal());
            else if (left instanceof FloatValue && right instanceof IntegerValue) 
                return new BooleanValue(((FloatValue) n.getLeftOperand().accept(this)).getVal() 
                    > ((IntegerValue) n.getRightOperand().accept(this)).getVal());
            else
                return new BooleanValue(((IntegerValue) n.getLeftOperand().accept(this)).getVal() 
                    > ((IntegerValue) n.getRightOperand().accept(this)).getVal());
        
        } catch (ClassCastException cce) {
            throw new PLp1Error("greater operation error: " + n.accept(new SourceVisitor()));
        }
    }

    @Override
    public Value visit(GreaterEqualNode n) throws PLp1Error {
        Value left = (Value) n.getLeftOperand().accept(this);
        Value right = (Value) n.getRightOperand().accept(this);
        
        try {
            if (left instanceof FloatValue && right instanceof FloatValue) 
                return new BooleanValue(((FloatValue) n.getLeftOperand().accept(this)).getVal() 
                    >= ((FloatValue) n.getRightOperand().accept(this)).getVal());
            else if (left instanceof IntegerValue && right instanceof FloatValue) 
                return new BooleanValue(((IntegerValue) n.getLeftOperand().accept(this)).getVal() 
                    >= ((FloatValue) n.getRightOperand().accept(this)).getVal());
            else if (left instanceof FloatValue && right instanceof IntegerValue) 
                return new BooleanValue(((FloatValue) n.getLeftOperand().accept(this)).getVal() 
                    >= ((IntegerValue) n.getRightOperand().accept(this)).getVal());
            else
                return new BooleanValue(((IntegerValue) n.getLeftOperand().accept(this)).getVal() 
                    >= ((IntegerValue) n.getRightOperand().accept(this)).getVal());
        } catch (ClassCastException cce) {
            throw new PLp1Error("greaterequal operation error: " + n.accept(new SourceVisitor()));
        }
    }

    @Override
    public Value visit(ParenNode n) throws PLp1Error {
        return (Value) n.getExpr().accept(this);
    }

    @Override
    public Value visit(ParameterListNode n) throws PLp1Error {
         throw new UnsupportedOperationException("ParameterList: Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Value visit(LetDeclNode n) throws PLp1Error {
        throw new UnsupportedOperationException("31Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Value visit(LetDeclListNode n) throws PLp1Error {
        throw new UnsupportedOperationException("32Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Value visit(SwitchCaseListNode n) throws PLp1Error {
        throw new UnsupportedOperationException("33Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Value visit(NullNode n) throws PLp1Error {
        return new NullValue();
    }

    @Override
    public Value visit(ProgramNode n) throws PLp1Error {
        return (Value) n.getProgram().get(0).accept(this);
    }

    @Override
    public Value visit(InstanceVariableListNode n) throws PLp1Error {
        throw new UnsupportedOperationException("InstanceVariableList: Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Value visit(MethodListNode n) throws PLp1Error {
        throw new UnsupportedOperationException("MethodList: Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Value visit(VarDefNode n) throws PLp1Error {
        throw new UnsupportedOperationException("VarDef: Not supported yet."); 
    }
}
