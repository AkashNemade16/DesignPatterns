package lab7;


    public interface NovelComponentIF {
        public NovelComposite getParent();
        public int getCharLength();
        public void displayChildren(String space);
        public int getElementCount();
        public String getName();
        public String getType();
    }

