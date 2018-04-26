package sorry;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

//class for creating a deck object of cards objects and supplying useful methods for game play
public class deck {

    //creates the parameters for the card array that is the deck (comprised of 45 card instances)
    static card thedeck[] = new card[45];

    //A second deck that is created to hold cards that have been drawn so once the original deck is empty, it will become this deck
    static card discarddeck[] = new card[45];

    //counter for discard deck
    int cardCount = 0;

    //field for the card that has been drawn
    card drawnCard;


    //constructor for the deck object
    public deck() {
        //sets the values of the cards equivalent to those in the real game using a for loop
        for (int r = 0; r < 45; r++) {
            //initializes 1 card
            if (r < 5) {
                // System.out.println()
                thedeck[r] = new card();
                thedeck[r].setName("1");
                thedeck[r].setVal(1);
                thedeck[r].setAlt(thedeck[r].getVal());
                thedeck[r].setStartable(true);
                thedeck[r].setSplitable(false);
            }
            //initializes 2 card
            else if (r >= 5 && r < 9) {
                thedeck[r] = new card();
                thedeck[r].setName("2");
                thedeck[r].setVal(2);
                thedeck[r].setAlt(thedeck[r].getVal());
                thedeck[r].setStartable(true);
                thedeck[r].setSplitable(false);
            }
            //initializes 3 card
            else if (r >= 9 && r < 13) {
                thedeck[r] = new card();
                thedeck[r].setName("3");
                thedeck[r].setVal(3);
                thedeck[r].setAlt(thedeck[r].getVal());
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(false);
            }
            //initializes 4 card
            else if (r >= 13 && r < 17) {
                thedeck[r] = new card();
                thedeck[r].setName("4");
                thedeck[r].setVal(-4);
                thedeck[r].setAlt(thedeck[r].getVal());
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(false);
            }
            //initializes 5 card
            else if (r >= 17 && r < 21) {
                thedeck[r] = new card();
                thedeck[r].setName("5");
                thedeck[r].setVal(5);
                thedeck[r].setAlt(thedeck[r].getVal());
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(false);
            }
            //initializes 7 card
            else if (r >= 21 && r < 25) {
                thedeck[r] = new card();
                thedeck[r].setName("7");
                thedeck[r].setVal(7);
                thedeck[r].setAlt(thedeck[r].getVal());
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(true);
            }
            //initializes 8 card
            else if (r >= 25 && r < 29) {
                thedeck[r] = new card();
                thedeck[r].setName("8");
                thedeck[r].setVal(8);
                thedeck[r].setAlt(thedeck[r].getVal());
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(false);
            }
            //initializes 10 card
            else if (r >= 29 && r < 33) {
                thedeck[r] = new card();
                thedeck[r].setName("10");
                thedeck[r].setVal(10);
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(false);
            }
            //initializes 11 card
            else if (r >= 33 && r < 37) {
                thedeck[r] = new card();
                thedeck[r].setName("11");
                thedeck[r].setVal(11);
                thedeck[r].setAlt(thedeck[r].getVal());
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(false);
            }
            //initializes 12 card
            else if (r >= 37 && r < 41) {
                thedeck[r] = new card();
                thedeck[r].setName("12");
                thedeck[r].setVal(12);
                thedeck[r].setAlt(-1);
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(false);
            }
            //initializes Sorry card
            else if (r >= 41 ) {
                thedeck[r] = new card();
                thedeck[r].setName("Sorry");
                thedeck[r].setVal(0);
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(false);
            }
        }

    }

    //returns the length of the deck
    int deckLength(){
        return thedeck.length;
    }

    //gets the number of cards left
    public void cardsLeft(){
        System.out.print("Number of cards in the deck is: ");
        System.out.println(thedeck.length);
    }

    //prints out the deck for testing purposes
    public void printArray(card[] deck) {
        for (int i = 0; i < deck.length; i++) {
            System.out.print(deck[i].getName());
            System.out.print(", ");

        }
        System.out.println("");
        cardsLeft();

    }

    //shuffles the deck of cards
    void shuffleArray() {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = thedeck.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            card a = thedeck[index];
            thedeck[index] = thedeck[i];
            thedeck[i] = a;
        }
    }

    //draws a card to be used for peg movement
    String draw(){

        Random generator = new Random();
        int randomIndex = generator.nextInt(thedeck.length);
        card[] result = new card[thedeck.length - 1];
        discarddeck[cardCount]= (thedeck[randomIndex]);
        cardCount ++;
        System.arraycopy(thedeck, 0, result, 0, randomIndex);
        if (thedeck.length != randomIndex) {
            System.arraycopy(thedeck, randomIndex + 1, result, randomIndex, thedeck.length - randomIndex - 1);
        }
        drawnCard = thedeck[randomIndex];
        //System.arraycopy(thedeck, randomIndex + 1, thedeck, randomIndex, thedeck.length - 1 - randomIndex);
        thedeck = result;
        System.out.print("You drew a ");
        System.out.print(drawnCard.getName());
        System.out.println(" Card");
        printArray(result);

        return drawnCard.getName();
    }

    //returns the drawn card
    public card getDrawnCard(){
        return drawnCard;
    }

    //draws the whole deck for testing purposes
    public void draw45(){
        for(int i =0; i < 45; i++){
            draw();
        }
    }

    //resets the card deck after all cards have been drawn
    public void reset(){
        thedeck = discarddeck;
    }


    //main for deck testing purposes
    public static void main(String[] args) {
        deck d = new deck();
        d.printArray(thedeck);
		d.shuffleArray();
		System.out.println();

		System.out.println("The shuffled deck: ");
        System.out.println();
        System.out.println();
        d.draw45();

        if(thedeck.length <= 0){
            d.reset();
        }
        System.out.println("The shuffled deck with a card drawn: ");




    }
}


