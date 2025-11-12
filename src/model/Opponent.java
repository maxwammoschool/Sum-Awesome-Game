package model;

public class Opponent {
    private int health;
    private int damage;
    private boolean isAlive;

    public Opponent(int health, int damage){
        this.health = health;
        this.damage = damage;
        isAlive = true;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void takeDamage(int damage){
        health -= damage;
        if(health < 0){
            isAlive = false;
        }
    }
}