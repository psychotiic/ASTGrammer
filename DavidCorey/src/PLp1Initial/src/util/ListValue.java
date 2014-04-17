/**
 *
 */
package util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author carr
 *
 */
public class ListValue extends Value {

    /**
     *
     */
    public ListValue() {
        this.val = new ArrayList<Value>();
    }
    
    public Value get(int index) {
        return ((ArrayList<Value>)this.val).get(index);
    }

    public Value addValue(Object val) {
        ((ArrayList<Value>) this.val).addAll((Collection) val);
        return this;
    }

    public Value first() {
        return ((ArrayList<Value>) val).get(0);
    }

    public ListValue rest() {
        ArrayList<Value> newL = (ArrayList<Value>) ((ArrayList<Value>) val).clone();
        newL.remove(0);

        return (ListValue) new ListValue().addValue(newL);
    }

    public ListValue insert(Value v) {
        ((List<Value>) val).add(0, v);

        return this;
    }
    
    public ListValue append(Value v) {
        ((List<Value>)val).add(v);
        return this;
    }

    public int length() {
        return ((ArrayList<Value>) val).size();
    }

    public String toString() {
        String str = "[";

        for (Value v : (ArrayList<Value>) val) {
            str += (v + ", ");
        }

        if (str.length() > 1) {
            return str.substring(0, str.length() - 2) + "]";
        } else {
            return str + "]";
        }
    }
    
    @Override
    public boolean equal(Object l) {
        if (l instanceof ListValue) {
            ArrayList<Value> lv = (ArrayList<Value>)((ListValue)l).val;
            ArrayList<Value> v = (ArrayList<Value>)val;
            if (lv.size() == v.size()) {
                boolean eq = true;
                for (int i = 0; i < lv.size() && eq; i++)
                    eq = lv.get(i).equal(v.get(i));
                return eq;
            }
            else
                return false;
        }
        else
            return false;
    }
}
