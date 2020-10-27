package lab7;

public class LineOfText extends NovelComposite {
    private String type = "LineOfText";
    private String name;

    public LineOfText(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
}
