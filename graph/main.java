package graph;

public class main {
    public static void main (String[] args) {
        graph myGraph = new graph();
        // myGraph.addVertex("A");
        // myGraph.printGraph();
        // // myGraph.addVertex("B");
        // myGraph.addEdge("A","B");
        // myGraph.printGraph();
        System.out.println("Remove vertes");
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addEdge("A","B");
        myGraph.addEdge("A","C");
        myGraph.addEdge("B","C");
        myGraph.printGraph();
        myGraph.removeEdge("A", "B");
        myGraph.printGraph();
        myGraph.removeVertex("A");
        myGraph.printGraph();

    }
}
