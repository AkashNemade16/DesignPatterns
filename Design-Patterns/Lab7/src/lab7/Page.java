package lab7;

public class Page extends NovelComposite {
    private String type = "Page";
    private String name;

    public Page(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }
}