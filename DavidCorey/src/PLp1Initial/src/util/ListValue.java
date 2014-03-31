/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carr
 */
public class ListValue extends Value<List<Value>> {
    public ListValue() {
        this.val = new ArrayList<>();
    }
    
    public void add(Value v) {
        this.val.add(v);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ListValue)) 
            return false;
        
        ListValue lv = (ListValue) obj;
        if (this.val.size() != lv.getVal().size())
            return false;
        
        for (int i = 0; i < this.val.size(); i++) {
            if (!this.val.get(i).equals(lv.getVal().get(i))) {
                return false;
            }
        }

        return true;
    }
}