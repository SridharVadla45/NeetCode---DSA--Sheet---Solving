package src.Graph.Representation;

import java.util.Arrays;

public class MatrixRepresentation {

    // Space Complexity : O(node length ) O(EdgeLength)

//    Graph with 4 nodes and 4 edges:
//    Nodes: ['1', '2', '3', '4']
//    Edges: [('1', '2'), ('2', '3'), ('3', '4'), ('4', '1')]
    public static void main(String[] args) {
        int node =4;
        int edge =4;
       createGraph(node,edge);
    }

    private static void createGraph(int node,int edge){
        int [][] graph =new int[node+1][edge+1];

        graph[1][2]=1;
        graph[2][1]=1;

        graph[2][3]=1;
        graph[3][2]=1;

        graph[3][4]=1;
        graph[4][3]=1;

        graph[4][1]=1;
        graph[1][4]=1;

        for(int [] i:graph){
            System.out.println(Arrays.toString(i));
        }

    }
}
