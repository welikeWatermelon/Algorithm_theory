package queue;

import java.util.Arrays;

public class Queue1_선형큐 {
    public static int front = -1, rear = -1;
    public static int[] queue = new int[10];
    public static void main(String[] args) {
        enQueue(1);
        enQueue(2);
        enQueue(3);
        enQueue(4);


        System.out.println(deQueue());
        System.out.println(deQueue());
        System.out.println(deQueue());
        System.out.println(deQueue());
    }

    //삽입
    public static void enQueue(int item) {
        if (isFull()) {
            System.out.println("꽉 차있음");
        } else {
            queue[++rear] = item;
        }
    }

    //삭제
    public static int deQueue(){
        if (isEmpty()) {
            System.out.println("이미 비어있음");
            return -1;
        } return queue[++front];
    }

    //공백
    public static boolean isEmpty(){
        return front == rear;
    }

    //포화 (배열이라서 함)
    public static boolean isFull(){
        return rear == queue.length-1;
    }
}
