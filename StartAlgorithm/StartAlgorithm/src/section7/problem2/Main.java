package section7.problem2;

class Main {
    public void recursive(int n){
        if(n==0) return;
        else{
            recursive(n/2);
            System.out.print(n%2);
        }
    }

    public void solution(int n){
        recursive(n);
    }
    public static void main(String[] args){
        Main T = new Main();
        T.solution(11);
    }
}