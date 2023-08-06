//Welcome to your first of many daily bytes! We are starting with a strings problem and we strongly recommend you find the time each day to solve these problems. It is important to not just solve them in your head but actually whip out your favorite editor/IDE and write a function and use the test cases supplied in the question to check your work. Getting yourself to actually write down the solutions will go a long way to ensuring you are thinking through all the edge cases as well as any space/time complexities.
//
//        This question is asked by Google. Given a string, reverse all of its characters and return the resulting string.
//
//        Ex: Given the following strings...
//
//        “Cat”, return “taC”
//        “The Daily Byte”, return "etyB yliaD ehT”
//        “civic”, return “civic”
//        Thanks,
//        The Daily Byte

package com.dailybyte.jaideep;

public class Strings1 {
    public static void main(String[] args) {
        System.out.println("reversed string for Cat :: "+getReversedString("Cat"));
        System.out.println("reversed string for The Daily Byte :: "+getReversedString("The Daily Byte"));
        System.out.println("reversed string for civic :: "+getReversedString("civic"));

    }
    private static String getReversedString(String str){
        if(str==null){
            return null;
        }
        if(str==""){
            return "";
        }
        int i=0;
        int j=str.length()-1;
        char[] charArray=str.toCharArray();
        while(i<j){
            char temp=charArray[i];
            charArray[i]=charArray[j];
            charArray[j]=temp;
            i++;
            j--;
        }
        return new String(charArray);
    }
}
