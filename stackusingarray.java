class stackarray{
    int top;
    int arr[];
    public stackarray(){
        arr=new int[5];
        top=-1;
    }
    void push(int x){
        if(top==arr.length-1){
            System.out.println("full");
        }else{
            int news=x;
            top++;
            arr[top]=news;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("empty");
        }else{
            top--;
            System.out.println("deleted");
        }
    }
    void display(){
        if(top==-1){
            System.out.println("empty");
        }else{
            for(int i=top;i>-1;i--){
                System.out.print(arr[i]+" ");
            }
        }
    }
    void peek(){
        if(top==-1){
            System.out.print("empty");
        }else{
            System.out.println("\n"+arr[top]+" ");
        }
    }
    public static void main(String[] args){
        stackarray s=new stackarray();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        // s.pop();
        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}
