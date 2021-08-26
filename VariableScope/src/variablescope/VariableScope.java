package variablescope;

public class VariableScope {

    public static void main(String[] args) {
        String name = "Nips";
        SayHello(name);
        name = "Pinpin";
        SayHello(name);
    }
    
    public static void SayHello(String name){
        name = "Madova";
        System.out.printf("Hello, %s\n", name);
    }
    
}
/*
Nips is assigned to name first
then PINPIN
Then finally MADOVA

The reason MADOVA is the output is because it was created in the block that was printing
*/