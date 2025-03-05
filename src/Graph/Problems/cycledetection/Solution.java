package src.Graph.Problems.cycledetection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {

    }

    private static boolean isCyclic(ArrayList<ArrayList<Integer>> graph, boolean[] isVisted, int current) {

        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(current, -1));
        isVisted[current] = true;
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            for (Integer neighbour : graph.get(p.a)) {
                if (isVisted[neighbour] && neighbour != p.b) return true;
                else {
                    queue.add(new Pair(neighbour, p.a));
                }
            }
        }

        return false;
    }


    public static boolean isCylciDfs(ArrayList<ArrayList<Integer>> graph, int current, int parent, boolean[] isVisited) {
        isVisited[current] = true;
        for (Integer neighbour : graph.get(current)) {
            if (!isVisited[neighbour]) {

                if (isCylciDfs(graph, neighbour, current, isVisited)) return true;
            } else {
                if (parent != neighbour) return true;
            }
        }
        return false;
    }

    private static class Pair {
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
