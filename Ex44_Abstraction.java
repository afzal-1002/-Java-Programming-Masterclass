public class Ex44_Abstraction {
}

 abstract class ListItem{
    protected ListItem rightLink = null;
    protected ListItem leftLink =  null;
    protected Object value;
    public ListItem(Object value) {
        this.value = value;
    }
     abstract ListItem next();
     abstract ListItem setNext(ListItem item);
     abstract ListItem previous();
     abstract ListItem setPrevious(ListItem item);
     abstract int compareTo(ListItem item);

     public Object getValue() {
         return value;
     }

     public void setValue(Object value) {
         this.value = value;
     }
 }

class  Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        return this.rightLink =  item;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        return this.leftLink = item;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }else {
            return -1;
        }
    }
}

interface NodeList{
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem item);
}

class MyLinkedList  implements NodeList{

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null){
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(newItem);
            if(comparison < 0){
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else {
                currentItem.setNext(newItem).setPrevious(currentItem);
                return true;
                }
            }else if(comparison > 0){
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
    public boolean removeItem(ListItem item) {
        if (item != null){
            System.out.println(" Deleting Items " + item.getValue());
        }
        ListItem currentItem = this.root;
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
    public void traverse(ListItem item) {
        if (root == null) {
            System.out.println(" The List is empty.");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }






}