package com.rmarchew;

import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.List;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        GridPane grid = new GridPane();

        int size = 10;         // grid dimension (10x10)
        int cellSize = 64;     // pixels per cell

        // build size x size grid of cells 
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

        // test stations for affinity debug
        List<Station> low = TestStations.lowAffinity();
        List<Station> med = TestStations.medAffinity();
        List<Station> high = TestStations.highAffinity();
        System.out.println("low test  = " + AffinityCalculator.computeAffinity(low));
        System.out.println("med test  = " + AffinityCalculator.computeAffinity(med));
        System.out.println("high test = " + AffinityCalculator.computeAffinity(high));

        // display stations
        int stationCount = 50;
        //for (Station s : TestStations.lowAffinity()) {
        //for (Station s : TestStations.medAffinity()) {
        //for (Station s : TestStations.highAffinity()) {
        for (Station s : StationsInitializer.generateStations(stationCount, size)) {
            StackPane target = cells[s.getY()][s.getX()];
            target.getChildren().add(StationView.create(s.getType(), Math.min(cellSize, cellSize), s.getR(), s.getG(), s.getB()));
        }

        root.setCenter(grid);

        Scene scene = new Scene(root, 700, 700);
    
        primaryStage.setTitle("app");
        primaryStage.setScene(scene);
        primaryStage.show();

        
    }

}
