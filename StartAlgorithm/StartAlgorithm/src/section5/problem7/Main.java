package section5.problem7;

import java.util.*;

class Main {
    public String solution(String requiredSubject, String scheduledSubject){
        String answer="YES";
        Queue<Character> queue = new LinkedList<>();

        for(char x : requiredSubject.toCharArray()) {
            queue.offer(x);
        }
        for(char x : scheduledSubject.toCharArray()){
            if(queue.contains(x)){
                if(x!=queue.poll()) {
                    return "NO";
                }
            }
        }
        if(!queue.isEmpty()){
            return "NO";
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.println(T.solution(a, b));
    }
}