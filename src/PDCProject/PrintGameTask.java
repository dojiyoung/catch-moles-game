/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDCProject;

import java.util.TimerTask;

/**
 *
 * @author OEM
 */
public class PrintGameTask extends TimerTask{

    Gameboard gameboard;
    
    public PrintGameTask(Gameboard gameboard){
       this.gameboard = gameboard;
    }
    
    @Override
    public void run() {
        gameboard.printBoard();
    }
}
