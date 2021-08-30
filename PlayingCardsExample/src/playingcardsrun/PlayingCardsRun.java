package playingcardsrun;

//import all classes from playingcards package using *
//import playingcards.Suits;
import java.util.Random;
import playingcards.*;

public class PlayingCardsRun {

    public static void main(String[] args) {
       /* Cards c = new Cards(Ranks.EIGHT, Suits.DIAMONDS);
        Cards d = new Cards(Ranks.SIX, Suits.SPADES);
        System.out.println(c);
        System.out.println(d);
        */
       
       Random gen = new Random();
       Cards c1 = new Cards(Ranks.ACE,Suits.HEARTS);
       Cards c2 = new Cards(gen.nextInt (52));
       
       System.out.printf("Cards: %s %s\n", c1.toString(),c2.toString());
       System.out.printf("Same rank: %s\n",c1.sameRank(c2));
       System.out.printf("Same suit: %s\n", c1.sameSuit(c2));
       System.out.printf("Same card: %s\n",c1.sameCard(c2));
    }
    
}
