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
public class UpdateBoardTask extends TimerTask{
    Gameboard gb;
    
    public UpdateBoardTask(Gameboard gb){
        this.gb = gb;
    }
    
    @Override
    public void run(){
        gb.showOneMole();
    }
}
