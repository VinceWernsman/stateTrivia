package com.company;

public class stateCapital {

    private String state;
    private String capital;
    private boolean beenUsed;

    public stateCapital(String state, String capital){    //main constructor
        this.state = state;
        this.capital = capital;
        beenUsed = false;
    }

    public stateCapital(){   //blank constructor

    }

    public String getState(){ //straight forward
        return state;
    }

    public String getCapital(){
        return capital;
    }

    public boolean getbeenUsed(){
        return beenUsed;
    }

    public void setBeenUsed(boolean beenUsed){  //used for when a state is asked of the user
        this.beenUsed = beenUsed;
    }
}


