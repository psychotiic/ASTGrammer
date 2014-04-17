/**
 * 
 */
package util;

import java.util.HashMap;
import java.util.List;

/**
 * @author carr
 *
 */
public class Environment extends HashMap<String,Value>{

	/**
	 * 
	 */
        Environment enclosingEnv;
	private static final long serialVersionUID = -8991149306084765376L;
	
	public Environment(List<String> vars, List<Value> vals, Environment enclosingEnv) {
		super();
                
		this.enclosingEnv = enclosingEnv;
		addToMap(vars,vals);
		
	}
	
	public Value get(String var) throws PLp1Error {
		if (containsKey(var)) 
			return super.get(var);
                else if (this.enclosingEnv != null) {
                        return this.enclosingEnv.get(var); 
                }
                else
			throw new PLp1Error("Undefined Variable: "+var);
	}
	
	public Value put(String var,Value val) {
		super.put(var, val);
		return val;
	}
	
	protected void addToMap(List<String> vars, List<Value> vals) {
		
		for (int i = 0; i < vals.size(); i++)
			put(vars.get(i), vals.get(i));
		
	}
}
