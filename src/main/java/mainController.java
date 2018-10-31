import backEnd.backController;

public class mainController {
    public mainController() {
        System.out.println("Uruchomilem mainController");
    }

    public void start() {
        backController gameCtrl = new backController();
        System.out.println("koniec programu");
        System.exit(0);
    }
}
