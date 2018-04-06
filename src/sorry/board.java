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
		addPeg(peg,x,y);
	}
	
	public void addPeg(pegs peg, int x, int y) {
		peg.setX(x);
		peg.setY(y);
		board[peg.getX()][peg.getY()] = peg;
	}
	
	public void bump(pegs peg1, pegs peg2)
	{
		if (peg1.getColor() != peg2.getColor()){
		if (peg2.getColor()== Color.RED){
			board[peg2.getX()][peg2.getY()] = null;
			addPeg(peg2,2,6);
		}
		else if (peg2.getColor()== Color.GREEN){
			board[peg2.getX()][peg2.getY()] = null;
			addPeg(peg2,6,13);
		}
		else if (peg2.getColor()== Color.BLUE){
			board[peg2.getX()][peg2.getY()] = null;
			addPeg(peg2,9,2);
		}
		else if (peg2.getColor()== Color.YELLOW){
			board[peg2.getX()][peg2.getY()] = null;
			addPeg(peg2,13,9);
		}
		}
	}
	public void start(pegs peg){
		if (peg.getColor()== Color.RED){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,4,0);
		}
		else if (peg.getColor()== Color.GREEN){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,11,0);
		}
		else if (peg.getColor()== Color.BLUE){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,15,4);
		}
		else if (peg.getColor()== Color.YELLOW){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,11,15);
		}
	}
	 public void slide(pegs peg){
		 if(peg.getColor() != Color.RED && peg.getX() == 1 && peg.getY() == 0){
			
				 board[peg.getX()][peg.getY()] = null;
				 addPeg(peg,4,0);
		 }
	     else if(peg.getColor() != Color.RED && peg.getX() == 9 && peg.getY() == 0){
				 board[peg.getX()][peg.getY()] = null;
				 addPeg(peg,13,0);
		}

		 else if(peg.getColor() != Color.GREEN && peg.getX() == 0 && peg.getY() == 14){
				 board[peg.getX()][peg.getY()] = null;
				 addPeg(peg,0,11);
		}
		else if(peg.getColor() != Color.GREEN && peg.getX() == 0 && peg.getY() == 6){
				 board[peg.getX()][peg.getY()] = null;
				 addPeg(peg,0,2);
		}		
		else if (peg.getColor() != Color.BLUE && peg.getX() == 15 && peg.getY() == 1){
				 board[peg.getX()][peg.getY()] = null;
				 addPeg(peg,15,4);
		}
		else if(peg.getColor() != Color.BLUE &&peg.getX() == 15 && peg.getY() == 9){
				 board[peg.getX()][peg.getY()] = null;
				 addPeg(peg,15,9);
		}
		else if (peg.getColor() != Color.YELLOW && peg.getX() == 14 && peg.getY() == 15){
				 board[peg.getX()][peg.getY()] = null;
				 addPeg(peg,11,15);
	    }
		else if(peg.getColor() != Color.YELLOW && peg.getX() == 6 && peg.getY() == 15){
				 board[peg.getX()][peg.getY()] = null;
				 addPeg(peg,2,15); 
		}
		else{
			 System.out.println("Slide is not available");
		}
		 
	 }
}
