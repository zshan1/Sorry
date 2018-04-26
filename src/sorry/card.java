package sorry;

//package sorry;

//Class for creating card objects with the following fields and methods
public class card {

    //Fields that every card object will have
    String name;
    int val;
    Boolean startable;
    Boolean splitable;

    //alternative value for card
    int alt;

    //Setting default values for a card object
    public card(){
        name = "null";
        val = 100;
        alt = val;
        startable = true;
        splitable = false;

    }





    //returns the name of an instance of card
    String getName(){
        return name;
    }

    //returns the value of an instance of card
    int getVal(){
        return val;
    }

    //returns the alternative value of an instance of card
    int getAlt(){
        return alt;
    }

    //returns a boolean saying whether you can start using this card (1 or 2)
    Boolean getStartable(){
        return startable;
    }



    //sees if you can split a card instances value for movement
    Boolean getSplitable(){
        return splitable;
    }


    //sets boolean value for a card instances ability to split or not
    void setSplitable(Boolean sp){
        splitable = sp;
    }

    ////sets boolean value for a card instances ability to start a peg instance or not
    void setStartable(Boolean s){
        startable = s;
    }

    //sets the name of a card instance
    void setName(String n){
        name = n;
    }

    //sets the value of a card instance
    void setVal(int v){
        val = v;
    }

    //sets the alternative value of a card instance
    void setAlt(int v){
        alt = v;
    }


}
