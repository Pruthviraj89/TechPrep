



//Array should be sorted then pass it to Binary search




class BinarySearch{

	int search(int arr[],int key){
		int low=0,high=arr.length-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(arr[mid]==key){
				return mid;
			}else if(key<arr[mid]){
				high=mid-1;
			}else if(key>arr[mid]){
				low=mid+1;
			}
			
		}
		return -1;
	}

	
}



class P1{
	
	public static void main(String args[]){
		int arr[]={1,2,3,4,5,8,10};
		BinarySearch s=new BinarySearch();
		
		System.out.println(s.search(arr,5	));
		
		
	}
	
}