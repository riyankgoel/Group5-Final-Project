/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group5.pkgfinal.project;

/**
 *
 * @author theodore
 */
public class GameScore {

    int score;

    public GameScore() {
        super();
        score = 0;

    }

//increments the score
    public void increaseScore() {
        score = score + 1;
    }

}
