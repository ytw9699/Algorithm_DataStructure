package section6.problem10;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public int count(int[] arr, int distance){//유효한지 확인함수
        int cnt=1;//배치한 말의 마리수
        int endPoint=arr[0];//바로 이전의 마구간 좌표

        for(int i=1; i<arr.length; i++){
            if (arr[i]-endPoint >= distance){
                cnt++;
                endPoint=arr[i];
            }
        }
        return cnt;
    }

    public int solution(int n, int c, int[] arr){
        int answer=0;
        Arrays.sort(arr);
        int left = 1;//가장 최소의 거리는 1
        int right = arr[n-1];//가장 최대의 거리
        while (left <= right){
            int mid = (left + right)/2;//mid는 최대거리
            if(count(arr, mid) >= c){//유효하면
                answer = mid;
                left = mid+1;
            }else
                right = mid-1;
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int c=kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(n, c, arr));
    }
}
