package basicsortingsearchingdemo;

import java.util.ArrayList;
import java.util.Random;

public class BasicSortingSearchingDemo {

    
    public static void main(String[] args) {
        
        //Example of sorting and searching
        Random generator = new Random();
        int found = -1;
        ArrayList <Integer> numbers = new ArrayList<>();
        for (int i = 0; i <20 ; i++);{
            numbers.add(generator.nextInt(100)+1);}
        
        System.out.println("UNSORTED");
        printNumbers(numbers);
                
    }
    public static void printNumbers(ArrayList<Integer> nums){
        for (int i=0; i< nums.size();i++){
            System.out.printf("%d",nums.get(i));
        }
        System.out.println();
    }
     //Linear searh
    public static int find (ArrayList<Integer>a, Integer target){
        int found = -1;
        for (int i=0; i<a.size();i++){
            if (a.get(i) == target) {
                found = i;
                break;
            }
        }
        return found;
    }
}
