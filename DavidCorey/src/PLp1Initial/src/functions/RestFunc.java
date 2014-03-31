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

// return everything except the first value of a list
public class RestFunc extends BuiltinFunction {
    
    @Override
    public Value invoke(Environment env, List<Value> args) throws PLp1Error {
        if (args.size() != 1 || !(args.get(0) instanceof ListValue))
            throw new PLp1Error("rest argument error");
        
        ListValue lv = (ListValue) args.get(0);
        if (lv.getVal().isEmpty()) {
             throw new PLp1Error("rest error: list is empty and does not have any elements to return after");
        }
        
        
        ListValue rest = new ListValue();
        
        for (Value v : lv.getVal().subList(1, lv.getVal().size()))
            rest.add(v);
        
        return rest;
    }
}