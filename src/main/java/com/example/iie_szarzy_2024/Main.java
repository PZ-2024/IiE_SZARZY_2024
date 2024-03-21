package com.example.iie_szarzy_2024;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login-view.fxml")));
        primaryStage.setTitle("Logowanie");
        primaryStage.setScene(new Scene(root, 1900, 1000));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
