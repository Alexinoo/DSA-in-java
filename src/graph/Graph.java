package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    // creates {}
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();


    // Adds A=[] to {}
    public boolean addVertex(String vertex){
        if(adjList.get(vertex) == null){
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    //Prints {A=[]}

    public void printGraph(){
        System.out.println(adjList);
    }
}
