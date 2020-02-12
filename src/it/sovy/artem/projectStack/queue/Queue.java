package it.sovy.artem.projectStack.queue;

import it.sovy.artem.projectStack.Exception.QueueOverFlowException;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private int size = 0;
    private int capacity;
    private List<T> list;

    public Queue(int capacity) {
        this.capacity = capacity;
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return (size == 0);  // returns true or false
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void push(T obj) throws QueueOverFlowException {
        if (obj == null)
            return;
        if (!isFull()) {
            list.add(obj);
            size++;
        } else {
            throw new QueueOverFlowException("The stack is full!");
        }
    }

    public void pop() throws QueueOverFlowException {
        if (isEmpty()) {
            throw new QueueOverFlowException("The stack is empty!");
        } else {
            list.remove(size - 1);  // calculates FIFO
            size--;
        }
    }

    public void show(){
        //for (T q : list){
            System.out.println(list);
        //}
    }

    public T top() {
        if (isEmpty()) {
            return null;
        } else {
            return list.get(size - 1);
        }
    }

    public T topAndPop() throws QueueOverFlowException {
        if (isEmpty()) {
            return null;
        } else {
            T tmp = top();
            pop();
            return tmp;
        }
    }

    public void empty(){
        // Three possibilities
        // list.removeAll();
        //list.clear();
        size = 0;  // second method to remove all is just to remove a size
    }





    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
