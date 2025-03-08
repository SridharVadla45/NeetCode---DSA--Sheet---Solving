package src.Graph.Problems.minimumheighttree;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        //construct  graph from edges undirected
        for(int [] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        List<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            result.add(height(i,graph));
        }






        return result;

    }

    private int height(int source, ArrayList<ArrayList<Integer>> graph ){
         for(int neighbour :graph.get(source)){
             height(neighbour,graph);
         }
         return 0;
    }

}
