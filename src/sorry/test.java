package sorry;

import java.util.Scanner;

import javafx.geometry.Point2D;
import sorry.pegs.Color;

public class test {

	private static board board1;

	public test() {
		board1 = new board();
		
		
	}

	public void play() {
		board1.printBoard();
	}
	
	public static void main(String[] args) {
		test game = new test();
		deck d = new deck();

		pegs peg1 = new pegs(Color.BLUE);
		pegs peg2 = new pegs(Color.YELLOW);
		pegs peg3 = new pegs(Color.YELLOW);
		pegs peg4 = new pegs(Color.YELLOW);
		board1.addPeg(peg1, 15, 7);
		board1.addPeg(peg2, 15, 5);
		board1.addPeg(peg3, 15, 4);
		board1.addPeg(peg4, 15, 3);
		game.play();
		board1.movePeg(peg1,1);
		d.draw();
        board1.movePeg(peg1,d);
        //d.draw();
        //board1.movePeg(peg1,d);
//		System.out.println(peg1.getColor());
//		System.out.println(peg1.getX());
//		System.out.println(peg1.getY());
//		board1.bump(peg2,peg3);
//		System.out.println(peg2.getColor());
//		System.out.println(peg2.getX());
//		System.out.println(peg2.getY());
//		board1.slide(peg2);
//		System.out.println(peg2.getX());
//		System.out.println(peg2.getY());
//		board1.swap(peg2,peg1);
		
//		System.out.println(peg1.getX());
//		System.out.println(peg1.getY());
//		System.out.println(peg2.getX());
//		System.out.println(peg2.getY());
		game.play();
		
	}
}
