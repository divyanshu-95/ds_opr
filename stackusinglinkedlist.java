class stacklinkedlist{
    private class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node top;
    private int length;
    public stacklinkedlist(){
        top=null;
        length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void push(int data){
        Node temp= new Node(data);
        temp.next=top;
        top=temp;
        length++;
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("empty");
        }
        return top.data;
    }
    public int pop(){
        int res=top.data;
        top=top.next;
        length--;
        return res;
    }
    public void display(){
        if(isEmpty()){
            return;
        }else{
            Node current=top;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    }
    public static void main(String[] args){
        stacklinkedlist s=new stacklinkedlist();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("\n"+s.peek());
        s.pop();
        System.out.println(s.peek());
        s.display();
    }
}
