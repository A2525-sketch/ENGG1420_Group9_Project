package com.example.engg1420.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class EventManagerApp extends Application {

    public static EventManagerController EMController = new EventManagerController();
    public static EventManagerContainerController EMContainerController = new EventManagerContainerController();
    public static ArrayList<EventManagerController> EMContainerList = new ArrayList<>(3);
    public static ArrayList<FXMLLoader> EMContainerLoaderList = new ArrayList<>(3);
    public static Stage s = new Stage();

    public static int count = 3;//a for loop will be bounded by this number

    public static FXMLLoader EMLoader;
    public static FXMLLoader EMContainerLoader;


    public Parent root1;
    public static Parent root2;
    public static Scene scene2;




    @Override
    public void start(Stage stage) throws Exception {
        EMContainerLoader = new FXMLLoader(getClass().getResource("/EventManagerContainer.fxml"));
        root2 = EMContainerLoader.load();
        scene2 = new Scene(root2);

        EMContainerController = EMContainerLoader.getController();
        for(int i = 0; i < count; i++){
            EMLoader = new FXMLLoader(getClass().getResource("/EventManager.fxml"));
            root1 = EMLoader.load();

            EMController = EMLoader.getController();
            EMController.EMCLabel.setLayoutY(50);
            EMController.ShowInfoButton.setLayoutX(150);
            EMController.ShowInfoButton.setLayoutY(50);
            EMController.EditInfoButton.setLayoutX(150);
            EMController.EditInfoButton.setLayoutY(50+35);
            EMController.CancelEventButton.setLayoutX(150);
            EMController.CancelEventButton.setLayoutY(50+70);
            EMController.index = i;
            //EMContainerList.add(root1);

            EMContainerController.getVBoxContainer().getChildren().add(root1);
            EMLoader.setController(EMController);
            EMContainerLoaderList.add(EMLoader);
            EMContainerList.add(EMController);



        }


        s.setScene(scene2);
        //EMContainerController.setCurrentStage(s);
        EMContainerController.setCurrentScene(scene2);

        s.show();








    }






    public void addToVBox() throws Exception{





            //EMContainerController = EMContainerLoader.getController();

            count = count+1;
            EMLoader = new FXMLLoader(getClass().getResource("/EventManager.fxml"));



            root1 = EMLoader.load();
            EMController = EMLoader.getController();

            EMController.EMCLabel.setLayoutY(50);
            EMController.ShowInfoButton.setLayoutX(150);
            EMController.ShowInfoButton.setLayoutY(50);
            EMController.EditInfoButton.setLayoutX(150);
            EMController.EditInfoButton.setLayoutY(50+35);
            EMController.CancelEventButton.setLayoutX(150);
            EMController.CancelEventButton.setLayoutY(50+70);
            EMController.index=count-1;


            //EMContainerList.add(EMLoader.getController());
            EMContainerController.getVBoxContainer().getChildren().add(root1);
            //EMContainerList.add(root1);

            //for(int i = 0; i < count; i++){
                //System.out.println(EMContainerList.get(i).index);
            //}

            

    }


    public void refreshVBox(){
        scene2.setRoot(root2);
        s.setScene(scene2);
        s.show();
    }


    public void showInformation()throws  Exception{
        EMController = EMContainerList.getFirst();

    }


    public EventManagerController getEMController(){
        return EMLoader.getController();
    }
    public EventManagerContainerController getEMContainerController(){return EMContainerLoader.getController();}
    public FXMLLoader getEMContainerLoader(){
        return EMContainerLoader;
    }



    public void initializeStuff() throws Exception{

    }


    public Stage getStage(){
        return s;
    }

    public Scene getScene2(){
        return scene2;
    }


    public static void main(String[] args) {launch();}
}
