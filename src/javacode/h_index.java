//��������
//�������鳤��֮��ʵ���Ѿ���ʼ��������; ����ֵ���У����� int sum=0����ʽ;
//֮��������histogram Ϊ n+1����Ϊ��ϣ����󷵻ص���ֵh����Ҫ�ټ�1
// for(int x: citations) x��citation�����ÿһ��Ԫ��
//���������и����⣬���xȡ����Ԫ�أ���ô����˵�������Խ��
//������ĳ�̶ֳȽ���˼·�ǶԵģ���������Ӧ��������ģ�����Ӧ��������ģ��ڴӺ���ǰ���б���Ѱ��

package javacode;

public class h_index {
	public static int hIndex(int[] citations){
		int n=citations.length+1;
		int[] histogram= new int[n+1];
		
		for(int x:citations){
			histogram[x>n?n:x]++;
		}
		int sum=0;
		for(int i=n;i>0;i--){
			sum+=histogram[i];
			if(sum>=i){
				return i;
			}			
		}
		
		return 0;
	}
	public static void main(String[] args){
		int[] citations={3,0,6,1,5};
		int result = hIndex(citations);
		System.out.print(result);
		System.out.println("Success");
	}
}
