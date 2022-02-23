package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class stateList {

    private List<stateCapital> list = new ArrayList<>();
    private Random rand = new Random();

    private String [] states = {"Alabama", "Alaska","Arizona", "Arkansas","California","Colorado",
            "Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas",
            "Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri",
            "Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina",
            "North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota",
            "Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};


    private String [] capitals = {"Montgomery","Juneau","Phoenix","Little Rock","Sacramento","Denver","Hartford","Dover",
            "Tallahassee","Atlanta","Honolulu","Boise","Springfield","Indianapolis","Des Moines","Topeka","Frankfort",
            "Baton Rouge","Augusta","Annapolis","Boston","Lansing","Saint Paul","Jackson","Jefferson City","Helena",
            "Lincoln","Carson City","Concord","Trenton","Santa Fe","Albany","Raleigh","Bismarck","Columbus",
            "Oklahoma City","Salem","Harrisburg","Providence","Columbia","Pierre","Nashville","Austin",
            "Salt Lake City","Montpelier","Richmond","Olympia","Charleston","Madison","Cheyenne"};


    public stateList() { ///Constructor
        for (int i = 0; i < states.length; i++) {
            list.add(new stateCapital(states[i], capitals[i]));

        }

    }

    public stateCapital getRandomState(){  //checks if a random state has been asked previously
        int x;

        do{
            x = rand.nextInt(list.size());
        } while(list.get(x).getbeenUsed());

        list.get(x).setBeenUsed(true);
        return list.get(x);
    }

    public void outputList(){   ///used only for testing purposes
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i).getState());
            System.out.print(list.get(i).getCapital());
            System.out.println(list.get(i).getbeenUsed());
        }
    }
}
