package LinkedList;

public class SinglyLinkedList {
    //defining a node in singly linked list
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //defining the head and tail of a singly linked list
    public Node head = null;
    public Node tail = null;

    //defining insert() function to add a node to the list
    public void insert(int data) {

        //Creating a new node
        Node newNode = new Node(data);

        //checking of the list is empty
        if(head == null) {
            //if the given list is empty, making the two nodes head and tail to point to the newly created node newNode
            head = newNode;
            tail = newNode;
        }

        else {
            //otherwise the newNode will be added after tail so that the next pointer of tail points to the newNode
            tail.next = newNode;

            tail = newNode;
        }
    }

    //defining displaylist() function to display the data in the list
    public void displaylist() {

        //Pointing the head to the node called current
        Node current = head;

        if(head == null) {
            System.out.println("The given list is empty");
            return;
        }

        System.out.println("The data in the given list are: ");

        while(current != null) {
            //printing each data in the list and next pointer pointing to the next node
            System.out.print(current.data + " ");

            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //creating a new list
        SinglyLinkedList newList = new SinglyLinkedList();

        //Adding data to the list by calling the insert function
        newList.insert(10);
        newList.insert(30);
        newList.insert(50);
        newList.insert(70);
        newList.insert(100);

        //Displaying the data in the list by calling displaylist() function
        newList.displaylist();
    }
}