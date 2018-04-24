package sorry;

import sorry.pegs.Color;

public class board {
	boolean bumpcheck = true;
	int niceMove = 0;
	public static final int X_SIZE = 16;
	public static final int Y_SIZE = 16;
	private pegs[][] board = new pegs[X_SIZE][Y_SIZE];
	public int turn = 1;
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

	public void movePeg(pegs peg, deck d, boolean nice) {
		if(d.getDrawnCard().getVal() >= 0 && !isHome(peg)){
			if(peg.getY()+d.getDrawnCard().getVal() <= 15 && peg.getX()==0){
				int temp1 = peg.getX();
				int temp2 = peg.getY()+d.getDrawnCard().getVal();
				System.out.println("1:"+temp1+"+ "+temp2);
				if(nice == false){
				check(peg, temp1,temp2);}
				else{
				    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getY()+d.getDrawnCard().getVal() > 15 && peg.getX()==0) {
				int temp1 = d.getDrawnCard().getVal() - 15 +peg.getY();
				int temp2 = 15;
				System.out.println("2:"+temp1+"+ "+temp2);
				check(peg, temp1,temp2);
			}
			else if(peg.getY() - d.getDrawnCard().getVal() >= 0 && peg.getX() == 15) {
				int temp1 = peg.getX();
				int temp2 = peg.getY()-d.getDrawnCard().getVal();
				System.out.println("3:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getY() - d.getDrawnCard().getVal() < 0 && peg.getX() == 15) {
				int temp1 = 15 - d.getDrawnCard().getVal() + peg.getY();
				int temp2 = 0;
				System.out.println("4:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getX()+d.getDrawnCard().getVal() <= 15 && peg.getY()==15){
				int temp1 = peg.getX()+d.getDrawnCard().getVal();
				int temp2 = peg.getY();
				System.out.println("5:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getX()+d.getDrawnCard().getVal() > 15 && peg.getY()==15){
				int temp1 = 15;
				int temp2 = 30 - d.getDrawnCard().getVal() - peg.getX();
				System.out.println("6:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getX()-d.getDrawnCard().getVal() >= 0 && peg.getY()==0){
				int temp1 = peg.getX()-d.getDrawnCard().getVal();
				int temp2 = 0;
				System.out.println("7:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getX()-d.getDrawnCard().getVal() < 0 && peg.getY()==0){
				int temp1 = 0;
				int temp2 = d.getDrawnCard().getVal()-peg.getX();
				System.out.println("8:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else{
				System.out.println("error");
			}
		}else if(d.getDrawnCard().getVal() < 0 && !isHome(peg)){
			if(peg.getY()+d.getDrawnCard().getVal() >= 0 && peg.getX()==0){
				int temp1 = peg.getX();
				int temp2 = peg.getY()+d.getDrawnCard().getVal();
				System.out.println("8:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getY()+d.getDrawnCard().getVal() < 0 && peg.getX()==0) {
				int temp1 = -d.getDrawnCard().getVal() - peg.getY();
				int temp2 = 0;
				System.out.println("10:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getY() - d.getDrawnCard().getVal() <= 15 && peg.getX() == 15) {
				int temp1 = peg.getX();
				int temp2 = peg.getY()-d.getDrawnCard().getVal();
				System.out.println("11:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getY() - d.getDrawnCard().getVal() > 15 && peg.getX() == 15) {
				int temp1 = 30 + d.getDrawnCard().getVal() - peg.getY();
				int temp2 = 15;
				System.out.println("12:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getX()+d.getDrawnCard().getVal() < 0 && peg.getY()==15){
				int temp1 = 0;
				int temp2 = 15+d.getDrawnCard().getVal()+peg.getX();
				System.out.println("13:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getX()+d.getDrawnCard().getVal() >= 0 && peg.getY()==15){
				int temp1 = peg.getX()+d.getDrawnCard().getVal();
				int temp2 = peg.getY();
				System.out.println("14:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getX()-d.getDrawnCard().getVal() <= 15 && peg.getY()==0){
				int temp1 = peg.getX()-d.getDrawnCard().getVal();
				int temp2 = 0;
				System.out.println("15:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getX()-d.getDrawnCard().getVal() > 15 && peg.getY()==0){
				int temp1 = 15;
				int temp2 = -d.getDrawnCard().getVal()-15 + peg.getX();
				System.out.println("16:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else{
				System.out.println("error");
			}

		}else{
			System.out.println("Peg cant move");
		}
		if(turn == 5){
			setTurn(1);
		}
		else{
			turn++;
		}
	}




	public void movePeg(pegs peg, int a, boolean nice) {
		if(a >= 0 && !isHome(peg)){
			if(peg.getY()+a <= 15 && peg.getX()==0){
				int temp1 = peg.getX();
				int temp2 = peg.getY()+a;
				System.out.println("1:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getY()+a > 15 && peg.getX()==0) {
				int temp1 = a - 15 +peg.getY();
				int temp2 = 15;
				System.out.println("2:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getY() - a >= 0 && peg.getX() == 15) {
				int temp1 = peg.getX();
				int temp2 = peg.getY()-a;
				System.out.println("3:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getY() - a < 0 && peg.getX() == 15) {
				int temp1 = 16 - a + peg.getY();
				int temp2 = 0;
				System.out.println("4:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getX()+a <= 15 && peg.getY()==15){
				int temp1 = peg.getX()+a;
				int temp2 = peg.getY();
				System.out.println("5:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getX()+a > 15 && peg.getY()==15){
				int temp1 = 15;
				int temp2 = 30 - a - peg.getX();
				System.out.println("6:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getX()-a >= 0 && peg.getY()==0){
				int temp1 = peg.getX()-a;
				int temp2 = 0;
				System.out.println("7:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getX()-a < 0 && peg.getY()==0){
				int temp1 = 0;
				int temp2 = a-peg.getX();
				System.out.println("8:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else{
				System.out.println("error");
			}
		}else if(a < 0 && !isHome(peg)){
			if(peg.getY()+a >= 0 && peg.getX()==0){
				int temp1 = peg.getX();
				int temp2 = peg.getY()+a;
				System.out.println("8:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getY()+a < 0 && peg.getX()==0) {
				int temp1 = -a - peg.getY();
				int temp2 = 0;
				System.out.println("10:"+temp1+"+ "+temp2);
				if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getY() - a <= 15 && peg.getX() == 15) {
				int temp1 = peg.getX();
				int temp2 = peg.getY()-a;
				System.out.println("11:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getY() - a > 15 && peg.getX() == 15) {
				int temp1 = 30 + a - peg.getY();
				int temp2 = 15;
				System.out.println("12:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getX()+a < 0 && peg.getY()==15){
				int temp1 = 0;
				int temp2 = 15+a+peg.getX();
				System.out.println("13:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getX()+a >= 0 && peg.getY()==15){
				int temp1 = peg.getX()+a;
				int temp2 = peg.getY();
				System.out.println("14:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getX()-a <= 15 && peg.getY()==0){
				int temp1 = peg.getX()-a;
				int temp2 = 0;
				System.out.println("15:"+temp1+"+ "+temp2);
				if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
			}
			else if(peg.getX()-a > 15 && peg.getY()==0){
				int temp1 = 15;
				int temp2 = -a-15 + peg.getX();
				System.out.println("16:"+temp1+"+ "+temp2);
                if(nice == false){
                    check(peg, temp1,temp2);}
                else{
                    checkNice(peg, temp1,temp2);
                }
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
				if(isSlide(peg)){
					slide(peg);
				}
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
				if(isSlide(peg)){
					slide(peg);
				}
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
				if(isSlide(peg)){
					slide(peg);
				}
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
				if(isSlide(peg)){
					slide(peg);
				}
			}
		}
	}

	public void check(pegs peg, int temp1, int temp2){

		if(isEmpty(temp1,temp2)){
			if(!toPegSafeZone(peg,temp1,temp2)){

				board[peg.getX()][peg.getY()] = null;
				addPeg(peg,temp1,temp2);
				if(isSlide(peg)){
					slide(peg);
				}
			}
			else{
				moveSafe(peg,temp1,temp2);
			}
		}
		//else if(peg.getdifficulty()!="nice")
		else{
			bump(peg,board[temp1][temp2]);
			board[peg.getX()][peg.getY()] = null;
			addPeg(peg,temp1,temp2);
			if(isSlide(peg)){
				slide(peg);
			}
		}
	}
    public void checkNice(pegs peg, int temp1, int temp2){
        int i =0;


        if(isEmpty(temp1,temp2)){
            setBumpcheck(true);

            if(!toPegSafeZone(peg,temp1,temp2)){

                board[peg.getX()][peg.getY()] = null;
                addPeg(peg,temp1,temp2);
                if(isSlide(peg)){
                    slide(peg);
                }
            }
            else{
                moveSafe(peg,temp1,temp2);
            }
            niceMove++;
        }
        //else if(peg.getdifficulty()!="nice")
        else {
            setBumpcheck(false);
            System.out.println("yyyyyy"+getBumpCheck());

        }
    }

	public void addPeg(pegs peg, int x, int y) {
		peg.setX(x);
		peg.setY(y);
		board[peg.getX()][peg.getY()] = peg;
	}

	public void swap(pegs peg1, pegs peg2){
		if(!isSafe(peg1)&&!isHome(peg1)&&!isSafe(peg2)&!isHome(peg2)){
			if (peg1.getColor() != peg2.getColor()){
				int temp1 = peg1.getX();
				int temp2 = peg1.getY();
				int temp3 = peg2.getX();
				int temp4 = peg2.getY();
				board[peg1.getX()][peg1.getY()] = null;
				board[peg2.getX()][peg2.getY()] = null;
				addPeg(peg1,temp3,temp4);
				addPeg(peg2,temp1,temp2);
			}
			else{
				System.out.println("You can not swap your peg");
			}
		}
		else{
			System.out.println("these pegs can not being swapped");
		}
	}
//	public boolean bumpCheck(){
//
//	}
	public void bump(pegs peg1, pegs peg2)
	{
		if (peg1.getdifficulty()!="nice") {
			if (!isSafe(peg2) || !isHome(peg2)) {
				if (peg1.getColor() != peg2.getColor()) {
					if (peg2.getColor() == Color.RED) {
						board[peg2.getX()][peg2.getY()] = null;
						addPeg(peg2, 1, 4);
					} else if (peg2.getColor() == Color.GREEN) {
						board[peg2.getX()][peg2.getY()] = null;
						addPeg(peg2, 11, 1);
					} else if (peg2.getColor() == Color.BLUE) {
						board[peg2.getX()][peg2.getY()] = null;
						addPeg(peg2, 4, 14);
					} else if (peg2.getColor() == Color.YELLOW) {
						board[peg2.getX()][peg2.getY()] = null;
						addPeg(peg2, 14, 11);
					}
				} else {
					System.out.println("error to bump");
				}
			} else {
				System.out.println("this peg can not being bumped");
			}
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

	public void setHome(pegs peg){
		if (peg.getColor()== Color.RED){
			addPeg(peg,1,4);
		}
		else if (peg.getColor()== Color.GREEN){
			addPeg(peg,11,1);
		}
		else if (peg.getColor()== Color.BLUE){
			addPeg(peg,4,14);
		}
		else if (peg.getColor()== Color.YELLOW){
			addPeg(peg,14,11);
		}
	}

	public void slide(pegs peg){
		for (int i = 1; i< 5; i++){
			movePeg(peg,1,false);
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
		if(peg.getColor()==Color.RED && x==0 && y==2){
			return true;
		}
		else if(peg.getColor()==Color.BLUE && y==15 && x==2){
			return true;
		}
		else if(peg.getColor()==Color.YELLOW && x==15 && y==13){
			return true;
		}
		else if(peg.getColor()==Color.GREEN && y==0 && x==13){
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
	public boolean isSlide(pegs peg){
		if (peg.getColor() != Color.RED && peg.getX() == 0 && peg.getY() == 1){
			return true;
		}
		else if (peg.getColor() != Color.RED && peg.getX() == 0 && peg.getY() == 9){
			return true;
		}

		else if (peg.getColor() != Color.GREEN && peg.getX() == 14 && peg.getY() == 0){
			return true;

		}
		else if (peg.getColor() != Color.GREEN && peg.getX() == 6 && peg.getY() == 0){
			return true;

		}
		else if (peg.getColor() != Color.BLUE && peg.getX() == 1 && peg.getY() == 15){
			return true;

		}
		else if (peg.getColor() != Color.BLUE && peg.getX() == 9 && peg.getY() == 15){
			return true;

		}
		else if (peg.getColor() != Color.YELLOW && peg.getX() == 15 && peg.getY() == 14){
			return true;

		}
		else if (peg.getColor() != Color.YELLOW && peg.getX() == 15 && peg.getY() == 6){
			return true; 

		}
		else{
			return false;
		}

	}
	public int getTurn(){
		return turn;
	}
	public void setTurn(int t){
		turn = t;
	}
	boolean getBumpCheck(){
		return bumpcheck;
	}
	void setBumpcheck(boolean tf){
		bumpcheck = tf;
	}
	int getNiceMove(){
	    return niceMove;
    }
    void setNiceMove(int m){
	    niceMove = m;
    }

}
