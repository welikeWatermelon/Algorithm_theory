package aps학습1_연습.단일리스트;

public class Node {
    public String data;

    //Node 라고 하는 다음 주소를 저장하겠다.
    public Node link;

    public Node(){
    }

    public Node(String data) {
        this.data = data;
        this.link = null;
    }

}
