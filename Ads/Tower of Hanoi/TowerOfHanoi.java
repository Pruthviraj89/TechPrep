class TowerOfHanoi{
	
	static void tower(int disk,char source, char intermidate,char destination){
		if(disk==1){
		System.out.println("disk "+disk+" from "+source+" to "+destination);
		return;
			}
		tower(disk-1,source,destination,intermidate); 
		System.out.println("Disk "+disk+" from "+source+" to "+destination);
		tower(disk-1,intermidate,source,destination);
		}


	public static void main(String ...args){

	
		tower(3,'A','B','C');

	
	}








}