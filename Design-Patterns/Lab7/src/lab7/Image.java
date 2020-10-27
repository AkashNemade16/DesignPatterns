package lab7;

public class Image extends AbtractNovel {
    private String Name;
    private String Type = "Image";

    public Image(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public String getType(){
        return Type;
    }
    public int getCharLen(){
        return 1;
    }
    public int getElementCount(){ return 0; }
    public void ShowChildren(String child){}
}
