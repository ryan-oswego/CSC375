package com.rmarchew;

import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        GridPane grid = new GridPane();

        int size = 10;         // grid dimension (10x10)
        int cellSize = 64;     // pixels per cell

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
        int stationCount = 50;
        for (Station s : StationsInitializer.generateStations(stationCount, size)) {
            if (s.getY() >= 0 && s.getY() < size && s.getX() >= 0 && s.getX() < size) {
                StackPane target = cells[s.getY()][s.getX()];
                target.getChildren().add(StationView.create(s.getType(), Math.min(cellSize, cellSize), s.getColorHex()));
            }
        }

        root.setCenter(grid);

        Scene scene = new Scene(root, 700, 700);

        primaryStage.setTitle("app");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
