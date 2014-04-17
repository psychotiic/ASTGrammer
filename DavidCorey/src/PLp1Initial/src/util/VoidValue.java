/**
 * 
 */
package util;

/**
 * @author carr
 *
 */
public class VoidValue extends Value {

	/**
	 * 
	 */
	public VoidValue() {
		this.val = null;
	}
	
	public String toString() {
		return "#void";
	}

    @Override
    public Value addValue(Object val) {
        return this;
    }

    @Override
    public boolean equal(Object val) {
        return val instanceof VoidValue;
    }

}
