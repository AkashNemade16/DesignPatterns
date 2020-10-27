package lab7;


    public interface NovelComponentIF {
        public NovelCompositeComponent getParent();
        public int getCharLen();
        public void ShowChildren(String child);
        public int getElementCount();
        public String getName();
        public String getType();
    }

