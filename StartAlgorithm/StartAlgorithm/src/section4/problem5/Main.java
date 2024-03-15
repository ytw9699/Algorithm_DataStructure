package section4.problem5;

import java.util.*;

class Main {
    public int solution(int[] arr, int n, int k){
        int answer=-1;

        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());//내림차순 정렬

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int p=j+1; p<n; p++){
                    treeSet.add(arr[i]+arr[j]+arr[p]);//3개 숫자합을 중복제거 저장
                }
            }
        }
        int cnt=0;
        //Tset.remove(143);
        //System.out.println(Tset.size());
        //System.out.println("first : "+ Tset.first());
        //System.out.println("last : "+ Tset.last());
        for(int x : treeSet){//모두 조회
            //System.out.println(x);
            cnt++;
            if(cnt==k) {
                return x;
            }
        }
        return answer;
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
        System.out.println(T.solution(arr, n, k));
}
}
