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
		
		pegs peg1 = new pegs(Color.RED);
		pegs peg2 = new pegs(Color.GREEN);
		pegs peg3 = new pegs(Color.YELLOW);
		pegs peg4 = new pegs(Color.BLUE);
		board1.addPeg(peg1, 5, 0);
		board1.addPeg(peg2, 13, 6);
		game.play();
//		board1.bump(peg1,peg3);
//		System.out.println(peg1.getColor());
//		System.out.println(peg1.getX());
//		System.out.println(peg1.getY());
//		board1.bump(peg2,peg3);
//		System.out.println(peg2.getColor());
		System.out.println(peg2.getX());
		System.out.println(peg2.getY());
//		board1.slide(peg2);
//		System.out.println(peg2.getX());
//		System.out.println(peg2.getY());
		board1.moveRegular(peg2,8);
		game.play();
		System.out.println(peg2.getX());
		System.out.println(peg2.getY());
		
	}
}
