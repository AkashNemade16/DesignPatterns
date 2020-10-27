package lab7;

public class Page extends NovelCompositeComponent {
    private String Type = "Page";
    private String Name;

    public Page(String Name){
        this.Name = Name;
    }

    public String getName(){
        return Name;
    }

    public String getType(){
        return Type;
    }
}