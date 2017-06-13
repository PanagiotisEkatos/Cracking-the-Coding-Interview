package LinkedLists;

import java.util.LinkedList;
import java.util.Random;

/**
 * Created by panek on 6/11/2017.
 */
public class Partition {

    public static void main (String[] args) {
        LinkedListNode head = new LinkedListNode(2);
        LinkedListNode walker = head;

        Random rand = new Random();
        int counter = 0;
        while (counter < 10) {
            walker.next = new LinkedListNode(rand.nextInt(10));
            walker = walker.next;
            counter++;
        }

        System.out.println(printList(head));

        head = partition(head, 3);

        System.out.println(printList(head));
    }


    public static LinkedListNode partition(LinkedListNode node, int x) {
        LinkedListNode head = node;
        LinkedListNode tail = node;

        while (node != null) {
            LinkedListNode next = node.next;
            if (node.data < x) {
                node.next = head;
                head = node;
            } else {
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;

        return head;
    }

    public static String printList(LinkedListNode head) {
        StringBuilder stringBuilder = new StringBuilder();
        LinkedListNode walker = head;
        while (walker != null) {
            stringBuilder.append(walker.data);
            stringBuilder.append(" ");
            walker = walker.next;
        }
        return stringBuilder.toString();
    }

}
