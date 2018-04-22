package sorry;


//go in here and look into giving them a quality or behavior
//choice is rendered for players individually
//set how many players - just dont init player if they arent playing
//get number of players from board class

//adjust start position based on color
//be able to set color seperate from making a peg


public class Players {
<<<<<<< HEAD

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
	
	//Initialize the pegs in default colors
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
	
	public final void colorChoice(String c){
		if (c == "blue"){
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
		}else if(c == "red"){
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
			
		}else if(c =="green"){
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
			
		}else if(c == "yellow"){
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


	public void p1Init(board board1) {

		board1.addPeg(peg1, 1, 15);
		board1.addPeg(peg2, 2, 15);
		board1.addPeg(peg3, 3, 15);
		board1.addPeg(peg4, 4, 15);

	}

	public void p2Init(board board1, String d, String b) {

		board1.addPeg(peg5, 15, 11);
		board1.addPeg(peg6, 15, 12);
		board1.addPeg(peg7, 15, 13);
		board1.addPeg(peg8, 15, 14);

		peg5.setdifficulty(d);
		peg6.setdifficulty(d);
		peg7.setdifficulty(d);
		peg8.setdifficulty(d);

		peg5.setbehavior(b);
		peg6.setbehavior(b);
		peg7.setbehavior(b);
		peg8.setbehavior(b);
	}

	public void p3Init(board board1, String d, String b) {

		board1.addPeg(peg9, 14, 0);
		board1.addPeg(peg10, 13, 0);
		board1.addPeg(peg11, 12, 0);
		board1.addPeg(peg12, 11, 0);
		
		peg9.setdifficulty(d);
		peg10.setdifficulty(d);
		peg11.setdifficulty(d);
		peg12.setdifficulty(d);

		peg9.setbehavior(b);
		peg10.setbehavior(b);
		peg11.setbehavior(b);
		peg12.setbehavior(b);
	}

	public void p4Init(board board1, String d, String b) {

		board1.addPeg(peg13, 0, 1);
		board1.addPeg(peg14, 0, 2);
		board1.addPeg(peg15, 0, 3);
		board1.addPeg(peg16, 0, 4);
		
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
=======
    Players(){

    }

    pegs currentPlayer;
    //Blue pegs (P1)
    pegs peg1 = new pegs(pegs.Color.BLUE);
    pegs peg2 = new pegs(pegs.Color.BLUE);
    pegs peg3 = new pegs(pegs.Color.BLUE);
    pegs peg4 = new pegs(pegs.Color.BLUE);

    //Yellow Pegs (P2)
    pegs peg5 = new pegs(pegs.Color.YELLOW);
    pegs peg6 = new pegs(pegs.Color.YELLOW);
    pegs peg7 = new pegs(pegs.Color.YELLOW);
    pegs peg8 = new pegs(pegs.Color.YELLOW);

    //Green Pegs (P3)
    pegs peg9 = new pegs(pegs.Color.GREEN);
    pegs peg10 = new pegs(pegs.Color.GREEN);
    pegs peg11= new pegs(pegs.Color.GREEN);
    pegs peg12 = new pegs(pegs.Color.GREEN);

    //Red Pegs (P4)
    pegs peg13 = new pegs(pegs.Color.RED);
    pegs peg14 = new pegs(pegs.Color.RED);
    pegs peg15 = new pegs(pegs.Color.RED);
    pegs peg16 = new pegs(pegs.Color.RED);

    public void p1Init(board board1){

        board1.addPeg(peg1, 1, 15);
        board1.addPeg(peg2, 2, 15);
        board1.addPeg(peg3, 3, 15);
        board1.addPeg(peg4, 4, 15);
    }
    public void p2Init(board board1){

        board1.addPeg(peg5, 15, 11);
        board1.addPeg(peg6, 15, 12);
        board1.addPeg(peg7, 15, 13);
        board1.addPeg(peg8, 15, 14);
    }

    public void p3Init(board board1){

        board1.addPeg(peg9, 14, 0);
        board1.addPeg(peg10, 13, 0);
        board1.addPeg(peg11, 12, 0);
        board1.addPeg(peg12, 11, 0);
    }
    public void p4Init(board board1){

        board1.addPeg(peg13, 0, 1);
        board1.addPeg(peg14, 0, 2);
        board1.addPeg(peg15, 0, 3);
        board1.addPeg(peg16, 0, 4);
    }
    pegs getPeg1(){
        return peg1;
    }
    pegs getPeg2(){
        return peg2;
    }
    pegs getPeg3(){
        return peg3;
    }
    pegs getPeg4(){
        return peg4;
    }


    pegs getPeg5(){
        return peg5;
    }
    pegs getPeg6(){
        return peg6;
    }
    pegs getPeg7(){
        return peg7;
    }
    pegs getPeg8(){
        return peg8;
    }


    pegs getPeg9(){
        return peg9;
    }
    pegs getPeg10(){
        return peg10;
    }
    pegs getPeg11(){
        return peg11;
    }
    pegs getPeg12(){
        return peg12;
    }


    pegs getPeg13(){
        return peg13;
    }
    pegs getPeg14(){
        return peg14;
    }
    pegs getPeg15(){
        return peg15;
    }
    pegs getPeg16(){
        return peg16;
    }
>>>>>>> 8ee5dcd6d9f50aee1bc8bba431e848c2251ee2df
}
