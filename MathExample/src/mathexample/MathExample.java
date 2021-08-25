/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathexample;

import java.util.Scanner;

/**
 *
 * @author Nips
 */
public class MathExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Circumference and area of a circle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        double radius = input.nextDouble();
        
        double circ = 2* Math.PI * radius;
        double area = Math.PI * radius * radius;
        
        System.out.printf("Circumferncce : %f; \nArea : %f\n",circ, area);
    }
    
}
