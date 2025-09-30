package com.rmarchew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class StationsInitializer {

    private StationsInitializer() {}
    private static final Random RNG = new Random();

    // helper method to generate random station type
    private static Station.Type randomType() {
        Station.Type[] values = Station.Type.values();
        return values[RNG.nextInt(values.length)];
    }

    // helper method to generate random RGB components
    private static int[] randomRGB() {
        int r = RNG.nextInt(256);
        int g = RNG.nextInt(256);
        int b = RNG.nextInt(256);
        return new int[]{r, g, b};
    }

    // generate n stations onto grid
    public static List<Station> generateStations(int stationCount, int gridSize) {
        int min = 48, max = 64;
        stationCount = Math.max(min, Math.min(max, stationCount));

        List<Station> list = new ArrayList<>(stationCount);
        List<Integer> positions = new ArrayList<>(gridSize * gridSize);

        // fill the positions list with all possible positions
        for (int y = 0; y < gridSize; y++) {
            for (int x = 0; x < gridSize; x++) {
                positions.add(y * gridSize + x);
            }
        }
        // shuffle the position order
        Collections.shuffle(positions, RNG);

        for (int i = 0; i < stationCount && i < positions.size(); i++) {
            int pos = positions.get(i);
            int x = pos % gridSize;
            int y = pos / gridSize;
            Station.Type t = randomType();
            int[] rgb = randomRGB();
            list.add(new Station(i, t, x, y, rgb[0], rgb[1], rgb[2]));
        }

        return list;
    }

}
