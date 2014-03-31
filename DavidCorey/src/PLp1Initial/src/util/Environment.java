/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.HashMap;

/**
 *
 * @author Carr
 */
public class Environment extends HashMap<String,Value> {
    
    public Value get(String var) throws PLp1Error {
        Value val = super.get(var);
        if (val == null)
            throw new PLp1Error("Too bad for you!");
        else
            return val;
    }
}
