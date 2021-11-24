package com.dc;

import java.util.Objects;

public class PrintValueOfX {
    public static void main(String[] args) {
        String[] arr = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(arr));
    }

    static int finalValueAfterOperations(String[] operations) {

        int x = 0;

        for (int i = 0; i< operations.length; i++){
            String op = operations[i];
            if(Objects.equals(op, "X++") || Objects.equals(op, "++X")){
                x += 1;
            }
            else if(op == "--X" || op == "X--"){
                x -= 1;
            }
        }

        return x;

    }
}
