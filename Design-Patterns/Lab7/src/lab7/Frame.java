package lab7;

public class Frame extends NovelCompositeComponent {
    private String Type = "Frame";
    private String Name;

    public Frame(String Name){
        this.Name = Name;
    }

    public String getName(){
        return Name;
    }

    public String getType(){
        return Type;
    }
}
