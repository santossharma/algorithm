package apnacollege;

public class CustomLinkedList<T> {

    Node<T> head;

    class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
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
    }
}
