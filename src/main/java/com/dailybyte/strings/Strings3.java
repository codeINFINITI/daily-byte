package com.dailybyte.strings;

//This question is asked by Amazon. Given a string representing the sequence of moves a robot vacuum makes, return whether or not it will return to its original position. The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively.
//
//        Ex: Given the following strings...
//
//        "LR", return true
//        "URURD", return false
//        "RUULLDRD", return true
public class Strings3 {
    private int origin;
    private String path;
    public void setPath(String path){

        this.path=path;
    }
    public Strings3(){

    }
    public Strings3(String path){
        setPath(path);
        calculateOrigin();

    }
    private void calculateOrigin(){
        this.origin=0;
        int i=0;
        int j =this.path.length()-1;

        while(i<j){
            stepIntoDirection(this.path.charAt(i));
            stepIntoDirection(this.path.charAt(j));
            i++;
            j--;
        }
        if(i==j){
            stepIntoDirection(this.path.charAt(i));
        }
    }

    private void stepIntoDirection(char c){
        if(c=='U'|| c=='R'){
            this.origin++;
        }
        else{
            this.origin--;
        }
    }
    public boolean isRobotReachedOrigin(){

        return this.origin==0;
    }
}
