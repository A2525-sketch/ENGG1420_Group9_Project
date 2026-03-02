package com.example.engg1420.ui;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

@Override
    public void start(Stage stage) throws Exception {//
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/main.fxml"));//references the main fxml
            Scene scene = new Scene(loader.load());

            stage.setScene(scene);
            stage.setTitle("Booking System Phase One");
            stage.show();

}



public static void main(String[] args){
        launch();
    }
}
