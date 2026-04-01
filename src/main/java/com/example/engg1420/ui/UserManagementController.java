package com.example.engg1420.ui;

import com.example.engg1420.model.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx. scene. control. TableColumn;
import javafx. scene. control. TableView;
import javafx. scene. control. cell. PropertyValueFactory;

public class UserManagementController {
    @FXML
    private TableView<User> tableView; //Generates Table in FXML File

    @FXML
    private TableColumn<User, String> nameColumn;

    @FXML
    private TableColumn<User, String> idColumn;

    @FXML
    private TableColumn<User, String> userTypeColumn;

    @FXML
    private TableColumn<User, String> userNameColumn;

    @FXML
    private TableColumn<User, String> passwordColumn;

    @FXML
    private TableColumn<User, String> eventsBookedColumn;

    @FXML
    public void initialize () {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("Name")); //Initializing Name Column
        idColumn.setCellValueFactory(new PropertyValueFactory<>("User ID")); //Initializing ID Column
        userTypeColumn.setCellValueFactory(new PropertyValueFactory<>("User Type")); //Initializing User Type Column
        userNameColumn.setCellValueFactory(new PropertyValueFactory<>("User Name")); //Initializing User Name Column
        passwordColumn.setCellValueFactory(new PropertyValueFactory<>("Password")); //Initializing Password Column
        eventsBookedColumn.setCellValueFactory(new PropertyValueFactory<>("Booked Event(s)")); //Initializing Booked Event(s) Column

        ObservableList<User> data = FXCollections.observableArrayList();
        tableView. setItems(data);
        }
}
