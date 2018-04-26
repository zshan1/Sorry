package sorry;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class pegs {
	private Color color;
	private int x;
	private int y;
	private String difficulty;
	private String behavior;
	private boolean isSafeStatus;
	private Label peglabel;
	
	public enum Color {
		RED, GREEN, BLUE, YELLOW
	}
	public pegs(){}
	public pegs(Color pgolor)
	{
		color = pgolor;
	}
	
    
    public int getX() {
    	// TODO Auto-generated method stub
        return x;
    }
    public int getY() {
    	// TODO Auto-generated method stub
        return y;
    }
    

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    public String getdifficulty() {
    	// TODO Auto-generated method stub
        return difficulty;
    }
    public String getbehavior() {
    	// TODO Auto-generated method stub
        return behavior;
    }
    

    public void setdifficulty(String x) {
        this.difficulty = x;
    }
    public void setbehavior(String y) {
        this.behavior = y;
    }
    
    
    public Color getColor()
	{
		
		return color;
	}
 
    public void setGpeg (Label x){
    	this.peglabel = x;
    }
    
    public Label getGpeg(){
    	return peglabel;
    }
   
	
}
