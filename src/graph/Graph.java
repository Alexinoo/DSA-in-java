package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    // creates {}
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();


    // Adds A=[] to {} -- {A=[]}
    public boolean addVertex(String vertex){
        if(adjList.get(vertex) == null){
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    // Creates {A=[B], B=[A]}
    public boolean addEdge(String vertex1 , String vertex2){
       if( adjList.get(vertex1) != null && adjList.get(vertex2) != null){
           adjList.get(vertex1).add(vertex2);
           adjList.get(vertex2).add(vertex1);
           return true;
       }
       return false;
    }

    public boolean removeEdge(String vertex1 , String vertex2){
        if( adjList.get(vertex1) != null && adjList.get(vertex2) != null){
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex){
       if(adjList.get(vertex) == null) return false;   // return false if Vertex not found
        for (String otherVertex: adjList.get(vertex) ) { // loop through each connected edge and remove the vertex
            adjList.get(otherVertex).remove(vertex);
        }
        adjList.remove(vertex); // remove the main vertex
        return true;
    }

    //Prints {A=[]}

    public void printGraph(){
        System.out.println(adjList);
    }
}
