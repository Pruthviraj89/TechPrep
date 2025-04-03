class BinarySearch{
	static Node start;
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
		Node(){
			start=null;
		}
	}
	
	
	Node insertData(Node head,int data){
			
		if(head==null){
			Node new_node=new Node(data);
			head=new_node;
			return head;
		}
		if(data<=head.data)
			head.left=insertData(head.left,data);
		else
			head.right=insertData(head.right,data);
		
		return head;	
	}
	
	void insert(int data){
		start=insertData(start,data);
	}
	
	
	Node deleteData(Node head,int key){
		if(head==null)
			return head;
		 if(key<head.data){
			head.left=deleteData(head.left,key);
		}else if(key>head.data){
			head.right=deleteData(head.right,key);
		}else{
			if(head.left==null){
				return head.right;
			}else if(head.right==null){
				return head.left;
			}
			head.data=minvalue(head.right);
			head.right=deleteData(head.right,head.data);
		}
			return head;
		
	}
	
	int minvalue(Node root){
		while(root.left!=null){
			root=root.left;
		}
		return root.data;
	}

	void inorder(Node head){
		Node temp=head;
		if(temp!=null){
			inorder(temp.left);
			System.out.print(temp.data+"-");
			inorder(temp.right);
			
		}
	}




	
}
class BST{
	
	
	public static void main(String args[]){
		
		BinarySearch s1=new BinarySearch();
		s1.insert(15);
		s1.insert(20);
		s1.insert(30);
		s1.insert(63);
		s1.insert(28);
		s1.insert(32);
		s1.insert(64);
		s1.insert(78);
		s1.insert(89);
		s1.insert(76);
		s1.inorder(s1.start);
		
	}
	
}