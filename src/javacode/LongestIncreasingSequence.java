package javacode;
//������Ŀ�Ľⷨ���ǣ�����״̬ת�Ʒ��̾��ǣ������յ�j, ����LIS���Ⱦ�����ǰ���κ�С��������ֵ�������µ�LIS���ȡ�
//�����漰����������һ�����ڴ洢��ֵ��һ��ֻ�Ǵ���LISֵ������������ͬ�ġ�
//Global �������ǲ�һ�����һ�������ģ�������ϣ���ܹ���f������Ѱ��һ��������ֵ��
import java.util.Arrays;

public class LongestIncreasingSequence {
	
	static int LIS(int[] nums){
		//int[] f=nums; //�����ˣ���ô��������ں�������num �ͱ���ʼ��Ϊ1��
		if (nums==null || nums.length==0) return 0;
		int global=0;
		int[] f = new int[nums.length];//�Ͳ���ʼ�����Ͳ�����ֵ
		Arrays.fill(f,1);	
		
		for(int i=0;i<nums.length;i++){
			for (int j=0;j<i;j++){ 				
				if (nums[j]<nums[i]){
					f[i]=Math.max(f[i],f[j]+1);
					//System.out.printf("%d",f[i]);
				}				
			}
			if(f[i]>global) global=f[i];
		}
		
		return global;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={10,9,2,5,3,7,101,18};
		int nums2[]={1,3,6,7,9,4,10,5,6};
		int result = LIS(nums2);
		System.out.printf("%d",result);
	}

}
