package com.dailybyte.strings;

public class Strings2 {

    public  boolean isValidPalindrome(String str){
        if(str ==null || str=="" || str.length()==1){
            return false;
        }
        int i=0;
        int j =str.length()-1;
        while(i<j){
            if(!isValidChar(str.charAt(i))){
                i++;
                continue;
            }
            if(!isValidChar(str.charAt(j))){
                j--;
                continue;
            }
            if(toLowerCase(str.charAt(i))!=toLowerCase(str.charAt(j))){
                return false;
            }
            i++;
            j--;

        }
        return  true;
    }
    private static boolean isValidChar(char c){
        return (c>=65 && c<=90) || (c>=97 && c<=122);
    }
    private static char toLowerCase(char c){
        if(c>=65 && c<=90){
           return (char) (c+32);
        }
        else{
            return c;
        }
    }
}
