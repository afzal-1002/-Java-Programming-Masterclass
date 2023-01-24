public class CH_ListItem{
    public static void main(String[] args) {

    }
}

abstract class ListItem1 {

    protected ListItem1 rightLink = null;
    protected ListItem1 leftLink = null;

    protected Object value;

    public ListItem1(Object value) {
        this.value = value;
    }

    abstract ListItem1 next();
    abstract ListItem1 setNext(ListItem1 item);
    abstract ListItem1 previous();

    abstract ListItem1 setPrevious(ListItem1 item);

    abstract int compareTo(ListItem1 item);

    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
}


class Node1 extends ListItem1 {

    public Node1(Object value) {
        super(value);
    }

    @Override
    ListItem1 next() {
        return this.rightLink;
    }

    @Override
    ListItem1 setNext(ListItem1 item) {
        return this.rightLink =  item;
    }

    @Override
    ListItem1 previous() {
        return this.leftLink;
    }

    @Override
    ListItem1 setPrevious(ListItem1 item) {
        return this.leftLink = item ;
    }

    @Override
    int compareTo(ListItem1 item) {
        if (item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }else {
            return -1;
        }
    }
}

interface NodeList1{
    ListItem1 getRoot();
    boolean addItem(ListItem1 item);
    boolean removeItem(ListItem1 item);
    void traverse(ListItem1 item);
}

class MyLinkedList1 implements  NodeList1{
    private ListItem1 root = null;

    public MyLinkedList1(ListItem1 root) {
        this.root = root;
    }

    @Override
    public ListItem1 getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem1 newItem) {
       if (this.root == null){
           // this item will be header
        this.root = newItem;
        return true;
       }
        ListItem1 currentItem = this.root;
       while(currentItem != null){
           int comparison = (currentItem.compareTo(newItem));
           if(comparison < 0){
               if (currentItem.next() != null){
                   currentItem = currentItem.next();
               }else{
                   currentItem.setNext(newItem).setPrevious(currentItem);
                   return true;
               }
           } else if (comparison > 0) {
               if(currentItem.previous() != null){
                   currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
//                   newItem.setPrevious(currentItem.previous());
                   newItem.setNext(currentItem).setPrevious(newItem);
//                   currentItem.setPrevious(newItem);
               }else{
                   newItem.setNext(this.root).setPrevious(newItem);
//                   this.root.setPrevious(newItem);
                   this.root = newItem;
               }
               return true;
           }else {
               System.out.println(newItem.getValue() + " is already present");
               break;
           }
       }
        return false;
    }

    @Override
    public boolean removeItem(ListItem1 item) {
        if (item != null){
            System.out.println(" Deleting Items " + item.getValue());
        }
        ListItem1 currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(item);
            if (comparison == 0){
                if(currentItem == this.root){
                    this.root = currentItem.next();

                }else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            }else {
                return false;
            }
        }
        ////
        return false;
    }

    @Override
    public void traverse(ListItem1 root) {

        if(root == null){
            System.out.println(" The List is empty.");
        }else {
            while (root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}


