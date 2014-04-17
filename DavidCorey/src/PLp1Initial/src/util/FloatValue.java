/**
 * 
 */
package util;

/**
 * @author carr
 *
 */
public class FloatValue extends Value {

	/**
	 * 
	 */
	public FloatValue() {
	}
        
        public Value addValue(Object val) {
          this.val = val;
          return this;
        }
	
	public float getFloat() {
		return ((Float)val).floatValue();
	}

	@Override
	public String toString() {
		return val.toString();
	}

    @Override
    public boolean equal(Object val) {
        return (val instanceof FloatValue &&
                ((FloatValue)val).getFloat() == getFloat());
    }

}
