package controller;

public class Num {
    private int numMember;

    public Num (String numMember){
        this.numMember = changeInteger(numMember);
    }

    private int changeInteger(String numString){
        return numMember = Integer.parseInt(numString);
    }

    public int getNumMember() {
        return numMember;
    }
}
