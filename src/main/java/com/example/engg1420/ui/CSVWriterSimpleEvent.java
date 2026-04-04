package com.example.engg1420.ui;

import com.example.engg1420.model.EventType;
import com.example.engg1420.model.User;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static com.example.engg1420.ui.EventManagerController.EMA;

public class CSVWriterSimpleEvent {
    private static final String FILE_PATH = "src/main/resources/Final Project Files/events.csv";

    public void addEvent() throws Exception {

        CSVReader reader = new CSVReader(new FileReader("src/main/resources/Final Project Files/events.csv"));
        List<String[]> strList = reader.readAll();
        reader.close();
        CSVWriter writer = new CSVWriter(new FileWriter(FILE_PATH, true),CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.DEFAULT_QUOTE_CHARACTER,
                CSVWriter.NO_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END);

        if(Arrays.equals(strList.getLast(), new String[]{""})){
            writer.writeNext(new String[]{"","","","","0","","","","",""});

        }else{
            writer.writeNext(new String[]{});
            writer.writeNext(new String[]{"","","","","0","","","","",""});
        }


        writer.close();



    }

    public void modifyEvent(String change, int index, int rowCount)throws Exception{
        CSVReader reader = new CSVReader(new FileReader("src/main/resources/Final Project Files/events.csv"));
        List<String[]> strList = reader.readAll();
        reader.close();
        CSVWriter writer = new CSVWriter(new FileWriter("src/main/resources/Final Project Files/events.csv", false));


        for(int i = 0; i < rowCount; i++){

            if(i == index){
                writer.writeNext(change.split(",", -1));

            }else{

                writer.writeNext(strList.get(i));

            }
        }


        writer.close();


    }
}
