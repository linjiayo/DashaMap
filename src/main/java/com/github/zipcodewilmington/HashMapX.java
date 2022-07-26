package com.github.zipcodewilmington;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public interface HashMapX<K, V> {
    // fundamentals
    void set(K key, V value);
    String delete(K key);
    String get(K key);
    boolean isEmpty();
    long size();
    K hash(K input);

    // testing access
    boolean bucketSize(K key); // used for tests
}
