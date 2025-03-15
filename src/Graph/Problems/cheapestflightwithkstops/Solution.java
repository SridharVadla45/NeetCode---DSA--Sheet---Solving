package src.Graph.Problems.cheapestflightwithkstops;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {


    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        int[] distance = new int[n];
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
            distance[i] = (int) 1e9;
        }

        for (int[] trip : flights) {
            graph.get(trip[0]).add(new int[]{trip[1], trip[2]});
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, src, 0});
        distance[src] = 0;

        while (!queue.isEmpty()) {
            int[] trip = queue.poll();
            int steps = trip[0];
            int srcPrice = trip[2];
            if (steps > k) continue;
            for (int[] edge : graph.get(trip[1])) {
                int dest = edge[0];
                int price = edge[1];
                if (srcPrice + price < distance[dest] && steps <= k) {
                    queue.add(new int[]{steps + 1, dest, srcPrice + price});
                    distance[dest] = srcPrice + price;

                }

            }
        }

        if (distance[dst] != 1e9) return distance[dst];
        return -1;

    }
}
