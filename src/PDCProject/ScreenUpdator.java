/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDCProject;

/**
 *
 * @author OEM
 */
public class ScreenUpdator extends Thread{
    Gameboard gb;
    
    public ScreenUpdator(Gameboard gb){
        this.gb = gb;
    }
    
    @Override
    public void run(){
        gb.showOneMole();
    }
}
