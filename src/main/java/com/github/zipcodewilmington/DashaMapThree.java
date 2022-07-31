package com.github.zipcodewilmington;

public class DashaMapThree extends DashaMap<Integer, Integer> implements HashMapX<Integer, Integer> {

    public DashaMapThree() {
        super(52);
        SinglyLinkedList<Integer, Integer>[] map = super.getMap();
        for (int i = 0; i < map.length; i++) {
            map[i] = new SinglyLinkedList<>();
            map[i].setListHead(new Node<>(i, 0));
        }

    }
    @Override
    public Integer hash(String input) {
        if (input.length() > 1) {
            return Character.toLowerCase(input.charAt(0)) - 'a' + Character.toLowerCase(input.charAt(1)) - 'a';
        }
        return null;
    }
}
