class DLL{
	static Node head;
	
		static class Node{
			int data;
			Node prev;
			Node next;
			
			Node(int data){
				this.data=data;
				this.prev=null;
				this.next=null;
			}
			Node(){
				head=null;
			}
		}
		
		void insert(int data){
			Node new_node=new Node(data);
			if(head==null){
				head=new_node;
				
			}else{
				head.prev=new_node;
				new_node.next=head;
				head=new_node;
				
			}
		}
		
		void display(){
			Node n=head;
			Node p=null;
			
			System.out.println("Forward Traversal---");
			
			while(n!=null){
				System.out.print(n.data+"--->");
				p=n;
				n=n.next;
			}
			System.out.println();
			System.out.println("Backward Traversal---");
			
			while(p!=null){
				System.out.print(p.data+"--->");
				p=p.prev;
			}
			
			
			
		}
		void insertAfter(int position,int data){
			Node temp=head;
			Node new_node=new Node(data);
			if(position<0)
				return;
			if(position==0 ){
				
				if( temp.next==null && temp.prev==null){
					new_node.prev=temp;
					temp.next=new_node;
					return;
				}else{
					temp.next.prev=new_node;
					new_node.next=temp.next;
					temp.next=new_node;
					new_node.prev=temp;
				}
				return;
			}else{
				
				while(position>0){
					temp=temp.next;
					position--;
				}
				if(temp==null){
					return;
				}else{
					if(temp.next==null){
						new_node.prev=temp;
					temp.next=new_node;
					}else{
						temp.next.prev=new_node;
					new_node.next=temp.next;
					temp.next=new_node;
					new_node.prev=temp;
					}
					return;
				}
				
			}
		}
		
		void append(int data){

			
			Node new_node=new Node(data);
			
		if(head==null){
			head=new_node;
			return;
		}
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			
			temp.next=new_node;
			new_node.prev=temp;
			
		}
		
		
		void delete(int data){
			Node temp=head;
			if(temp==null)
				return;
			
			if(temp.data==data){
				temp=temp.next;
				temp.prev=null;
				head=temp;
				return;
			}
			
			while(temp.data!=data){
				temp=temp.next;
			}
			
			if(temp==null)
				return;
			else{
				temp.prev.next=temp.next;
				temp.next.prev=temp.prev;
				
			}
			
			return;	
			
		}
	
}





class P1{
	public static void main(String args[]){
		DLL d=new DLL();
		
		d.insert(20);
		d.insert(30);
		d.insert(20);
		d.insert(10);
		d.insert(85);
		d.insert(76);
		d.insert(45);
		d.insert(69);
		d.insert(98);
		d.insertAfter(8,83);
		d.append(41);
		d.delete(10);
		d.display();
		
	}
}