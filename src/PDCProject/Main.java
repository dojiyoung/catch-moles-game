/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDCProject;

import java.util.Scanner;
import java.util.Timer;

/**
 *
 * @author OEM
 */
public class Main {

    public static void main(String[] args) {
        Gameboard gameboard = new Gameboard(new Size(3, 3));
        Score score = new Score();
        Scanner scanner = new Scanner(System.in);
        GameSession gameSession = new GameSession(gameboard, scanner);
                
        gameSession.start();
    }
}