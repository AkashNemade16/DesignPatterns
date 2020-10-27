package lab7;

    public class Character extends AbtractNovel {

        private String charac;
        private String name;
        private String type = "Character";

        public Character(String name,String c){
            this.name = name;
            charac = c;
        }

        public String getName(){
            return name;
        }

        public String getType(){
            return type;
        }

        @Override
        public int getCharLen() {
            return charac.length();
        }

        public int getElementCount(){ return 0; }
        public void ShowChildren(String child){ }
    }

