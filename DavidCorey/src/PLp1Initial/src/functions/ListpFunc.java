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

// return true if L is a list
public class ListpFunc extends BuiltinFunction {
    
    @Override
    public Value invoke(Environment env, List<Value> args) throws PLp1Error {
        if (args.size() != 1)
            throw new PLp1Error("listp argument error");
        
        return new BooleanValue(args.get(0) instanceof ListValue);
    } 
}