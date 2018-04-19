package sorry;
import javafx.geometry.Point2D;
public class Players {
    Players(){

    }
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
}
