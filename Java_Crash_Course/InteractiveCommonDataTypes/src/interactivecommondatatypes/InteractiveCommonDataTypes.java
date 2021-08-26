package interactivecommondatatypes;

import java.util.Scanner;
/*
 * @author Nips
 */
public class InteractiveCommonDataTypes {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //the strings are left null. To be answered by user 
      String name = "", heshe = "";
      double grade;
      int age = 41, retirement = 70, daystill = 0;
      boolean isFemale ;
     
      /*
      Not needed since i've added the Scanner to get answers from the user
      *name = "Nips";
      *age = 26;
      *grade = 400.202;
      */
      
      System.out.println("Enter student's name :");
      name = input.nextLine();
      System.out.println("Enter student's age ");
      age = input.nextInt();
      System.out.println("Enter student's grade: ");
      grade = input.nextDouble();
      System.out.println("Are you female ? [true / false] : ");
      isFemale = input.nextBoolean();
      
      heshe = isFemale ? "She" :"He";
      daystill = retirement - age;
      
      /*
      Shorter way to declare variables and assign values would be
      String name = Nips;
      int age = 26;
      double grade = 400.202;
      */
      
      System.out.printf("%s is %d years old (%d years till retirement). %s got %4.2f in KCPE \n" , name, age, daystill, heshe, grade);
      
        
    }
    
}
