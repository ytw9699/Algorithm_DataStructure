package section6.problem8;

import java.util.*;

class Main {
    public int solution(int n, int m, int[] arr){
        int answer=0;
        int left=0;
        int right=n-1;
        Arrays.sort(arr);//이분검색은 정렬먼저

        while(left <= right){//배열안에 값이 없으면 그만
            int mid = (left+right)/2;

            if(arr[mid] == m){
                answer = mid+1;
                break;
            }
            if(arr[mid] > m) {
                right = mid-1;
            }else{
                left = mid+1;
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
        System.out.println(T.solution(n, m, arr));
    }
}