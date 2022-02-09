import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;
}

public class doublyLinkedList {
    static Scanner sc = new Scanner(System.in);
    Node head;

    public static void main(String[] args) {
        doublyLinkedList ob = new doublyLinkedList();
        while (true) {
            System.out.print("Press:\n" +
                    "1 for Insert\n" +
                    "2 for Delete\n" +
                    "3 for Traverse\n" +
                    "4 for exit()\n" +
                    "Enter your Choice -> ");
            int Choice = sc.nextInt();
            switch (Choice) {
                case 1:
                    ob.insert();
                    break;
                case 2:
                    ob.delete();
                    break;
                case 3:
                    ob.traverse();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice! ");
            }
        }
    }

    doublyLinkedList() {
        head = null;
    }

    void insert() {
        System.out.print("Enter your Data -> ");
        int data = sc.nextInt();
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        newNode.prev = null;
        if (head == null)
            head = newNode;
        else {
            Node currentNode = head;
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = newNode;
            newNode.prev = currentNode;
        }
        System.out.println("Data Inserted!");
        // System.out.println("Insert Fn is Working!");
    }

    void delete() {
        System.out.println("Deleted -> " + head.data);
        if (head == null)
            System.out.println("List is Empty!");
        if (head.next == null)
            head = null;
        else
            head = head.next;
        head.prev = null;
        // System.out.println("Delete Fn is Working!");
    }

    void traverse() {
        if (head == null)
            System.out.println("List Empty!");
        else {
            // forward
            Node currentNode;
            Node lastNode = null;
            for (currentNode = head; currentNode != null; currentNode = currentNode.next) {
                System.out.print(currentNode.data + " ");
                lastNode = currentNode;
            }
            System.out.println();
            // reverse
            for (; lastNode != null; lastNode = lastNode.prev)
                System.out.print(lastNode.data + " ");
            System.out.println();
        }
        // System.out.println("Traverse Fn is Working!");
    }
}