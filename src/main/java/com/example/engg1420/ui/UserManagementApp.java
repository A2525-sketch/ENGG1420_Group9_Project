package com.example.engg1420.ui;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UserManagementApp extends Application {
    //Add Content Related to java.fx
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/UserManagement.fxml"));
        Scene scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.setTitle("User Manager");
        stage.show();

    }
    public static void main(String[] args){
        launch();
    }
}
