package lab7;

public class Frame extends NovelComposite {
    private String type = "Frame";
    private String name;

    public Frame(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }
}
