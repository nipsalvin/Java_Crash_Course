/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodbasic;

import java.util.Scanner;

/**
 *
 * @author Nips
 */
public class MethodBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int length, width;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the length : ");
       length = input.nextInt();
       System.out.print("Enter the width : ");
       width = input.nextInt();
       
       int area = rectangleArea(length, width);
       int per = rectanglePerimeter(length, width);
       System.out.printf("Rectangle area : %d; Perimeter : %d\n",area , per);
        /*
        rectangleArea ->> method call
        (5,10) ->> arguments
        sample code to print area only  below
        System.out.println(rectangleArea(5,10));
        */
        
    }
    
    /*
    when yyou define the method you parse PARAMETERS (someLength, someWidth)
    When you run a method you parse aN ARGUMENT (5,10) [a real value]
    
    */
    
    public static int rectangleArea (int someLength, int someWidth) {
        return someLength * someWidth;
        
    }
    public static int rectanglePerimeter(int someLength, int someWidth){
   
    return 2 * (someLength + someWidth);
       }

}   

