package section1.problem5;

import java.util.*;
class Main {
    public String solution(String str){

        String answer;

        char[] s = str.toCharArray();

        int left = 0;
        int right = str.length()-1;

        while(left < right){

            if(!Character.isAlphabetic(s[left])){
                left++;

            } else if(!Character.isAlphabetic(s[right])){
                right--;

            }else{
                char tmp=s[left];
                s[left]=s[right];
                s[right]=tmp;
                left++;
                right--;
            }
        }

        answer=String.valueOf(s);

        return answer;
    }

    public static void main(String[] args){

        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(T.solution(str));
    }
}