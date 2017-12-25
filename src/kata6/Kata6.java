/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

/**
 *
 * @author Arkhen
 */
public class Kata6 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        for (int i = 0; i < 15; i++) {
            histogram.increment("gmail.com");            
        }
       
        for (int i = 0; i < 5; i++) {
            histogram.increment("ulpgc.com");           
        }
        for (int i = 0; i < 20; i++) {
            histogram.increment("ull.com");           
        }
        histogram.increment("hotmail.com");
        new HistogramDisplay(histogram).execute();
        
        
    }
    
}