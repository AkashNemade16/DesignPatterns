package lab7;


    import java.util.ArrayList;

    public abstract class NovelCompositeComponent extends AbtractNovel {

        private ArrayList<NovelComponentIF> children = new ArrayList();
        private int CharLen = -1;

//        public NovelComponentIF getChild(int index){
//            return (NovelComponentIF)children.get(index);
//        }

        public synchronized void addChild(NovelComponentIF child){
            synchronized (child){
                children.add(child);
                ((AbtractNovel)child).setParent(this);
                Alert();
            }
        }

//        public synchronized void removeChild(AbtractNovel child){
//            synchronized (child){
//                if(this == child.getParent()){
//                    child.setParent(null);
//                }
//                children.remove(child);
//                Alert();
//            }
//        }

        public void Alert(){
            CharLen = -1;
            if(getParent() != null){
                getParent().Alert();
            }
        }

        public int getCharLen(){
            int len = 0;
            for(int i = 0 ; i < children.size(); i++){
                AbtractNovel thisChild;
                thisChild = (AbtractNovel)children.get(i);
                len += thisChild.getCharLen();
            }
            return len;
        }

        public void ShowChildren(String space){
            StringBuilder ans = new StringBuilder("    ");
            ans.append(space);

            for(int i = 0 ; i < children.size(); i++){
                AbtractNovel thisChild;
                thisChild = (AbtractNovel)children.get(i);
                System.out.println(ans + "--"+thisChild.getType()+ "(" + thisChild.getName()+ ")");
                String x = ans.toString();
                thisChild.ShowChildren(x);
            }
        }

        public int getElementCount(){
            int count = children.size();
            for(int i = 0 ; i < children.size(); i++){
                AbtractNovel thisChild;
                thisChild = (AbtractNovel) children.get(i);
                count += thisChild.getElementCount();
            }
            return count;
        }
    }

