package com.example.engg1420.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventManagerContainerController {
    public static EventManagerApp EM = new EventManagerApp();


    public static FXMLLoader loader8;
    public static EventManagerContainerController emc;




    @FXML
    public VBox VBoxContainer;


    @FXML
    public AnchorPane APContainer;

    public Stage stage;
    public Scene scene;





    @FXML
    public void goAddEvent()throws Exception{
        loader8 = EM.getEMContainerLoader();
        EM.EMContainerController = loader8.getController();
        EM.addToVBox();
        EM.refreshVBox();



    }



    @FXML
    public void goShowPosition(MouseEvent event){
        System.out.println("posY: " + event.getX());
        System.out.println("posX: " + event.getY());
    }


    public VBox getVBoxContainer(){
        return VBoxContainer;
    }
    public EventManagerContainerController getEMCC(){
        return emc;
    }

    public void setLoader8(FXMLLoader l){
        loader8 = l;
    }

    public FXMLLoader getLoader8(){
        return loader8;
    }

    public void setCurrentStage(Stage s){
        stage = s;
    }


    public void setCurrentScene(Scene s){
        scene = s;
    }
}
