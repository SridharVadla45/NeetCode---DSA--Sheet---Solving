package src.Graph.Problems.keyandrooms;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        boolean [] isVisited = new boolean [rooms.size()];
        Queue<Integer> queue = new LinkedList<>();
         queue.add(0);
         isVisited[0]=true;


        while(!queue.isEmpty()){
            int room =queue.poll();
            isVisited[room]=true;
            for(int key : rooms.get(room)){
                if(!isVisited[key]) queue.add(key);
            }
        }
        for(boolean b:isVisited){
            if (!b) return false;
        }
        return true;
    }
}
