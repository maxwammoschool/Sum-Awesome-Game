package Model;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Opponent> opponents;

    public Game(){

    }

    public void generateOpponents(){
        opponents = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            opponents.add(new Opponent(200,30));
        }
    }





}
