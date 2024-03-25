package section7.problem1;

class Main {
    public void recursive(int n){
        if(n==0) return;
        else{
            //System.out.print(n+" ");
            recursive(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args){
        Main T = new Main();
        T.recursive(3);
    }
}