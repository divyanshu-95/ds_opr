public class DLL{
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head;
    Node tail;
    int length;
    public DLL(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty(){
        return length==0;//head==null
    }
    public void insertFirst(int data){
        Node news=new Node(data);
        if(isEmpty()){
            tail=news;
        }
        else{
            head.prev=news;
        }
        news.next=head;
        head=news;
        length++;
    }
    public void insertEnd(int data){
        Node news=new Node(data);
        if(isEmpty()){
            tail=news;
        }else{
            tail.next=news;
            news.prev=tail;
        }
        tail=news;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public int deleteFirst(){
        if(isEmpty()){
            return 0;
        }
        Node temp=head;
        if(head==tail){
            tail=null;
        }else{
            head.next.prev=null;
        }
        head=head.next;
        temp.next=null;
        return 1;
    }
    public int deleteLast(){
        if (isEmpty()){
            return 0;
        }
        Node temp=tail;
        if(head==tail){
            tail=null;
        }else{
            tail.prev.next=null;
        }
        tail=tail.prev;
        temp.prev=null;
        return 1;
    }
    public int length(){
        if(head==null){
            return 0;
        }
        int count=0;
        Node temp=head;
        
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public boolean search(int search){
        Node temp=head;
        while(temp!=null){
            if(temp.data==search){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static void main(String[] args){
        DLL d = new DLL();
        d.insertFirst(1);
        d.insertFirst(2);
        d.insertFirst(3);
        d.insertFirst(4);
        d.insertEnd(5);
        d.display();
        d.deleteFirst();
        d.display();
        d.deleteLast();
        d.display();
        System.out.print("\nlength: "+d.length());
        // d.length();
        if(d.search(5)){
            System.out.println("\nfound");
        }else{
            System.out.println("\nnot found");
        }
    }
}
