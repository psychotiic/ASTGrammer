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

// return true if L1 and L2 are equivalent lists
public class EqualpFunc extends BuiltinFunction {
    
    @Override
    public Value invoke(Environment env, List<Value> args) throws PLp1Error {
        if (args.size() != 2 || !(args.get(0) instanceof ListValue) 
                || !(args.get(1) instanceof ListValue))
            throw new PLp1Error("equalp argument error");

        ListValue lv1 = (ListValue) args.get(0);
        ListValue lv2 = (ListValue) args.get(1);
        
        return new BooleanValue(lv1.equals(lv2));
    } 
}