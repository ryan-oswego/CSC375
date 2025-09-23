package com.rmarchew;

public class Station {

    public enum Type { SQUARE, CIRCLE, TRIANGLE, DIAMOND }

    private final Type type;
    private final int x;
    private final int y;
    // store color as hex (e.g. #RRGGBB) for easy JavaFX consumption
    private final String colorHex;

    public Station(Type type, int x, int y, String colorHex) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.colorHex = colorHex;
    }

    public Type getType() { return type; }
    public int getX() { return x; }
    public int getY() { return y; }
    public String getColorHex() { return colorHex; }

}