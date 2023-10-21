class Node{
    int data;
    Node next;
    Node(int data){
        this.data =data;
        this.next =null;
    }
    
}
class linkedlist{
    Node head;
    Node tail;
    
    Node addnode(Node node){
        if(head ==null){
            head =node;
            tail =node;
        }
        else{
            tail.next =node;
            tail =node;
        }
        return head;
    }
    
    void print(){
        Node curr =head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr  =curr.next;
        }
    }
}

public class Qu16CreateLinkedList {
    public static void main(String[] args) {
        int [] A = {8,55,4,88,45,58,55,89,9,3,36};
        int n =A.length;
        linkedlist llist = new linkedlist();
        for(int i=0;i<n;i++){
           
            Node node  = new Node(A[i]);
            llist.addnode(node);
        } 
        llist.print(); 
    }
}
