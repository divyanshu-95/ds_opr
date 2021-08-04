class binarytree{
  //structure of tree
    class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    Node root;
    public void create(){
        //create
        Node first=new Node(1);
        Node sec=new Node(2);
        Node third=new Node(3);
        Node forth=new Node(4);
        Node fifth=new Node(5);
        Node sixth=new Node(6);
        Node seventh=new Node(7);
        //connect
        root=first;
        root.left=sec;
        root.right=third;
        sec.left=forth;
        sec.right=fifth;
        third.left=sixth;
        third.right=seventh;
    }
  //preorder recursively
    public void prerec(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        prerec(root.left);
        prerec(root.right);
    }
  //inorder recursively
    public void inrec(Node root){
        if(root==null){
            return;
        }
        inrec(root.left);
        System.out.print(root.data+" ");
        inrec(root.right);
    }
  //postorder
    public void postrec(Node root){
        if(root==null){
            return;
        }
        inrec(root.left);
        inrec(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args){
        binarytree b=new binarytree();
        b.create();
        b.prerec(b.root);
        System.out.print("\n");
        b.inrec(b.root);
        System.out.print("\n");
        b.postrec(b.root);
    }
}
