package com.example.engg1420.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EventManagerApp extends Application {
    private int opt;
    public static EventManagerApp e = new EventManagerApp();
    public EventManagerController EMController = new EventManagerController();
    public EventManagerContainerController EMContainerController = new EventManagerContainerController();
    public static Stage s = new Stage();
    public void setOpt(int opt){
        this.opt = opt;
    }

    public static int count = 3;//a for loop will be bounded by this number

    public static FXMLLoader EMLoader;
    public static FXMLLoader EMContainerLoader;

    public Stage sEM = new Stage();
    public Parent root1;
    public static Parent root2;




    @Override
    public void start(Stage stage) throws Exception {

        EMLoader = new FXMLLoader(getClass().getResource("/EventManager.fxml"));
        Parent root = EMLoader.load();
        Scene scene = new Scene(root);
        sEM.setScene(scene);
        sEM.setTitle("Event Manager");
        sEM.show();










    }



    public int getOpt(){
        return opt;
    }
    public void setWindow(){

    }

    public void newRoot(){

    }

    public void addToVBox(int option) throws Exception{
        //create an addcount variable and add to bound of count variable

        //case 1: initial run
        if(option == 0){
            //EMContainerLoader = new FXMLLoader(getClass().getResource("/EventManagerContainer.fxml"));
            //root2 = EMContainerLoader.load();
            EMContainerController = EMContainerLoader.getController();
            for(int i = 0; i < count; i++){
                EMLoader = new FXMLLoader(getClass().getResource("/EventManager.fxml"));
                root1 = EMLoader.load();
                EMController = EMLoader.getController();
                EMController.EMCLabel.setLayoutY(50*i);
                EMController.ShowInfoButton.setLayoutX(150);
                EMController.ShowInfoButton.setLayoutY(50*i);
                EMController.EditInfoButton.setLayoutX(150);
                EMController.EditInfoButton.setLayoutY((50*i)+35);
                EMController.CancelEventButton.setLayoutX(150);
                EMController.CancelEventButton.setLayoutY((50*i)+70);
                EMContainerController.getVBoxContainer().getChildren().add(root1);


            }
        }else if(option == 1){
            EMContainerController = EMContainerLoader.getController();

            count = count+1;
            EMLoader = new FXMLLoader(getClass().getResource("/EventManager.fxml"));


            root1 = EMLoader.load();
            EMController = EMLoader.getController();

            EMController.EMCLabel.setLayoutY(50*count);
            EMController.ShowInfoButton.setLayoutX(150);
            EMController.ShowInfoButton.setLayoutY(50*count);
            EMController.EditInfoButton.setLayoutX(150);
            EMController.EditInfoButton.setLayoutY((50*count)+35);
            EMController.CancelEventButton.setLayoutX(150);
            EMController.CancelEventButton.setLayoutY((50*count)+70);
            EMContainerController.setLoader8(EMContainerLoader);
            EMContainerController.getVBoxContainer().getChildren().add(root1);

        }
        //case 2: general run
        /**/


        //Scene scene = new Scene(root2);
        s.setScene(new Scene(root2));
        s.show();


    }
    public EventManagerController getEMController(){
        return EMLoader.getController();
    }
    public EventManagerContainerController getEMContainerController(){return EMContainerLoader.getController();}
    public FXMLLoader getEMContainerLoader(){
        return EMContainerLoader;
    }



    public void initializeStuff() throws Exception{
        EMContainerLoader = new FXMLLoader(getClass().getResource("/EventManagerContainer.fxml"));
        root2 = EMContainerLoader.load();
    }
    public static void main(String[] args) {launch();}
}
