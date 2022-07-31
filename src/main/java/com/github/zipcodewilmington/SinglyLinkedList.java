package com.github.zipcodewilmington;

public class SinglyLinkedList<K extends Comparable<K>, V> {

    private Node<K, V> head;

    public SinglyLinkedList() {
        head = null;
    }

    public Node<K, V> getListHead() {
        return head;
    }

    public void setListHead(Node<K, V> node) {
        head = node;
    }

    public void add(Node<K, V> node) {
        if (head == null) {
            head = node;
            return;
        }
        Node<K, V> tmp = head;
        head = node;
        head.next = tmp;
    }

    public void append(Node<K, V> node) {
        if (head == null) {
            head = node;
            return;
        }

        if (head.next == null) {
            head.next = node;
            return;
        }

        // traverse linked list
        Node<K, V> tail = head.next;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = node;
    }

    public Node<K, V> get(int index) {
        int count = 0;
        if (head == null) {
            return null;
        }

        Node<K, V> node = head;
        while (node != null || count <= index) {
            if (count == index) {
                return node;
            }
            node = node.next;
            count++;
        }
        return null;
    }

    public int size() {
        int count = 0;
        for (Node<K, V> node = head; node != null; node = node.next) {
            count++;
        }
        return count;
    }

    public Node<K, V> getNodeByKey(K key) {
        if (head == null) {
            return null;
        }
        Node<K, V> currNode = head;

        while (currNode != null) {
            if (currNode.getKey() == key || currNode.getKey().equals(key)) {
                return currNode;
            }
            currNode = currNode.next;
        }
        return null;
    }

    public int find(K key) {
        Node<K, V> node = head;
        int index = 0;
        while (node != null) {
            if (node.getKey() == key || node.getKey().equals(key)) {
                return index;
            }
            index++;
            node = node.next;
        }
        return -1;
    }

    public boolean containsKey(K key) {
        return this.find(key) > -1;
    }

    public void remove(int index) {
        Node<K, V> node = head;
        Node<K, V> prev = null;
        int count = 0;
        if (index == 0) {
            head = head.next;
            return;
        }
        while (node != null && count < index) {
            prev = node;
            node = node.next;
            count++;
        }
        prev.next = prev.next.next;
    }

    /**
     * Deep copy of linked list
     **/
    public SinglyLinkedList<K, V> copy() {
        SinglyLinkedList<K, V> deepCopy = new SinglyLinkedList<>();

        for (Node<K, V> node = head; node != null; node = node.next) {
            deepCopy.append(new Node<>(node.getKey(), node.getVal()));
        }
        return deepCopy;
    }

    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }

        Node<K, V> headCopy = head;
        Node<K, V> reverse = null;
        while (headCopy != null) {
            Node<K, V> second = headCopy.next;
            headCopy.next = reverse;
            reverse = headCopy;
            headCopy = second;

        }
        head = reverse;
    }

}
