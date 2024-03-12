package section1.problem1;

import java.util.*;
class Main {
    public int solution(String str, char t){

        str=str.toUpperCase();

        t=Character.toUpperCase(t);

        //System.out.println(str+" "+t);
		/*for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==t) answer++;
		}*/

        int answer=0;

        for(char x : str.toCharArray()){
            if(x==t) answer++;
        }

        return answer;
    }

    public static void main(String[] args){

        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();//next는 문자열 하나 읽어들임

        char c = kb.next().charAt(0);//문자열에서 문자 하나만 0번 가져오기

        System.out.print(T.solution(str, c));
    }
}