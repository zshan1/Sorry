package sorry;

//go in here and look into giving them a quality or behavior
//choice is rendered for players individually
//set how many players - just dont init player if they arent playing
//get number of players from board class

//adjust start position based on color
//be able to set color seperate from making a peg

import java.util.Random;

public class Players {

	Players() {

	}

	// get mode
	String mode = "";
	// get difficulties
	String difficulty1 = "";
	String difficulty2 = "";
	String difficulty3 = "";
	// get behaviors
	String bevavior1 = "";
	String behavior2 = "";
	String behavior3 = "";
	// get color
	String color = "";
	pegs computerPeg;

	// Initialize the pegs in default colors
	// Blue pegs (P1)
	pegs peg1 = new pegs(pegs.Color.BLUE);
	pegs peg2 = new pegs(pegs.Color.BLUE);
	pegs peg3 = new pegs(pegs.Color.BLUE);
	pegs peg4 = new pegs(pegs.Color.BLUE);

	// Yellow Pegs (P2)
	pegs peg5 = new pegs(pegs.Color.YELLOW);
	pegs peg6 = new pegs(pegs.Color.YELLOW);
	pegs peg7 = new pegs(pegs.Color.YELLOW);
	pegs peg8 = new pegs(pegs.Color.YELLOW);

	// Green Pegs (P3)
	pegs peg9 = new pegs(pegs.Color.GREEN);
	pegs peg10 = new pegs(pegs.Color.GREEN);
	pegs peg11 = new pegs(pegs.Color.GREEN);
	pegs peg12 = new pegs(pegs.Color.GREEN);

	// Red Pegs (P4)
	pegs peg13 = new pegs(pegs.Color.RED);
	pegs peg14 = new pegs(pegs.Color.RED);
	pegs peg15 = new pegs(pegs.Color.RED);
	pegs peg16 = new pegs(pegs.Color.RED);

