import ar.com.ada.polymorphism.interfeces.Runner;
import ar.com.ada.polymorphism.interfeces.Swimmer;
import ar.com.ada.polymorphism.subclass.Horse;
import ar.com.ada.polymorphism.subclass.Shark;
import ar.com.ada.polymorphism.subclass.SoccerPlayer;
import ar.com.ada.polymorphism.subclass.WaterpoloPlayer;
import ar.com.ada.polymorphism.superclass.Animal;

public class App {

    public static void main(String[] args) {

        Runner soccerPlayer = new SoccerPlayer("Messi", 10, "Barcelona");
        Runner horse = new Horse("Frison", "Azabache");

        Swimmer waterpoloPlayer = new WaterpoloPlayer("Jose", "Profesional");
        Swimmer shark = new Shark("Tigre", "Agrecibo");

        soccerPlayer.run();
        horse.run();

        waterpoloPlayer.swimming();
        shark.swimming();

    }

}
