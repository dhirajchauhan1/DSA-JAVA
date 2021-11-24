package com.dc;

import java.util.Objects;

public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

   static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i< jewels.length(); i++){
            for ( int j = 0; j< stones.length(); j++){
                if (Objects.equals( jewels.charAt(i), stones.charAt(j) ))
                    count++;
            }
        }
        return count;
    }
}
