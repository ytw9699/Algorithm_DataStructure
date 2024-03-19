package section5.problem8;

import java.util.*;
import java.io.*;

class Person{
    int id;
    int priority;
    public Person(int id, int priority){
        this.id=id;
        this.priority=priority;
    }
}

class Main {
    public int solution(int n, int m, int[] arr){
        int answer=0;
        Queue<Person> queue = new LinkedList<>();

        for(int i=0; i<n; i++){
            queue.offer(new Person(i, arr[i]));
        }
        while(!queue.isEmpty()){
            Person tmp = queue.poll();
            for(Person x : queue){
                if(x.priority>tmp.priority){
                    queue.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id==m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException{
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}