package section1.problem2;

import java.util.Scanner;
class Main {
    public String solution(String str){

        char[] result = str.toCharArray();

        for(int i=0; i< result.length; i++){

            char currentChar = result[i];

            if(Character.isUpperCase(currentChar)){
                result[i] = Character.toLowerCase(currentChar);
            }

            if(Character.isLowerCase(currentChar)){
                result[i] = Character.toUpperCase(currentChar);
            }
        }

        return new String(result);
    }

    public static void main(String[] args){

        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();//next는 문자열 하나 읽어들임

        System.out.print(T.solution(str));
    }
}