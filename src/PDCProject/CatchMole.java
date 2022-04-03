/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDCProject;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author OEM
 */
public class CatchMole {

    public static void main(String[] args) {
        Gameboard gameboard = new Gameboard(new Size(3,3));
        
        gameboard.printBoard();
        gameboard.randomise();
        gameboard.printBoard();
//        Scanner sc = new Scanner(System.in);
        Timer time = new Timer();
        PrintGameTask printGameTask = new PrintGameTask(gameboard);
        time.schedule(printGameTask, 1000);
        
//        while (!isRun) {
//            
//            int user = sc.nextInt();
//            gameboard.isMoleAtIndex(user);
//        }
    }
}
