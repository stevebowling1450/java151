package _011_Blackjack;

/**
 * Created by stevebowling on 10/5/16.
 */
public class Cards {
    public Suit suit;
    public Value value;


    public Cards(Suit s, Value v) {
        value = v;
        suit = s;
    }

    public Value getValue(){
        return value;
    }
    // Create a string that allows

    public String toString(){
        return suit.toString() +"-" +value.toString();
    }

    public Suit getSuit(){
        return suit;
    }

   // public Cards c1= new Cards(Enum.valueOf(Suit, Value) );



}