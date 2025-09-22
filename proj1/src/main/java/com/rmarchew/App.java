package com.rmarchew;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("CSC375 Project");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
