package section6.problem5;
.
import java.util.*;

class Main {
    public String solution(int n, int[] arr){
        //해시맵으로 풀면 o(n) 인데 그렇게 안풀고 걍 정렬로도 풀자
        
        String answer="U";
        
        Arrays.sort(arr);// 시간복잡도 n Log n 해시맵보다 안좋지만 걍 해보자
        //오름차순 정렬
        for(int i=0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                answer="D";
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.println(T.solution(n, arr));
    }
}