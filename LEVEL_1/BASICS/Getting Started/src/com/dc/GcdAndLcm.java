package com.dc;

public class GcdAndLcm {
    public static void main(String[] args) {

    }
    static int gcd(int a, int b){

        int dividend, divisor, quotient, remainder;

        divisor = a<b ? a: b;
        dividend = a>b ? a: b;

        do {
            remainder = dividend / divisor;
            if (remainder != 0){
                dividend = divisor;
                divisor = remainder;
            }
            else if (remainder == 0){
                break;
            }
        }
        while (remainder> 0);


        return remainder;
    }
}
