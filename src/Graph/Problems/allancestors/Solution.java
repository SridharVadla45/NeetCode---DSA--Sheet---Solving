package src.Graph.Problems.allancestors;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        int [][] edges = {{0,3},{0,4},{1,3},{2,4},{2,7},{3,5},{3,6},{3,7},{4,6}};
        getAncestors(8,edges);
    }

    static List<List<Integer>> ans = new ArrayList<>();

    public static  List<List<Integer>> getAncestors(int n, int[][] edges) {


        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
            ans.add(new ArrayList<>());
        }

        for(int [] edge :edges){
            graph.get(edge[0]).add(edge[1]);
        }

        for(int i=0;i<n;i++){
            dfs(graph,i,i);
        }

        return ans;
    }

    private static void dfs(ArrayList<ArrayList<Integer>> graph, int i,int source) {

        for (int neighbour : graph.get(i)) {
                if(ans.get(neighbour).isEmpty() ){
                    ans.get(neighbour).add(source);
                }else{
                    if(ans.get(neighbour).getLast()!=source){

                    }
                }
                dfs(graph, neighbour,source);

        }

    }
}
