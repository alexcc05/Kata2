/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

public class Kata2   {

    public static void main(String[] args) {
      Integer[] array= {1,4,7,1,1,8,4,1,4,9};
       Histogram <Integer> histogram = BuildHisto.cumputHisto(array);
       
       for(Object key:histogram.keySet()){
          System.out.println(key +":"+ histogram.get(key));
    }
    
        
    }
}
