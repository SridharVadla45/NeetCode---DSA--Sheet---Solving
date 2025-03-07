package src.Graph.Problems.completeconnectedcomponents;
import java.util.ArrayList;


class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        int [] count ={0,0};
        int ans=0;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int [] edge :edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean [] isVisited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!isVisited[i]){
                count[0]=0;
                count[1]=0;
                dfs(graph,i,isVisited,graph.get(i).size(),count);
                if(count[0]==0 && graph.get(i).size()==count[1]-1) ans++;
            }
        }

        return ans;
    }

    private void dfs(ArrayList<ArrayList<Integer>> graph, int current, boolean[] isVisited, int size, int[] count) {
        isVisited[current]=true;
        count[1]+=1;
        if(graph.get(current).size()!=size) count[0]=1;
        for(int i : graph.get(current)){
            if(!isVisited[i]){
                dfs(graph,i,isVisited,size, count);
            }
        }
    }
}