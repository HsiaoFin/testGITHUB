package reverseString;

public class reverseString {

	/**
	 * 1��ʹ��substring�иstr.substring(�иʼλ�ã��и����λ�ã�
	 * 2��
	 */
	public static void main(String[] args) {

		String result = "";
		String str = "123456";
		
		for(int i=0; i < str.length(); i++)
			result=result + str.substring(str.length()-i-1 , str.length()-i);

		System.out.println(result);

	}
}
