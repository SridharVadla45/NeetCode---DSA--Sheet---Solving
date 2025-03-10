package src.Graph.Problems.dijkstrasalgorithm.usingminheap;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Solution {

    static class iPair {
        int first, second;

        iPair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    // Function to find the shortest distance of all the vertices
    // from the source vertex src.
    ArrayList<Integer> dijkstra(ArrayList<ArrayList<iPair>> adj, int src) {
        // Write your code here
        int n = adj.size();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0;i<n;i++){
            if(i==src)ans.add(0) ;
            else ans.add((int) 1e9);
        }

        PriorityQueue<iPair> pq = new PriorityQueue<>((o1, o2) -> o1.first-o2.first );
        pq.add(new iPair(0,src));
        while(!pq.isEmpty()){
            iPair pair = pq.poll();
            int dist = pair.first;
            int node =pair.second;
            for(iPair neighbour: adj.get(node)){
                if(dist+neighbour.second < ans.get(neighbour.first)){
                    ans.set(neighbour.first,dist+neighbour.second);
                    pq.add(new iPair(dist+neighbour.second,neighbour.first));
                }
            }
        }

        return ans;
    }
}