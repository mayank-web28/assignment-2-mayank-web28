/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student

import problem3.myqueue.MyPriorityQueue;
import problem3.student.student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new student("Tushar",58));
        queue.enqueue(new student("Tanishq",23));
        queue.enqueue(new student("Pavit",65));
        queue.enqueue(new student("Samar",1));
        queue.enqueue(new student("Vibhu",10));
        queue.enqueue(new student("Shantanu",76));

        queue.show();
        queue.dequeue();
        queue.show();

    }
}