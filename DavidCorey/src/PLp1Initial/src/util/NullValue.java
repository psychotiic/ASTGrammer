/**
 * 
 */
package util;

/**
 * @author carr
 *
 */
public class NullValue extends Value {

	/**
	 * 
	 */
	public NullValue() {
	}

	/* (non-Javadoc)
	 * @see util.Value#toString()
	 */
	@Override
	public String toString() {
		return "null";
	}

    @Override
    public Value addValue(Object val) {
        return this;
    }

    @Override
    public boolean equal(Object val) {
        return val instanceof NullValue;
    }

}
