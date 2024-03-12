package section3.problem5;

import java.util.Scanner;

class Main {
    public int solution(int k){

        int answer=0, sum=0, left=0;
        int n= k/2 + 1;
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }

        for(int right=0; right<n; right++){

            sum+=arr[right];

            if(sum == k) {
                answer++;
            }
            while(sum >= k){

                sum-=arr[left++];

                if(sum == k){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){

        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int k = kb.nextInt();

        System.out.print(T.solution(k));
    }
}