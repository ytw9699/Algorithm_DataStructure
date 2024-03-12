package section3.problem2;

import java.util.*;
class Main {

    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2){

        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);// 오름 차순 정렬
        Arrays.sort(arr2);

        int pointer1=0, pointer2=0;

        while(pointer1 < n && pointer2 < m){

            if(arr1[pointer1] == arr2[pointer2]){
                answer.add(arr1[pointer1++]);
                pointer2++;
            }else if(arr1[pointer1] < arr2[pointer2]){
                pointer1++;
            }else{
                pointer2++;
            }
        }
        return answer;
    }

    public static void main(String[] args){

        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i] = kb.nextInt();
        }
        for(int x : T.solution(n, m, arr1, arr2)){
            System.out.print(x+" ");
        }
    }
}