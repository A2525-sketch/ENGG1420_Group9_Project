package com.example.engg1420.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EventManagerApp extends Application {
    private int opt;
    //public static EventManagerController EMC;
    public String str;

    public static Stage s = new Stage();
    public void setOpt(int opt, int sel){
        this.opt = opt;
    }

    //FXMLLoader loader0
    public void initialize(){
        //EMC.eventid1.setText("");
        //EMC.eventid2.setText("");
    }

    EventManagerUserInput User;

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
                s.setScene(scene);
                s.setTitle("Info");
                s.show();
            }else if(opt == 2){//open Edit info window for event 1
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/EM_goEditInfoE1.fxml"));
                Scene scene = new Scene(loader.load());
                User = loader.getController();
                EventManagerController logic = new EventManagerController(User);

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
                System.out.println(" ");
            }

    }

    public int getOpt(){
        return opt;
    }


    public static void main(String[] args) {
        launch();
    }
}
