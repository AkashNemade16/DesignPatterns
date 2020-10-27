package lab7;

public class LineOfText extends NovelCompositeComponent {
    private String Type = "LineOfText";
    private String Name;

    public LineOfText(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public String getType(){
        return Type;
    }
}
