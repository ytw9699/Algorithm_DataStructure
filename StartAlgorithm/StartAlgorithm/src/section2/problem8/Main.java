package section2.problem8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Main main = new Main();

        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        int[] arr = new int[count];

        for (int i=0;  i < count; i++){
            arr[i]=scan.nextInt();
        }

        for (int i=0;  i < count; i++){
            list.add(arr[i]);
        }

        Collections.sort(list, Collections.reverseOrder());

        for (int i=0;  i < count; i++){
            System.out.print(main.solution(list, arr[i])+" ");
        }
    }

    public int solution(  List<Integer> list , int i) {
        int index = list.indexOf(i);
        return index + 1;
    }
}