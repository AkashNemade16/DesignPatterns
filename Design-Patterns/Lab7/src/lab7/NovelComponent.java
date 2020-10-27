package lab7;

public class NovelComponent extends NovelCompositeComponent {
    //do something
    private String type = "NovelComponent";
    private String name;

    public NovelComponent(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }
}
