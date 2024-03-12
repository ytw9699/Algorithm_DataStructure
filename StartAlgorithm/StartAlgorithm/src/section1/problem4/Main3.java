package section1.problem4;

import java.util.*;
class Main3 {
    public ArrayList<String> solution(String[] str){

        ArrayList<String> answer = new ArrayList<>();

        for(String x : str){

            char[] s = x.toCharArray();

            int lt = 0;
            int rt = x.length()-1;

            while( lt < rt){

                char tmp= s[lt];
                     s[lt] = s[rt];
                     s[rt] = tmp;
                     lt++;
                     rt--;
            }

            String tmp=String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args){

        Main3 T = new Main3();

        Scanner kb = new Scanner(System.in);

        int n=kb.nextInt();

        String[] str = new String[n];

        for(int i=0; i<n; i++){
            str[i]=kb.next();
        }

        for(String x : T.solution(str)){

            System.out.println(x);
        }
    }
}

