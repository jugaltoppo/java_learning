public class Node extends ListItem {

    public Node(Object value)
    {
        super(value);
    }

    ListItem next()
    {
        return super.rightLink;
    }

    ListItem setNext(ListItem item)
    {
        super.rightLink=item;
        return super.rightLink;
    }

    ListItem previous()
    {
        return super.leftLink;
    }

    ListItem setPrevious(ListItem item)
    {
        super.leftLink=item;
        return super.leftLink;
    }

    int compareTo(ListItem item)
    {
        if(item!=null) {
            return ((String) this.getValue()).compareTo((String) item.getValue());
        }
        else
        {
            return -1;
        }
    }
}
