package com.codekatha.machinecodingpractice.mine.java8quest;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Q39. Group characters by type (uppercase, lowercase, digit, special)
 */
public class Q39_GroupCharactersByType {

    // ---------- Sample data ----------
    static final String text = "Hello#World2026!Java_21";

    public static void main(String[] args) {
        System.out.println("===== Q39: Group characters by type =====");

        // TODO: text ke characters ko 4 type me group karo: UPPERCASE, LOWERCASE, DIGIT, SPECIAL
        // Expected (har group ke andar order wahi jo string me hai):
        //   UPPERCASE=[H, W, J]
        //   LOWERCASE=[e, l, l, o, o, r, l, d, a, v, a]
        //   DIGIT=[2, 0, 2, 6, 2, 1]
        //   SPECIAL=[#, !, _]

        var map = text.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(
                        v->getGroup(v)
                ));
        System.out.println(map);

    }

    private static String getGroup(char c){
        if(Character.isUpperCase(c)){
            return "UPPERCASE";
        } else if (Character.isLowerCase(c)) {
            return "LOWERCASE";
        } else if (Character.isDigit(c)) {
            return "DIGIT";
        } else{
            return "SPECIAL";
        }
    }
}
