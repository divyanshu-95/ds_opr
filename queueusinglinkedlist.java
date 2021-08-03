public class queuelinkedlist{
   Node front;
   Node rear;
   int length;
   class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public queuelinkedlist(){
        front=null;
        rear=null;
        length=0;
    }
    // public int length(){
    //     return length;
    // }
    public boolean isEmpty(){
        return length==0;
    }
    public void enqueue(int data){
        Node temp=new Node(data);
        if(isEmpty()){
            front=temp;
        }else{
            rear.next=temp;
        }
        rear=temp;
        length++;
        System.out.println("insert");
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Empty");
        }
        int res=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        length--;
        return res;
        
    }
    public void display(){
        if(isEmpty()){
            return;
        }
        Node current =front;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[] args){
        queuelinkedlist q=new queuelinkedlist();
        
        q.enqueue(1);
        q.enqueue(2);
        q.display();
        q.dequeue();
        System.out.print("\n");
        q.display();
    }
}
