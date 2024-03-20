package section6.problem4;

import java.util.*;

class Main {
    public int[] solution(int size, int n, int[] arr){

        int[] cache=new int[size];//5

        for(int x : arr){
            int position=-1;

            for(int i=0; i<size; i++){
                if(x==cache[i])
                    position=i;//캐시 히트된 위치 저장
            }

            if(position==-1){//캐시 미스의 경우
                for(int i=size-1; i>=1; i--){
                    cache[i]=cache[i-1];//맨 뒤에서부터 땡김
                }
            }else{//캐시 히트의 경우
                for(int i=position; i>=1; i--){
                    cache[i]=cache[i-1];//히트 위치부터 땡김
                }
            }
            cache[0]=x;//배열 맨앞 새로운 숫자로 업데이트
        }
        return cache;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int s=kb.nextInt();//5
        int n=kb.nextInt();//9
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : T.solution(s, n, arr)) {
            System.out.print(x+" ");
        }
    }
}