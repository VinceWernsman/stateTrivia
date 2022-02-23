package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        stateList allStates = new stateList();   //builds initial list of all states
        stateCapital newState = new stateCapital(); //blank state and capital object
        Scanner scan = new Scanner(System.in);

        String state;
        String capital;
        String userGuess;
        int numCorrect = 0;
        int numWrong = 0;

        System.out.println("Welcome to Trivia!!!!");
        System.out.println("Enter all of the state capitals, guess 5 incorrectly, and its game over.");
        System.out.print("\n");

        while(numWrong < 5 && numWrong+numCorrect<50) {     //checks if user has not gotten 5 wrong and all states have not been asked.
            newState = allStates.getRandomState();
            state = newState.getState();
            capital = newState.getCapital();

            System.out.print("What is the capital of " + state + "? ");
            userGuess = scan.nextLine();

            //add in here about parsing user input.

            if (userGuess.equals(capital)) {
                System.out.println("You are correct!");
                numCorrect++;
            } else {
                System.out.println("Im sorry, the correct answer is " + capital);
                numWrong++;
            }
        }

        System.out.println("\n");
        System.out.println("GAME OVER!!!! You got "+numCorrect+" correct");

        //allStates.outputList();

    }
}
