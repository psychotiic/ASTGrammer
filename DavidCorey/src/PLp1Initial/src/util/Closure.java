/**
 *
 */
package util;

import java.util.ArrayList;

import visitor.EvalVisitor;


import ast.ASTNode;
import java.util.List;

/**
 * @author carr
 *
 */
public class Closure extends Function {
    private String name;
    private ListValue params;
    private ASTNode body;
    private Environment env;

    /**
     * @param name
     * @param param
     * @param body
     * @param env
     */
    public Closure(String name, ListValue params, ASTNode body, Environment env) {
        this.name = name;
        this.params = params;
        this.body = body;
        this.env = env;
    }

    /* (non-Javadoc)
     * @see util.Function#invoke(util.Environment, java.util.ArrayList)
     */
    @Override
    public Value invoke(Environment environment, List<Value> arg) throws PLp1Error {
        if (arg.size() != ((ArrayList<Value>) params.get()).size())
            throw new PLp1Error("Argument error");
        
        Environment newEnv = new Environment(new ArrayList<String>(), 
                new ArrayList<Value>(), this.env);
        
        for (int i = 0; i < arg.size(); i++) {
            newEnv.put((String) ((StringValue) this.params.get(i)).val, arg.get(i));
        }
        
        return (Value) body.accept(new EvalVisitor(newEnv));
    }

    public String toString() {
        if (name != null) {
            return name;
        } else {
            return "#function";
        }
    }

    @Override
    public Value addValue(Object val) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
