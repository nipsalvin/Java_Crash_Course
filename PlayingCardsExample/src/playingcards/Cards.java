package playingcards;

public class Cards {
    private int suit; //clubs = 0 ,spade = 3 etc
    private int rank; //deuce = 0
    
    /**
     * (describes what card method does)Creates a new card
     * @param ranks this int representation of the ran Ranks. THREE of 2 for example
     * @param suit this is the int representation of the suit 0=club 
     */
    //constructor
    public Cards(int rank, int suit){
        this.suit = suit;
        this.rank = rank;
    }
    /**
     * Creates new card with a card number
     * @param cardno integer representation of card 0 = 2 of clubs 13 = 2 of diamonds
     */
    public Cards(int cardno) {
        this.rank = cardno % 13;
        this.suit = (cardno/13) % 4;
    }
}
