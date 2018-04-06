package sorry;

import sorry.pegs.Color;

public class board {
	public static final int X_SIZE = 16;
	public static final int Y_SIZE = 16;
	private pegs[][] board = new pegs[X_SIZE][Y_SIZE];
	
	public void printBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == null) {
					System.out.print("- ");
				} else {
					System.out.print(board[i][j].charRepresentation() + " ");
				}
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public void movePiece(pegs peg, int x, int y) {
		board[peg.getX()][peg.getY()] = null;
		peg.setX(y);
		peg.setY(y);
		addPeg(peg,x,y);
	}
	
	public void addPeg(pegs peg, int x, int y) {
		peg.setX(x);
		peg.setY(y);
		board[peg.getX()][peg.getY()] = peg;
	}
	
	public void bump(pegs peg)
	{
		if (peg.getColor()== Color.RED){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,2,6);
		}
		else if (peg.getColor()== Color.GREEN){
			board[peg.getX()][peg.getY()] = null;
			peg.setX(6);
			peg.setY(13);
			addPeg(peg,6,13);
		}
		else if (peg.getColor()== Color.BLUE){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,9,2);
		}
		else if (peg.getColor()== Color.YELLOW){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,13,9);
		}
	}
	public void start(pegs peg){
		if (peg.getColor()== Color.RED){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,4,1);
		}
		else if (peg.getColor()== Color.GREEN){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,11,1);
		}
		else if (peg.getColor()== Color.BLUE){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,14,4);
		}
		else if (peg.getColor()== Color.YELLOW){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,11,14);
		}
	}
}
