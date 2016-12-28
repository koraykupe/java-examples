/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myqueue;

import java.util.Stack;

/**
 *
 * @author koray.kup
 */
public class MyStack {
    public static void main(String[] args) {
        Stack<String> mystack = new Stack<>();
        
        mystack.push("world");
        mystack.push("hello");
        
        System.out.print(mystack.pop() + " ");
        System.out.println(mystack.pop() + "!");
        System.out.println("Size of stack is " + mystack.size());
    }
}
