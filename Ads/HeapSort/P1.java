import java.util.*;
class MaxHeap{
	void heapify(int arr[],int n,int i){
		int largest=i;
		int lc=2*i+1;
		int rc=2*i+2;
		
		if(lc<n && arr[lc]>arr[largest])
			largest=lc;
		if(rc<n && arr[rc]>arr[largest])
			largest=rc;
		if(largest!=i){
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			
			heapify(arr,n,largest);
		}
	}
	
	
	void heapsort(int arr[]){
		int n=arr.length;
		
		for(int i=n/2-1;i>=0;i--)
			heapify(arr,n,i);
		
		for(int i=n-1;i>=0;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			heapify(arr,i,0);
		}
	}	
}

class P1{
	
	
	
	public static void main(String args[]){
		int arr[]={5,23,14,75,41,20,39};
		MaxHeap m=new MaxHeap();
		m.heapsort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}