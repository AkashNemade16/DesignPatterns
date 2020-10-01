package Lab3;

import java.util.List;

public class Client {
    public static void main(String[] args){

        Node A = new Node(0);
        Node B = new Node(1);
        Node C = new Node(2);
        Node D = new Node(3);
        Node E = new Node(4);
        Node F = new Node(5);
        Node G = new Node(6);

        Graph g = new Graph();
        g.addEdge(A,B);
        g.addEdge(A,C);
        g.addEdge(B,D);
        g.addEdge(B,E);
        g.addEdge(C,F);
        g.addEdge(C,G);

//        GraphTraversor Gt = new GraphTraversor() {
//            @Override
//            public List<Node> DFS_traversing(Node start, Graph g) {
//                return null;
//            }
//
//            @Override
//            public List<Node> WFS_traversing(Node start, Graph g) {
//                return null;
//            }
//        };

    }

}
