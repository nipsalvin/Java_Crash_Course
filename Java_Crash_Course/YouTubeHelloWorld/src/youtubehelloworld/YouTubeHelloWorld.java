/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtubehelloworld;

import java.util.Scanner;

/**
@author Nips
 **/
public class YouTubeHelloWorld 
//begining of class YouTubeHelloWorld
{

    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       System.out.print("What is your name ? ");
       String yourName = input.nextLine();
                /*
                1. String yourName;
                   yourName = "Nips Alvin";
                2. (shorter code would be)
                   String yourName = "Nips Alvin";
                */
       System.out.print("Hello, ");
       System.out.println(yourName);
       System.out.println("Wassup");
      
    }
    
//end of class YouTubeHelloWorld
}
