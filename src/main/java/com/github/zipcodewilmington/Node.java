package com.github.zipcodewilmington;

public class Node<K, V> {
    private K key;
    private V val;
    protected Node<K, V> next;

    public Node(K key, V val) {
        this.key = key;
        this.val = val;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getVal() {
        return val;
    }

    public void setVal(V val) {
        this.val = val;
    }



}
