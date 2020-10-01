package Lab3;


import java.util.List;

public class Client {
    public static void main(String[] args) {

        Node A = new Node(0);
        Node B = new Node(1);
        Node C = new Node(2);
        Node D = new Node(3);
        Node E = new Node(4);
        Node F = new Node(5);
        Node G = new Node(6);

        Graph g = new Graph();
        g.addEdge(A, B);
        g.addEdge(A, C);
        g.addEdge(B, D);
        g.addEdge(B, E);
        g.addEdge(C, F);
        g.addEdge(C, G);

        GraphTraversor t = new CachedGT();
        List<Node> nodes = t.DFS_traversing(B, g);
        for(Node node: nodes){
            System.out.println(""+node);
        }

        GraphTraversor f = new CachedGT();
        List<Node> nodes1 = f.WFS_traversing(A, g);
        for(Node node: nodes1){
            System.out.println(""+node);
        }

    }

}
