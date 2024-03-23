package section6.problem9;

import java.util.*;

class Main {
    public int count(int[] arr, int capacity){//dvd장수 리턴, capacity=dvd의 최소용량크기
        int cnt=1, sum=0;

        for(int element : arr){
            if(sum+element > capacity){//12345, 67, 89
                cnt++;
                sum=element;
            }else
                sum+=element;
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr){
        int answer=0;
        int left = Arrays.stream(arr).max().getAsInt();
        int right = Arrays.stream(arr).sum();

        while(left <= right){//이분검색

            int mid=(left+right)/2;

            if(count(arr, mid) <= m){
                answer=mid;
                right=mid-1;
            }else
                left=mid+1;
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();//곡들의 분들
        int m=kb.nextInt();//dvd 장수
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i]=kb.nextInt();

        System.out.println(T.solution(n, m, arr));
    }
}
