package com.rmarchew;

import java.util.ArrayList;
import java.util.List;

public final class TestStations {

    private TestStations() {}

    public static List<Station> lowAffinity() {
        List<Station> out = new ArrayList<>();
        out.add(new Station(Station.Type.CIRCLE, 0, 0, 10, 20, 200));
        out.add(new Station(Station.Type.SQUARE, 9, 9, 200, 10, 20));
        out.add(new Station(Station.Type.TRIANGLE, 4, 2, 100, 150, 30));
        out.add(new Station(Station.Type.DIAMOND, 7, 1, 60, 120, 200));
        out.add(new Station(Station.Type.CIRCLE, 2, 8, 120, 10, 130));
        out.add(new Station(Station.Type.SQUARE, 5, 5, 200, 200, 50));
        out.add(new Station(Station.Type.TRIANGLE, 1, 6, 25, 200, 80));
        out.add(new Station(Station.Type.DIAMOND, 8, 3, 10, 180, 180));
        out.add(new Station(Station.Type.CIRCLE, 3, 4, 90, 40, 170));
        out.add(new Station(Station.Type.SQUARE, 6, 7, 220, 70, 40));
        out.add(new Station(Station.Type.TRIANGLE, 0, 9, 15, 90, 200));
        out.add(new Station(Station.Type.DIAMOND, 9, 0, 200, 200, 200));
        return out;
    }

    public static List<Station> medAffinity() {
        List<Station> out = new ArrayList<>();
        out.add(new Station(Station.Type.CIRCLE, 1, 1, 20, 30, 220));
        out.add(new Station(Station.Type.CIRCLE, 2, 1, 25, 35, 215));
        out.add(new Station(Station.Type.CIRCLE, 1, 2, 18, 28, 225));
        out.add(new Station(Station.Type.CIRCLE, 2, 2, 22, 32, 218));
        out.add(new Station(Station.Type.CIRCLE, 5, 2, 18, 28, 225));
        out.add(new Station(Station.Type.CIRCLE, 6, 2, 22, 32, 218));
        out.add(new Station(Station.Type.SQUARE, 6, 6, 210, 40, 40));
        out.add(new Station(Station.Type.SQUARE, 7, 6, 200, 50, 45));
        out.add(new Station(Station.Type.SQUARE, 6, 7, 220, 35, 35));
        out.add(new Station(Station.Type.SQUARE, 7, 7, 205, 45, 50));
        out.add(new Station(Station.Type.TRIANGLE, 4, 4, 100, 180, 40));
        out.add(new Station(Station.Type.DIAMOND, 3, 8, 60, 120, 200));
        return out;
    }

    public static List<Station> highAffinity() {
        List<Station> out = new ArrayList<>();
    out.add(new Station(Station.Type.CIRCLE, 2, 2, 24, 34, 220));
    out.add(new Station(Station.Type.CIRCLE, 3, 2, 26, 34, 220));
    out.add(new Station(Station.Type.CIRCLE, 4, 2, 28, 34, 220));
    out.add(new Station(Station.Type.CIRCLE, 2, 3, 24, 36, 220));
    out.add(new Station(Station.Type.CIRCLE, 3, 3, 26, 36, 220));
    out.add(new Station(Station.Type.CIRCLE, 4, 3, 28, 36, 220));
    out.add(new Station(Station.Type.SQUARE, 6, 2, 220, 46, 42));
    out.add(new Station(Station.Type.SQUARE, 7, 2, 220, 47, 42));
    out.add(new Station(Station.Type.SQUARE, 8, 2, 220, 48, 42));
    out.add(new Station(Station.Type.SQUARE, 6, 3, 220, 46, 43));
    out.add(new Station(Station.Type.SQUARE, 7, 3, 220, 47, 43));
    out.add(new Station(Station.Type.TRIANGLE, 5, 7, 120, 200, 60));
    out.add(new Station(Station.Type.TRIANGLE, 5, 8, 118, 198, 62));
    out.add(new Station(Station.Type.TRIANGLE, 6, 7, 122, 202, 58));
        return out;
    }

}
