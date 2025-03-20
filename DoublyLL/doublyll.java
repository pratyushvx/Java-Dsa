import java.util.*;
public class doublyll {
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
       public void insertatbeg(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
        newnode.prev=null;
        
        }
        public void display(){
         Node temp=head;
         System.out.print("Null <-> ");
         while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
         }
         System.out.print("Null");

        }
        public void deleteatlast(){
            Node temp=head;
            int data=tail.data;
            for(int i=0;i<size-2;i++){
                temp=temp.next;
             }
             temp.next=null;
             tail=temp;
             System.out.println(data);
        }
        public void deleteFirst(){
            if(head==null){
                System.out.println("LL is Empty");
                
            }
            if(size==1){
                int data=head.data;
                head=tail=null;
                System.out.println(data);
                size=0;
            }
            int data=head.data;
            head=head.next;
            head.prev=null;
            System.out.println(data);
            size--;
            
            System.out.println(data);
        }
       
        public void insertlast(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
            }
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
            
            size--;
            }
        public void insertatpos(int data,int pos){
            if(pos==1){
                insertatbeg(data);
                return;
            }
            Node newnode=new Node(data);
            size++;
            Node temp=head;
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            newnode.prev=temp;
            temp.next.prev=newnode;
            temp.next=newnode;
            }
            public void deleteatpos(int pos){
                if(pos==1){
                    deleteFirst();
                    return;
                }
                int val=head.data;
                Node temp=head;
                for(int i=1;i<pos-1;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                temp.next.next.prev=temp;
                size--;
                System.out.println(val);

            }
    
    public static void main(String args[]) {
        doublyll dll=new doublyll();
        Scanner sc=new Scanner(System.in);
      int s;
    do{
        System.out.println("1.Insert At Beg\n2.Insert at End\n3.Insert at Pos\n4.Delete at Beg\n5.Delete at end\n6.Delete at pos\n7.Display\n8.Exit\nEnter Your Choises:-");
        int choise=sc.nextInt();
        switch(choise){
            case 1:System.out.println("Enter a No to Insert at Beg");
            int data=sc.nextInt();
            dll.insertatbeg(data);
            break;
            case 2: System.out.println("Enter a No to Insert at Last");
            int data1=sc.nextInt();
            dll.insertlast(data1);
            break;
            case 3:System.out.println("Enter a No to Insert at Pos");
            int data3=sc.nextInt();
            System.out.println("Enter a Pos at which you want to insert");
            int pos=sc.nextInt();
            dll.insertatpos(data3, pos);
            break;
            case 4:dll.deleteFirst();
            break;
            case 5:dll.deleteatlast();
            break;
            case 6:System.out.println("Enter a Pos at which you want to Delete");
            int pos1=sc.nextInt();
            dll.deleteatpos(pos1);
            break;
            case 7:dll.display();
            break;
            case 8: break;
            default:break;}
            System.out.println("\npress 1 if you want to continue");
            s=sc.nextInt();
        }while(s==1);
        
     

    }
}
    
    

