package lab7;

abstract class AbtractNovel implements NovelComponentIF {

    private NovelComposite parent;
    private String name;

    @Override
    public NovelComposite getParent() {
        return parent;
    }

    public void setParent(NovelComposite p){
        this.parent = p;
    }

    @Override
    public abstract String getName();

    public abstract String getType();

    @Override
    public abstract int getCharLength();

    @Override
    public abstract void displayChildren(String space);

    @Override
    public abstract int getElementCount();

}
