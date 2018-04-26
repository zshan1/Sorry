package sorry;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

//Class for creating peg objects to be used on the board
public class pegs {

    //initializing fields that will belong to each instance of peg
	private Color color;
	private int x;
	private int y;
	private String difficulty;
	private String behavior;
	private boolean isSafeStatus;
	private Label peglabel;

	//enumerating color choices for each peg instance
	public enum Color {
		RED, GREEN, BLUE, YELLOW
	}

	//peg object constructor
	public pegs(){}
	public pegs(Color pgolor)
	{
		color = pgolor;
	}
	
    //Gets pegs X coordinate of a peg instance
    public int getX() {
    	// TODO Auto-generated method stub
        return x;
    }

    //Gets pegs Y coordinate of a peg instance
    public int getY() {
    	// TODO Auto-generated method stub
        return y;
    }
    
    //Set peg instances X coordinate
    public void setX(int x) {
        this.x = x;
    }

    //Set peg instances Y coordinate
    public void setY(int y) {
        this.y = y;
    }


    //Returns difficulty string that is given to the computer player (either easy or hard)
    public String getdifficulty() {
    	// TODO Auto-generated method stub
        return difficulty;
    }

    //Returns behavior string that is given to the computer player (either nice or mean)
    public String getbehavior() {
    	// TODO Auto-generated method stub
        return behavior;
    }
    

    //Sets difficulty string to computer player (easy or hard)
    public void setdifficulty(String x) {
        this.difficulty = x;
    }

    //Sets behavior string to computer player (nice or mean)
    public void setbehavior(String y) {
        this.behavior = y;
    }
    


    //returns color of a peg instance
    public Color getColor()
	{
		
		return color;
	}

	//sets the location of peg on the GUI
    public void setGpeg (Label x){
    	this.peglabel = x;
    }
    
    public Label getGpeg(){
    	return peglabel;
    }
   
	
}
