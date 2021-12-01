package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        String play1 = scan.nextLine();
        String play2 = scan.nextLine();


        System.out.println(handGame(play1, play2));
    }
    public static String handGame(String play1, String play2){
        String winner;
        if(play1.equals(play2)){
            winner = "TIE";
        } else if(play1.equals("rock") && play2.equals("scissors") || play1.equals("scissors") && play2.equals("paper") || play1.equals("paper") && play2.equals("rock")){
            winner = "Player 1 wins";
        } else {
            winner = "Player 2 wins";
        }
        return winner;
    }
}
