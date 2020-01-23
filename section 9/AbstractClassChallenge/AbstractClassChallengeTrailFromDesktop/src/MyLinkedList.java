public class MyLinkedList implements NodeList {

     private ListItem root=null;

     public  MyLinkedList(ListItem root)
     {
         this.root=root;
     }

     public ListItem getRoot()
     {
         return this.root;
     }

    public boolean addItem(ListItem item)
    {
        if(this.root==null)
        {
            this.root=item;
            return true;
        }
        else
        {
            ListItem currentItem = this.root;
            while(currentItem!=null)
            {
                int comparision=currentItem.compareTo(item);
                if(comparision<0)
                {
                    if(currentItem.next()!=null)
                    {
                        currentItem=currentItem.next();
                    }
                    else
                    {
                        currentItem.setNext(item);
                        item.setPrevious(currentItem);
                        return true;
                    }
                }
                else if(comparision>0)
                {
                    if(currentItem.previous()!=null)      //mumbai kolk
                    {

                        currentItem.previous().setNext(item);
                        item.setPrevious(currentItem.previous());
                        item.setNext(currentItem);
                        currentItem.setPrevious(item);
                        return true;
                    }
                    else
                    {
                        currentItem.setPrevious(item);
                        item.setNext(currentItem);
                        this.root=item;
                        return true;
                    }
                }
                else
                {
                    System.out.println(item.getValue() + " already passed");
                    return false;
                }

            }
        }
        return false;
    }

    public boolean removeItem(ListItem item)
    {
        ListItem currentItem=this.root;

        if(this.root!=null) {
            while (currentItem != null) {
                int comparision = currentItem.compareTo(item);
                if (comparision == 0) {
                    System.out.println("removing item " + currentItem.getValue());
                    if (currentItem == this.root) {
                        this.root = currentItem.next();
                        return true;
                    } else {
                        currentItem.previous().setNext(currentItem.next());
                        if (currentItem.next() != null) {
                            currentItem.next().setPrevious(currentItem.previous());
                            return true;
                        }
                    }

                } else if (comparision < 0) {
                    currentItem = currentItem.next();
                } else {
                    System.out.println("error");
                    return false;
                }
            }
        }
        System.out.println("error cant find");
        return false;
    }

    public void traverse(ListItem root)
    {
        if(root==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            while(root!=null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }

}
