/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDCProject;

/**
 *
 * @author ssr7324
 */
public class User {
    private final String userName;
    private final Score score;
    
    public User(String userName, Score score){
        this.userName = userName;
        this.score = score;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public String toString(){
        return "[Name: " + this.userName +  ", Score:" + this.score.getScore() + "]";
    }
}
