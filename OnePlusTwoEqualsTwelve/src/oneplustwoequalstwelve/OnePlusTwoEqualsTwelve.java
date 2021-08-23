/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oneplustwoequalstwelve;

/**
 *
 * @author Nips
 */
public class OnePlusTwoEqualsTwelve {

    /*
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 20;
        int y = 15;
        int a = x/y;    //int / int ==> int
        double b = x/y; //int / int ==> double
        double c = x/(0.1 * y); //int / (double*int) ==> double
        double d = x / (double)y; //int / double ==> double
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    
}
