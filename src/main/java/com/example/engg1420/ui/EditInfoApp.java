package com.example.engg1420.ui;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static com.example.engg1420.ui.EditInfoController.eventid;

public class EditInfoApp extends Application {
    //apply injection
    //close screen
    public EditInfoController A = new EditInfoController();
    private int option;
    static Stage s = new Stage();
    public void setOption(int option){
        this.option = option;
    }
    public static String str;


    @Override
    public void start(Stage stage) throws Exception{
        if(option == 0){//only use for initial creation
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/EditInfo.fxml"));
            Scene scene = new Scene(loader.load());
            s.setScene(scene);
            s.setTitle("Edit Info");
            s.show();
        }else if(option == 1){//use when user selects apply
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/EditInfo.fxml"));
            loader.load();
            A = loader.getController();
            str = eventid.getText();
            //System.out.println(str);
            s.close();





        }else if(option == 2){//use when user selects close
            s.close();
        }






    }



}
