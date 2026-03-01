package com.example.engg1420.ui;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    private int c = 0;
    private String r;
    public void setC(int c){
        this.c = c;
    }
    public int getC(){
        return c;
    }
@Override
    public void start(Stage stage) throws Exception {
        if(c == 0){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/main.fxml"));
            Scene scene = new Scene(loader.load());

            stage.setScene(scene);
            stage.setTitle("Booking System Phase One");
            stage.show();
        }

}



public static void main(String[] args){
        /*if(c == 1){
            launch();
        }else{
            System.out.println("test");
        }*/
        launch();
    }
}
