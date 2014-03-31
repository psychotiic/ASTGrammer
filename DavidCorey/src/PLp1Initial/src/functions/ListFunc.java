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

// create a list
public class ListFunc extends BuiltinFunction {
    
    @Override
    public Value invoke(Environment env, List<Value> args) throws PLp1Error {
        ListValue lv = new ListValue();
        if (args.isEmpty())
            throw new PLp1Error("list argument error");
        
        for (Value v : args)
            lv.add(v);
        
        return lv;
    } 
}