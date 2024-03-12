package section3.problem5;

import java.util.Scanner;

class Main2 {

    public int solution(int n){

        int answer=0, cnt=1;
        n--;//14

        while(n > 0){
            cnt++;
            n=n-cnt;//처음에 n에서 1과 2를 빼니 12됨
            if(n%cnt == 0) {//0으로 떨어지면 연속된 자연수가 된다
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.print(T.solution(n));
    }
}