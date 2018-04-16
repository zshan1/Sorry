package sorry;

public class card {
	String name;
	int val;
	Boolean startable;
	//String status;
	Boolean splitable;
	public card(){
		name = "null";
		val = 100;
		startable = true;
		splitable = false;
	}
	
	
	
	
	
	String getName(){
		return name;
	}
	
	int getVal(){
		return val;
	}
	Boolean getStartable(){
		return startable;
	}
	
	Boolean getSplitable(){
		return splitable;
	}
	
	
	void setSplitable(Boolean sp){
		splitable = sp;
	}
	void setStartable(Boolean s){
		startable = s;
	}
	void setName(String n){
		name = n;
	}
	void setVal(int v){
		val = v;
	}
	
	
	
}
