class Singleton {
	private static Singleton s;
	private Singleton(){//��������˽�еģ��ڲ����ܵ���
		System.out.println("A Singleton Model example");
	}
	public static Singleton getSigleton()
	{
		if(s==null)s=new Singleton();
		return s;
	}
}

public class Single1 {
	
	public static void main(String[] args) {
		// ���� ����
	//	Singleton sl = new Singleton();
		Singleton.getSigleton();
		
		//����forѭ������
		int time = 0;
		for(int i = 1, j=50; i<100 && j<100 ; i++,j++){
			time++;
		}
		System.out.print(time);
		//�����������
		float []f[] = new float[6][]; 
	}
}