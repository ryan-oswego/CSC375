package com.rmarchew;

public class Station {

    public enum Type { SQUARE, CIRCLE, TRIANGLE, DIAMOND }

    private final Type type;
    private final int x;
    private final int y;
    // store color as RGB components (0-255)
    private final int r;
    private final int g;
    private final int b;

    public Station(Type type, int x, int y, int r, int g, int b) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public Type getType() { return type; }
    public int getX() { return x; }
    public int getY() { return y; }
    public int getR() { return r; }
    public int getG() { return g; }
    public int getB() { return b; }
    
}