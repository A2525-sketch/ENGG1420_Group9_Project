package com.example.engg1420.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static com.example.engg1420.ui.EditInfoApp.str;
import static com.example.engg1420.ui.ShowInfoController.eventid2;

public class ShowInfoApp extends Application {
    public EditInfoApp EIA = new EditInfoApp();
    public ShowInfoController SIC = new ShowInfoController();
    private int option;


    public void setOption(int option){
        this.option = option;
    }

    static Stage s = new Stage();
    public void start(Stage stage)throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ShowInfo.fxml"));//references the main fxml
        Scene scene = new Scene(loader.load());
        eventid2.setText(str);
        s.setScene(scene);
        s.setTitle("Info");
        s.show();

    }

    public void closeWindow(){
        s.close();
    }




}
