package doublylinked;

public class Main {
    public static void main(String[] args) {
        doublylist newList = new doublylist(7);
        newList.printList();
        System.out.println(newList.getHead().value);
        System.out.println(newList.getTail().value);
        newList.append(8);
        System.out.println("After appending");
        System.out.println(newList.getTail().value);
        newList.printList();
        System.out.println("Remove Last");
        newList.append(22);
        newList.append(21);
        newList.removeLast();
        System.out.println(newList.getTail().value);
        newList.printList();
        newList.prepend(5);
        System.out.println("Adding element in first");
        newList.printList();
        System.out.println(newList.getHead().value);
        System.out.println("Removing first element");
        newList.printList();
        System.out.println("After removing");
        System.out.println(newList.removeFirst().value);
        System.out.println("Head value" + newList.getHead().value);
        newList.printList();
        
        System.out.println(newList.get(2).value);
        
        newList.append(1);
        newList.append(2);
        newList.append(3);
        System.out.println("Printing");
        newList.printList();
        System.out.println("Setting");
        newList.set(2, 21);
        newList.printList();
        System.out.println("Remove");
        newList.remove(4);
        newList.printList();
    }
}
