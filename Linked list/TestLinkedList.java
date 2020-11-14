class Link {
    private int number;
    private Link next;
//    public Link(int x)
//    {
//        number = x;
//    }

    public Link(int number) {
        this.number = number;
    }

    public void displayLink()
    {
        System.out.println("The number is: " + number);
    }
    public int getNumber()
    {
        return number;
    }
//    public void setNumber(int y)
//    {
//        number =y;
//    }


    public void setNumber(int number) {
        this.number = number;
    }

    public Link getNext()
    {
        return next;
    }
//    public void setNext(Link l)
//    {
//        next=l;
//    }

    public void setNext(Link next) {
        this.next = next;
    }
}
class LinkedList {
    private static int size=0;
    private Link first;
    public LinkedList()
    {
        first = null;
    }
    public boolean isEmpty()
    {
        return (first==null);
    }
    public void insertFirst(int x)
    {
        Link newLink = new Link(x);
        newLink.setNext(first);
        first = newLink;
        size++;
    }
    public void deleteFirst()
    {
        first = first.getNext();
        size--;
    }public void displayList()
    {
        System.out.println("List (first-->last): ");
        Link current = first;
        while(current != null)
        {
            current.displayLink();
            current = current.getNext();
        }
    }public Link find(int key)
    {
        Link current = first;
        while(current.getNumber() != key)
        {
            if(current.getNext() == null)
            {
                return null;
            }
            else
            {
                current = current.getNext();
            }
        }
        return current;
    }
    public int size()
    {
        return size;

    }
    public void findMax()
    {
        //System.out.println("List (first-->last): ");
        int a=Integer.MIN_VALUE;
        Link current = first;
        while(current != null)
        {
            current.displayLink();
            current = current.getNext();
            if (a<current.getNumber())
            {
                a= current.getNumber();
            }
        }
        System.out.println(a);
    }

}
public class TestLinkedList {
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.insertFirst(2);
        list.insertFirst(10);
        list.insertFirst(6);
        list.insertFirst(12);
        list.insertFirst(4);

        list.displayList();
//        int res=list.findMax();
        // System.out.println(res);
        list.findMax();
    }
}
