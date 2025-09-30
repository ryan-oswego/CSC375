package com.rmarchew;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public final class StationView {

    private StationView() {}

    // creates nodes for the stations 
    public static Node create(Station.Type type, double size, int r, int g, int b) {
        double s = Math.max(4, size);
        Color fill = Color.rgb(r, g, b);
        Color stroke = Color.BLACK;
        switch (type) {
            case SQUARE: {
                Rectangle rectangle = new Rectangle(s, s);
                rectangle.setFill(fill);
                rectangle.setStroke(stroke);
                rectangle.setStrokeWidth(1);
                return rectangle;
            }
            case CIRCLE: {
                Circle circle = new Circle(s / 2.0);
                circle.setFill(fill);
                circle.setStroke(stroke);
                circle.setStrokeWidth(1);
                return circle;
            }
            case TRIANGLE: {
                Polygon triangle = new Polygon();
                triangle.getPoints().addAll(0.0, s, s/2.0, 0.0, s, s);
                triangle.setFill(fill);
                triangle.setStroke(stroke);
                triangle.setStrokeWidth(1);
                return triangle;
            }
            case DIAMOND: {
                Polygon diamond = new Polygon();
                diamond.getPoints().addAll(s/2.0, 0.0, s, s/2.0, s/2.0, s, 0.0, s/2.0);
                diamond.setFill(fill);
                diamond.setStroke(stroke);
                diamond.setStrokeWidth(1);
                return diamond;
            }
            default:
                return null;
        }
    }

}
