package lab4;

public class Factory {

   public enum TypeOfMode{
        BEGINNER, INTERMEDIATE, ADVANCED
    }

    public static Modes factory(TypeOfMode type){
        switch(type){
            case BEGINNER:
                return  new BeginnerMode();
            case INTERMEDIATE:
                return  new IntermediateMode();
            case ADVANCED:
                return  new AdvancedMode();
            default:
                throw new IllegalArgumentException("This type of mode is not supported");
        }
    }
}






