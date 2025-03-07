package src.Graph.Problems.courseschedule;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

      // create a adjacency list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int [] a:prerequisites){
            graph.get(a[1]).add(a[0]);
        }

        int [] indegree = new int[numCourses];

        for(int i=0;i<numCourses;i++){
            for(int j:graph.get(i)){
                indegree[j]+=1;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0) queue.add(i);
        }

        int [] toposort = new int[numCourses];
        int index=0;
        while(!queue.isEmpty()){
            int temp = queue.poll();
            toposort[index++]=(temp);
            for(int i:graph.get(temp)){
                indegree[i]--;
                if(indegree[i]==0)queue.add(i);
            }
        }
        if(index==numCourses) return toposort;

        return new int[]{};


    }
}
