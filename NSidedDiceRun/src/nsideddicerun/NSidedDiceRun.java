package nsideddicerun;

public class NSidedDiceRun {

    public static void main(String[] args) {

        Die d12 = new Die(12); //makes a 12 sided die
        Die normal = new Die(6); //regular die
        Die skullcrusher = new Die(20);
        /*
        System.out.println(normal.roll()); //prints out a die roll
        System.out.println(d12.getValue()); //prints initial value of the die before rolling
        System.out.println(d12.getValue()); //Confirmation that it is the initial value before rolling
        */
        System.out.printf("Rolling a %d sided die : %d\n",normal.getSides(),normal.roll());
        System.out.printf("Rolling a %d sided die : %d\n",d12.getSides(),d12.roll());
        System.out.printf("Rolling a %d sided die : %d\n",skullcrusher.getSides(),skullcrusher.roll());
    }
    
    
}
