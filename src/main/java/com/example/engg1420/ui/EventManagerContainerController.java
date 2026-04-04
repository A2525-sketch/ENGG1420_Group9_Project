package com.example.engg1420.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventManagerContainerController {
    public static EventManagerApp EventManagerAppObj = new EventManagerApp();
    public CSVReaderSimpleEvent CsvEventTest = new CSVReaderSimpleEvent();



    public static FXMLLoader EventManagerContainerLoader;





    @FXML
    public VBox VBoxContainer;


    @FXML
    public AnchorPane APContainer;


    public Scene scene;





    @FXML
    public void goAddEvent()throws Exception{
        EventManagerContainerLoader = EventManagerAppObj.getEMContainerLoader();

        EventManagerAppObj.setEventManagerContainerController(EventManagerContainerLoader.getController());

        EventManagerAppObj.addToVBox();
        EventManagerAppObj.refreshVBox();

    }








    public VBox getVBoxContainer(){
        return VBoxContainer;
    }









    public void setCurrentScene(Scene s){
        scene = s;
    }


}
