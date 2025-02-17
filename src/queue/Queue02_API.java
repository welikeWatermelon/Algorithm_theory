package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue02_API {
    public static void main(String[] args) {
        //인터페이스
        Queue<Integer> queue = new LinkedList<>();

        //추가
        queue.add(1);
        queue.offer(2);

        //삭제
        queue.remove();
        queue.poll();

        //조회
        queue.element();
        queue.peek();

        //윗줄 add, remove, element는 예외를 발생 시킴(에러)
        //아랫줄 offer, poll, peek은 값은 리턴함


    }
}
