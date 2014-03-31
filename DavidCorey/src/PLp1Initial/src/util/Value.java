/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Carr
 */
public abstract class Value<T> {
    protected T val;

    public void setVal(T val) {
        this.val = val;
    }
    
    public T getVal() {
        return val;
    }
    
    public String toString() {
        return val.toString();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Value)) return false;
        
        Value v = (Value) obj;
        return this.getVal().equals(v.getVal());
    }
}
