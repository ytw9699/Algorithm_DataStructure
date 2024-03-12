package section1.problem3;

import java.util.Scanner;

class Main {
    public String solution(String str){

        String[] result = str.split(" ");

        int count =0;

        String answer = null;

        for(String x : result){

            if(x.length() > count){
                answer = x;
                count = x.length();
            }
        }

        return answer;
    }

    public static void main(String[] args){

        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();//스트링 할줄

        System.out.print(T.solution(str));
    }
}