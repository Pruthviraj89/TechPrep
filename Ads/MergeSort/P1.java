import java.util.*;
class MergeSort{
	int arr[];
	void mergeSort(int arr[],int p,int r){
		this.arr=arr;
		if(p<r){
			int mid=(p+(r-p)/2);
			mergeSort(arr,p,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,p,mid,r);
		}
		
	}
	
	void merge(int arr[],int p,int q,int r){
		int n1=(q+1)-p;
		int n2=r-q;
		
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		//Adding
		for(int i=0;i<n1;i++)
			L[i]=arr[p+i];
		for(int j=0;j<n2;j++)
			R[j]=arr[(q+1)+j];
		int i=0,j=0,k=p;
			//case1
			while(i<n1 && j<n2){
				if(L[i]<=R[j]){
					arr[k]=L[i];
					i++;
				}else{
					arr[k]=R[j];
					j++;
				}
				k++;
			}
			//case 2
			while(i<n1){
				arr[k]=L[i];
				i++;
				k++;
			}
			//case 3
			while(j<n2){
				arr[k]=R[j];
				j++;
				k++;
			}
		
	}
	void display(){
		System.out.println(Arrays.toString(arr));
	}
	
	
	
}
class P1{
	public static void main(String ...args){
		
		int arr[] = {99,44,77,22,88,33,11,66,55};
		MergeSort m=new MergeSort();
		m.mergeSort(arr,0,8);
		m.display();
	}
}