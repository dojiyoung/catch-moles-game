/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDCProject;

import java.util.Scanner;

/**
 *
 * @author OEM
 */
public class GameSession {
    
    Gameboard gameboard;
    Scanner sc = new Scanner(System.in);
    Score score = new Score();
    
    public GameSession(Gameboard gameboard) {
        this.gameboard = gameboard;
    }

    public void start() {

        while (true) {
            boolean isValidIndex = false;
            String inputFromUser = null;
            int indexFromUser = -1;
            do {
                inputFromUser = sc.nextLine();
                if ("q".equalsIgnoreCase(inputFromUser)) {
                    System.out.println("Score: " + score.getScore());
                    System.exit(0);
                } else {
                    try {
                        indexFromUser = Integer.parseInt(inputFromUser);

                        if (indexFromUser < 1 || 9 < indexFromUser) {
                            System.out.println(" Invalid Input ! ! ! ");
                        } else {
                            isValidIndex = true;

                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter 'q' or "
                                + "a number between 1 and 9!");
                    }
                }
            } while (!isValidIndex);

            System.out.println(gameboard.isMoleVisibleAtIndex(indexFromUser - 1));
            if (gameboard.isMoleVisibleAtIndex(indexFromUser - 1) == true) {
                score.setScore(score.getScore() + 10);
            }
        }
    }
}
