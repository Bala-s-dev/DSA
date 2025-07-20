public class linkedlist {
    Node head;
    Node tail;
    int length;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value =  value;
        }
    }
    public linkedlist(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void printList(){
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead(){
        System.out.println(head.value);
    }
    public void getTail(){
        System.out.println(tail.value);
    }
    public void getLength(){
        System.out.println(length);
    }
    public void append(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail =  newNode;
            length++;
        }
    }
    public Node removeLast(){
        if(length==0){
            return null;
        }
        Node temp = head;
        Node pre  = head;
        
        while(temp.next!=null){ // stop when next temp is null
            pre = temp;         // prev = current temp value;
            temp = temp.next;   // temp moves next
        }
        tail = pre;             
        tail.next = null;
        length--;
        if(length == 0){        // to solve if the list contains only one node
            head = null;
            tail = null;
        }
        return temp;            // returning the removed element
    } 

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail = null;
        }
        return temp;
    }
    public Node getIndex(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }
    public boolean set(int index, int value){       
        Node temp = getIndex(index);
        if(temp!=null){
            temp.value = value;
        }
        return true;
    }
    public boolean insert(int index, int value){
        if(index < 0 || index > length){
            return false;
        }
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == value){
            append(value);
            return true;    
        }
        Node newNode = new Node(value);
        Node temp = getIndex(index - 1);    // 1 2 4 5
        newNode.next = temp.next;           //    3
        temp.next = newNode;
        length++;
        return true;
    }
    public Node remove(int index){
        if(index < 0 || index >= length){
            return null;
        }
        if(index == 0){
            return removeFirst();
        }
        if(index == length-1){
            return removeLast();
        }
        Node prev = getIndex(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i = 0; i < length ; i++){   // 5 6 7
            after = temp.next;              // 7 6 5
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
