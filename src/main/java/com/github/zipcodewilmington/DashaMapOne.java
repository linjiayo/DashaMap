package com.github.zipcodewilmington;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapOne extends DashaMap<Character, Integer> implements HashMapX<Character, Integer> {

    public DashaMapOne() {
        super(26);
        SinglyLinkedList<Character, Integer>[] map = super.getMap();
        for (int i = 0; i < map.length; i++) {
            map[i].setListHead(new Node<>((char) ('a' + i), 0));
        }

    }
    public Integer hash(String input) {
        if (input.length() > 0) {
            return Character.toLowerCase(input.charAt(0)) - 'a';
        }
        return null;
    }


}
