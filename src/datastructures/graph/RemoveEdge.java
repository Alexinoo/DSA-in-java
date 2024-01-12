package datastructures.graph;

public class RemoveEdge {
    public static void main(String[] args){
        Graph myGraph = new Graph();

        //Add Vertex {A=[], B=[], C=[]}
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.printGraph();

        //Add Edges {A=[B, C], B=[A, C], C=[A, B]}
        myGraph.addEdge("A","B");
        myGraph.addEdge("A","C");
        myGraph.addEdge("B","C");
        myGraph.printGraph();

        //Remove Edge Between A and B vertices {A=[C], B=[C], C=[A, B]}
        myGraph.removeEdge("A","B");
        myGraph.printGraph();




    }
}
