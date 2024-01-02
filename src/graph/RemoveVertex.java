package graph;

public class RemoveVertex {
    public static void main(String[] args){
        Graph myGraph = new Graph();

        //  Add vertices {A=[], B=[], C=[], D=[]}
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");
        myGraph.printGraph();

        //  Add edges {A=[B, C, D], B=[A, D], C=[A, D], D=[A, B, C]}
        myGraph.addEdge("A","B");
        myGraph.addEdge("A","C");
        myGraph.addEdge("A","D");
        myGraph.addEdge("B","D");
        myGraph.addEdge("C","D");
        myGraph.printGraph();


        // Remove Vertex D {A=[B, C], B=[A], C=[A]}
        myGraph.removeVertex("D");
        myGraph.printGraph();


    }
}
