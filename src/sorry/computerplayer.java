package sorry;

public class computerplayer {
    String quality;
    public void niceEasy(board b, Players players, deck deck) {
        if (b.getTurn() == 2 && players.player2()[1].getdifficulty() == "easy" && players.player2()[1].getbehavior() == "nice") {
            //b.movePeg(players.getPeg5().
            for (int i = 0; i < players.player2().length; i++) {
                if (b.getBumpCheck() == true) {
                    b.movePeg(players.player2()[i], deck);
                    break;
                }

            }
            //if (b.getBumpCheck()==true)
        }
        if (b.getTurn() == 3 && players.player3()[1].getdifficulty() == "easy" && players.player3()[1].getbehavior() == "dumb") {
            for (int i = 0; i < players.player3().length; i++) {
                if (b.getBumpCheck() == true) {
                    b.movePeg(players.player3()[i], deck);
                    break;
                }
            }
        }
            if (b.getTurn() == 4 && players.player4()[1].getdifficulty() == "easy" && players.player4()[1].getbehavior() == "dumb") {
                for (int i = 0; i < players.player4().length; i++) {
                    if (b.getBumpCheck() == true) {
                        b.movePeg(players.player4()[i], deck);
                        break;
                    }
                }
            }
                //moves each piece at random
                //numbers generated randomly between the first peg and fourth peg
                //if space = occupied don't make that peg go to it


            }
            public void meanEasy (pegs peg, board b){
                if (b.getTurn() == 2 && peg.getdifficulty() == "dumb" && peg.getbehavior() == "evil") {

                } else if (b.getTurn() == 3 && peg.getdifficulty() == "dumb" && peg.getbehavior() == "evil") {

                } else if (b.getTurn() == 4 && peg.getdifficulty() == "dumb" && peg.getbehavior() == "evil") {

                }
                //moves each piece at random
                //numbers generated randomly between the first peg and fourth peg
                //if space = occupied, take it
            }
            public void niceHard (pegs peg, board b){
                if (b.getTurn() == 2 && peg.getdifficulty() == "smart" && peg.getbehavior() == "nice") {

                } else if (b.getTurn() == 3 && peg.getdifficulty() == "smart" && peg.getbehavior() == "nice") {

                } else if (b.getTurn() == 4 && peg.getdifficulty() == "smart" && peg.getbehavior() == "nice") {

                }
                //move one piece through at a time
                //if space = occupied don't make that peg go to it
            }
            public void meanHard (pegs peg, board b){
                if (b.getTurn() == 2 && peg.getdifficulty() == "smart" && peg.getbehavior() == "evil") {

                } else if (b.getTurn() == 3 && peg.getdifficulty() == "smart" && peg.getbehavior() == "evil") {

                } else if (b.getTurn() == 4 && peg.getdifficulty() == "smart" && peg.getbehavior() == "evil") {

                }
                //move one piece through at a time
                //if space = occupied, take it
            }


        }
