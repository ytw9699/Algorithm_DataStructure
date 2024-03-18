package section5.problem3;

import java.util.*;

class Main {
    public int solution(int[][] board, int[] moves){
        int answer=0;

        Stack<Integer> stack = new Stack<>();

        for(int postion : moves){

            for(int i=0; i<board.length; i++){

                if(board[i][postion-1] != 0){ //인형 발견

                    int tmp = board[i][postion-1];//인형번호 저장

                    board[i][postion-1] = 0;//인형 뽑아내기

                    if(!stack.isEmpty() && tmp==stack.peek()){//스택 상단 값 확인
                        answer+=2;//터뜨림
                        stack.pop();
                    }else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] board=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]=kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<m; i++){
            moves[i]=kb.nextInt();
        }
        System.out.println(T.solution(board, moves));
        System.out.println(3/2);
    }
}