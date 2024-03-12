package section1.problem7;

import java.util.Scanner;
class Main2 {

    public String solution(String str){

        String answer = "NO";

        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equalsIgnoreCase(tmp)){//equalsIgnoreCase는 대소문자 무시 비교함
            answer="YES";
        }

        return answer;
    }

    public static void main(String[] args){

        Main2 T = new Main2();

        Scanner kb = new Scanner(System.in);

        String str=kb.next();

        System.out.print(T.solution(str));
    }
}