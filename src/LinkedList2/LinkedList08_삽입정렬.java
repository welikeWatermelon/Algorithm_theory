package LinkedList2;

public class LinkedList08_삽입정렬 {
    public static void main(String[] args) {
        int[] data = {69, 10, 30, 2, 16, 8, 3, 22};

        //삽입정렬
        //1부터 하는 이유는? (이미 [0]요소는 정렬 집합에 포함)
        for (int i = 1; i < data.length; i++) {
            int j; //정렬 포인트
            int key = data[i];

            for (j = i - 1; j >= 0 && key < data[j]; j--) {
                data[j + 1] = data[j];
            }//뒤로 밀어버리는 작업

            //j가 for문을 지나면서 -1이 되었기때문
            data[j + 1] = key;
        }
    }
}
