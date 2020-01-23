
public abstract class ListItems {

    protected ListItems rightLink=null;
    protected ListItems leftLink=null;

    protected Object value;

    public ListItems(Object value)
    {
        this.value=value;
    }

    abstract ListItems next();
    abstract ListItems setNext(ListItems item);
    abstract ListItems previous();
    abstract ListItems setPrevious(ListItems item);

    abstract int compare(ListItems item);

    public void setValue(Object value)
    {
        this.value=value;
    }

    public Object getValue()
    {
        return this.value;
    }
}
