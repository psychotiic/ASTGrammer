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

// return the first value of a list
public class ExitFunc extends BuiltinFunction {
    
    @Override
    public Value invoke(Environment env, List<Value> args) throws PLp1Error {
        if (!args.isEmpty())
            throw new PLp1Error("exit argument error");
        
        System.exit(0);
        
        return new NullValue();
    } 
}