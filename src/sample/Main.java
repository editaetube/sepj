package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Button button1;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Exam manager");

        //button1 = new Button();
        //button1.setText("Categories");
        //StackPane layout = new StackPane();
        //layout.getChildren().add(button1);

        primaryStage.setScene(new Scene(root, 300, 275));

        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}

