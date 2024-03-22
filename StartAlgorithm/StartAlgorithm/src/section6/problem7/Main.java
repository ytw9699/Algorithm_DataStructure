package section6.problem7;

import java.util.*;

//Comparable 객체 정렬에 필요한 메서드를 정의한 인터페이스
class Point implements Comparable<Point>{//기본 정렬기준을 구현하는데 사용
    public int x, y;

    Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override//두 객체의 비교결과를 반환
    public int compareTo(Point object){//정렬기준을 잡는다
        if(this.x == object.x){//같으면 1 == 2
            return this.y-object.y;//y를 비교
        } else {
            return this.x-object.x;//안같으면 x비교  : 오름차순은 this - object
            //1-2
        }
    }
}

class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();

        ArrayList<Point> arr=new ArrayList<>();

        for(int i=0; i<n; i++){
            int x=kb.nextInt();
            int y=kb.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for(Point o : arr)
            System.out.println(o.x+" "+o.y);
    }
}