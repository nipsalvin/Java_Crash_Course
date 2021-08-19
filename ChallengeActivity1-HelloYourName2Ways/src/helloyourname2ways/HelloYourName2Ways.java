/* Challenge Activity 1

Write a java program to input your first name and last name, then say "hello"
two ways, like this:
 
Enter your first name: Michael
Enter your last name: Fudge

Hello, Michael Fudge!  
Or should I say: Fudge, Michael!

*/
package helloyourname2ways;

import java.util.Scanner;

/**
 *
 * @author mafudge
 */
public class HelloYourName2Ways {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your First name: " );
        String fname = input.nextLine();
        System.out.print("Enter your Last name: " );
        String lname = input.nextLine();

        System.out.printf("hello %s %s !\n",fname, lname);
       

        System.out.printf("Or should i say %s %s!\n", lname, fname);
       


    }
    
}
