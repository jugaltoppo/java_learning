public class myLinkedList implements NodeList {
    private ListItems root=null;

    public myLinkedList(ListItems root) {
        this.root = root;
    }

    public ListItems getRoot()
    {
        return this.root;
    }

    public boolean addItem(ListItems item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }
        ListItems currentItem = this.root;
        while (currentItem != null) {
            int compare = (currentItem.compare(item));
            if (compare < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            } else if (compare > 0) {
                if(currentItem.previous()!=null)
                {
                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                }
                else {
                    // the node with a previous is the root
                    item.setNext(this.root).setPrevious(item);
                    this.root = item;

                }
                return true;
            } else {
                System.out.println(item.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;
    }

    public boolean removeItem(ListItems item)
    {
        if(item!=null)
        {
            System.out.println("removing item " + item.getValue());

        }

        ListItems currentItem=this.root;

        while(currentItem!=null)
        {
            int comparision = currentItem.compare(item);
            if(comparision==0)
            {
                if(currentItem==this.root)
                {
                    this.root=currentItem.next();

                }
                else
                {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next()!=null)
                    {
                        currentItem.next().setPrevious(currentItem.previous());

                    }

                }
                return true;
            }
            else if(comparision<0)
            {
                currentItem=currentItem.next();
            }
            else
            {
                System.out.println("error/cannot find item to remove");
                return false;
            }
        }
        return false;
    }

    public void traverse(ListItems root)
    {
        if(root==null)
        {
            System.out.println("The list is empty");
        }
        else
        {
            while (root!=null)
            {
                System.out.println(root.getValue());
                root=root.next();
            }
        }
    }
}
