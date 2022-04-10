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
public class SessionManager {

    private final Gameboard gameboard;
    private final Scanner scanner;
    private final Menu menu;
    private final Size size = new Size(3, 3);
    private final GameSession gameSession;

    public SessionManager() {
        gameboard = new Gameboard(size);
        scanner = new Scanner(System.in);
        gameSession = new GameSession(gameboard, scanner);
        menu = new Menu(gameSession, scanner);
    }

    public void start() {
        menu.showMenu();
    }
}
