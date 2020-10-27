package lab7;

public class Novel extends NovelComposite {
    //do something
    private String type = "Novel";
    private String name;

    public Novel(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }
}
