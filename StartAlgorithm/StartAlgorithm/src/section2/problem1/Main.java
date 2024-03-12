package section2.problem1;

import java.util.*;
class Main {
    public ArrayList<Integer> solution(int n, int[] arr){

        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);

        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]) answer.add(arr[i]);
        }

        return answer;
    }

    public static void main(String[] args){

        Main main = new Main();
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();

        int[] arr=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=input.nextInt();
        }

        for(int x : main.solution(n, arr)){
            System.out.print(x+" ");
        }
    }
}


