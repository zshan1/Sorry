package sorry;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;
public class deck {
    static card thedeck[] = new card[45];
    static card discarddeck[] = new card[45];
    int cardCount = 0;
    card drawnCard;
    public deck() {

        // Boolean banana = true;
        // for (int i =0; i < 5; i ++){
        // thedeck[i].setName("1");
        // thedeck[i].setVal(1);
        // thedeck[i].setStartable(true);
        // }
        // for (int j = 5; j < 9; j++){
        // thedeck[j].setName("2");
        // thedeck[j].setVal(2);
        // thedeck[j].setStartable(true);
        // }
        // for (int k = 9; k < 13; k++){
        // thedeck[k].setName("3");
        // thedeck[k].setVal(3);
        // thedeck[k].setStartable(false);
        // }
        // for (int l = 13; l < 17; l++){
        // thedeck[l].setName("4");
        // thedeck[l].setVal(4);
        // thedeck[l].setStartable(false);
        // }

        // System.out.println(thedeck[2].getName());
        for (int r = 0; r < 45; r++) {
            if (r < 5) {
                // System.out.println()
                thedeck[r] = new card();
                thedeck[r].setName("1");
                thedeck[r].setVal(1);
                thedeck[r].setAlt(thedeck[r].getVal());
                thedeck[r].setStartable(true);
                thedeck[r].setSplitable(false);
            } else if (r >= 5 && r < 9) {
                thedeck[r] = new card();
                thedeck[r].setName("2");
                thedeck[r].setVal(2);
                thedeck[r].setAlt(thedeck[r].getVal());
                thedeck[r].setStartable(true);
                thedeck[r].setSplitable(false);
            } else if (r >= 9 && r < 13) {
                thedeck[r] = new card();
                thedeck[r].setName("3");
                thedeck[r].setVal(3);
                thedeck[r].setAlt(thedeck[r].getVal());
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(false);
            } else if (r >= 13 && r < 17) {
                thedeck[r] = new card();
                thedeck[r].setName("4");
                thedeck[r].setVal(-4);
                thedeck[r].setAlt(thedeck[r].getVal());
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(false);
            } else if (r >= 17 && r < 21) {
                thedeck[r] = new card();
                thedeck[r].setName("5");
                thedeck[r].setVal(5);
                thedeck[r].setAlt(thedeck[r].getVal());
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(false);
            } else if (r >= 21 && r < 25) {
                thedeck[r] = new card();
                thedeck[r].setName("7");
                thedeck[r].setVal(7);
                thedeck[r].setAlt(thedeck[r].getVal());
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(true);
            } else if (r >= 25 && r < 29) {
                thedeck[r] = new card();
                thedeck[r].setName("8");
                thedeck[r].setVal(8);
                thedeck[r].setAlt(thedeck[r].getVal());
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(false);
            } else if (r >= 29 && r < 33) {
                thedeck[r] = new card();
                thedeck[r].setName("10");
                thedeck[r].setVal(10);
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(false);
            } else if (r >= 33 && r < 37) {
                thedeck[r] = new card();
                thedeck[r].setName("11");
                thedeck[r].setVal(11);
                thedeck[r].setAlt(thedeck[r].getVal());
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(false);
            } else if (r >= 37 && r < 41) {
                thedeck[r] = new card();
                thedeck[r].setName("12");
                thedeck[r].setVal(12);
                thedeck[r].setAlt(-1);
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(false);
            } else if (r >= 41 ) {
                thedeck[r] = new card();
                thedeck[r].setName("Sorry");
                thedeck[r].setVal(100);
                thedeck[r].setStartable(false);
                thedeck[r].setSplitable(false);
            }
        }
        //System.out.println(thedeck.length);
    }

    int deckLength(){
        return thedeck.length;
    }
    public void cardsLeft(){
        System.out.print("Number of cards in the deck is: ");
        System.out.println(thedeck.length);
    }
    public void printArray(card[] deck) {
        for (int i = 0; i < deck.length; i++) {
            System.out.print(deck[i].getName());
            System.out.print(", ");

        }
        System.out.println("");
        cardsLeft();

    }

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

    void draw(){

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

    }
    public card getDrawnCard(){
        return drawnCard;
    }
    public void draw45(){
        for(int i =0; i < 45; i++){
            draw();
        }
    }
    public void reset(){
        thedeck = discarddeck;
    }
    //	void arrayCount(){
//		int counter = 0;
//		for(int i = 0; i < thedeck.length; i++){
//			i++;
//			counter = counter + 1;
//		}
//		System.out.print("Number of cards in the deck is: ");
//		System.out.println(counter);
//	}
    public static void main(String[] args) {
        deck d = new deck();
        //deck c = new deck();
        d.printArray(thedeck);
//		d.shuffleArray();
//		System.out.println();
//		//d.arrayCount();
//		//System.out.println(thedeck.size());
//		System.out.println("The shuffled deck: ");
//		d.printArray();
        System.out.println();
        //d.draw();
        System.out.println();
        //d.draw();
        d.draw45();

        if(thedeck.length <= 0){
            d.reset();
        }
        //System.out.println("The shuffled deck with a card drawn: ");
        //d.printArray(result);

        //d.arrayCount();



    }
}


