package com.synowa.switchexamples;

public class Main {

    public static void main(String[] args) {
        int iVal = 10;
        switch (iVal % 2){
            case 0:
                System.out.print(iVal);
                System.out.println(" is even");
                break; //if here's no brake it will print out 10 is even| 10 is odd and "oop...", because after it matched on a case 0 its just running all lines below
            case 1:
                System.out.print(iVal);
                System.out.println(" is odd");
                break;
            default:
                System.out.println("oops it broke");
                break; //here I don't need a brake, but it's just a good programming practice
        }

    }
}
