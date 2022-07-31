package com.github.zipcodewilmington;

public abstract class DashaMap<K extends Comparable<K>, V> implements HashMapX<K, V> {
    private SinglyLinkedList<K, V>[] map;

    @SuppressWarnings({"unchecked"})
    public DashaMap(int initialSize) {
        map = new SinglyLinkedList[initialSize];
    }

    public SinglyLinkedList<K, V>[] getMap() {
        return map;
    }
    public Integer hash(K input) {
        return null;
    }
    @Override
    public void set(K key, V value) {
        Integer idx = this.hash(key);
        // check if key exists
        Node<K, V> existNode = map[idx].getNodeByKey(key);
        if (existNode != null) {
            existNode.setVal(value);
            return;
        }
        map[idx].add(new Node<>(key, value));
    }

    @Override
    public Boolean delete(K key) {
        Integer idx = this.hash(key);
        int keyIdx = map[idx].find(key);
        if (keyIdx > -1) {
            map[idx].remove(keyIdx);
            return true;
        }
        return false;
    }

    @Override
    public V get(K key) {
        Integer idx = this.hash(key);
        return map[idx].getNodeByKey(key).getVal();
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < map.length; i++) {
            if (this.size() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            count += map[i].size() - 1;
        }
        return count;
    }

    @Override
    public int bucketSize(K key) {
        Integer idx = this.hash(key);
        return map[idx].size() - 1;
    }

    public abstract Integer hash(String input);
}
