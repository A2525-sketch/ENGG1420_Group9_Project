package com.example.engg1420.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class EventManagerApp extends Application {
    private int opt;
    EventManagerController EMC = new EventManagerController();

    public static Stage s = new Stage();
    public void setOpt(int opt){
        this.opt = opt;
    }
    public String str;
    public Label L = new Label();
    //FXMLLoader loader1 = new FXMLLoader(getClass().getResource("/EM_goEditInfoE1.fxml"));
    FXMLLoader loader1= new FXMLLoader(getClass().getResource("/EM_goEditInfoE1.fxml"));
    public void setStr()throws Exception{
        loader1 = new FXMLLoader(getClass().getResource("/EM_goEditInfoE1.fxml"));
        Parent root = loader1.load();
        EMC = loader1.getController();
        str = EMC.eventid.getText();
    }

    @Override


    public void start(Stage stage) throws Exception {
            if(opt == 0){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/EventManager.fxml"));
                Scene scene = new Scene(loader.load());
                stage.setScene(scene);
                stage.setTitle("Event Manager");
                stage.show();
            }else if(opt == 1){//open info window for event 1

                s.show();
            }else if(opt == 2){//open Edit info window for event 1
                loader1 = new FXMLLoader(getClass().getResource("/EM_goEditInfoE1.fxml"));
                Scene scene = new Scene(loader1.load());
                //EMC = loader1.getController();
                s.setScene(scene);
                s.setTitle("Edit Info");
                s.show();
            }else if(opt == 3){//ed
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/EM_goInfoE2.fxml"));
                Scene scene = new Scene(loader.load());
                s.setScene(scene);
                s.setTitle("Edit Info");
                s.show();
            }else if(opt == 4){//edit info event 2
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/EM_goEditInfoE2.fxml"));
                Scene scene = new Scene(loader.load());
                s.setScene(scene);
                s.setTitle("Edit Info");
                s.show();
            }else if(opt == 5){// info event 2
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/EM_goInfoE3.fxml"));
                Scene scene = new Scene(loader.load());
                s.setScene(scene);
                s.setTitle("Edit Info");
                s.show();
            }else if(opt == 6){//info event 3
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/EM_goEditInfoE3.fxml"));
                Scene scene = new Scene(loader.load());
                s.setScene(scene);
                s.setTitle("Edit Info");
                s.show();
            }else if(opt == 7){//edit info event 3

                s.close();
            }else if(opt == 8){

            }









    }
    public String getStr() throws Exception{
        loader1 = new FXMLLoader(getClass().getResource("/EM_goEditInfoE1.fxml"));
        Parent root = loader1.load();
        EMC = loader1.getController();
        str = EMC.eventid.getText();
        return str;
    }

    public Label setLabel()throws Exception{
        loader1 = new FXMLLoader(getClass().getResource("/EM_goInfoE1.fxml"));
        Parent root = loader1.load();
        EMC = loader1.getController();
        EMC.eventId2.setText("eventid: " + str);
        L = EMC.eventId2;
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.setTitle("Info");
        return L;


    }

    public void loadScene()throws Exception{
        loader1 = new FXMLLoader(getClass().getResource("/EM_goInfoE1.fxml"));


    }
    public void saveState()throws Exception{
        loader1 = new FXMLLoader(getClass().getResource("/EM_goEditInfoE1.fxml"));
        Parent root = loader1.load();
    }

    public int getOpt(){
        return opt;
    }
    public void setWindow(){

    }
    public static void main(String[] args) {launch();}
}
