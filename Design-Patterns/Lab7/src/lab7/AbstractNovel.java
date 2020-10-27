package lab7;

abstract class AbtractNovel implements NovelComponentIF {

    private NovelCompositeComponent parent;
    private String Name;

    @Override
    public NovelCompositeComponent getParent() {
        return parent;
    }

    public void setParent(NovelCompositeComponent pa){
        this.parent = pa;
    }

    @Override
    public abstract String getName();

    public abstract String getType();


    public abstract int getCharLen();

    @Override
    public abstract void ShowChildren(String space);

    @Override
    public abstract int getElementCount();

}
