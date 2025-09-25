/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hwkesson2;

/**
 *
 * @author User
 */
public class HWkesson2 {

    public static void printList(Node<Integer> lst) {
        Node<Integer> curr = lst;
        while (curr != null) {
            System.out.print(curr.getValue() + " ");
            curr = curr.getNext();
        }
        System.out.println("");
    }
//מוחק כפילויות

    public static Node<Integer> Double(Node<Integer> head) {
        Node<Integer> curr = head;
        int max = curr.getValue();
        while (curr.getNext() != null) {
            if (curr.getValue() > max) {
                max = curr.getValue();
            }
            curr = curr.getNext();
        }
        if (curr.getValue() > max) {
            max = curr.getValue();
        }
        int[] monim = new int[max + 1];
        Node<Integer> curr1 = head;
        while (curr1 != null) {
            monim[curr1.getValue()]++;
            curr1 = curr1.getNext();
        }
        Node<Integer> curr2 = head;
        while (curr2.getNext() != null) {
            if (monim[curr2.getNext().getValue()] > 1) {
                monim[curr2.getNext().getValue()]--;
                curr2.setNext(curr2.getNext().getNext());
            } else {
                curr2 = curr2.getNext();
            }
        }
        return head;
    }
    //  מוחק MAX אם אי זוגי

    public static Node<Integer> getMax(Node<Integer> head) {
        Node<Integer> curr = head;
        int count = 0;
        Node<Integer> maxNode = head;
        Node<Integer> prevMax = null;
        Node<Integer> prev = null;

        while (curr != null) {
            count++;
            if (curr.getValue() > maxNode.getValue()) {
                maxNode = curr;
                prevMax = prev;
            }
            prev = curr;
            curr = curr.getNext();
        }
        if (count % 2 == 1) {
            if (prevMax == null) {
                head = head.getNext();
            } else {
                prevMax.setNext(maxNode.getNext());
            }
        }

        return head;
    }

    public static Node<Integer> maxNum(Node<Integer> lst) {
        if (lst == null || lst.getNext() == null) {
            return lst;
        }

        Node<Integer> current = new Node<>(-1);
        current.setNext(lst);
        Node<Integer> prev = current;
        Node<Integer> curr = lst;

        while (curr != null && curr.getNext() != null) {
            if (curr.getValue() >= curr.getNext().getValue()) {
                curr.setNext(curr.getNext().getNext());
            } else {
                prev.setNext(curr.getNext());
                curr = prev.getNext();
            }
            prev = curr;
            curr = curr.getNext();
        }

        return current.getNext();
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Node<Integer> head = new Node<>(8, new Node<>(8, new Node<>(9, new Node<>(3, new Node<>(3, new Node<>(8, new Node<>(8)))))));
        Node<Integer> lst = Double(head);
        Node<Integer> lst1 = getMax(lst);
        Node<Integer> lst2 = maxNum(lst1);
        printList(lst2);

    }
}
