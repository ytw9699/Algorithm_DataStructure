package section4.problem4;

import java.util.*;

class Main {
    public int solution(String aString, String bString){
        int answer=0;
        HashMap<Character, Integer> aMap =new HashMap<>();
        HashMap<Character, Integer> bMap =new HashMap<>();

        for(char x : bString.toCharArray()){
            bMap.put(x, bMap.getOrDefault(x, 0)+1);
        }

        int bLength=bString.length()-1;

        for(int i=0; i<bLength; i++){
            aMap.put(aString.charAt(i), aMap.getOrDefault(aString.charAt(i), 0)+1);
        }
        int lt=0;

        for(int rt=bLength; rt<aString.length(); rt++){
            aMap.put(aString.charAt(rt), aMap.getOrDefault(aString.charAt(rt), 0)+1);
            if(aMap.equals(bMap)){//아나그램인지 비교
                answer++;
            }
            aMap.put(aString.charAt(lt), aMap.get(aString.charAt(lt))-1);
            if(aMap.get(aString.charAt(lt))==0){
                aMap.remove(aString.charAt(lt));
            }
            lt++;
        }
        return answer;
    }


    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.print(T.solution(a, b));
    }
}