package lab4;


    public class IntermediateCharacter implements Character{
        String name;

        public void AddNewCharacter(String character){
            this.name = character;
        }

        public String getCharacter(){
            return "The Character is"+this.name;
        }
    }

