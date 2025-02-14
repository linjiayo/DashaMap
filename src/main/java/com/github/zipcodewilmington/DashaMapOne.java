package com.github.zipcodewilmington;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapOne extends DashaMap<String, Integer> implements HashMapX<String, Integer> {

    public DashaMapOne() {
        super(26);
        SinglyLinkedList<String, Integer>[] map = super.getMap();
        for (int i = 0; i < map.length; i++) {
            map[i] = new SinglyLinkedList<>();
            map[i].setListHead(new Node<>(String.valueOf((char) ('a' + i)), 0));
        }

    }
    @Override
    public Integer hash(String input) {
        if (input.length() > 0) {
            return Character.toLowerCase(input.charAt(0)) - 'a';
        }
        return null;
    }


}
