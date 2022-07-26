package com.github.zipcodewilmington;

public abstract class DashaMap<K, V> implements HashMapX<K, V> {
    private Node<K, V>[] map;

    @SuppressWarnings({"unchecked"})
    public DashaMap(int initialSize) {
        // manual cast as in HashMap
        map = (Node<K, V>[]) new Node[initialSize];
    }

    public Node<K, V>[] getMap() {
        return map;
    }
    @Override
    public K hash(K input) {
        return input;
    }
    @Override
    public void set(K key, V value) {

    }

    @Override
    public String delete(K key) {
        return null;
    }

    @Override
    public String get(K key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public boolean bucketSize(K key) {
        return false;
    }

}
