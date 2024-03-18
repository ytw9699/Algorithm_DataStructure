package section5.problem4;

import java.util.*;

class Main {
    public int solution(String str){
        int answer=0;

        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()){//352+*9-

            if(Character.isDigit(x)){//숫자인지 확인
                stack.push(x-48);//0의 ASCII 값(48)을 빼기

            }else{//연산이라면
                int right = stack.pop();
                int left = stack.pop();

                if(x=='+'){
                    stack.push(left+right);
                }else if(x=='-'){
                    stack.push(left-right);
                }else if(x=='*') {
                    stack.push(left*right);
                }else if(x=='/') {
                    stack.push(left/right);
                }
            }
        }
        answer=stack.get(0);
        return answer;//12
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}