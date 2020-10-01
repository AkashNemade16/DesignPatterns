package Lab3;


import java.util.LinkedList;
import java.util.List;

public class CachedGT implements GraphTraversor{
    private GraphTraversor service;
    private List<Node> cache = new LinkedList<>();
    private List<Node> cacheWFS = new LinkedList<>();

    public CachedGT(){
        this.service = new RealGraphTraversor();
    }


    @Override
    public List<Node> DFS_traversing(Node start, Graph g) {
        if(cache.isEmpty()){
            cache = service.DFS_traversing(start,g);
        }else {
            System.out.println("Retrieved the list from cache");
        }
        return cache;
    }

    @Override
    public List<Node> WFS_traversing(Node start, Graph g) {
        if(cacheWFS.isEmpty()){
            cacheWFS = service.WFS_traversing(start,g);
        }else{
            System.out.println("Retrieved the list from cacheWFS");
        }
        return cacheWFS;
    }

    public void reset(){
        cache.clear();
        cacheWFS.clear();
    }
}
