package Insert;
import java.util.Random;
/**
 * 
 * ����˵�������������������У�==��ÿ�δ��ұߵĶ����ó�һ����������е����Ƚ�
 * ���˼·��
 * 1����ѡ������һ������������ұ�����
 * 2�����ұߵ�һ�������뵽��ߵ�������
 * 
 * 
 * �ؼ���
 * 1����һ��ѭ������������е������ڶ���ѭ����ʾ�Ѿ��������������磺i=10ʱj=10�Ѿ���������10������
 * 2������һ��ѭ���ǻ�δ�Ƚϵ������ڶ���ѭ���Ǻ��Ѿ�����õ����Ƚ�
 * 3��Ȼ�󽫵�10����A��ǰ9����Bһһ�Ƚϣ���AС��B���滻��ֱ������A����B
 * 
 */
class test{
	
	//˽�����飬�����಻�ܷ���
	private int[] a = new int[100];
	private Random random = null;

	//����getA����������
	public int[] getA(){
		return a;
	} 

	//�����������ʼ��
	public void init(){
		random  =  new Random();//��������ʼ��
		for(int i  =  0; i < a.length; i++){
			a[i]  =  random.nextInt(99) + 1; //��1~99���������ѡһ������+1��Ϊ���ų�0��
		}
	}
	
	//չʾ����
	public void show(int a[]){
		for(int i = 0;i<a.length;i++)
			System.out.print(a[i]+" "); 
	}
	
	//���������㷨
	public void sort(){
		int tmp = 0;
		if(a != null){//�п�
			for(int i = 1;i < a.length;i++){
				for(int j = i; j > 0 && a[j]<a[j-1]; j--){
					tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
				}
			}
		}
		else
			System.out.print("array hasn't bean inited!"); 
	}
}

public class Insert {
	public static void main(String[] args) {
		
		test t = new test();
		int[] array = t.getA();
		
		t.init();
		System.out.print("before sort ");
		t.show(array);
		t.sort();//����
		System.out.print("\nafter sort ");
		t.show(array);

	}
}

//for(int i = 1;i < a.length;i++){
//	int temp = a[i], j = i;
//	if(a[j-1] > temp){
//		while(j >= 1 && a[j-1] > temp){
//			a[j] = a[j-1];
//			j--;
//		}
//	}
//	a[j] = temp;
