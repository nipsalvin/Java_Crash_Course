package randomexample;

import java.util.Random;
//author nips
public class RandomExample {

    public static void main(String[] args) {
        // Pseudo-random number example
        Random generator = new Random ();
        int i = generator.nextInt (10);
        System.out.println(i);
        i = generator.nextInt (10);
        System.out.println(i);
        i = generator.nextInt (10);
        System.out.println(i);   
    }    
}
