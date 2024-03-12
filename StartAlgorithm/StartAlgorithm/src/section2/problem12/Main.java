package section2.problem12;

import java.util.*;

class Main {

    public int solution(int n, int m, int[][] arr){
        int answer=0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){//2중 for 문으로 일단 모든 경우의수 돈다
                int cnt=0;

                for(int k=0; k<m; k++){//테스트 횟수만큼

                    int positionI = 0, postionJ = 0;

                    for(int s=0; s<n; s++){
                        if(arr[k][s] == i){
                            positionI = s;
                        }
                        if(arr[k][s] == j){
                            postionJ = s;
                        }
                    }
                    if(positionI < postionJ) {//등수의 차이를 확인
                        cnt++;
                    }
                }
                if(cnt == m){
                    answer++;
                    //System.out.println(i+" "+j);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n=kb.nextInt();//학생수
        int m=kb.nextInt();//테스트 횟수
        int[][] arr=new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n, m, arr));
    }
}