package com.example.engg1420.ui;

import com.example.engg1420.model.EventType;
import com.example.engg1420.model.User;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TextInputDialog;

import java.util.List;

public class UserManagementController{
@FXML
    public ListView userlist;

    private ObservableList<String> usersObservableList;

    @FXML
    public void initialize() {
        // Initialize the list
        usersObservableList = FXCollections.observableArrayList();
        userlist.setItems(usersObservableList);
        //create array and print in console for debug
        try {
            CSVReaderSimpleUser reader = new CSVReaderSimpleUser();
            List<User> users = reader.readfile();

            for (User u : users) {
                System.out.println(u); // uses toString()
                usersObservableList.add(u.toString()); //add to list
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Call this method to populate the list after reading CSV
    public void addUsersToList(List<User> users) {
        for (User user : users) {
            usersObservableList.add(user.getName());
        }
    }

    public void addUser(User user) {
        if (user != null) {
            usersObservableList.add(
                    user.getId() + " | " + user.getName() + " | " + user.getEmail() + " | " + user.getUserType()
            );
        }
    }
    // Button handler for adding a user interactively
    @FXML
    private void handleAddUser() {
        // Ask for all 4 fields
        TextInputDialog idDialog = new TextInputDialog();
        idDialog.setTitle("Add User");
        idDialog.setHeaderText("Enter user ID:");
        idDialog.setContentText("ID:");
        String id = idDialog.showAndWait().orElse(null);
        if (id == null || id.isEmpty()) return;

        TextInputDialog nameDialog = new TextInputDialog();
        nameDialog.setTitle("Add User");
        nameDialog.setHeaderText("Enter user Name:");
        nameDialog.setContentText("Name:");
        String name = nameDialog.showAndWait().orElse(null);
        if (name == null || name.isEmpty()) return;

        TextInputDialog emailDialog = new TextInputDialog();
        emailDialog.setTitle("Add User");
        emailDialog.setHeaderText("Enter user Email:");
        emailDialog.setContentText("Email:");
        String email = emailDialog.showAndWait().orElse(null);
        if (email == null || email.isEmpty()) return;

        TextInputDialog typeDialog = new TextInputDialog();
        typeDialog.setTitle("Add User");
        typeDialog.setHeaderText("Enter user Type:");
        typeDialog.setContentText("Type:");
        String type = typeDialog.showAndWait().orElse(null);
        if (type == null || type.isEmpty()) return;

        // Create the full User object
        User newUser = new User(id, name, email, type);

        // Add to ObservableList so it shows in ListView
        addUser(newUser);
    }
}