	public final void colorChoice(String c) {
		if (c == "blue") {
			// Blue pegs (P1)
			pegs peg1 = new pegs(pegs.Color.BLUE);
			pegs peg2 = new pegs(pegs.Color.BLUE);
			pegs peg3 = new pegs(pegs.Color.BLUE);
			pegs peg4 = new pegs(pegs.Color.BLUE);

			// Yellow Pegs (P2)
			pegs peg5 = new pegs(pegs.Color.YELLOW);
			pegs peg6 = new pegs(pegs.Color.YELLOW);
			pegs peg7 = new pegs(pegs.Color.YELLOW);
			pegs peg8 = new pegs(pegs.Color.YELLOW);

			// Green Pegs (P3)
			pegs peg9 = new pegs(pegs.Color.GREEN);
			pegs peg10 = new pegs(pegs.Color.GREEN);
			pegs peg11 = new pegs(pegs.Color.GREEN);
			pegs peg12 = new pegs(pegs.Color.GREEN);

			// Red Pegs (P4)
			pegs peg13 = new pegs(pegs.Color.RED);
			pegs peg14 = new pegs(pegs.Color.RED);
			pegs peg15 = new pegs(pegs.Color.RED);
			pegs peg16 = new pegs(pegs.Color.RED);
		} else if (c == "red") {
			// Blue pegs (P1)
			pegs peg1 = new pegs(pegs.Color.RED);
			pegs peg2 = new pegs(pegs.Color.RED);
			pegs peg3 = new pegs(pegs.Color.RED);
			pegs peg4 = new pegs(pegs.Color.RED);

			// Yellow Pegs (P2)
			pegs peg5 = new pegs(pegs.Color.YELLOW);
			pegs peg6 = new pegs(pegs.Color.YELLOW);
			pegs peg7 = new pegs(pegs.Color.YELLOW);
			pegs peg8 = new pegs(pegs.Color.YELLOW);

			// Green Pegs (P3)
			pegs peg9 = new pegs(pegs.Color.GREEN);
			pegs peg10 = new pegs(pegs.Color.GREEN);
			pegs peg11 = new pegs(pegs.Color.GREEN);
			pegs peg12 = new pegs(pegs.Color.GREEN);

			// Red Pegs (P4)
			pegs peg13 = new pegs(pegs.Color.BLUE);
			pegs peg14 = new pegs(pegs.Color.BLUE);
			pegs peg15 = new pegs(pegs.Color.BLUE);
			pegs peg16 = new pegs(pegs.Color.BLUE);

		} else if (c == "green") {
			// Blue pegs (P1)
			pegs peg1 = new pegs(pegs.Color.GREEN);
			pegs peg2 = new pegs(pegs.Color.GREEN);
			pegs peg3 = new pegs(pegs.Color.GREEN);
			pegs peg4 = new pegs(pegs.Color.GREEN);

			// Yellow Pegs (P2)
			pegs peg5 = new pegs(pegs.Color.YELLOW);
			pegs peg6 = new pegs(pegs.Color.YELLOW);
			pegs peg7 = new pegs(pegs.Color.YELLOW);
			pegs peg8 = new pegs(pegs.Color.YELLOW);

			// Green Pegs (P3)
			pegs peg9 = new pegs(pegs.Color.RED);
			pegs peg10 = new pegs(pegs.Color.RED);
			pegs peg11 = new pegs(pegs.Color.RED);
			pegs peg12 = new pegs(pegs.Color.RED);

			// Red Pegs (P4)
			pegs peg13 = new pegs(pegs.Color.BLUE);
			pegs peg14 = new pegs(pegs.Color.BLUE);
			pegs peg15 = new pegs(pegs.Color.BLUE);
			pegs peg16 = new pegs(pegs.Color.BLUE);

		} else if (c == "yellow") {
			// Blue pegs (P1)
			pegs peg1 = new pegs(pegs.Color.YELLOW);
			pegs peg2 = new pegs(pegs.Color.YELLOW);
			pegs peg3 = new pegs(pegs.Color.YELLOW);
			pegs peg4 = new pegs(pegs.Color.YELLOW);

			// Yellow Pegs (P2)
			pegs peg5 = new pegs(pegs.Color.GREEN);
			pegs peg6 = new pegs(pegs.Color.GREEN);
			pegs peg7 = new pegs(pegs.Color.GREEN);
			pegs peg8 = new pegs(pegs.Color.GREEN);

			// Green Pegs (P3)
			pegs peg9 = new pegs(pegs.Color.RED);
			pegs peg10 = new pegs(pegs.Color.RED);
			pegs peg11 = new pegs(pegs.Color.RED);
			pegs peg12 = new pegs(pegs.Color.RED);

			// Red Pegs (P4)
			pegs peg13 = new pegs(pegs.Color.BLUE);
			pegs peg14 = new pegs(pegs.Color.BLUE);
			pegs peg15 = new pegs(pegs.Color.BLUE);
			pegs peg16 = new pegs(pegs.Color.BLUE);
		}
	}

	public void p1Init(board board1, String c) {

		if (c == "blue") {
            board1.addPeg(peg1, 3, 13);
            board1.addPeg(peg2, 4, 13);
            board1.addPeg(peg3, 3, 12);
            board1.addPeg(peg4, 4, 12);
		} else if (c == "yellow") {
            board1.addPeg(peg1, 13, 11);
            board1.addPeg(peg2, 14, 11);
            board1.addPeg(peg3, 13, 10);
            board1.addPeg(peg4, 14, 10);
		} else if (c == "green") {
            board1.addPeg(peg1, 12, 2);
            board1.addPeg(peg2, 11, 2);
            board1.addPeg(peg3, 11, 3);
            board1.addPeg(peg4, 12, 3);
		} else {
            board1.addPeg(peg1, 2, 4);
            board1.addPeg(peg2, 1, 4);
            board1.addPeg(peg3, 2, 5);
            board1.addPeg(peg4, 1, 5);
		}

	}

	public void p2Init(board board1, String d, String b, String c) {
		
		if (c == "blue") {
            board1.addPeg(peg5, 13, 11);
            board1.addPeg(peg6, 14, 11);
            board1.addPeg(peg7, 13, 10);
            board1.addPeg(peg8, 14, 10);
		} else if (c == "yellow") {
            board1.addPeg(peg5, 12, 2);
            board1.addPeg(peg6, 11, 2);
            board1.addPeg(peg7, 11, 3);
            board1.addPeg(peg8, 12, 3);
		} else if (c == "green") {
            board1.addPeg(peg5, 13, 11);
            board1.addPeg(peg6, 14, 11);
            board1.addPeg(peg7, 13, 10);
            board1.addPeg(peg8, 14, 10);
		} else {
            board1.addPeg(peg5, 13, 11);
            board1.addPeg(peg6, 14, 11);
            board1.addPeg(peg7, 13, 10);
            board1.addPeg(peg8, 14, 10);
		}

		peg5.setdifficulty(d);
		peg6.setdifficulty(d);
		peg7.setdifficulty(d);
		peg8.setdifficulty(d);

		peg5.setbehavior(b);
		peg6.setbehavior(b);
		peg7.setbehavior(b);
		peg8.setbehavior(b);
	}

