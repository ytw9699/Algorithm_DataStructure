package section3.problem6;

import java.util.*;

class Main {
    public int solution(int n, int maxChangeCnt, int[] arr){
        int length=0, currentChangeCnt=0, left=0;

        for(int right=0; right<n; right++){

            if(arr[right]==0) {
                currentChangeCnt++;
            }
            while(currentChangeCnt > maxChangeCnt){
                if(arr[left]==0) {
                    currentChangeCnt--;
                }
                left++;
            }
            length=Math.max(length, right-left+1);
        }
        return length;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}