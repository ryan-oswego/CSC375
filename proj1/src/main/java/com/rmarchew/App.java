package com.rmarchew;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        GridPane grid = new GridPane();

        int size = 10;         // grid dimension (10x10)
        int cellSize = 50;     // pixels per cell

        // build a simple size x size grid of cells and keep references
        StackPane[][] cells = new StackPane[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                StackPane cell = new StackPane();
                cell.setPrefSize(cellSize, cellSize);
                cell.setStyle("-fx-border-color: #505050ff;");
                grid.add(cell, col, row);
                cells[row][col] = cell;
            }
        }

        // initialize stations (kept separate from the model)
        int requestedN = 50; // example: change this to vary between 48 and 64
        for (Station s : StationsInitializer.generateStations(requestedN, size)) {
            if (s.getY() >= 0 && s.getY() < size && s.getX() >= 0 && s.getX() < size) {
                StackPane target = cells[s.getY()][s.getX()];
                target.getChildren().add(StationView.create(s.getType(), Math.min(cellSize, cellSize), s.getColorHex()));
            }
        }

        root.setCenter(grid);

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("CSC375 Project - Grid");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
