/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDCProject;

import java.util.Scanner;

/**
 *
 * @author ssr7324
 */
public class Menu {

    private final Scanner scanner;
    private final GameSession gameSession;
    private String inputFromUser;
    private boolean isValid;
    private final ScoreSession scoreSession;

    public Menu(GameSession gameSession, ScoreSession scoreSession, Scanner scanner ) {
        this.gameSession = gameSession;
        this.scanner = scanner;
        this.scoreSession = scoreSession;
    }

    public void showMenuOption() {
        System.out.println("1. Register name (Press 'R')");
        System.out.println("2. Play Game (Press 'P')");
        System.out.println("3. Score Board (Press 'S')");
        System.out.println("4. Quit the program anytime (Press 'Q')");
    }

    public void showMenu() {
        isValid = true;
        UserScoreManager userScoreManager = new UserScoreManager();
        userScoreManager.getUserScores();
        User user = new User("");
        Score score;
        showMenuOption();

        do {
            inputFromUser = scanner.nextLine();

            if ("R".equalsIgnoreCase(inputFromUser)) {

                System.out.println("Please Enter Your Name:");
                String inputNameFromUser = scanner.nextLine();
                user = new User(inputNameFromUser);
                score = new Score();
                userScoreManager.updateUserScore(user, score);
                System.out.println("Press 'B' for back to Menu.");
            } else if ("P".equalsIgnoreCase(inputFromUser)) {
                gameSession.gameStart();
            } else if("S".equalsIgnoreCase(inputFromUser)){
                scoreSession.showScoreboard(userScoreManager.getUserScores());  
                System.out.println("Press 'B' for back to Menu.");
            }  
            else if ("Q".equalsIgnoreCase(inputFromUser)) {
                System.out.println("Quits the program." + "\n Good Bye, "+user.getUserName());
                isValid = false;
            } else if ("B".equalsIgnoreCase(inputFromUser)) {
                this.showMenuOption();
            }
        } while (isValid);
        {
            System.exit(0);
        }
    }
}
