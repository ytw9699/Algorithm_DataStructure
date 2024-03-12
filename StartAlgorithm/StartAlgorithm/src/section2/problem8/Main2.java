package section2.problem8;

import java.util.*;

class Main2 {

    public int[] solution(int n, int[] arr){

        int[] answer = new int[n];

        for(int i=0; i<n; i++){

            int cnt=1;

            for(int j=0; j<n; j++){
                if(arr[j]>arr[i]) {
                    cnt++;
                }
            }
            answer[i]=cnt;
        }
        return answer;
    }

    public static void main(String[] args){

        Main2 T = new Main2();

        Scanner kb = new Scanner(System.in);

        int n=kb.nextInt();

        int[] arr=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }

        for(int x :T.solution(n, arr)) {
            System.out.print(x+" ");
        }
    }
}