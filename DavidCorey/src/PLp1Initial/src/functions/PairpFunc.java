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

// return true if L is a non-empty list
public class PairpFunc extends BuiltinFunction {
    
    @Override
    public Value invoke(Environment env, List<Value> args) throws PLp1Error {
        if (args.size() != 1 || !(args.get(0) instanceof ListValue))
            throw new PLp1Error("pairp argument error");
        
        ListValue lv = (ListValue) args.get(0);
        
        return new BooleanValue(!lv.getVal().isEmpty());
    } 
}