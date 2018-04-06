package sorry;

public class pegs {
	private boolean at_Start;
	private boolean at_Home;
	private boolean at_SafeZone;
	private int row;
    private int col;
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
	 public int getRow() {
	        return row;
	    }
	    public int getCol() {
	        return col;
	    }

	    public void setRow(int row) {
	        this.row = row;
	    }
	    public void setCol(int col) {
	        this.col = col;
	    }
}
