package src.Graph.Traversal.BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {


    private void bfs(ArrayList<ArrayList<Integer>> graph ,boolean  [] isVisited,int startNode  ) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        isVisited[startNode]=true;
        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            System.out.print(currentNode +" ");
            for(Integer i:graph.get(currentNode)){
                if(!isVisited[i]){
                    isVisited[i]=true;
                    queue.add(i);
                }
            }
        }
    }
}
