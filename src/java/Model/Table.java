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
    private int turn;

    public Table(int player1Score, int player2Score, int tieScore, int turn, int[] boardPosition) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.tieScore = tieScore;
        this.turn = turn;
        this.boardPosition = boardPosition;
    }
    private int[] boardPosition;

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

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public int[] getBoardPosition() {
        return boardPosition;
    }

    public void setBoardPosition(int[] boardPosition) {
        this.boardPosition = boardPosition;
    }

    public boolean isWinByHorizontal(int position,int player){
        if(position == 0 || position == 1 || position == 2){
            for(int i = 0;i<=2;i++){
                if(boardPosition[i] != player){
                    return false;
                }
            }
        }
        else if(position == 3 || position == 4 || position == 5){
            for(int i = 3;i<=5;i++){
                if(boardPosition[i] != player){
                    return false;
                }
            }
        }
        else if(position == 6 || position ==7 || position == 8){
            for(int i = 6;i<=8;i++){
                if(boardPosition[i] != player){
                    return false;
                }
            }
        }
        return true;
    }
    
}
