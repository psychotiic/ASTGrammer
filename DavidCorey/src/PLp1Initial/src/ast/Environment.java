/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import java.util.HashMap;

/**
 *
 * @author Carr
 */
public class Environment extends HashMap<String,Integer> {
    
    public int get(String var) throws PLp1Exception {
        Integer val = super.get(var);
        if (val == null)
            throw new PLp1Exception("Too bad for you!");
        else
            return val;
    }
}
