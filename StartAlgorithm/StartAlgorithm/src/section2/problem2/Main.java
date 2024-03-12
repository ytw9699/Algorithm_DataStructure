package section2.problem2;

import java.util.*;
class Main {

    public int solution(int n, int[] arr){

        int answer = 1;

        int top = arr[0];

        for(int i=1; i<n; i++){
            if( arr[i] > top) {
                answer++;
                top = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args){

        Main main = new Main();

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=input.nextInt();
        }

        System.out.print(main.solution(n, arr));
    }
}