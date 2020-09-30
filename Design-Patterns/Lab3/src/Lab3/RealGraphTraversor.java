package Lab3;

import java.util.LinkedList;
import java.util.List;

public class RealGraphTraversor {
    LinkedList<Node> nodes;//initializing global List

    public List<Node> DFS_traversing(Node start, Graph g){
        nodes = new LinkedList<>();
        g.resetNodesVisited();
        DFS(start,g);
        return nodes;
    }

    private void DFS(Node present, Graph g){
        nodes.add(present);
        present.visit();
        System.out.println(present);
        LinkedList<Node> neighbours = g.getNeighbors(present);
        while(!neighbours.isEmpty()){
            for(Node node : neighbours){
                if(!node.getvisited()){
                    DFS(node, g);
                }
            }
        }
    }

    public List<Node> WFS_traversing(Node start, Graph g){
       return null;
    }


}
