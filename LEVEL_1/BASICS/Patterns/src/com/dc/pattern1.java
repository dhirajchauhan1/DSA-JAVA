package com.dc;

import java.util.Scanner;

public class pattern1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        pattern7(5);
    }

    /*

     *
     *	*
     *	*	*
     *	*	*	*
     *	*	*	*	*

     */

    /*
                    *
                *	*
            *	*	*
         *	*	*	*
     *	*	*	*	*
     */
    static void pattern3(int n){
        for (int row=1; row<=n; row++){
            for (int sp=0; sp<n-row; sp++){
                System.out.print("\t");
            }
            for(int st=0; st<row; st++){
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }

    /*
     *  *   *   *   *
        *   *   *   *
            *   *   *
                *   *
                    *
    * */
    static void pattern4(int n){
        for (int row=n; row>=1; row--){
            for (int sp=0; sp<n-row; sp++){
                System.out.print("\t");
            }
            for(int st=0; st<row; st++){
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }

    /*

            *
        *   *   *
    *   *   *   *   *
        *   *   *
            *

     */
    static void pattern5(int n){
        int nst=1, nsp=n/2;

        for(int row=0; row<n; row++){
            for(int sp=0; sp<nsp; sp++){
                System.out.print("\t");
            }
            for(int st=0; st<nst; st++){
                System.out.print("*\t");
            }

            if(row<n/2){
                nst +=2;
                nsp--;
            }
            else{
                nst -=2;
                nsp++;
            }
            System.out.println("");

        }
    }

    /*

    *   *   *       *   *   *
    *   *               *   *
    *                       *
    *   *               *   *
    *   *   *       *   *   *

     */
    static void pattern6(int n){
        int nst = n/2+1, nsp=1;

        for(int row=0; row<n; row++){
            for(int st=0; st<nst; st++){
                System.out.print("*\t");
            }
            for(int sp=0; sp<nsp; sp++){
                System.out.print("\t");
            }
            for(int st=0; st<nst; st++){
                System.out.print("*\t");
            }

            if(row<n/2){
                nsp +=2;
                nst--;
            }
            else{
                nsp -=2;
                nst++;
            }
            System.out.println("");
        }
    }

    /*

    *
        *
            *
                *
                    *

     */
    static void pattern7(int n){
        for(int row=n; row>=1; row--){
            for (int sp=0; sp<n-row; sp++){
                System.out.print("\t");
            }
            System.out.print("*\n");
        }

    }
}
