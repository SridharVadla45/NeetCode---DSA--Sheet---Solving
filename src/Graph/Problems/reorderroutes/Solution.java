package src.Graph.Problems.reorderroutes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int minReorder(int n, int[][] connections) {
        int count =0;
        boolean [] isVisited = new boolean[n];

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int [] edge :connections) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[2]);
        }
        HashSet<String> set = new HashSet<>();
        for(int [] edge :connections){
            set.add(edge[0]+""+edge[1]);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        isVisited[0]=true;

        while (!queue.isEmpty()){
            int current =queue.poll();
            for(int neighbour : graph.get(current)){
                if(!isVisited[neighbour]){
                    queue.add(neighbour);
                    isVisited[neighbour]=true;
                    if(!set.contains(neighbour+""+current))count++;

                }
            }
        }

    return count;
    }


}
