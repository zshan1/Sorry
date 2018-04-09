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
					System.out.print("-  ");
				} else {
					System.out.print(charRepresentation(board[i][j]) + "  ");
				}
			}
			System.out.println("");
		}
		System.out.println("");
	}
	public char charRepresentation(pegs peg) {
		if(peg.getColor() == Color.RED){
			return 'R';
		}else if(peg.getColor() == Color.BLUE){
			return 'B';
		}else if(peg.getColor() == Color.GREEN){
			return 'G';
		}
		else{
			return 'Y';
		}
	}


	public void moveRegular(pegs peg, int a) {
		if(a>=0 && !isHome(peg)){
			if(peg.getY()+a <= 15 && peg.getX()==0){
				int temp1 = peg.getX();
				int temp2 = peg.getY()+a;
				check(peg, temp1,temp2);
			}
			else if(peg.getY()+a > 15 && peg.getX()==0) {
				int temp1 = a - 15 +peg.getY();
				int temp2 = 15;
				check(peg, temp1,temp2);
			}
			else if(peg.getY() - a >= 0 && peg.getX() == 15) {
				int temp1 = peg.getX();
				int temp2 = peg.getY()-a;
				check(peg, temp1,temp2);
			}
			else if(peg.getY() - a < 0 && peg.getX() == 15) {
				int temp1 = 16 - a + peg.getY();
				int temp2 = 0;
				check(peg, temp1,temp2);
			}
			else if(peg.getX()+a <= 15 && peg.getY()==15){
				int temp1 = peg.getX()+a;
				int temp2 = peg.getY();
				check(peg, temp1,temp2);
			}
			else if(peg.getX()+a > 15 && peg.getY()==15){
				int temp1 = 15;
				int temp2 = 30 - a - peg.getX();
				check(peg, temp1,temp2);
			}
			else if(peg.getX()-a >= 0 && peg.getY()==0){
				int temp1 = peg.getX()-a;
				int temp2 = 0;
				check(peg, temp1,temp2);
			}
			else if(peg.getX()-a < 0 && peg.getY()==0){
				int temp1 = 0;
				int temp2 = a-peg.getX();
				check(peg, temp1,temp2);
			}
			else{
				System.out.println("error");
			}
		}else if(a>=0 && !isHome(peg)){
			if(peg.getY()+a >= 0 && peg.getX()==0){
				int temp1 = peg.getX();
				int temp2 = peg.getY()+a;
				check(peg, temp1,temp2);
			}
			else if(peg.getY()+a < 0 && peg.getX()==0) {
				int temp1 = -a - peg.getY();
				int temp2 = 0;
				check(peg, temp1,temp2);
			}
			else if(peg.getY() - a <= 15 && peg.getX() == 15) {
				int temp1 = peg.getX();
				int temp2 = peg.getY()-a;
				check(peg, temp1,temp2);
			}
			else if(peg.getY() - a > 15 && peg.getX() == 15) {
				int temp1 = 30 + a - peg.getY();
				int temp2 = 15;
				check(peg, temp1,temp2);
			}
			else if(peg.getX()+a < 0 && peg.getY()==15){
				int temp1 = 0;
				int temp2 = 15+a+peg.getX();
				check(peg, temp1,temp2);
			}
			else if(peg.getX()+a >= 0 && peg.getY()==15){
				int temp1 = peg.getX()+a;
				int temp2 = peg.getY();
				check(peg, temp1,temp2);
			}
			else if(peg.getX()-a <= 15 && peg.getY()==0){
				int temp1 = peg.getX()-a;
				int temp2 = 0;
				check(peg, temp1,temp2);
			}
			else if(peg.getX()-a > 15 && peg.getY()==0){
				int temp1 = 15;
				int temp2 = -a-15 + peg.getX();
				System.out.println(temp2);
				check(peg, temp1,temp2);
			}
			else{
				System.out.println("error");
			}

		}else{
			System.out.println("Peg cant move");
		}
	}
	public void moveSafe(pegs peg, int temp1, int temp2){
		if(peg.getColor()==Color.RED){
			int temp3 = temp1+temp2-2;
			int temp4 = 2 ; 
			if(temp3>6){
				System.out.println("can't move!");
			}else{
				board[peg.getX()][peg.getY()] = null;
				addPeg(peg,temp3,temp4);
			}
		}
		else if(peg.getColor()==Color.BLUE){
			int temp3 = 2;
			int temp4 = temp2-temp1+2 ; 
			if(temp4<9){
				System.out.println("can't move!");
			}else{
				board[peg.getX()][peg.getY()] = null;
				addPeg(peg,temp3,temp4);
			}
		}
		else if(peg.getColor()==Color.YELLOW){
			int temp3 = temp1-temp2+13;
			int temp4 = 13 ; 
			if(temp3>9){
				System.out.println("can't move!");
			}else{
				board[peg.getX()][peg.getY()] = null;
				addPeg(peg,temp3,temp4);
			}
		}
		else if(peg.getColor()==Color.GREEN){
			int temp3 = 13;
			int temp4 = 13-temp1+temp2; 
			if(temp4>6){
				System.out.println("can't move!");
			}else{
				board[peg.getX()][peg.getY()] = null;
				addPeg(peg,temp3,temp4);
			}
		}
	}

	public void check(pegs peg, int temp1, int temp2){
		if(isEmpty(temp1,temp2)){
			if(!toPegSafeZone(peg,temp1,temp2)){			
				board[peg.getX()][peg.getY()] = null;
				addPeg(peg,temp1,temp2);
			}
			else{
				moveSafe(peg,temp1,temp2);
			}
		}
		else{
			bump(peg,board[temp1][temp2]);
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,temp1,temp2);
		}
	}

	public void addPeg(pegs peg, int x, int y) {
		peg.setX(x);
		peg.setY(y);
		board[peg.getX()][peg.getY()] = peg;
	}

	public void bump(pegs peg1, pegs peg2)
	{
		if(isSafe(peg2)||isHome(peg2)){
			if (peg1.getColor() != peg2.getColor()){
				if (peg2.getColor()== Color.RED){
					board[peg2.getX()][peg2.getY()] = null;
					addPeg(peg2,1,4);
				}
				else if (peg2.getColor()== Color.GREEN){
					board[peg2.getX()][peg2.getY()] = null;
					addPeg(peg2,11,1);
				}
				else if (peg2.getColor()== Color.BLUE){
					board[peg2.getX()][peg2.getY()] = null;
					addPeg(peg2,4,14);
				}
				else if (peg2.getColor()== Color.YELLOW){
					board[peg2.getX()][peg2.getY()] = null;
					addPeg(peg2,14,11);
				}
			}else{
				System.out.println("error to bump");
			}
		}else{
			System.out.println("this peg can not being bumped");
		}
	}
	public void start(pegs peg){
		if (peg.getColor()== Color.RED){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,0,4);
		}
		else if (peg.getColor()== Color.GREEN){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,11,0);
		}
		else if (peg.getColor()== Color.BLUE){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,4,15);
		}
		else if (peg.getColor()== Color.YELLOW){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,15,11);
		}
	}
	public void slide(pegs peg){
		if (peg.getColor() != Color.RED && peg.getX() == 1 && peg.getY() == 0){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,4,0);
		}
		else if (peg.getColor() != Color.RED && peg.getX() == 9 && peg.getY() == 0){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,13,0);
		}

		else if (peg.getColor() != Color.GREEN && peg.getX() == 0 && peg.getY() == 14){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,0,11);
		}
		else if (peg.getColor() != Color.GREEN && peg.getX() == 0 && peg.getY() == 6){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,0,2);
		}		
		else if (peg.getColor() != Color.BLUE && peg.getX() == 15 && peg.getY() == 1){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,15,4);
		}
		else if (peg.getColor() != Color.BLUE && peg.getX() == 15 && peg.getY() == 9){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,15,9);
		}
		else if (peg.getColor() != Color.YELLOW && peg.getX() == 14 && peg.getY() == 15){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,11,15);
		}
		else if (peg.getColor() != Color.YELLOW && peg.getX() == 6 && peg.getY() == 15){
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,2,15); 
		}
		else{
			System.out.println("Slide is not available");
		}

	}
	public boolean isEmpty(int x, int y) {
		if((board[x][y] != null))
		{
			return false;
		}
		else{
			return true;
		}
	}

	public boolean toPegSafeZone(pegs peg, int x, int y){
		if(peg.getColor()==Color.RED && x==0 && y>2){
			return true;
		}
		else if(peg.getColor()==Color.BLUE && y==15 && x>2){
			return true;
		}
		else if(peg.getColor()==Color.YELLOW && x==15 && y<13){
			return true;
		}
		else if(peg.getColor()==Color.GREEN && y==0 && x<13){
			return true;
		}
		else{
			return false;
		} 
	}

	public boolean isHome(pegs peg){
		if(peg.getColor()==Color.RED && peg.getX()==6&&peg.getY()==2){
			return true;
		}
		if(peg.getColor()==Color.BLUE && peg.getX()==2&&peg.getY()==9){
			return true;
		}
		if(peg.getColor()==Color.YELLOW && peg.getX()==9&&peg.getY()==13){
			return true;
		}
		if(peg.getColor()==Color.GREEN && peg.getX()==13&&peg.getY()==6){
			return true;
		}else{
			return false;
		}
	}
	public boolean isSafe(pegs peg){
		if (peg.getColor()==Color.RED && peg.getY()==2 && peg.getX()<=5 && peg.getX()>=1){
			return true;
		}
		else if (peg.getColor()==Color.BLUE && peg.getX()==2 && peg.getY()<=14 && peg.getY()>=10){
			return true;
		}
		else if (peg.getColor()==Color.YELLOW && peg.getY()==13 && peg.getX()<=14 && peg.getX()>=10){
			return true;
		}
		else if (peg.getColor()==Color.GREEN && peg.getX()==14 && peg.getY()<=5 && peg.getY()>=1){
			return true;
		}else{
			return false;
		}
	}
}
