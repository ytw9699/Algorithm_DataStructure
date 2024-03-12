package section1.problem4;

import java.util.*;
class Main2 {
    public ArrayList<String> solution(String[] str){

        ArrayList<String> answer=new ArrayList<>();

        for(String x : str){
            String tmp=new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        Main2 T = new Main2();

        Scanner kb = new Scanner(System.in);

        int n=kb.nextInt();

        String[] str=new String[n];

        for(int i=0; i<n; i++){
            str[i]=kb.next();
        }

        for(String x : T.solution(str)){
            System.out.println(x);
        }
    }
}