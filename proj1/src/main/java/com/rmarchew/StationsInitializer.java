package com.rmarchew;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public final class StationsInitializer {

    private StationsInitializer() {}
    private static final Random RNG = new Random();

    private static Station.Type randomType() {
        Station.Type[] values = Station.Type.values();
        return values[RNG.nextInt(values.length)];
    }

    private static String randomColorHex() {
        // generate bright-ish colors
        int r = RNG.nextInt(256);
        int g = RNG.nextInt(256);
        int b = RNG.nextInt(256);
        return String.format("#%02X%02X%02X", r, g, b);
    }

    /**
     * Generate N stations with unique positions inside a grid of given size.
     * N will be clamped to [48,64].
     */
    public static List<Station> generateStations(int requestedN, int gridSize) {
        int min = 48, max = 64;
        int N = Math.max(min, Math.min(max, requestedN));

        List<Station> list = new ArrayList<>(N);
        Set<Integer> used = new HashSet<>(); // encode position as y*gridSize + x

        while (list.size() < N) {
            int x = RNG.nextInt(gridSize);
            int y = RNG.nextInt(gridSize);
            int key = y * gridSize + x;
            if (used.contains(key)) continue;
            used.add(key);
            Station.Type t = randomType();
            String color = randomColorHex();
            list.add(new Station(t, x, y, color));
        }

        return list;
    }

    // keep a sample for backwards compatibility (small set)
    public static List<Station> sampleStations() {
        List<Station> list = new ArrayList<>();
        list.add(new Station(Station.Type.SQUARE, 2, 0, "#FF0000"));
        list.add(new Station(Station.Type.SQUARE, 3, 0, "#00FF00"));
        list.add(new Station(Station.Type.CIRCLE, 5, 2, "#0000FF"));
        list.add(new Station(Station.Type.CIRCLE, 2, 4, "#FF00FF"));
        list.add(new Station(Station.Type.TRIANGLE, 2, 7, "#00FFFF"));
        list.add(new Station(Station.Type.TRIANGLE, 4, 7, "#FFFF00"));
        list.add(new Station(Station.Type.DIAMOND, 6, 7, "#FF8800"));
        list.add(new Station(Station.Type.DIAMOND, 1, 8, "#8888FF"));
        list.add(new Station(Station.Type.SQUARE, 5, 8, "#88FF88"));
        list.add(new Station(Station.Type.CIRCLE, 9, 8, "#FF8888"));
        return list;
    }
}
