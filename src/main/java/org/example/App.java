package org.example;

import custom.exceptions.EmptyStackException;
import custom.exceptions.FullStackException;

import java.util.Optional;

public class App {
    public static void main( String[] args ) throws EmptyStackException, FullStackException {
        MyStack myStack = new MyStack(10);

        myStack.addElement(22);
        myStack.addElement(32);
        myStack.addElement(42);
        myStack.addElement(52);
        myStack.addElement(62);
        myStack.addElement(72);
        myStack.addElement(82);
        myStack.addElement(92);
        myStack.addElement(102);
        myStack.addElement(112);

        System.out.println(myStack.topElement());

        System.out.println(myStack.getStackElement(5).get());
    }
}