/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.lesson;

/**
 *
 * @author בנימין צביה
 */

    public class Node<T>{
    private T value;
    private Node<T> next;
    //ctor
    public Node(T value){
        this.value = value;
    }
    public Node(T value, Node<T> next){
        this.value = value;
        this.next = next;
    }
    //setters

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    //getters

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }
    
    public boolean hasNext(){
        return next!= null;
    }
    public String toString(){
        return "value: " + this.value;
    }
    
}

    

