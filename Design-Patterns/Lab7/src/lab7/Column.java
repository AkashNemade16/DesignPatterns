package lab7;

public class Column extends NovelCompositeComponent {

    private String Type = "Column";
    private String Name;

    public Column(String Name){
        this.Name = Name;
    }

    public String getName(){
        return Name;
    }

    public String getType(){
        return Type;
    }
}