	public void p3Init(board board1, String d, String b, String c) {
		
		if (c == "blue") {
            board1.addPeg(peg9, 12, 2);
            board1.addPeg(peg10, 11, 2);
            board1.addPeg(peg11, 11, 3);
            board1.addPeg(peg12, 12, 3);
		} else if (c == "yellow") {
            board1.addPeg(peg9, 2, 4);
            board1.addPeg(peg10, 1, 4);
            board1.addPeg(peg11, 1, 5);
            board1.addPeg(peg12, 2, 5);
		} else if (c == "green") {
            board1.addPeg(peg9, 2, 4);
            board1.addPeg(peg10, 1, 4);
            board1.addPeg(peg11, 1, 5);
            board1.addPeg(peg12, 2, 5);
		} else {
            board1.addPeg(peg9, 12, 2);
            board1.addPeg(peg10, 11, 2);
            board1.addPeg(peg11, 11, 2);
            board1.addPeg(peg12, 12, 2);
		}

		peg9.setdifficulty(d);
		peg10.setdifficulty(d);
		peg11.setdifficulty(d);
		peg12.setdifficulty(d);

		peg9.setbehavior(b);
		peg10.setbehavior(b);
		peg11.setbehavior(b);
		peg12.setbehavior(b);
	}

	public void p4Init(board board1, String d, String b, String c) {

		if (c == "blue") {
            board1.addPeg(peg13, 2, 4);
            board1.addPeg(peg14, 1, 4);
            board1.addPeg(peg15, 1, 5);
            board1.addPeg(peg16, 2, 5);
		} else if (c == "yellow") {
            board1.addPeg(peg13, 3, 13);
            board1.addPeg(peg14, 4, 13);
            board1.addPeg(peg15, 3, 12);
            board1.addPeg(peg16, 4, 12);
		} else if (c == "green") {
            board1.addPeg(peg13, 3, 13);
            board1.addPeg(peg14, 4, 13);
            board1.addPeg(peg15, 3, 12);
            board1.addPeg(peg16, 4, 12);
		} else {
            board1.addPeg(peg13, 3, 13);
            board1.addPeg(peg14, 4, 13);
            board1.addPeg(peg15, 3, 12);
            board1.addPeg(peg16, 4, 12);
		}

		peg13.setdifficulty(d);
		peg14.setdifficulty(d);
		peg15.setdifficulty(d);
		peg16.setdifficulty(d);

		peg13.setbehavior(b);
		peg14.setbehavior(b);
		peg15.setbehavior(b);
		peg16.setbehavior(b);
	}

	pegs getPeg1() {
		return peg1;
	}

	pegs getPeg2() {
		return peg2;
	}

	pegs getPeg3() {
		return peg3;
	}

	pegs getPeg4() {
		return peg4;
	}

	pegs getPeg5() {
		return peg5;
	}

	pegs getPeg6() {
		return peg6;
	}

	pegs getPeg7() {
		return peg7;
	}

	pegs getPeg8() {
		return peg8;
	}

	pegs getPeg9() {
		return peg9;
	}

	pegs getPeg10() {
		return peg10;
	}

	pegs getPeg11() {
		return peg11;
	}

	pegs getPeg12() {
		return peg12;
	}

	pegs getPeg13() {
		return peg13;
	}

	pegs getPeg14() {
		return peg14;
	}

	pegs getPeg15() {
		return peg15;
	}

	pegs getPeg16() {
		return peg16;
	}

