package section2.problem3;

import java.util.Scanner;

class Main {

    public String solution(int a, int b){

        String result;

        if( a == b) {
            result = "D";
        }
        else if( a == 1 && b == 3) {
            result = "A";
        }else if(a == 2 && b == 1) {
            result = "A";
        }else if(a == 3 && b == 2) {
            result = "A";
        }else {
            result = "B";
        }

        return result;
    }
    public static void main(String[] args){

        Main main = new Main();

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0; i<n; i++){
            a[i]=input.nextInt();
        }

        for(int i=0; i<n; i++){
            b[i]=input.nextInt();
        }

        for(int i=0; i<n; i++){
            System.out.println(main.solution(a[i], b[i]));
        }
    }
}