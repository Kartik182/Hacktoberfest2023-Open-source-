
    class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    class LinkedList {
        Node head;
    
        void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    
        void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    
        void deleteFirst() {
            if (head != null) {
                head = head.next;
            }
        }
    
        void deleteLast() {
            if (head == null || head.next == null) {
                head = null;
                return;
            }
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    
        void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    
    public class Linkedlistdemo {
        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            
            list.addLast(1);
            list.addLast(2);
            list.addLast(3);
            
            System.out.println("Initial List:");
            list.printList();
            
            list.addFirst(0);
            System.out.println("After prepending 0:");
            list.printList();
            
            list.deleteFirst();
            System.out.println("After deleting first element:");
            list.printList();
            
            list.deleteLast();
            System.out.println("After deleting last element:");
            list.printList();
        }
    }
