package aps학습1_연습.연결스택;

public class Node {
    public int data; //데이터
    public Node link; //다음 주소의 값

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", link=" + link +
                '}';
    }
}
