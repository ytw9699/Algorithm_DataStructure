package section2.problem4;

import java.util.Scanner;

class Main {

    public void solution(int n){

        int[] answer = new int[n];
              answer[0] =1;
              answer[1] =1;

        for(int i=2; i<n; i++){
            answer[i] = answer[i-2] + answer[i-1];
        }

        for (int result : answer){
            System.out.print(result+" ");
        }
    }

    public static void main(String[] args){

        Main main = new Main();

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        main.solution(n);
    }
}