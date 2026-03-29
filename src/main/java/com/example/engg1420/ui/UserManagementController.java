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
    private TableView<User> tableView;

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
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
        idColumn.setCellValueFactory(new PropertyValueFactory<>("User ID"));
        userTypeColumn.setCellValueFactory(new PropertyValueFactory<>("User Type"));
        userNameColumn.setCellValueFactory(new PropertyValueFactory<>("User Name"));
        passwordColumn.setCellValueFactory(new PropertyValueFactory<>("Password"));
        eventsBookedColumn.setCellValueFactory(new PropertyValueFactory<>("Booked Event(s)"));

        ObservableList<User> data = FXCollections.observableArrayList(
                new User("123", "Alice") {
                    @Override
                    public String getUserType() {
                        return "Student";
                    }
                },
                new User("789", "Bob") {
                    @Override
                    public String getUserType() {
                        return "Guest";
                    }
                },
                new User("674", "Charlie") {
                    @Override
                    public String getUserType() {
                        return "Staff";
                    }
                }
        );
        tableView. setItems(data);
        }
}
