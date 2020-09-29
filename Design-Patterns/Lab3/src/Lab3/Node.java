package Lab3;

public class Node {
    private int value;
    private boolean visited;

    public Node(int va ){
        value = va;

    }

    public void visit(){
        visited = true;
    }

    public void unvisit(){
        visited = false;
    }

    public int getValue(){
        return value;
    }

    public boolean getvisited(){
        return visited;
    }

    public void setValue(int va){
        value = va;
    }



}
