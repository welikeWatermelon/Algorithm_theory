package Tree;

import java.util.Arrays;
import java.util.Scanner;

public class Tree02_연습문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt(); //노드의 총 개수 -> 0번부터 시작하는지, 1번부터 시작하는지 파악하기
        int[][] tree = new int[V+1][3]; //왼좌오자 만 관련시킬거면 2, 부모까지 할거면 3
        //[0] 왼자, [1] 오자, [2] 부모

        // V-1 만큼 들어옴 (문제에서 제시해줌)
        for (int i = 0; i < V - 1; i++) {
            int p = sc.nextInt(); //부모
            int c = sc.nextInt(); //자식
            //문제에서 부모의 노드 번호가 작은 것부터 준다
            //왼쪽 자식부터 준다

            //왼자가 아직 채워지지 않았다면...
            if (tree[p][0] == 0) {
                tree[p][0] = c;  //왼좌 저장
            } else { //왼자가 채워져 있다면
                tree[p][1] = c;
            }

            //부모 정보 저장
            tree[c][2] = p;


        }// 입력 처리
        for (int i = 0; i < V + 1; i++) {
            System.out.println(i+" : " + Arrays.toString(tree[i]));
        }

    }
}
