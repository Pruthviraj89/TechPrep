import java.util.*;
class Stack{
	static final int MAX=7;
	int top;
	int a[]=new int[MAX];
	
	Stack(){
		top=-1;
	}
	
	boolean isEmpty(){
		return(top<0);
	}
	boolean push(int x){
		if(top>=MAX-1){
			System.out.println("Stack is full");
			return false;
		}
		a[++top]=x;
		System.out.println(x+" pushed into stack");
		return true;
	}
	boolean pop(){
		if(top<=-1){
			System.out.println(" Stack is Empty");
			return false;
		}
		int x= a[top--];
		System.out.println(x+ " Removed from stack");
		return true;
	}
	
	int peek(){
		if(top<=-1){
			System.out.println("Stack is Empty");
			return 0;
		}
		int x= a[top];
		return x;
	}
	
	
}

class P1{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Stack s=new Stack();
		int choice;
		do{
			System.out.println("\n******** MENU *******");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEK");
            System.out.println("4. IS EMPTY?");
            System.out.println("5. EXIT");
            System.out.print("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice){
				
				case 1: System.out.println("Enter Element: ");
						s.push(sc.nextInt());
						break;
				case 2:s.pop();
						break;
				case 3:	int peek=s.peek();
						System.out.println("top element: "+peek);
						break;
				case 4:s.isEmpty();
						break;
				case 5:	sc.close();
						System.exit(0);
					break;
				default: System.out.println("Invalid input");
			}
			System.out.print("Do you want to continue? (1 for yes 0 for no): ");
			
		}while(sc.nextInt()==1);
		
		
	}
	
	
	
}