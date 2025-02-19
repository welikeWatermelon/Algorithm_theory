package 데크;

//제네릭 하게
public class LinkedListDeque<T> {
    //내부에 Node를 정의해놓고 쓰자
    //클래스 내부의 클래스는 무조건 static으로, 아니면 메모리 유수가 남
    private static class Node<T> {
        T data;
        Node prev;
        Node next;

        Node(T data) {
            this.data = data;
        }
    } //Node class 정의

    private Node front; //앞쪽 컨드롤
    private Node rear; //뒤쪽 컨트롤
    private int size;

    //기본  생성자를 작성하지 않을건데, 생각할 수 있어야 함

    //공백 확인
    public boolean isEmpty(){
        //작성하는 방법은 많음
        return size == 0;
    }

    //개수 반환
    public int size(){
        return size;
    }

    //앞쪽에 새로운 원소 추가
    public void addFirst(T item) {
        Node node = new Node(item);
        if (isEmpty()) {
            front = node;
            rear = node;
        } else {
            node.next = front;
            front.prev = node;
            front = node;
        }
        size++;
    }

    //뒤쪽에 새로운 원소 추가
    public void addLast(T item){
        Node node = new Node(item);
        if (isEmpty()) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            node.prev = rear;
            rear = node;
        }
        size++;
    }

    //앞쪽 노드 삭제
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        T data = (T) front.data;
        if (size == 1) {
            front = null;
            rear = null;
        } else {
            front = front.next;
            front.prev = null;
        }
        size--;
        return data;
    }

    //뒤쪽 노드 삭제
    public T removeLast(){
        if (isEmpty()) {
            return null;
        }
        T data = (T) rear.data;
        if (size == 1) {
            front = rear = null;
        } else {
            rear = rear.prev;
            rear.next = null;
        }
        size--;
        return data;
    }

    //peek
    public T peekFirst(){
        if(isEmpty()) return null;
        return (T)front.data;
    }

    public T peekLast(){
        if (isEmpty()) return null;
        return (T)rear.data;
    }
}
