package model;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private boolean isPlayerWin;
    private boolean isOpponentWin;
    private int totalFillDamage;
    private GameBoard gameBoard;
    private List<Opponent> opponents = new ArrayList<>();;

    public Game(){
        isPlayerWin = false;
        isOpponentWin = false;
        gameBoard = new GameBoard();
    }

    private void generateOpponents(){
        for(int i = 3; i > 0; i--){
            Opponent opponent = new Opponent(200, 50);
            opponents.add(opponent);
        }
    }

    private void attackOpponent(){
        opponents.get(1).takeDamage(totalFillDamage);
    }



}
