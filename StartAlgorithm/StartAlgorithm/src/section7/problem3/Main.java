package section7.problem3;

class Main {
    public int recursive(int n){
        if(n==1) return 1;
        else return n* recursive(n-1);//5*4*3*2*1
    }
    public static void main(String[] args){
        Main T = new Main();
        System.out.println(T.recursive(5));
    }
}