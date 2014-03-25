/**
 * 
 */
package util;

/**
 * @author carr
 *
 */
public class PLp1Error extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8480673268859231478L;

	/**
	 * 
	 */
	public PLp1Error() {
	}

	/**
	 * @param arg0
	 */
	public PLp1Error(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public PLp1Error(Throwable arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public PLp1Error(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}
	
	public String toString() {
		return this.getMessage();
	}

}
