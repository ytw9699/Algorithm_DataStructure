package section7.problem5;

class Node{
    int data;//번호 1,2,3~
    Node left;
    Node right;
    public Node(int val) {
        data=val;
        left=right=null;
    }
}

public class Main{
    Node root;
    public void DFS(Node root){
        if(root==null){
            return;
        }else{
            //System.out.print(root.data+" ");//전위순회
            DFS(root.left);
            System.out.print(root.data+" ");//중위순회
            DFS(root.right);
            //System.out.print(root.data+" ");//후위순회
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
        tree.DFS(tree.root);
    }
}
