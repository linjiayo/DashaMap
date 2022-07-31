package com.github.zipcodewilmington;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public interface HashMapX<K, V> {
    // fundamentals
    void set(K key, V value);
    Boolean delete(K key);
    V get(K key);
    boolean isEmpty();
    int size();
    Integer hash(K input);

    // testing access
    int bucketSize(K key); // used for tests
}
