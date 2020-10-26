import javafx.application.*;
import javafx.stage.Stage;


public class TestScope extends Application {
    public static void main(String[] args) {
        System.out.println("Test");
        System.out.println("first change");
        System.out.println("second change");
        System.out.println("third change");
    }

    public void start(Stage stage) throws Exception {
        stage.close();
    }
}
