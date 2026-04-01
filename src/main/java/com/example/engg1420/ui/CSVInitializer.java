package com.example.engg1420.ui;

import com.example.engg1420.model.User;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVInitializer { // fixed name

    private static final String FOLDER_NAME = "data";
    private static final String FILE_NAME = "users.csv";

    public static void initializeUsers() {
        File projectRoot = new File(System.getProperty("user.dir"));
        File folder = new File(projectRoot, FOLDER_NAME);
        if (!folder.exists()) folder.mkdirs();

        File file = new File(folder, FILE_NAME);

        // Only populate if file doesn't exist
        if (file.exists()) return;

        List<User> initialUsers = new ArrayList<>();
        initialUsers.add(new User("U001","Alice Smith","alice.smith@uoguelph.ca","Student"));
        initialUsers.add(new User("U002","Bob Chen","bob.chen@uoguelph.ca","Student"));
        initialUsers.add(new User("U003","Clara Diaz","clara.diaz@uoguelph.ca","Student"));
        initialUsers.add(new User("U004","Daniel Kim","daniel.kim@uoguelph.ca","Student"));
        initialUsers.add(new User("U005","Ella Brown","ella.brown@uoguelph.ca","Student"));
        initialUsers.add(new User("U006","Farhad Rahimi","farhad.rahimi@uoguelph.ca","Student"));
        initialUsers.add(new User("U007","Grace Wilson","grace.wilson@uoguelph.ca","Student"));
        initialUsers.add(new User("U008","Hassan Noor","hassan.noor@uoguelph.ca","Student"));
        initialUsers.add(new User("U009","Ivy Patel","ivy.patel@uoguelph.ca","Student"));
        initialUsers.add(new User("U010","Jason Li","jason.li@uoguelph.ca","Student"));
        initialUsers.add(new User("U011","Karen Taylor","karen.taylor@uoguelph.ca","Staff"));
        initialUsers.add(new User("U012","Leo Martin","leo.martin@uoguelph.ca","Staff"));
        initialUsers.add(new User("U013","Mina Zarei","mina.zarei@uoguelph.ca","Staff"));
        initialUsers.add(new User("U014","Nora Hughes","nora.hughes@uoguelph.ca","Staff"));
        initialUsers.add(new User("U015","Omid Karimi","omid.karimi@uoguelph.ca","Staff"));
        initialUsers.add(new User("U016","Priya Nair","priya.nair@uoguelph.ca","Staff"));
        initialUsers.add(new User("U017","Quinn Adams","quinn.adams@gmail.com","Guest"));
        initialUsers.add(new User("U018","Rosa Evans","rosa.evans@gmail.com","Guest"));
        initialUsers.add(new User("U019","Sam Foster","sam.foster@gmail.com","Guest"));
        initialUsers.add(new User("U020","Tina Green","tina.green@gmail.com","Guest"));
        initialUsers.add(new User("U021","Uma Roy","uma.roy@uoguelph.ca","Student"));
        initialUsers.add(new User("U022","Victor Scott","victor.scott@uoguelph.ca","Student"));
        initialUsers.add(new User("U023","Wendy Zhao","wendy.zhao@uoguelph.ca","Staff"));
        initialUsers.add(new User("U024","Yara Mohammadi","yara.mohammadi@gmail.com","Guest"));

        try (FileWriter writer = new FileWriter(file)) {
            // write header
            writer.write("ID,Name,Email,UserType\n");

            for (User u : initialUsers) {
                writer.write(u.getId() + "," + u.getName() + "," + u.getEmail() + "," + u.getUserType() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Initial users populated to: " + file.getAbsolutePath());
    }
}