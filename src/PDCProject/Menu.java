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

    public Menu(GameSession gameSession, Scanner scanner) {
        this.gameSession = gameSession;
        this.scanner = scanner;
    }

    public void showMenu() {

        System.out.println("1. Play Game (Press 'P')");
        System.out.println("2. Score Board (Press 'S')");
        System.out.println("3. Quit (Press 'Q')");
        String inputFromUser = scanner.next();

        if ("P".equalsIgnoreCase(inputFromUser)) {
            gameSession.start();
        } //else if("S".equalsIgnoreCase(inputFromUser)){
        //  scoreboard.showScoreboard();    
        //} 
        else if ("Q".equalsIgnoreCase(inputFromUser)){
            System.exit(0);
        }
    }
}
