package it.sovy.artem.projectStack.Main;

import it.sovy.artem.projectStack.Exception.QueueOverFlowException;
import it.sovy.artem.projectStack.Exception.StackOverFlowException;
import it.sovy.artem.projectStack.Stack.Stack;
import it.sovy.artem.projectStack.queue.Queue;

public class Main {
    public static void main(String[] args) throws StackOverFlowException, QueueOverFlowException {

        Stack<Integer> stack1 = new Stack<>(3);
        stack1.push(17);
        stack1.push(15);
        stack1.push(12);

        stack1.show();

        System.out.println(stack1.top());
        stack1.pop();
        stack1.show();
        System.out.println(stack1.top());


        Queue<Integer> queue1 = new Queue<>(4);
        queue1.push(15);
        queue1.push(25);
        queue1.push(30);
        queue1.push(11);

        queue1.show();
        System.out.println(queue1.top());
        queue1.pop();
        queue1.show();
        System.out.println(queue1.top());


        System.out.println("Works fine!");
    }
}
