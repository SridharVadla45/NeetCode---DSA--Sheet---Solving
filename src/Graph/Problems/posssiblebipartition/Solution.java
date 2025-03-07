package src.Graph.Problems.posssiblebipartition;

import java.util.ArrayList;

public class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
          ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
          for(int i=0;i<n;i++){
              graph.add(new ArrayList<>());
          }

          for(int [] edge :dislikes){
              graph.get(edge[0]).add(edge[1]);
              graph.get(edge[1]).add(edge[0]);
          }

          boolean [] isVisited=new boolean[n];
          int [] color =new int[n];
        return dfs(graph, 0, isVisited, color,-1);
    }

    private boolean dfs(ArrayList<ArrayList<Integer>> graph, int i, boolean[] isVisited, int[] color,int mark) {
        isVisited[i]=true;
        color[i]=mark;
        for(int neighbour:graph.get(i)){
            if(!isVisited[neighbour]){
               if( !dfs(graph, i, isVisited, color, -1*mark)) return false;
            }else{
                if(color[neighbour]==(-1*mark)) return false;
            }
        }
        return true;
    }

}
