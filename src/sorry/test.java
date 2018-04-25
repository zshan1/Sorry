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

		computerplayer cp2 = new computerplayer();
		computerplayer cp3 = new computerplayer();
		computerplayer cp4 = new computerplayer();
		String test = "dumb";
		String smart = "smart";
		String hard = "hard";
		String mean = "mean";
		String nice = "nice";
		String easy = "easy";
		test game = new test();
		deck d = new deck();
		Players plyrs1 = new Players();
        plyrs1.p1Init(board1,"blue");
        plyrs1.p2Init(board1,easy,nice,"yellow");
        plyrs1.p3Init(board1, hard, nice, "green");
        plyrs1.p4Init(board1, easy, mean,"red");

//		pegs peg1 = new pegs(Color.BLUE);
//		pegs peg2 = new pegs(Color.YELLOW);
//		pegs peg3 = new pegs(Color.YELLOW);
//		pegs peg4 = new pegs(Color.YELLOW);
//		board1.addPeg(peg1, 15, 7);
//		board1.addPeg(peg2, 15, 5);
//		board1.addPeg(peg3, 15, 4);
//		board1.addPeg(peg4, 15, 3);
//		game.play();
		//board1.movePeg(peg1,1);
		//d.draw();
//        board1.movePeg(plyrs1.getPeg4(),d);
//        game.play();
//		d.draw();
//		board1.movePeg(plyrs1.getPeg4(),d);
//        game.play();
//		d.draw();
//		board1.movePeg(plyrs1.getPeg4(),d);
//
//
//		System.out.println(plyrs1.getPeg12().getdifficulty());
//		game.play();
//		d.draw();
//		board1.movePeg(plyrs1.getPeg12(),13);
		game.play();

        //yellow turn
		d.draw();
		board1.setTurn(2);
		plyrs1.easyNice(board1,d);
		plyrs1.hardNice(board1,d);
		plyrs1.hardMean(board1,d);
        plyrs1.easyMean(board1,d);
		game.play();

		//green turn
		d.draw();
		board1.setTurn(board1.getTurn() + 1);
        plyrs1.easyNice(board1,d);
        plyrs1.hardNice(board1,d);
        plyrs1.hardMean(board1,d);
        plyrs1.easyMean(board1,d);

		game.play();

		//red turn
		d.draw();
		board1.setTurn(board1.getTurn() + 1);
        plyrs1.easyNice(board1,d);
        plyrs1.hardNice(board1,d);
        plyrs1.hardMean(board1,d);
        plyrs1.easyMean(board1,d);
		game.play();
//		d.draw();
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
		//game.play();
		
	}
}
