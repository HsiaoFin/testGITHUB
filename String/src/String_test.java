
public class String_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s1 = "abc" + "def";
		 String s2 = new String(s1);
		 
		 //equals ��������String������ĳ���Object�м̳еģ�
		 //����������������������Ƿ���ȣ����ִ�Сд
		 if(s1.equals(s2))
			 System.out.println(".equals() succeeded");
		 
		//�����������ڴ�ռ䶼�ڶ����棬�����ǱȽ϶ѿռ�ĵ�ַ���϶�����
		 if(s1 == s2)
			 System.out.println("== succeeded");

		 

	}

}
