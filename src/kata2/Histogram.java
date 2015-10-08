/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;
import java.util.HashMap;
import java.util.Set;
public class Histogram <T>{
    HashMap<T, Integer> histo = new HashMap<>();

    public Integer get(Object key) {
        return histo.get(key);
    }

    public Set<T> keySet() {
        return histo.keySet();
    }
    
    public void increment(T key){
        histo.put(key, histo.containsKey(key)? histo.get(key)+1:1);
    }
    
  
}