	public pegs[] player1(){
		pegs p1Array[] = {getPeg1(), getPeg2(), getPeg3(),getPeg4()};
		return p1Array;
	}
	public pegs[] player2(){
		pegs p2Array[] = {getPeg5(), getPeg6(), getPeg7(),getPeg8()};
		return p2Array;
	}
	public pegs[] player3(){
		pegs p3Array[] = {getPeg9(), getPeg10(), getPeg11(),getPeg12()};
		return p3Array;
	}
	public pegs[] player4(){
		pegs p4Array[] = {getPeg13(), getPeg14(), getPeg15(),getPeg16()};
		return p4Array;
	}
    public void hardNice(board b, deck d) {
        if (b.getTurn() == 2 && player2()[1].getdifficulty() == "hard" && player2()[1].getbehavior() == "nice") {
//            b.movePeg(player2()[0], move);
//            b.setBumpcheck(true);
//            System.out.println(b.getBumpCheck());

            for (int i = 0; i < player2().length ; i++) {
            	if(b.getNiceMove() <= 0) {
            		if (b.isStart(player2()[i])){
            			b.start(player2()[i]);
            		}
            		else{
					b.movePeg(player2()[i], d.getDrawnCard().getVal(), true);
            		}
					setComputerPeg(player2()[i]);
					//b.setNiceMove(0);
				}

            }
			b.setNiceMove(0);
            //if (b.getBumpCheck()==true)
        }
        if (b.getTurn() == 3 && player3()[1].getdifficulty() == "hard" && player3()[1].getbehavior() == "nice") {
			for (int i = 0; i < player3().length ; i++) {
				if(b.getNiceMove() <= 0) {
					b.movePeg(player3()[i], d.getDrawnCard().getVal(), true);
					setComputerPeg(player3()[i]);
					//b.setNiceMove(0);
				}

			}
			b.setNiceMove(0);
        }
        if (b.getTurn() == 4 && player4()[1].getdifficulty() == "hard" && player4()[1].getbehavior() == "nice") {
			for (int i = 0; i < player4().length ; i++) {
				if(b.getNiceMove() <= 0) {
					b.movePeg(player4()[i], d.getDrawnCard().getVal(), true);
					setComputerPeg(player4()[i]);
					//b.setNiceMove(0);
				}

			}
			b.setNiceMove(0);
        }
        //moves each piece at random
        //numbers generated randomly between the first peg and fourth peg
        //if space = occupied don't make that peg go to it


    }
	public void easyNice(board b, deck d) {
		if (b.getTurn() == 2 && player2()[1].getdifficulty() == "easy" && player2()[1].getbehavior() == "nice") {


			for (int i = 0; i < player2().length ; i++) {
                Random generator = new Random();
                int randomIndex = generator.nextInt(player2().length);
				if(b.getNiceMove() <= 0) {
					b.movePeg(player2()[randomIndex], d.getDrawnCard().getVal(), true);
					setComputerPeg(player2()[randomIndex]);
					//b.setNiceMove(0);
				}

			}
			b.setNiceMove(0);
			//if (b.getBumpCheck()==true)
		}
		if (b.getTurn() == 3 && player3()[1].getdifficulty() == "easy" && player3()[1].getbehavior() == "nice") {
			for (int i = 0; i < player3().length ; i++) {
                Random generator = new Random();
                int randomIndex = generator.nextInt(player2().length);
				if(b.getNiceMove() <= 0) {
					b.movePeg(player3()[randomIndex], d.getDrawnCard().getVal(), true);
					setComputerPeg(player3()[randomIndex]);
					//b.setNiceMove(0);
				}

			}
			b.setNiceMove(0);
		}
		if (b.getTurn() == 4 && player4()[1].getdifficulty() == "easy" && player4()[1].getbehavior() == "nice") {
			for (int i = 0; i < player4().length ; i++) {
                Random generator = new Random();
                int randomIndex = generator.nextInt(player2().length);
				if(b.getNiceMove() <= 0) {
					b.movePeg(player4()[randomIndex], d.getDrawnCard().getVal(), true);
					setComputerPeg(player4()[randomIndex]);
					//b.setNiceMove(0);
				}

			}
			b.setNiceMove(0);
		}
		//moves each piece at random
		//numbers generated randomly between the first peg and fourth peg
		//if space = occupied don't make that peg go to it


	}


