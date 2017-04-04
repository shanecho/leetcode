package javacode;

public class longestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] bq={"Harris","Harter","Harbin"};
		String result = lcp(bq);
		System.out.printf("%s",result);
	}
	
	public static String lcp (String[] strs) {
		if (strs.length==0) return "";
		for (int j = 0; j < strs[0].length(); ++j) { // ×ÝÏòÉ¨Ãè
            for (int i = 1; i < strs.length; ++i) {
                if (j == strs[i].length() || 
                        strs[i].charAt(j) != strs[0].charAt(j))
                    return strs[0].substring(0, j);
            }
		}
		return strs[0];
	}

}
