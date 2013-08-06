
public class String_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s1 = "abc" + "def";
		 String s2 = new String(s1);
		 
		 //equals 方法（是String类从它的超类Object中继承的）
		 //被用来检测两个对象内容是否相等，区分大小写
		 if(s1.equals(s2))
			 System.out.println(".equals() succeeded");
		 
		//开辟了两个内存空间都在堆里面，所以是比较堆空间的地址，肯定不等
		 if(s1 == s2)
			 System.out.println("== succeeded");

		 

	}

}
