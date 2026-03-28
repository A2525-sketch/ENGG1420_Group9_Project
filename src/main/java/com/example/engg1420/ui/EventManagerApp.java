package com.example.engg1420.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EventManagerApp extends Application {
    private int opt;
    public static EventManagerApp e = new EventManagerApp();
    public static Stage s = new Stage();
    public void setOpt(int opt){
        this.opt = opt;
    }



    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/EventManager.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("Event Manager");
        stage.show();










    }

    public int getOpt(){
        return opt;
    }
    public void setWindow(){

    }
    public static void main(String[] args) {launch();}
}
