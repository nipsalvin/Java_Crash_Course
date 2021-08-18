/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactivecommondatatypes;

/**
 *
 * @author Nips
 */
public class InteractiveCommonDataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String name;
      int age;
      double grade;
      
      name = "Nips";
      age = 26;
      grade = 400.2;
      
      System.out.printf("%s is %d years old. %s got %f in KCPE",
                    name, age, name,grade);
      
        
    }
    
}
