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
        Gameboard gameboard = new Gameboard(new Size(3, 3));
        Scanner sc = new Scanner(System.in);
        ScreenUpdator su = new ScreenUpdator(gameboard);
        Mole mole = new Mole();
        Score score = new Score();

        Timer time = new Timer();
        PrintGameTask printGameTask = new PrintGameTask(gameboard);

        time.schedule(printGameTask, 1000);
        su.start();
        int user = sc.nextInt();
        try {
            gameboard.isMoleAtIndex(user);
        }catch(NullPointerException e){
            System.out.println(e);
        }
        System.out.println(score.getScore());
    }
}
