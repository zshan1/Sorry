package sorry;

public class pegs {
	private boolean at_Start;
	private boolean at_Home;
	private boolean at_SafeZone;
	private int x;
    private int y;
    
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
    
	public void leaveStart()
	{
		at_Start = false;
	}
	public void bump()
	{
		at_Start = true;
		at_Home = false;
		at_SafeZone = false;
	}
	public void start(){
		at_Home = false;
		at_Start = false;
		at_SafeZone = false;
	}
	
}
