package com.company;

public class stateCapital {

    private String state;
    private String capital;
    private boolean beenUsed;

    public stateCapital(String state, String capital){
        this.state = state;
        this.capital = capital;
        beenUsed = false;

    }

    public stateCapital(){

    }

    public String getState(){
        return state;
    }

    public String getCapital(){
        return capital;
    }

    public boolean getbeenUsed(){
        return beenUsed;
    }

    public void setBeenUsed(boolean getused){
        this.beenUsed = beenUsed;

    }


}


