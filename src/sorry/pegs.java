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
 
	public void bump(pegs peg)
	{
		if (peg.getColor()== Color.RED){
			peg.setX(2);
			peg.setY(6);
		}
		else if (peg.getColor()== Color.GREEN){
			peg.setX(6);
			peg.setY(13);
		}
		else if (peg.getColor()== Color.BLUE){
			peg.setX(9);
			peg.setY(2);
		}
		else if (peg.getColor()== Color.YELLOW){
			peg.setX(13);
			peg.setY(9);
		}
	}
	public void start(pegs peg){
		if (peg.getColor()== Color.RED){
			peg.setX(4);
			peg.setY(1);
		}
		else if (peg.getColor()== Color.GREEN){
			peg.setX(1);
			peg.setY(11);
		}
		else if (peg.getColor()== Color.BLUE){
			peg.setX(14);
			peg.setY(4);
		}
		else if (peg.getColor()== Color.YELLOW){
			peg.setX(11);
			peg.setY(14);
		}
	}
	public static void main(String[] args)
	{
		// make a new pegs of each color
		pegs peg1 = new pegs(Color.RED);
		pegs peg2 = new pegs(Color.YELLOW);
		pegs peg3 = new pegs(Color.GREEN);
		pegs peg4 = new pegs(Color.BLUE);
	
		peg1.start(peg1);
		System.out.println(peg1.getColor());
		System.out.println(peg1.getX());
		System.out.println(peg1.getY());
		
		peg2.setX(100);
		peg2.setY(100);
		peg2.bump(peg2);
		System.out.println(peg2.getColor());
		System.out.println(peg2.getX());
		System.out.println(peg2.getY());
	}
}
