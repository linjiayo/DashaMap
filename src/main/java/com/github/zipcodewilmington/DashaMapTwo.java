package com.github.zipcodewilmington;

public class DashaMapTwo extends DashaMap<String, Integer> implements HashMapX<String, Integer> {

    public DashaMapTwo() {
        super(26);
        SinglyLinkedList<String, Integer>[] map = super.getMap();
        for (int i = 0; i < map.length; i++) {
            map[i] = new SinglyLinkedList<>();
            map[i].setListHead(new Node<>(String.valueOf((char) ('a' + i)), 0));
        }

    }

    public Integer hash(String input) {
        if (input.length() > 0) {
            return Character.toLowerCase(input.charAt(1)) - 'a';
        }
        return null;
    }
}