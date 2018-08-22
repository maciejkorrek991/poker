import backEnd.engine.gameController;

public class mainController {
    public mainController(){
        System.out.println("Uruchomilem mainController");
    }

    public void start(){
        gameController gameCtrl = new gameController();
        gameCtrl.startGame();
    }
}