    public void hardMean(board b, deck d) {
        if (b.getTurn() == 2 && player2()[1].getdifficulty() == "hard" && player2()[1].getbehavior() == "mean") {
//            b.movePeg(player2()[0], move);
//            b.setBumpcheck(true);
//            System.out.println(b.getBumpCheck());

            for (int i = 0; i < player2().length ; i++) {
                if(b.getMeanMove() <= 0) {
                		if (b.isStart(player2()[i])==true){
                			System.out.println("1error1");
                			b.start(player2()[i]);
                		}
                		else{
                			System.out.println("1error2");
                			b.movePeg(player2()[i], d.getDrawnCard().getVal(), true);
                		}
					setComputerPeg(player2()[i]);
                    //b.setNiceMove(0);
                }

            }
            b.setMeanMove(0);
            //if (b.getBumpCheck()==true)
        }
        if (b.getTurn() == 3 && player3()[1].getdifficulty() == "hard" && player3()[1].getbehavior() == "mean") {
            for (int i = 0; i < player3().length ; i++) {
                if(b.getMeanMove() <= 0) {
                	if (b.isStart(player2()[i])==true){
            			System.out.println("2error1");
            			b.start(player3()[i]);
            		}
            		else{
            			System.out.println("2error2");
            			b.movePeg(player3()[i], d.getDrawnCard().getVal(), true);
            		}
					setComputerPeg(player3()[i]);
                    //b.setNiceMove(0);
                }

            }
            b.setMeanMove(0);
        }
        if (b.getTurn() == 4 && player4()[1].getdifficulty() == "hard" && player4()[1].getbehavior() == "mean") {
            for (int i = 0; i < player4().length ; i++) {
                if(b.getMeanMove() <= 0) {
                	if (b.isStart(player2()[i])==true){
            			System.out.println("3error1");
            			b.start(player4()[i]);
            		}
            		else{
            			System.out.println("3error2");
            			b.movePeg(player4()[i], d.getDrawnCard().getVal(), true);
            		}
					setComputerPeg(player4()[i]);
                    //b.setNiceMove(0);
                }

            }
            b.setMeanMove(0);
        }
        //moves each piece at random
        //numbers generated randomly between the first peg and fourth peg
        //if space = occupied don't make that peg go to it


    }
    public void easyMean(board b, deck d) {
        if (b.getTurn() == 2 && player2()[1].getdifficulty() == "easy" && player2()[1].getbehavior() == "mean") {
//            b.movePeg(player2()[0], move);
//            b.setBumpcheck(true);
//            System.out.println(b.getBumpCheck());

            for (int i = 0; i < player2().length ; i++) {
                Random generator = new Random();
                int randomIndex = generator.nextInt(player2().length);
                if(b.getMeanMove() <= 0) {
                    b.movePeg(player2()[randomIndex], d.getDrawnCard().getVal(), false);
					setComputerPeg(player2()[randomIndex]);
                    //b.setNiceMove(0);
                }

            }
            b.setMeanMove(0);
            //if (b.getBumpCheck()==true)
        }
        if (b.getTurn() == 3 && player3()[1].getdifficulty() == "easy" && player3()[1].getbehavior() == "mean") {
            for (int i = 0; i < player3().length ; i++) {
                Random generator = new Random();
                int randomIndex = generator.nextInt(player2().length);
                if(b.getMeanMove() <= 0) {
                    b.movePeg(player3()[randomIndex], d.getDrawnCard().getVal(), false);
					setComputerPeg(player3()[randomIndex]);
                    //b.setNiceMove(0);
                }

            }
            b.setMeanMove(0);
        }
        if (b.getTurn() == 4 && player4()[1].getdifficulty() == "easy" && player4()[1].getbehavior() == "mean") {
            for (int i = 0; i < player4().length ; i++) {
                Random generator = new Random();
                int randomIndex = generator.nextInt(player2().length);
                if(b.getMeanMove() <= 0) {
                    b.movePeg(player4()[randomIndex], d.getDrawnCard().getVal(),false);
					setComputerPeg(player4()[randomIndex]);
                    //b.setNiceMove(0);
                }

            }
            b.setMeanMove(0);
        }
        //moves each piece at random
        //numbers generated randomly between the first peg and fourth peg
        //if space = occupied don't make that peg go to it


    }

	public pegs getComputerPeg() {
		return computerPeg;
	}

	public void setComputerPeg(pegs computerPeg) {
		this.computerPeg = computerPeg;
	}
}

