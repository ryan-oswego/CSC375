package com.rmarchew;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public final class StationView {

    private StationView() {}

    // minimal, static factory for station shapes
    public static Node create(Station.Type type, double size, String colorHex) {
        double s = Math.max(4, size);
        Color fill = Color.web(colorHex != null && !colorHex.isEmpty() ? colorHex : "#FF0000");
        Color stroke = Color.BLACK;
        switch (type) {
            case SQUARE: {
                Rectangle r = new Rectangle(s, s);
                r.setFill(fill);
                r.setStroke(stroke);
                r.setStrokeWidth(1);
                return r;
            }
            case CIRCLE: {
                Circle c = new Circle(s / 2.0);
                c.setFill(fill);
                c.setStroke(stroke);
                c.setStrokeWidth(1);
                return c;
            }
            case TRIANGLE: {
                Polygon p = new Polygon();
                p.getPoints().addAll(0.0, s, s/2.0, 0.0, s, s);
                p.setFill(fill);
                p.setStroke(stroke);
                p.setStrokeWidth(1);
                return p;
            }
            case DIAMOND: {
                Polygon d = new Polygon();
                d.getPoints().addAll(s/2.0, 0.0, s, s/2.0, s/2.0, s, 0.0, s/2.0);
                d.setFill(fill);
                d.setStroke(stroke);
                d.setStrokeWidth(1);
                return d;
            }
            default:
                return null;
        }
    }
}
