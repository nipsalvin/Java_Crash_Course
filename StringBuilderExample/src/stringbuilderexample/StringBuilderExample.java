package stringbuilderexample;

public class StringBuilderExample {

    public static void main(String[] args) {
        // Reverse a string
        String forward = "This is a test";
        StringBuilder sb = new StringBuilder();
        sb.append(forward);
        /*sb ->> string builder
        . ->> references property/method of..
        reverse ->> sb class
        . ->> after reverse it is referenced to new string "toString"
        */
        String reverse = sb.reverse().toString();
        
        System.out.println(forward);
        System.out.println(reverse);
    }
    
}
