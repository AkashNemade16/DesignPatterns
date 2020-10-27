package lab7;

public class Column extends NovelComposite {

    private String type = "Column";
    private String name;

    public Column(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }
}
