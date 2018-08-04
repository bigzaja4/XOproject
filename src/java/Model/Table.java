/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author bigza
 */
public class Table {
    private int player1Score;
    private int player2Score;
    private int tieScore;

    public Table() {
    }

    public Table(int player1Score, int player2Score, int tieScore) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.tieScore = tieScore;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public void setPlayer2Score(int player2Score) {
        this.player2Score = player2Score;
    }

    public int getTieScore() {
        return tieScore;
    }

    public void setTieScore(int tieScore) {
        this.tieScore = tieScore;
    }
    
}
