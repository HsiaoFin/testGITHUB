package reverseString;

public class reverseString {

	/**
	 * 1、使用substring切割，str.substring(切割开始位置，切割结束位置）
	 * 2、
	 */
	public static void main(String[] args) {

		String result = "";
		String str = "123456";
		
		for(int i=0; i < str.length(); i++)
			result=result + str.substring(str.length()-i-1 , str.length()-i);

		System.out.println(result);

	}
}
