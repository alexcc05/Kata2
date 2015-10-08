/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class Kata2 {

    public static void main(String[] args) {
       int[] array= {1,4,7,1,1,8,4,1,4,9};
       Histogram histo = new Histogram(array);
       HashMap<Integer, Integer> histogram = histo.getHisto();
   
       for(Integer key:histogram.keySet()){
          System.out.println(key +":"+ histogram.get(key));
    }
    
        
    }
}
