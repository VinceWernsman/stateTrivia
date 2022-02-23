package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        stateList allStates = new stateList();   //builds initial list of all states
        stateCapital newState = new stateCapital(); //blank state and capital object
        Scanner scan = new Scanner(System.in);

        String state;
        String capital;
        String capitalLowercase;
        String userGuess;
        int numCorrect = 0;
        int numWrong = 0;
        int total;

        System.out.println("Welcome to Trivia!!!!");
        System.out.println("Enter all of the state capitals, guess 5 incorrectly, and its game over.");
        System.out.print("\n");

        while(numWrong < 5 && (numWrong+numCorrect) < allStates.getListSize()) {     //checks if user has not gotten 5 wrong and all states have not been asked.
            newState = allStates.getRandomState();
            state = newState.getState();
            capital = newState.getCapital();

            System.out.print("What is the capital of " + state + "? ");
            userGuess = scan.nextLine();

            userGuess = userGuess.replaceAll("[^a-zA-Z ]", "");
            userGuess = userGuess.toLowerCase();
            capitalLowercase = capital.toLowerCase();
            userGuess.replaceAll(" ", "");

            if (userGuess.equals(capitalLowercase)) {
                System.out.println("You are correct!");
                numCorrect++;
            } else {
                System.out.println("Im sorry, the correct answer is " + capital);
                numWrong++;
            }
        }

        total = numCorrect+numWrong;
        System.out.println("\n");
        System.out.println("GAME OVER!!!! You got "+numCorrect+" correct out of "+total+" states");

        //allStates.outputList();

    }
}
