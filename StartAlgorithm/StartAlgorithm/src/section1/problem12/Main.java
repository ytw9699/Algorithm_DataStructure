package section1.problem12;

import java.util.*;

class Main {
    public String solution(int count, String str){

        String answer="";

        for(int i=0; i<count; i++){

            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');

            int num = Integer.parseInt(tmp, 2);//이진 문자열을 십진 숫자로 변환 10진수화

            answer+=(char)num;//아스키 번호가 문자로 변환

            str = str.substring(7);//7이후 문자
        }

        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        String str = input.next();
        System.out.println(main.solution(count,str));
    }
}