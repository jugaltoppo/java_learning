

public class Node extends ListItems {

    public Node(Object value)
    {
        super(value);
    }

    ListItems next()
    {
        return this.rightLink;
    }
    ListItems setNext(ListItems item)
    {
        this.rightLink=item;
        return this.rightLink;
    }
    ListItems previous()
    {
        return this.leftLink;
    }
    ListItems setPrevious(ListItems item)
    {
        this.leftLink=item;
        return this.leftLink;
    }

    int compare(ListItems item)
    {
        if(item!= null)
        {
            return ((String)super.getValue()).compareTo((String)item.getValue());
        }
        else
        {
            return -1;
        }
    }
}
