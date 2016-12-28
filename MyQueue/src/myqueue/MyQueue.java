/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myqueue;

import java.util.LinkedList;

/**
 *
 * @author koray.kup
 * It's a custom queue with linked list. Just for demo purpose.
 * It works with only integers but you can easily change the data types
 */
public class MyQueue {
    
    LinkedList queue;
    
    public MyQueue() {
        queue = new LinkedList();
    }
    
    // Check queue is empty or not
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    // Return size of the queue
    public int size() {
        return queue.size();
    }
    
    // It only accepts integer
    public void enqueue(int i) {
        queue.addLast(i);
    }
    
    // Deqeue an item
    public int dequeue() {
        return (int) queue.removeLast();
    }
    
    // Peek the first item
    public int peek() {
        return (int) queue.get(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyQueue intQueue = new MyQueue();
        intQueue.enqueue(3);
        intQueue.enqueue(4);
        intQueue.enqueue(5);
        
        System.out.println("First number: "+ intQueue.dequeue());
        System.out.println("Second number: "+ intQueue.dequeue());
        System.out.println("Peek number: "+ intQueue.peek());
        System.out.println("Third number: "+ intQueue.dequeue());
    }
    
}