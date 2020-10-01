package Lab3;

import java.util.List;

interface GraphTraversor {
     List<Node> DFS_traversing(Node start, Graph g);
     List<Node> WFS_traversing(Node start, Graph g);
}