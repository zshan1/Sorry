package sorry;

public class pegs {
	private Color color;
	private int x;
	private int y;
	
	public enum Color {
		RED, GREEN, BLUE, YELLOW
	}
	
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
    public Color getColor()
	{
		
		return color;
	}
 

	
}
