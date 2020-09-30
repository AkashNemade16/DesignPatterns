package Lab3;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
    private boolean directed;
    private HashMap<Node, LinkedList<Node>> adjacencyMap = new HashMap<>();

    public void addEdge(Node Source, Node destination){
        if(!adjacencyMap.containsKey(Source)){
            adjacencyMap.put(Source, new LinkedList<>());
        }
        LinkedList<Node> neighbours = adjacencyMap.get(Source);
        neighbours.add(destination);
        if(directed){
            LinkedList<Node> neighbours1 = adjacencyMap.get(destination);
            neighbours1.add(Source);
        }
    }

    public boolean hasEdge(Node Source, Node destination){
        LinkedList<Node> neighbours = adjacencyMap.get(Source);
        return neighbours.contains(destination); // if both source and destination are same means Linked list hasEdge
    }

    public void resetNodesVisited(){
        for (Node node : adjacencyMap.keySet()) {
            node.unvisit();
        }
    }

    public LinkedList<Node> getNeighbors(Node present) {
        return adjacencyMap.get(present);
    }
}
