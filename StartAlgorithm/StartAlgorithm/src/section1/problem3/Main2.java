package section1.problem3;

import java.util.Scanner;

class Main2 {
    public String solution(String str){

        String answer="";

        int count =Integer.MIN_VALUE;
        int position;

        while((position = str.indexOf(' '))!=-1){ //공백이 있으면 계속 while 돌기

            String tmp = str.substring(0, position);//공백 전까지 짜르기

            int len=tmp.length();

            if(len > count){
                count = len;
                answer = tmp;
            }

            str=str.substring(position+1);//마지막 단어는 공백이 없어서 여기서 판단 해준다.
        }

        if(str.length()>count){
            answer = str;
        }

        return answer;
    }

    public static void main(String[] args){
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
}
