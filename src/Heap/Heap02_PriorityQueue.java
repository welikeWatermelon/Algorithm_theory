package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Heap02_PriorityQueue {
    public static void main(String[] args) {
        //최소힙이 기본
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(19);


        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        //비교 기준 넣으면 최대힙으로 할 수 있음 근데 모름
        //음수를 붙여주면 역으로 최대힙으로 꺼낼 수 있음
        pq.add(-10);
        pq.add(-20);
        pq.add(-15);
        pq.add(-19);


        System.out.println(pq);
        System.out.println(-pq.poll());
        System.out.println(-pq.poll());
        System.out.println(-pq.poll());
        System.out.println(-pq.poll());
    }
}
