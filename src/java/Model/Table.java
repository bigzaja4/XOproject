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

    private int turn = 1;

    private Integer[] boardPosition = new Integer[9];


    public Table(int player1Score, int player2Score, int tieScore, int turn) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.tieScore = tieScore;
        this.turn = turn;
    }

    

    
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
    
    public void setBoardPosition(Integer position,int player){
        boardPosition[position] = player;
    }
    
    public boolean markPosition(String position){
        int realPosition = 0;
        if (position.equals("R1_C1")) {
            realPosition=0;
        }else if(position.equals("R1_C2")){
            realPosition=1;
        }else if(position.equals("R1_C3")){
            realPosition=2;
        }else if(position.equals("R2_C1")){
            realPosition=3;
        }else if(position.equals("R2_C2")){
            realPosition=4;
        }else if(position.equals("R2_C3")){
            realPosition=5;
        }else if(position.equals("R3_C1")){
            realPosition=6;
        }else if(position.equals("R3_C2")){
            realPosition=7;
        }else if(position.equals("R3_C3")){
            realPosition=8;
        }
        
        if ( boardPosition[realPosition] == null) {
            boardPosition[realPosition] = turn%2;
            return true;
        }
        return false;
    }

    public Integer[] getBoardPosition() {
        return boardPosition;
    }

    public void setBoardPosition(Integer[] boardPosition) {
        this.boardPosition = boardPosition;
    }

    public boolean checkTurnIsFive() {
        boolean check = false;
        if(turn >= 5){
            check = true;
        }
        return check;
    }
  
    public boolean isWinByHorizontal(Integer position,int player){
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
