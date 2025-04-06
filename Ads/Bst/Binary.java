class BinarySearch{
	static Node root;
	static class Node{
		int key;
		Node left,right;
		Node(int key){
			this.key=key;
			this.left=null;
			this.right=null;
		}
		Node(){
			root=null;
		}
	}
	
	
	boolean searchNode(Node head, int key){
		if(head==null)
			return false;
		Node temp=head;
		if(temp.key==key){
		return true;}
		else {
			if(key<temp.key){
				return searchNode(temp.left,key);
			}else{
				return searchNode(temp.right,key);
			}
			
		}
		
	}
	
	//wrapperSearch
	boolean search(int key){
		return searchNode(root,key);
	}
	
	
	Node insertData(Node root,int key){
		if(root==null){
			Node new_node=new Node(key);
			root=new_node;
			return root;
		}
	if(key<=root.key){
		root.left=insertData(root.left,key);
	}else{
		root.right=insertData(root.right,key);
	}
	return root;
	}
	
	void insert(int data){
		root=insertData(root,data);
	}
	
	
	Node deleteData(Node root,int key){
		if(root==null)
			return root;
		if(key<root.key){
			root.left=deleteData(root.left,key);
		}else if(key>root.key){
			root.right=deleteData(root.right,key);
		}else{
			if(root.left==null)
				return root.right;
			if(root.right==null)
				return root.left;
			root.key=minvalue(root.right);
			root.right=deleteData(root.right,key);
		}
		return root;
		
	}
	
	int minvalue(Node head){
		while(head.left!=null){
			head=head.left;
		}
		return head.key;
	}
	
	void delete(int data){
		root=deleteData(root,data);
	}
	
	void display(Node root){
		Node temp=root;
		if(temp!=null){
			display(root.left);
			System.out.print(temp.key+" ");
			display(root.right);
		}
	}
	
}
class Binary{
	public static void main(String args[]){
		BinarySearch s1=new BinarySearch();
		s1.insert(26);
		s1.insert(35);
		s1.insert(78);
		s1.insert(46);
		s1.delete(46);
		s1.display(s1.root);
		System.out.println(s1.search(35));
	}
}