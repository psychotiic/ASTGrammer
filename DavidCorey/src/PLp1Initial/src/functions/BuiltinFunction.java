/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;
import java.util.List;
import util.*;

/**
 *
 * @author Corey
 */
public abstract class BuiltinFunction extends Value<Object> {
    
    public abstract Value invoke(Environment env, List<Value> args) throws PLp1Error;
    
    @Override
    public String toString() { return "#builtin"; }
}
