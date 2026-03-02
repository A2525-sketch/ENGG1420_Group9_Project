package com.example.engg1420.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EventManagerApp extends Application {
    private int opt;

    @Override
    public void start(Stage stage) throws Exception {
            if(opt == 0){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/EventManager.fxml"));
                Scene scene = new Scene(loader.load());
                stage.setScene(scene);
                stage.setTitle("Event Manager");
                stage.show();
            }else if(opt == 1){//open info window for event 1
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/EM_goInfoE1.fxml"));
                Scene scene = new Scene(loader.load());
                stage.setScene(scene);
                stage.setTitle("Info");
                stage.show();
            }else if(opt == 2){//open Edit info window for event 1
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/EM_goEditInfoE1.fxml"));
                Scene scene = new Scene(loader.load());
                stage.setScene(scene);
                stage.setTitle("Edit Info");
                stage.show();
            }








    }
    public void setOpt(int opt){
        this.opt = opt;
    }

    public int getOpt(){
        return opt;
    }
    public void setWindow(){

    }
    public static void main(String[] args) {launch();}
}
