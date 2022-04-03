/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDCProject;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author OEM
 */
public class Gameboard {

    private Random rand = new Random();
    private HashMap<Integer, Mole> moles;
    private Size size;

    public Gameboard(Size size) {
        this.size = size;
        this.moles = new HashMap();

        for (int i = 0; i < size.getRow() * size.getCol(); i++) {
            this.moles.put(i, new Mole());
        }
    }

    public void showOneMole() {
        reset();
        moles.get(rand.nextInt(moles.size()))
                .setIsVisible(true);
    }

    private void reset() {
        for (int i = 0; i < moles.size(); i++) {
            moles.get(i).setIsVisible(false);
        }

    }

    public void printBoard() {
        for (int i = 0; i < moles.size(); i++) {

            System.out.print(moles.get(i));
            if ((i + 1) % size.getRow() == 0) {
                System.out.println();
            }
        }
    }

    public void isMoleAtIndex(int index) {

    }
}
