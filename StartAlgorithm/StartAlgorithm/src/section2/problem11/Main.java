package section2.problem11;

import java.util.*;

class Main {

    public int solution(int n, int[][] arr){
        int answer = 0;
        int max = 0;

        for(int i = 1; i<=n; i++){//n명
            int cnt = 0;
            for(int j=1; j<=n; j++){//n명
                for(int k=1; k<=5; k++){//학년
                    if(arr[i][k] == arr[j][k]){//i번 학생의 k학년과 j번학생의 k학년이 같냐
                        cnt++;
                        break;//같은반을 똑같은사람과 여러번 했어도 한번으로 친다
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n=kb.nextInt();

        int[][] arr = new int[n+1][6];//0번을 버리고 1번부터 시작하자

        for(int i=1; i<=n; i++){
            for(int j=1; j<6; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}