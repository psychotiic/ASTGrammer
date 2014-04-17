/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author steve
 */
public class ValueFactory {
    
    public static enum ValueType {INT,FLOAT,BOOL,LIST,NULL,
        STRING,VOID};

    
    public Value makeValue(ValueType valueType) {
        switch (valueType) {
            case INT: return new IntValue();
            case FLOAT: return new FloatValue();
            case BOOL: return new BooleanValue();
            case LIST: return new ListValue();
            case NULL: return new NullValue();
            case STRING: return new StringValue();
            case VOID: return new VoidValue();
            default:
                return null;
        }
    }
}
