/**
 * 
 */
package util;

/**
 * @author carr
 *
 */
public class IntValue extends Value {

	/**
	 * 
	 */
	public IntValue() {
	}
        
        public Value addValue(Object val) {
            this.val = val;
            return this;
        }
	
	public int getInt() {
		return ((Integer)val).intValue();
	}

	@Override
	public String toString() {
		return val.toString();
	}

    @Override
    public boolean equal(Object val) {
        return (val instanceof IntValue &&
                ((IntValue)val).getInt() == getInt());
    }

}
