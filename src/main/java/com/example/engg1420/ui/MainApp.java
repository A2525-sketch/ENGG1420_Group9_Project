package com.example.engg1420.ui;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/main.fxml"));//references the main fxml
            Scene scene = new Scene(loader.load());
            CSVInitializer.initializeUsers();
            stage.setScene(scene);
            stage.setTitle("Booking System Phase Two");
            stage.show();

    }



    public static void main(String[] args){
        launch();
    } //launch when Mainapp.java is run to start program
}
