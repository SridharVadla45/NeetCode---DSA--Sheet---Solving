package src.Graph.Traversal.AllPathsFromSourceToTarget;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ArrayList<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        dfs(temp, 0, ans, graph);
        return ans;
    }

    private void dfs(ArrayList<Integer> temp, int i, List<List<Integer>> ans, int[][] graph) {
        temp.add(i);
        if (i == graph.length - 1) ans.add(new ArrayList<>(temp));
        for (int element : graph[i]) {
            dfs(temp, element, ans, graph);
        }
        temp.removeLast();
    }

}
