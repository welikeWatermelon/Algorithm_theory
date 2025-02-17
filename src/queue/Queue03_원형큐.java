package queue;

import java.util.Arrays;

public class Queue03_원형큐 {
    //한칸 비워둘 예정
    public static String[] cQ = new String[5];
    public static int front = 0, rear = 0;

    public static void main(String[] args) {
        System.out.println(enQueue("김도훈"));
        System.out.println(enQueue("박승현"));
        System.out.println(enQueue("강건"));
        System.out.println(enQueue("문하은"));

        System.out.println(Arrays.toString(cQ));

        System.out.println(deQueue());
        System.out.println(enQueue("전지환"));
        System.out.println(Arrays.toString(cQ));
    }

    //삽입
    public static boolean enQueue(String item) {
        if (isFull()) {
            //배열의 크기를 늘려서 넣어줄 수 있음
            System.out.println("가득 찼음");
            return false;
        }
        rear = (rear + 1) % cQ.length;
        cQ[rear] = item;
        return true;
    }

    //삭제
    public static String deQueue(){
        if (isEmpty()) {
            System.out.println("비워져있음");
            return null;
        }
        front = (front +1) % cQ.length;
        //실제로 데이터를 지우지는 않음
        //rear를 통해 데이터를 덮어버리니까 크게 상관은 없음
        return cQ[front];
    }


    //공백 (선형 큐와 동일함)
    public static boolean isEmpty(){
        return front == rear;
    }

    //포화(한칸을 비워둠)
    public static boolean isFull(){
        return front == (rear + 1) % cQ.length;
    }

}
