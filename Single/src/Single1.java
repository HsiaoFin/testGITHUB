class Singleton {
	private static Singleton s;
	private Singleton(){//构造器是私有的，内部才能调用
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
		// 测试 代码
	//	Singleton sl = new Singleton();
		Singleton.getSigleton();
		
		//测试for循环代码
		int time = 0;
		for(int i = 1, j=50; i<100 && j<100 ; i++,j++){
			time++;
		}
		System.out.print(time);
		//测试数组代码
		float []f[] = new float[6][]; 
	}
}