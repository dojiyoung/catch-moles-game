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
//  private final Scoreboard scoreboard;
    private final GameSession gameSession;
    private String inputFromUser;
    private boolean isValid;
    private User user;
    
    public Menu(GameSession gameSession, Scanner scanner) {
        this.gameSession = gameSession;
        this.scanner = scanner;
    }

    public void defaultMenu() {
        System.out.println("1. Register name (Press 'R')");
        System.out.println("2. Play Game (Press 'P')");
        System.out.println("3. Score Board (Press 'S')");
        System.out.println("4. Quit the program anytime (Press 'Q')");
    }

    public void showMenu() {
        isValid = true;

        defaultMenu();

        do {
            inputFromUser = scanner.nextLine();

            if ("R".equalsIgnoreCase(inputFromUser)) {
                System.out.println("Please Enter Your Name:");
                String setUserName = scanner.nextLine();
                user = new User(setUserName);

                System.out.println("Press 'B' for back to Menu.");
            } else if ("P".equalsIgnoreCase(inputFromUser)) {
                gameSession.gameStart();
            } //else if("S".equalsIgnoreCase(inputFromUser)){
            //  scoreSession.showScoreboard();   
            // System.out.println("Press 'B' for back to Menu.");
            //}  
            else if ("Q".equalsIgnoreCase(inputFromUser)) {
                System.out.println("Quits the program.");
                isValid = false;
            } else if ("B".equalsIgnoreCase(inputFromUser)) {
                this.defaultMenu();
            }
        } while (isValid);
        {
            System.exit(0);
        }
    }
}
