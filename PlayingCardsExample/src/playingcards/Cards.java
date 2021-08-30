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
        //card number divided b 13 then you take the remainder e.g 13/2=6 rem 1....value is 1
        this.rank = cardno % 13;
        this.suit = (cardno/13) % 4;
    }
    /**
     *Get the rank of the card
     * return ran of the card as integer
     */
    
    public int rank() {return rank;}
    
    /**
     * Get the suit of the card
     * return suit of the card
     */
    
    public int suit() {return suit;}
    
    /**
     * compares 2 ranks to see if they are same
     * @param c the card to compare to to this card
     * @return true if same suit, false if otherwise
     */
    
    public boolean sameSuit(Cards c){
        return (this.suit == c.suit);
    }
    /**
     * Compares 2 cards to see if they are the same rank
     * @param c the card to compare to this card
     * @return true if same rank, false if otherwise
     */
    
    public boolean sameRank(Cards c){
        return (this.rank == c.rank);
    }
    
    /**
     * Compares 2 cards to see if they are the same
     * @param c the card to compare to this card
     * @return true if same card, false if otherwise
     */
    
    public boolean sameCard(Cards c){
        return(this.sameRank(c) && this.sameSuit(c));
    }
    
    /**
     * Returns the difference between 2 cards
     * @params c the card to compare to this card
     * @return an integer difference between this card and c
     */
    public int rankDiff(Cards c){
        return (this.rank - c.rank);
    }
    
    /**
     * Converts the cards to a string format for printing
     * @return the card's representation as a string
     */
    @Override
    public String toString(){
        String ranks ="23456789TJQKA";
        String suits = "\u2663\u2666\u2665\u2660"; //CDHS
        return ranks.charAt(rank)+""+suits.charAt(suit);
    }
}   

