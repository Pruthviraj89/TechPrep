class LinkedList{
    Node start;
    
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
	
	//Delete at Particular Position
	void delPosition(Node head,int position){
		Node temp=head;
		if (head==null)
			return;
		if(position==0){
		  head=head.next;
		  start=head;
		  return;
		}
		Node previous=null;
		while(position>0){
			previous=temp;
			temp=temp.next;
			position--;
		}
		previous.next=previous.next.next;
			start=head;
	}
	
	//WAF to delete linked list:
	void deleteLinkList(){
		start=null;
	}
	
    //Insertion at the begining:
    void insertAtBeg(int data){
        if(start==null){
            start = new Node(data);
        }else{
            Node new_node=new Node(data);
            new_node.next=start;
            start=new_node;
        }  
    }
	
	//WAF to count the number of nodes in LL:
    int count(Node head){
        Node temp =head;
       int count=0;
        while(temp!=null){
            count++;
        }
        return count;
    }
    //WAF toto search a node in given LL:
    boolean searchNode(Node head,int key){
        Node temp=head;
        if(temp==null)
            return false;
        else{
            if(temp.data==key)
                return true;
        }
       return searchNode(temp.next,key);
    }
    //WA recursive F to count the number of nodes in LL:
    int recursiveCount(Node head,int count){
        Node temp=head;
        if(temp!=null)
            count++;
        else
            return count;
      return recursiveCount(temp.next,count);
    }
	//Insertion at the end
    void insertAtLast(Node head,int data){
        Node temp=head;
        if(temp.next==null){
            Node new_node=new Node(data);
            temp.next=new_node;
            return;
        }
        insertAtLast(temp.next,data);
    }
    //Insertion in between 2 nodes
    void insertAfter(Node head,int after,int data){
        Node temp=head;
        if(temp==null)
            return;
        if(temp.data==after){
            Node previous=temp;
            Node new_node=new Node(data);
            new_node.next=previous.next;
            previous.next=new_node;
            return;
        }
        insertAfter(temp.next,after,data);
    }
    //Deletion in between 2 nodes
    Node deleteNode(Node head,int key){
        Node temp=head;
        if(temp==null){
            return null;
        }
        if(temp.data==key)
            return temp.next;
        temp.next=deleteNode(temp.next,key);
        return temp;
    }
    //Deletion at the begining
    Node deleteBeg(Node head){
        if(head==null)
            return null;
        return head=head.next;
    }
    //Deletion at the end
    Node deleteAtEnd(Node head){
        Node temp=head;
        
        if(temp.next==null)
            return null;
        temp.next=deleteAtEnd(temp.next);
        return temp;
    }
    //WAF to revers the linked list:
    void reverseAll(Node head){
        Node previous=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        start=previous;
    }
    
    
    void display(Node head){
        Node temp=head;
        if(temp==null)
            return;
        System.out.print(temp.data+"----->");
         display(temp.next);
    }
    
    
    
    
    
}



public class BST {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        LinkedList l1=new LinkedList();
        l1.insertAtBeg(89);
        l1.insertAtBeg(85);
        l1.insertAtBeg(42);
        l1.insertAtBeg(36);
        l1.insertAtBeg(9);
        l1.insertAtBeg(65);
        l1.insertAtLast(l1.start,86);
        l1.insertAfter(l1.start,30,72);
        l1.insertAtBeg(20);
       // l1.deleteNode(l1.start,85);
       l1.start=l1.deleteBeg(l1.start);
        l1.start=l1.deleteAtEnd(l1.start);
        l1.display(l1.start);
        System.out.println();
        l1.reverseAll(l1.start);
        l1.display(l1.start);
        int count=l1.recursiveCount(l1.start,0);
        System.out.println();
        System.out.println(count);
        System.out.println(l1.searchNode(l1.start,9));
		l1.delPosition(l1.start,3);
		l1.display(l1.start);
		
        
    }
}