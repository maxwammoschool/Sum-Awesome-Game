package model;

public class Cell {
    private int value;
    private boolean isFilled;

    public Cell(int value){
        this.value = value;
        isFilled = false;
    }

    public int getValue() {
        return value;
    }

    public boolean getIsFilled() {
        return isFilled;
    }

    public void setFilled() {
        isFilled = true;
    }
}
