
public class main {
    public static void main(String[] args) {
        linkedlist newlist = new linkedlist(5);
        newlist.getHead();
        newlist.getTail();
        newlist.printList();
        newlist.getLength();
        newlist.append(6);
        newlist.append(7);
        newlist.printList();
        System.out.println(newlist.removeLast().value);
        System.out.println("Before prepend");
        newlist.getHead();
        newlist.printList();
        System.out.println("After prepend");
        newlist.getHead();
        newlist.prepend(2);
        newlist.printList();
        System.out.println("Remove First Node");
        System.out.println(newlist.removeFirst().value);
        newlist.printList();
        System.out.println("Accessing element via index");
        System.out.println(newlist.getIndex(0).value);
        System.out.println("Setting value in index");
        newlist.set(1, 7);
        newlist.printList();
        System.out.println("Insert value at position");
        newlist.insert(1, 6);
        newlist.printList();
        System.out.println("Remove by position");
        System.out.println(newlist.remove(2).value);
        System.out.println("After removing");
        newlist.printList();
        newlist.append(7);
        System.out.println("Reverse");
        newlist.reverse();
        newlist.printList();
    }
}
