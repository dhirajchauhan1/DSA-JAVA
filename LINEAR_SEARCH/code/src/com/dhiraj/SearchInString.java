package com.dhiraj;

public class SearchInString {

    public static void main(String[] args) {

        System.out.println(searchChar("dhiraj", 'j'));
        System.out.println(searchChar2("dhiraj", '1'));

    }

    static boolean searchChar(String str, char c){
        if (str.length()==0)
            return false;

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == c)
                return true;
        }

        return false;
    }

    static boolean searchChar2(String str, char c){
        if (str.length()==0)
            return false;

        for (char ch:str.toCharArray()){
            if (ch == c)
                return true;
        }

        return false;
    }

}
