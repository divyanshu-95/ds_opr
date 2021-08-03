class queuearray{
    int arr[];
    int front;
    int rear;
    public queuearray(){
        arr=new int[5];
        front=rear=-1;
    }
    void enqueue(int x){
        if(front==-1){
            front=0;
        }
        int news=x;
        rear++;
        arr[rear]=news;
        System.out.println("Inserted");
    }
    void dequeue(){
        if(front==-1){
            System.out.println("empty");
        }else{
            if(front==rear){
                front=-1;
                rear=-1;
            }else{
                System.out.println("deleted : "+arr[front]);
                front++;
            }
        }
    }
    void display(){
		if(front==-1){
			System.out.println("Empty");
		}
		else{
			for(int i=front;i<=rear;i++){
				System.out.print(arr[i]+" ");
			}
		}
	}
    public static void main(String[] args){
        queuearray s=new queuearray();
        s.enqueue(1);
        s.enqueue(2);
        // s.dequeue();
        s.display();
        s.dequeue();
        s.display();
    }
}
