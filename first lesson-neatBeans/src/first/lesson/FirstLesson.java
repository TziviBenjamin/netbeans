/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.lesson;

import java.util.Scanner;

/**
 *
 * @author בנימין צביה
 */
public class FirstLesson {

//איבר קטן ואיבר גדוך
    public static void minmMax(Node<Integer> lst) {
        int min = 1000, max = 0;
        Node<Integer> curr = lst;
        while (curr != null) {
            if (curr.getValue() > max) {
                max = curr.getValue();
            }
            if (curr.getValue() < min) {
                min = curr.getValue();
            }
            curr = curr.getNext();
        }
        System.out.println("min:" + min + "max" + max);
    }

    //ערך מוחלט
    public static void absulutePositive(Node<Integer> lst) {
        Node<Integer> curr = lst;

        while (curr != null) {
            if (curr.getValue() < 0) {
                int value = curr.getValue();
                curr.setValue(value * -1);
            }
            curr = curr.getNext();
        }
        printList(lst);
    }

    //print
    public static void printList(Node<Integer> lst) {
        Node<Integer> curr = lst;
        while (curr != null) {
            System.out.print(curr.getValue() + " ");
            curr = curr.getNext();
        }
    }

    public static boolean numbers(Node<Integer> lst, int x) {
        Node<Integer> curr = lst;
        int[] monim = new int[x+1];
        while (curr != null) {
            int value = curr.getValue();
            if (value <= x) {
                monim[value]++;
            }
            curr = curr.getNext();

        }
        for (int i = 0; i <= x; i++) {
            if (monim[i] != i) {
                
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int x = 0;
        //exe1
        Node<Integer> lst = new Node<>(1, new Node<>(2, new Node<>(2, new Node<>(3, new Node<>(3)))));
        //printList(head);
//
//        //exe3
//        System.out.println("enter numbers");
//        x = input.nextInt();
//        if (x == -1) {
//            System.out.println("stop");
//            return;
//        }
//        Node<Integer> head1 = new Node<>(x);
//        Node<Integer> current = head1;
//        while (x != -1) {
//            System.out.println("enter numbers");
//            x = input.nextInt();
//            if (x == -1) {
//                System.out.println("stop");
//                printList(head1);
//                return;
//            }
//            Node<Integer> n2 = new Node<>(x);
//            current.setNext(n2);
//            current = n2;
//
//        }
        //exe4
//        Node<Integer> n1 = new Node<>(1);
//          Node<Integer>urrent=n1;
//        for(int i=5;i<=50;i+=5){
//            Node<Integer> n2 = new Node<>(i);
//            urrent.setNext(n2);
//            urrent=n2;
//        }
//        printList(n1);
//        minmMax(lst);
//        absulutePositive(lst);
        System.out.println(numbers(lst,2));

    }
}
