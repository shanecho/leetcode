package javacode;

public class Roman2Integer {
	public static void main(String[] args){
		int result = Roman2Int("MMMCCCXIII");
		System.out.printf("%d",result);
		System.out.println("success");
		
	}
	
	static int Roman2Int(String S){
		int result=0;
		for(int i=0; i<S.length();i++){
			if(i>0 && map(S.charAt(i))>map(S.charAt(i-1))){
				result = result - 2*map(S.charAt(i-1)) + map(S.charAt(i));			
			}else{
				result +=map(S.charAt(i));
			}
		}
		return result;
	}
	
	public static int map (char c){
		switch(c){
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		default: return 0;
		}
		//return 0;
	}
}
