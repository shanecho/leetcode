package javacode;
import java.util.List;
import java.util.ArrayList;

public class restore_ip_address {
	
	public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        List<String> ip = new ArrayList<>();
        dfs(s,ip,result,0);
        return result;
    }

    /**
     * �����ַ���
     * @param[in] s �ַ�������������
     * @param[out] ip ����м���
     * @param[out] result ������п��ܵ�IP��ַ
     * @param[in] start ��ǰ���ڴ���� index
     * @return ��
     */
    private static void dfs(String s, List<String> ip,
                            List<String> result, int start) {
    	if(ip.size() == 4 && start == s.length()){
    		result.add(ip.get(0)+'.'+ ip.get(1) +'.'+ip.get(2)+'.'+ip.get(3));
    		return;
    	}
    	
    	//��ֽ
    	if ((s.length()-start) > (4-ip.size())*3) return;
    	if ((s.length()-start) < (4-ip.size())) return;
    	
    	//��֧
        int num=0;
        for(int i = start; i < start+3 && i < s.length(); i++){
        	num = num*10+ (s.charAt(i)-'0');
        	if(num < 0 || num > 255) continue;
        	ip.add(s.substring(start, i+1));
        	dfs(s, ip, result, i+1);
        	ip.remove(ip.size()-1);
        	
        	if (num == 0) break;
        }       
        
    }

	public static void main(String[] args){
		String s = "2552550135";
		System.out.print(restoreIpAddresses(s));
		System.out.println("success");
	}
}
 