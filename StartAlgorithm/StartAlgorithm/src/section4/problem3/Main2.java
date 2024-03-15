package section4.problem3;

import java.util.*;

class Main2 {//2중 for문 시간제한 걸림..
    public ArrayList<Integer> solution(int n, int k, int[] arr){

        ArrayList<Integer> answer = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        int count = n-k+1;
        int i = 0;

        for(int j=0; j<count; j++){
            for(int p=i; p<k; p++){
                set.add(arr[p]);
                if(p+1 == k){
                    answer.add(set.size());
                }
            }
            set.clear();
            k=k+1;
            i=i+1;
        }
        return answer;
    }

    public static void main(String[] args){
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : T.solution(n, k, arr)) System.out.print(x+" ");
    }
}