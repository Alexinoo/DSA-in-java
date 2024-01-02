package graph;

public class AddEdge {
    public static void main(String[] args){
        Graph myGraph = new Graph();

        // Creates {A=[], B=[]}
         myGraph.addVertex("A");
         myGraph.addVertex("B");
         myGraph.printGraph();

        // Creates {A=[B], B=[A]}
        myGraph.addEdge("A","B");
        myGraph.printGraph();
    }
}
