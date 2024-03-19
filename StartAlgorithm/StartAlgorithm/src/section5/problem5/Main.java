package section5.problem5;

import java.util.*;

class Main {
    public int solution(String str){
        int cnt=0;
        Stack<Character> stack=new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='(') {
                stack.push('(');
            }else{
                stack.pop();
                
                if(str.charAt(i-1)=='(') {//레이저 지점
                    cnt+=stack.size();//막대기가 잘린 개수
                }else
                    cnt++;//레이저지점은 아니지만 닫는곳 : 막대기가 잘린 개수 1개
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}
