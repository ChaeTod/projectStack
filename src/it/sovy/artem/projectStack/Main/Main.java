package it.sovy.artem.projectStack.Main;

import it.sovy.artem.projectStack.Exception.StackOverFlowException;
import it.sovy.artem.projectStack.Stack.Stack;

public class Main {
    public static void main(String[] args) throws StackOverFlowException {

        Stack<Integer> stack1 = new Stack<>(3);
        stack1.push(17);
        stack1.push(15);
        stack1.push(12);


        System.out.println("Works fine!");
    }
}
