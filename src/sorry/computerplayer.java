package sorry;

public class computerplayer {
    String quality;
    public void dumbNice(pegs peg, board b){
        if(b.getTurn() ==2){

        }
        if(b.getTurn() ==3){

        }
        if(b.getTurn() ==4){

        }

        //moves each piece at random
            //numbers generated randomly between the first peg and fourth peg
        //if space = occupied don't make that peg go to it





    }
    public void dumbEvil(pegs peg, board b){
        if(b.getTurn() ==2){

        }
        else if(b.getTurn() ==3){

        }
        else if(b.getTurn() ==4){

        }
        //moves each piece at random
            //numbers generated randomly between the first peg and fourth peg
        //if space = occupied, take it
    }
    public void smartNice(pegs peg, board b){
        if(b.getTurn() ==2){

        }
        else if(b.getTurn() ==3){

        }
        else if(b.getTurn() ==4){

        }
        //move one piece through at a time
        //if space = occupied don't make that peg go to it
    }
    public void smartEvil(pegs peg, board b){
        if(b.getTurn() ==2){

        }
        else if(b.getTurn() ==3){

        }
        else if(b.getTurn() ==4){

        }
        //move one piece through at a time
        //if space = occupied, take it
    }


    public String getQuality(){
        return quality;
    }
    public void setQuality(String q){
        quality = q;
    }


}
