package com.dc;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1056389759));
    }

   static int reverse(int x) {
        int rev = 0;
        int prev = 0;
        while(x!=0){
            int curr =  (x%10);
            rev = (rev*10) + curr;
            x = x/10;

            if ( (rev-curr)/10 != prev)
                return 0;

            prev = rev;
        }

        return rev;
    }
}

