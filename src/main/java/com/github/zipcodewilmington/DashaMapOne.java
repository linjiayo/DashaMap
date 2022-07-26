package com.github.zipcodewilmington;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapOne extends DashaMap<String, Integer> implements HashMapX<String, Integer> {

    public DashaMapOne() {
        super(26);
        Node<String, Integer>[] map = super.getMap();
        for (int i = 0; i < map.length; i++) {

        }

    }
    private String HashFunctionOne(String input) {
        if (input.length() > 0) {
            return String.valueOf(input.charAt(0)).toLowerCase();
        }
        return null;
    }


}
