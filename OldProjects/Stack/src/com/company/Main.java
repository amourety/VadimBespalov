package com.company;

public class Main {

    public static void main(String[] args) {
	    Stack a = new Stack();
        a.push(12222222);
        a.push(222222);
        System.out.println(a.toString());
        System.out.println(a.size());
        a.pop();
        System.out.println(a.toString());
    }
}
