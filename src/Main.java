import model.GameManager;
import ui.TextUi;

public class Main {
    public static void main(String[] args) {

        GameManager gameManager = new GameManager();
        TextUi textUi = new TextUi(gameManager);
        textUi.start();

    }
}