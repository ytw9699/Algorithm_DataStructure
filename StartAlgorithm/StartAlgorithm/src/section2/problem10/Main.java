package section2.problem10;

import java.util.*;

class Main {

    int[] directionX={-1, 0, 1, 0};//행좌표
    int[] directionY={0, 1, 0, -1};//열좌표

    public int solution(int n, int[][] arr){
        int answer=0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){

                boolean flag = true;

                for(int k=0; k<4; k++){
                    int nextX = i+directionX[k];
                    int nextY = j+directionY[k];
                    if(nextX >= 0 && nextX < n && nextY >= 0 && nextY < n){//가장자리는 제외
                        if(arr[nextX][nextY] >= arr[i][j]){//봉우리가 아니면
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}