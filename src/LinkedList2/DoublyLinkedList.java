package LinkedList2;

public class DoublyLinkedList {
    private Node head;
    private Node tail; //있으면 좋다
    private int size;

    //아래 내용을 작성하지 않더라도 전부 기본값으로 작성된거와 동일함
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //조회
    public Node get(int idx) {
        if (idx < 0 || idx >= size) {
            //예외 처리로 해도 좋음
            return null;
        }
        //지역 변수
        Node curr;
        //앞에서 부터 찾을래
        if (idx < size / 2) {
            curr = head;
            for (int i = 0; i < idx; i++) {
                curr = curr.next;
            }
        }
        //뒤에서 부터 찾을래
        else {
            curr = tail;
            //조건식을 계산해서 0부터 OO회 돌리면 가능
            for (int i = size - 1; i > idx; i--) {
                curr = curr.prev;
            }
        }
        return curr;
    }

    //첫 번째 위치에 삽입
    public void addFirst(String data) {
        Node node = new Node(data);

        node.next = head;
        //공백이 아니라면
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;

        //만약에 노드가 1개 뿐이라면
        //if(size==1)
        if (head.next == null) {
            tail = head;
        }
    }

    //마지막 위치 삽입
    public void addLast(String data) {
        if (size == 0) {
            addFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
//        node.next=null; //굳이 필요없음
        node.prev=tail;
        tail = node;
        size++;
    }

    //중간 위치 삽입
    public void add(int idx, String data) {
        if(idx<0 || idx>size) return;

        if (idx == 0) {
            addFirst(data);
            return;
        }

        if (idx == size) {
            addLast(data);
            return;
        }

        //중간에 넣는 경우
        //앞의 주소와 뒤의 주소를 알고 있으면 좋음
        //앞의 주소만 알고 있으면 되긴 함 혹은 뒤의 주소만 알고 있어도 되긴 함
        Node prevNode = get(idx - 1);
        Node nextNode = prevNode.next;
        Node node = new Node(data);

        //nextNode를 구해두었으니 간편
        //이전 노드와 새로 만든 노드 연결
        prevNode.next = node;
        node.prev = prevNode;

        //이후 노드와 새로 만든 노드 연결
        node.next = nextNode;
        nextNode.prev = node;
    }

    //첫번째 위치 삭제
    public String remove(){
        if (head == null) { //size = 0;
            return null;
        }

        String data = head.data;

        Node nextNode = head.next;
        if (nextNode != null) {
            nextNode.prev = null;
        }
        head = nextNode;
        size--;
        //tail 물고 있을 수도 있다.
        if (size == 0) {
            tail = null;
        }

        return data;
    }

    //중간노드 삭제
    public String remove(int idx){
        //범위를 벗어난건 없어
        if (idx >= size || idx < 0) {
            return null;
        }
        if(idx==0) remove();

        //이제 범위 내의 계산
        Node prevNode = get(idx - 1);
//        Node rmNode = prevNode.next;
        Node nextNode = prevNode.next.next;
        String data = prevNode.next.data;

        if (nextNode != null) {
            nextNode.prev = prevNode;
            prevNode.next = nextNode;
        } else { //nextNode가 null인 상태
            prevNode.next = null;
            tail = prevNode;
        }
        size--;
        return data;
    }

    //출력
    public void printList(){
        Node curr = head;
        if (head == null) {
            System.out.println("공백");
            return;
        }
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }
}

