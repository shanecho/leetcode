package javacode;

public class remove_duplicate_from_sorted_array {
	
	static int remove_duplicate(int[] ary){
		int index=1;
		for(int i=1;i<ary.length;i++){
			if (ary[i]!=ary[index-1]){
				ary[index++]=ary[i];
			}
		}
		return index;
	}
	
	public static void main(String[] args){
		int ary[]={1,2,3,3,4};
		int result = remove_duplicate(ary);
		
		System.out.printf("%d\n",result);
		
		for(int i=0;i<result;i++){
			System.out.printf("%d ",ary[i]);
		}
		
		System.out.println("Success");		
	}

}
