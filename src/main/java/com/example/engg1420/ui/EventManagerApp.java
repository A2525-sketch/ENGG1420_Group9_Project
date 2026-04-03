package com.example.engg1420.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.ArrayList;

public class EventManagerApp extends Application {

    public static ArrayList<EventManagerController> EventManagerControllerList = new ArrayList<>(3);
    public static EventManagerContainerController EventManagerContainerControllerObj = new EventManagerContainerController();


    public static ArrayList<String> eventIDList = new ArrayList<>(3);
    public static ArrayList<String> titleList= new ArrayList<>(3);
    public static ArrayList<String> dateList= new ArrayList<>(3);
    public static ArrayList<String> locationList= new ArrayList<>(3);
    public static ArrayList<String> capacityList= new ArrayList<>(3);
    public static ArrayList<String> eventTypeList= new ArrayList<>(3);
    public static Stage EventManagerStage = new Stage();

    public static int rowCount = 3;//a for loop will be bounded by this number
    public static int Index = 0;
    public static ArrayList<FXMLLoader> EventManagerLoaderList = new ArrayList<>(3);
    public static FXMLLoader EMContainerLoader;

    public static boolean runState = false;


    public Parent EventManagerRoot;
    public static Parent EventManagerContainerRoot;
    public static Scene EventManagerScene;








    @Override
    public void start(Stage stage) throws Exception {

        if(runState == false){
            EMContainerLoader = new FXMLLoader(getClass().getResource("/EventManagerContainer.fxml"));
            EventManagerContainerRoot = EMContainerLoader.load();
            EventManagerScene = new Scene(EventManagerContainerRoot);

            EventManagerContainerControllerObj = EMContainerLoader.getController();
            for(int i = 0; i < rowCount; i++){
                EventManagerLoaderList.add(i,new FXMLLoader(getClass().getResource("/EventManager.fxml")));



                EventManagerRoot = EventManagerLoaderList.get(i).load();
                EventManagerControllerList.add(i,EventManagerLoaderList.get(i).getController());


                //set position of content
                EventManagerControllerList.get(i).EMCLabel.setLayoutY(50);
                EventManagerControllerList.get(i).ShowInfoButton.setLayoutX(150);
                EventManagerControllerList.get(i).ShowInfoButton.setLayoutY(50);
                EventManagerControllerList.get(i).EditInfoButton.setLayoutX(150);
                EventManagerControllerList.get(i).EditInfoButton.setLayoutY(50+35);
                EventManagerControllerList.get(i).CancelEventButton.setLayoutX(150);
                EventManagerControllerList.get(i).CancelEventButton.setLayoutY(50+70);



                EventManagerContainerControllerObj.getVBoxContainer().getChildren().add(EventManagerRoot);
                EventManagerLoaderList.get(i).setController(EventManagerControllerList.get(i));


                EventManagerControllerList.get(i).setIndex(i);
                eventIDList.add(i, "");
                titleList.add(i, "");
                dateList.add(i, "");
                locationList.add(i, "");
                capacityList.add(i, "");
                eventTypeList.add(i, "");




            }
        }
        runState = true;


        for(int i = 0; i < rowCount; i++){
            EventManagerControllerList.get(i).setEMA(this);
        }


        EventManagerStage.setScene(EventManagerScene);

        EventManagerContainerControllerObj.setCurrentScene(EventManagerScene);

        EventManagerStage.show();








    }






    public void addToVBox() throws Exception{






            EventManagerLoaderList.add(rowCount, new FXMLLoader(getClass().getResource("/EventManager.fxml")));


            EventManagerRoot = EventManagerLoaderList.get(rowCount).load();
            EventManagerControllerList.add(EventManagerLoaderList.get(rowCount).getController());

            EventManagerControllerList.get(rowCount).EMCLabel.setLayoutY(50);
            EventManagerControllerList.get(rowCount).ShowInfoButton.setLayoutX(150);
            EventManagerControllerList.get(rowCount).ShowInfoButton.setLayoutY(50);
            EventManagerControllerList.get(rowCount).EditInfoButton.setLayoutX(150);
            EventManagerControllerList.get(rowCount).EditInfoButton.setLayoutY(50+35);
            EventManagerControllerList.get(rowCount).CancelEventButton.setLayoutX(150);
            EventManagerControllerList.get(rowCount).CancelEventButton.setLayoutY(50+70);




            EventManagerControllerList.get(rowCount).setIndex(rowCount);
            eventIDList.add(rowCount, "");
            titleList.add(rowCount, "");
            dateList.add(rowCount, "");
            locationList.add(rowCount, "");
            capacityList.add(rowCount, "");
            eventTypeList.add(rowCount, "");

            EventManagerContainerControllerObj.getVBoxContainer().getChildren().add(EventManagerRoot);



            for(int i = 0; i < rowCount; i++){
                EventManagerControllerList.get(i).setEMA(this);
            }

            rowCount = rowCount+1;
            

    }







    public void refreshVBox(){
        EventManagerScene.setRoot(EventManagerContainerRoot);
        EventManagerStage.setScene(EventManagerScene);
        EventManagerStage.show();
    }







    public void setEventManagerContainerController(EventManagerContainerController controller){
        EventManagerContainerControllerObj = controller;
    }

    public FXMLLoader getEMContainerLoader(){
        return EMContainerLoader;
    }





    public void setIndex(int i){
        Index = i;
    }

    public void setRowCount(int rowcount){
        rowCount = rowcount;
    }


    public static void main(String[] args) {launch();}
}
