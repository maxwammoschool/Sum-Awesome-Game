package Model;

public class Opponent {
    private int health;
    private int damage;

    public Opponent(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public int getHealth(){
        return health;
    }

    public int getDamage(){
        return damage;
    }

    public void takeDamage(int damage){
        health -= damage;
    }

}
