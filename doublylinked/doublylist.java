package doublylinked;

public class doublylist {
    Node head;
    Node tail;
    int length;

    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
    }

    public doublylist(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public int getLength(){
        return length;
    }

    public Node getHead(){
        return head;
    }

    public Node getTail(){
        return tail;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = null;
            tail = newNode;
        }
        length++;
    }
    public Node removeLast(){  
        if(length == 0){
            return null;
        }                                // 1 2 3<-4->null 
        Node temp = tail;                // 1 2<-3->null
        tail = tail.prev;    
        tail.next = null;  
        temp.prev = null;   
        length--; 
        
        if (length == 0) {
            head = null;
            tail = null;
        }                   
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);    
         
        if(length == 0){
            head = newNode;
            tail = newNode;
        }  
        else{
            newNode.next = head;                // null<-2-><-3->4
            head.prev = newNode;               // 1<-2
            head = newNode;
        }                                
        length++;
    }
    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;

        if(length == 1){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >= length) return null;
        Node temp = head;
        if(index > length/2){
            for(int i = 0; i < index ; i++){
                temp = temp.next;
            }
        }
        else{
            temp = tail;
            for(int i = length - 1; i > index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }
    public boolean Insert(int index, int value){       // 1 2 4 5
        if(index < 0 || index > length) return false;  //    3

        if(index == 0){
            prepend(value);
            return true;
        }
        
        if(index == length){
            append(value);
            return true;
        }

        Node newNode = new Node(value);                
        Node before  = get(index - 1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }

    public Node remove(int index){                  // 1 2 3 4 5
        if(index < 0 || index > length) return null;  // 1 2   4 5
        if(index == 0){
            return removeFirst();
        }
        if(index == length - 1){
            return removeLast();
        }
        Node before = get(index - 1);                 
        Node after = get(index + 1); 
        Node temp = get(index);                
        before.next = after;
        after.prev = before;
        temp.prev = null;
        temp.next = null;
        length--;
        return temp;

        // Alternate method:
        // Node temp = get(index);
        // temp.next.prev =  temp.prev;
        // temp.prev.next = temp.next;
        // temp.next = null;
        // temp.prev = null;
        // length--;
    }
}
