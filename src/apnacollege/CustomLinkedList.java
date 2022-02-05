package apnacollege;

public class CustomLinkedList<T> {

    Node<T> head;
    private int size;

    class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add node at first location (changing the Head)
    public void addAtFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode; // new head
    }

    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;
        head = head.next;
    }

    public void deleteLast() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;
        if(head.next == null) {
            head = null;
            return;
        }

        Node<T> secondLastNode = head;
        Node<T> lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

     public void reverseIterate() {
        if(head == null || head.next == null) {
            return;
        }

        // ex. 20 -> 21
        Node<T> previousNode = head; // previousNode = 20
        Node<T> currentNode = head.next; // currentNode = 21

        while(currentNode != null) {
            Node<T> nextNode = currentNode.next; // nextNode = null
            currentNode.next = previousNode; // currentNode's next is pointed to 20

            //updating node
            previousNode = currentNode; // previousNode (20) pointing to 21
            currentNode = nextNode; // currentNode = null
        }

        head.next = null;
        head = previousNode; // head = 21
         // finally the linkedlist became 21 -> 20 -> null
     }

    public int getSize() {
        return size;
    }

    // print linked list
    public void printLinkedList() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node<T> currentNode = head; // always take head's copy and traverse through the copy
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        System.out.println("------------------String LinkedList");
        CustomLinkedList<String> linkedList = new CustomLinkedList<>();
        linkedList.printLinkedList();
        linkedList.addAtFirst("a");
        linkedList.addAtFirst("is");
        linkedList.printLinkedList();

        System.out.println("------------------Integer LinkedList");
        CustomLinkedList<Integer> integerCustomLinkedList = new CustomLinkedList<>();
        integerCustomLinkedList.printLinkedList();
        integerCustomLinkedList.addAtFirst(21);
        integerCustomLinkedList.addAtFirst(20);
        integerCustomLinkedList.printLinkedList();
        //integerCustomLinkedList.deleteLast();
        integerCustomLinkedList.printLinkedList();
        System.out.println(integerCustomLinkedList.getSize());

        integerCustomLinkedList.reverseIterate();
        integerCustomLinkedList.printLinkedList();
    }
}
