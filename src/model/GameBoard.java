package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameBoard {
    private static final int MIDDLE_INDEX = 4;
    private int strengthNum;
    private boolean isFilled;
    List<Cell> cells = new ArrayList<>();
    Random random = new Random();

    public GameBoard(){
        strengthNum = 0;
        isFilled = false;
        generateGameBoard();
    }

    private void generateGameBoard(){
        for(int i = 0; i < 9; i++){
            Cell cell = new Cell(random.nextInt(16));
            cells.add(cell);
        }
        cells.get(MIDDLE_INDEX).setFilled();
    }

    private boolean checkValidSum(int input){
        for(int i = 0; i < 9; i++){
            if(i == MIDDLE_INDEX){
                continue;
            }
            if(cells.get(i).getValue() + cells.get(MIDDLE_INDEX).getValue() == input){
                strengthNum += input;
                return true;
            }
        }
        return false;
    }

    private void checkFill(){
        isFilled = true;
        for(Cell cell : cells){
            if (!cell.getIsFilled()) {
                isFilled = false;
                break;
            }
        }
    }

}
