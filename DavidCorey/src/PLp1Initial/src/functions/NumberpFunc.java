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

// return true if element is a number
public class NumberpFunc extends BuiltinFunction {
    
    @Override
    public Value invoke(Environment env, List<Value> args) throws PLp1Error {
        if (args.size() != 1)
            throw new PLp1Error("numberp argument error");
        
        Value v = args.get(0);
        return new BooleanValue(v instanceof IntegerValue || v instanceof FloatValue);
    } 
}