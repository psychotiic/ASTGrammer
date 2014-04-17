/**
 * 
 */
package util;

import java.util.List;

/**
 * @author carr
 *
 */
public abstract class Function extends Value {

	public abstract Value invoke(Environment env, List<Value> args) throws PLp1Error;
}
