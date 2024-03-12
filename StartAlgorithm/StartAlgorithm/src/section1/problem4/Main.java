package section1.problem4;

import java.util.Scanner;

class Main {
    public void solution(String[] str, int t){

        for(String word : str) {
            StringBuffer sb = new StringBuffer(word);
            String reverse = sb.reverse().toString();
            System.out.println(reverse);
        }
    }

    public static void main(String[] args){

        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int count = kb.nextInt();

        String[] input = new String[count];

        for(int i=0; i<count; i++){
            input[i] = kb.next();
        }

        T.solution(input, count);
    }
}