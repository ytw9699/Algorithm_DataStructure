package section3.problem4;

import java.util.*;

class Main {
    public int solution(int n, int m, int[] arr){

        int answer=0, sum=0, left=0;

        for(int right=0; right<n; right++){

            sum+=arr[right];

            if(sum==m) {
                answer++;
            }
            while(sum>=m){

                sum-=arr[left++];

                if(sum==m){
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
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}