package com.rmarchew;

import java.util.List;

public final class AffinityCalculator {

    private AffinityCalculator() {}

    // compute total affinity for list of stations
    public static double computeAffinity(List<Station> stations) {
        double total = 0.0;
        int n = stations.size();
        for (int i = 0; i < n; i++) {
            Station a = stations.get(i);
            for (int j = i + 1; j < n; j++) {
                Station b = stations.get(j);
                if (a.getType() == b.getType()) {
                    double dx = a.getX() - b.getX();
                    double dy = a.getY() - b.getY();
                    double dist = Math.sqrt(dx * dx + dy * dy);
                    total += 1.0 / (1.0 + dist);
                }
            }
        }
        return total;
    }    

}










