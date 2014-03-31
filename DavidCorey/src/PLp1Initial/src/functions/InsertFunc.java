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

// insert a value to the front of L
// ex. insert->(1, [2,3,4,5]) == [1, 2, 3, 4, 5]
public class InsertFunc extends BuiltinFunction {
    
    @Override
    public Value invoke(Environment env, List<Value> args) throws PLp1Error {
        if (args.size() != 2 || !(args.get(1) instanceof ListValue))
            throw new PLp1Error("insert argument error");
        
        Value v = args.get(0);
        ListValue lv = (ListValue) args.get(1);
        
        ListValue insert = new ListValue();
        insert.add(v);
        
        for (Value val : lv.getVal())
            insert.add(val);
        
        return insert;
    } 
}