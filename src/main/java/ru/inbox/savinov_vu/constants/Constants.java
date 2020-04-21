package ru.inbox.savinov_vu.constants;

import java.util.HashMap;
import java.util.Map;



public class Constants {

    public static final String SPACE = " ";
    public static final Map<Character, String> SYMBOL_TO_CODE_MAP = new HashMap<Character, String>();
    public static final Map<Character, Integer> SYMBOL_TO_BUTTON_MAP = new HashMap<Character, Integer>();


    static {
        SYMBOL_TO_CODE_MAP.put('a', "2");
        SYMBOL_TO_CODE_MAP.put('b', "22");
        SYMBOL_TO_CODE_MAP.put('c', "222");

        SYMBOL_TO_CODE_MAP.put('d', "3");
        SYMBOL_TO_CODE_MAP.put('e', "33");
        SYMBOL_TO_CODE_MAP.put('f', "333");

        SYMBOL_TO_CODE_MAP.put('g', "4");
        SYMBOL_TO_CODE_MAP.put('h', "44");
        SYMBOL_TO_CODE_MAP.put('i', "444");

        SYMBOL_TO_CODE_MAP.put('j', "5");
        SYMBOL_TO_CODE_MAP.put('k', "55");
        SYMBOL_TO_CODE_MAP.put('l', "555");

        SYMBOL_TO_CODE_MAP.put('m', "6");
        SYMBOL_TO_CODE_MAP.put('n', "66");
        SYMBOL_TO_CODE_MAP.put('o', "666");

        SYMBOL_TO_CODE_MAP.put('p', "7");
        SYMBOL_TO_CODE_MAP.put('q', "77");
        SYMBOL_TO_CODE_MAP.put('r', "777");
        SYMBOL_TO_CODE_MAP.put('s', "7777");

        SYMBOL_TO_CODE_MAP.put('t', "8");
        SYMBOL_TO_CODE_MAP.put('u', "88");
        SYMBOL_TO_CODE_MAP.put('v', "888");

        SYMBOL_TO_CODE_MAP.put('w', "9");
        SYMBOL_TO_CODE_MAP.put('x', "99");
        SYMBOL_TO_CODE_MAP.put('y', "999");
        SYMBOL_TO_CODE_MAP.put('z', "9999");

        SYMBOL_TO_CODE_MAP.put(' ', "0");


        SYMBOL_TO_BUTTON_MAP.put('a', 1);
        SYMBOL_TO_BUTTON_MAP.put('b', 1);
        SYMBOL_TO_BUTTON_MAP.put('c', 1);

        SYMBOL_TO_BUTTON_MAP.put('d', 2);
        SYMBOL_TO_BUTTON_MAP.put('e', 2);
        SYMBOL_TO_BUTTON_MAP.put('f', 2);

        SYMBOL_TO_BUTTON_MAP.put('g', 3);
        SYMBOL_TO_BUTTON_MAP.put('h', 3);
        SYMBOL_TO_BUTTON_MAP.put('i', 3);

        SYMBOL_TO_BUTTON_MAP.put('j', 4);
        SYMBOL_TO_BUTTON_MAP.put('k', 4);
        SYMBOL_TO_BUTTON_MAP.put('l', 4);

        SYMBOL_TO_BUTTON_MAP.put('m', 5);
        SYMBOL_TO_BUTTON_MAP.put('n', 5);
        SYMBOL_TO_BUTTON_MAP.put('o', 5);

        SYMBOL_TO_BUTTON_MAP.put('p', 6);
        SYMBOL_TO_BUTTON_MAP.put('q', 6);
        SYMBOL_TO_BUTTON_MAP.put('r', 6);
        SYMBOL_TO_BUTTON_MAP.put('s', 6);

        SYMBOL_TO_BUTTON_MAP.put('t', 7);
        SYMBOL_TO_BUTTON_MAP.put('u', 7);
        SYMBOL_TO_BUTTON_MAP.put('v', 7);

        SYMBOL_TO_BUTTON_MAP.put('w', 8);
        SYMBOL_TO_BUTTON_MAP.put('x', 8);
        SYMBOL_TO_BUTTON_MAP.put('y', 8);
        SYMBOL_TO_BUTTON_MAP.put('z', 8);

        SYMBOL_TO_BUTTON_MAP.put(' ', 9);

    }

}
