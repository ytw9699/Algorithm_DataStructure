package section1.problem6;

import java.util.*;
class Main {
    public String solution(String str){

        String answer="";

        char[] word = str.toCharArray();

        for(int i=0; i<str.length(); i++){
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));

            if( str.indexOf(word[i]) == i) {
                answer += word[i];
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}