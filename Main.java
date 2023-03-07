import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LL{
        Node head;
        public LL(){
            this.head=null;
        }
    public void insertFirst(int val){
        Node newNode = new Node(val);
        if(head==null){
          head=newNode;  
        }
        else{
           newNode.next=head;
           head=newNode;
        }
        
    }
    public void insertLast(int val){
        Node newNode = new Node(val);
        if(head==null){
          head=newNode;  
        }
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode; 
        }
        
    }
    public void print(){
        if(head==null){
          System.out.print("Empty list");
        } 
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("null");
        System.out.println("");
        
    }
    public int size(){
       if(head==null){
           return 0;
       } 
       int s=0;
       Node curr=head;
        while(curr!=null){
            s++;
            curr=curr.next;
        }
        return s;
    }
    public void deleteFirst(){
        if(head==null || head.next==null){
            head=null;
        }
        else{
            head=head.next;
        }
    } 
    public void deleteLast(){
     Node l=head.next;
     Node sl=head;
     while(l.next!=null){
         sl=sl.next;
         l=l.next;
     }
     sl.next=null;
    }
    public void reverse(){
        if(head==null || head.next==null){
            System.out.print(head.data);
        }
        Node prev=head;
        Node curr=prev.next;
        Node nex=curr.next;
        while(curr.next!=null ){
            curr.next=prev;
            prev=prev.next;
            curr=prev.next;
            nex=curr.next;
        }
        
    }
    }
class Main
{   
	public static void main(String[] args) {
	
		LL list=new LL();
		Scanner s=new Scanner(System.in);
		int arr[]={10,20,30,40,50,60};
		for(int val:arr){
		    list.insertLast(val);
		}

		list.print();
		System.out.println(list.size());
		list.reverse();
		list.print();
		}
}

