package section7.problem7;

import java.util.*;

class Node{
    int data;
    Node left, right;
    public Node(int val) {
        data=val;
        left = right =null;
    }
}

public class Main{
    Node root;
    public void BFS(Node root){
        Queue<Node> queue = new LinkedList<>();
                    queue.add(root);
        int level = 0;//처음 레벨은 0

        while(!queue.isEmpty()){//비어있지 않을때

            int len = queue.size();

            System.out.print(level+" : ");

            for(int i=0; i<len; i++){
                Node current = queue.poll();//큐의 출구로부터 데이터의 반환과 + 삭제
                System.out.print(current.data+" ");
                if(current.left != null) {
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
            level++;
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Main tree=new Main();
        tree.root=new Node(1);
        tree.root.left =new Node(2);
        tree.root.right =new Node(3);
        tree.root.left.left =new Node(4);
        tree.root.left.right =new Node(5);
        tree.root.right.left =new Node(6);
        tree.root.right.right =new Node(7);
        tree.BFS(tree.root);
    }
}