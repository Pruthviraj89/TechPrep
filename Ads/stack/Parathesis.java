import java.util.*;
class StackDemo{
	Node top;
	
	static class Node{
		char data;
		Node next;
		Node(char data){
			this.data=data;
			this.next=null;
	} 
	}
		
		StackDemo(){
			this.top=null;
		}
		
		boolean isEmpty(){
			if(top==null){
				System.out.println("Stack underflow");
				return true;
			}
			return false;
		}
		
		
		Node push(char data){
			if(top==null){
				Node new_node=new Node(data);
				top=new_node;
				return top;
			}
			Node new_node=new Node(data);
			new_node.next=top;
			top=new_node;
			return top;
		}
		Node pop(){
			if(!isEmpty()){
				Node temp=top;
				top=top.next;
				temp.next=null;
				return temp;
			}
			return null;
		}
		
		
		Node peek(){
			if(!isEmpty()){
				Node temp=top;
				return temp;
			}
			return null;
		}

	
}
class Parathesis{
	public static void main(String args[]){
		StackDemo s=new StackDemo();
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		for(int i=0;i<n.length();i++){
			if(n.charAt(i)=='['||n.charAt(i)=='('|| n.charAt(i)=='{')
				s.push(n.charAt(i));
			else if(n.charAt(i)==']' && s.peek().data=='['){
				s.pop();
			}else if(n.charAt(i)=='}' && s.peek().data=='{'){
				s.pop();
			}else if(n.charAt(i)==')' && s.peek().data=='('){
				s.pop();
			}
			
		}
		if(s.top==null){
			System.out.println("Balanced");
		}else{
			System.out.println("Not Balanced");
		}
	}
}