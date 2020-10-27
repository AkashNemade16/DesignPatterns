package lab7;

public class Image extends AbtractNovel {
    private String name;
    private String type = "Image";

    public Image(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public int getCharLen(){
        return 1;
    }
    public int getElementCount(){ return 0; }
    public void ShowChildren(String x){}
}
