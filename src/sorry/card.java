package sorry;

//package sorry;

public class card {
    String name;
    int val;
    Boolean startable;
    //String status;
    Boolean splitable;
    int alt;
    public card(){
        name = "null";
        val = 100;
        alt = val;
        startable = true;
        splitable = false;

    }





    String getName(){
        return name;
    }

    int getVal(){
        return val;
    }
    int getAlt(){
        return alt;
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
    void setAlt(int v){
        alt = v;
    }


}
//Set alt will be the same as val for most pieces except for 12 where it could also be 1 and 11 could switch pieces

