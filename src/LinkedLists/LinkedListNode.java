package LinkedLists;

/**
 * Created by panek on 6/11/2017.
 */

public class LinkedListNode {
    LinkedListNode next;
    int data;

    public LinkedListNode(int data, LinkedListNode next) {
        this.data = data;
        this.next = next;
    }

    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public LinkedListNode() {
    }
}

