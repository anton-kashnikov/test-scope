import javafx.application.*;
import javafx.stage.Stage;


public class TestScope extends Application {
    public static void main(String[] args) {
        System.out.println("Test");
        System.out.println("first change");
        System.out.println("branch-1-first change");
        System.out.println("branch-1-second change");
    }

    public void start(Stage stage) throws Exception {
        stage.close();
    }
}
