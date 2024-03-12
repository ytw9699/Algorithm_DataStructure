package section1.problem11;

import java.util.*;

class Main {

    public String solution(String str){

        String answer="";
        str=str+" ";
        int cnt=1;

        for(int i=0; i<str.length()-1; i++){

            if(str.charAt(i) == str.charAt(i+1)){
                cnt++;

            } else{
                answer += str.charAt(i);

                if(cnt > 1) {
                    answer+=cnt;
                }
                cnt=1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        System.out.println(main.solution(str));
    }
}