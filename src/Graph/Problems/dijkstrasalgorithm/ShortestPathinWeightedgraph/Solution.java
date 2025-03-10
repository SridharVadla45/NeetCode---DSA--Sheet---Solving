package src.Graph.Problems.dijkstrasalgorithm.ShortestPathinWeightedgraph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class Solution {
    public List<Integer> shortestPath(int n, int m, int edges[][]) {
        //  Code Here.
        //construct graph
        ArrayList<ArrayList<int []>> graph = new ArrayList<>();
        int [] dist = new int[n];
        for(int i=0;i<n;i++){

            graph.add(new ArrayList<>());
            dist[i]= (int) 1e9;
        }
        for(int [] edge : edges){
            int a = edge[0];
            int b = edge[1];
            int w = edge[2];
            graph.get(a-1).add(new int []{b-1,w});
            graph.get(b-1).add(new int []{a-1,w});
        }

        dist[0]=0;
        int [] parent = new int[n];
        PriorityQueue<int []> priorityQueue = new PriorityQueue<>((o1, o2) -> o1[2]-o2[2]);
        priorityQueue.add(new int []{0,0});
        while(!priorityQueue.isEmpty()){
            int [] current = priorityQueue.poll();
            int node = current[0];
            int distance= current[1];
            for(int [] neigh : graph.get(node)){
                if(distance+neigh[1]< dist[neigh[0]]){
                    dist[neigh[0]]=distance+neigh[1];
                    priorityQueue.add(new int[]{neigh[0],dist[neigh[0]]});
                    parent[neigh[0]]=node;
                }
            }
        }
        List<Integer> ans = new ArrayList<>();

        if(dist[n-1]!=1e9) {
            ans.add(-1) ;
            return ans;
        }

        int temp = n-1;
        Stack<Integer> stack = new Stack<>();
        while(temp!=0){
            stack.add(temp);
            temp= parent[temp];
        }
        ans.add(dist[n-1]);
        ans.add(1);
        while(!stack.isEmpty()){
            ans.add(stack.pop()+1);
        }


        return ans;

    }


}
