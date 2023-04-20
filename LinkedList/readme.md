## reversing a linked list

    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    
    
    full program 
    
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class ReverseLinkedList {
        public static void main(String[] args) {
            // Create a linked list
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);

            // Print the original linked list
            System.out.println("Original Linked List:");
            printList(head);

            // Reverse the linked list
            head = reverseList(head);

            // Print the reversed linked list
            System.out.println("Reversed Linked List:");
            printList(head);
        }

        // Function to reverse a linked list using recursion
        public static ListNode reverseList(ListNode head) {
            // Base case
            if (head == null || head.next == null) {
                return head;
            }

            // Reverse the rest of the linked list
            ListNode newHead = reverseList(head.next);

            // Set the next node's next reference to point to the current node
            head.next.next = head;

            // Set the current node's next reference to null
            head.next = null;

            // Return the new head of the reversed linked list
            return newHead;
        }

        // Function to print a linked list
        public static void printList(ListNode head) {
            while (head != null) {
                System.out.print(head.val + " ");
                head = head.next;
            }
            System.out.println();
        }
    }


    
## finding middle element

    public Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
## circular or not

    public boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    
###  my methods 
  
    public boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            if (temp == head) {
                return true;
            }
        }
        return false;
    }

