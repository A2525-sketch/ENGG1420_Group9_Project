package com.example.engg1420.ui;//under this folder

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.stage.Stage;












public class EventManagerController {
    public static EventManagerApp EMA;
    public static EditInfoController EIC = new EditInfoController();
    public static ShowInfoController SIC = new ShowInfoController();
    public CSVReaderSimpleEvent CsvEventTest= new CSVReaderSimpleEvent();
    public FXMLLoader loader1;
    public FXMLLoader loader2;
    public int index;







    public Stage s = new Stage();
    @FXML
    public Label EMCLabel;
    @FXML
    public Button ShowInfoButton;
    @FXML
    public Button EditInfoButton;
    @FXML
    public Button CancelEventButton;





    //public static



    //public static FXMLLoader loader;
    @FXML//allows fxml file to reference this method
    public void goEditInfo()throws Exception{
        EMA.setIndex(index);

        loader2 = new FXMLLoader(getClass().getResource("/EditInfo.fxml"));
        Parent root = loader2.load();
        EIC = loader2.getController();
        EIC.setLoader(loader2);
        Scene scene = new Scene(root);
        s.setScene(scene);
        EIC.setStage(s);
        s.show();
    }

    @FXML
    public void goShowInfo()throws Exception{
        EMA.Index = index;

        loader1 = new FXMLLoader(getClass().getResource("/ShowInfo.fxml"));
        Parent root = loader1.load();
        SIC = loader1.getController();

        SIC.setEventIdText(CsvEventTest.getInfo(EMA.Index, 0));
        SIC.setTitle(CsvEventTest.getInfo(EMA.Index, 1));
        SIC.setDate(CsvEventTest.getInfo(EMA.Index, 2));
        SIC.setLocation(CsvEventTest.getInfo(EMA.Index, 3));
        SIC.setCapacity(CsvEventTest.getInfo(EMA.Index, 4));
        SIC.setEventType(CsvEventTest.getInfo(EMA.Index, 5));

        SIC = loader1.getController();
        Scene scene = new Scene(root);
        SIC.setStage(s);
        s.setScene(scene);
        s.show();
    }

    public void setIndex(int i){
        index = i;
    }


    public void goCancel(){

    }

    public void setEMA(EventManagerApp E){
        EMA = E;
    }


}
