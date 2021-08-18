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
        System.out.print("Enter your name: " );
        String fname = input.nextLine();
        System.out.print("Enter your name: " );
        String lname = input.nextLine();

        System.out.print("hello,");
        System.out.print(fname);
        System.out.println(lname);

        System.out.print("Or should i say ");
        System.out.print(lname );
        System.out.print(fname);


    }
    
}
