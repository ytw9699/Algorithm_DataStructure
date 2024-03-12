package section2.problem5;

import java.util.Scanner;
class Main {
    public void solution(int n){

        int answer = 0;

        int[] ch = new int[n+1];

        for(int i=2; i<n; i++){
            if(ch[i] ==0){
                answer++;
                for(int j=i; j<=n; j=j+i){
                    ch[j] = 1;
                }
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        main.solution(n);
    }
}