package Quick3way;
import java.util.Random;
/**
 * 
 * ����˵���������зֿ��������������У�==��
 * ���˼·��
 * 1����ʼ�������Ҫ�����Գ�ʼҪ����˳��
 * 
 * �ؼ���
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

	//��������
	public void exch(int a[],int x,int y){
		int tmp = 0;
		tmp = a[x];
		a[x] = a[y];
		a[y] = tmp;

	}

	//���������㷨
	public void sort(int a[],int lo,int hi){
		//		int lo = 0;
		//		int hi = a.length - 1;

		if(a != null){//�п�

			if(hi <= lo) return;
			int lt = lo;
			int i = lo + 1;
			int gt = hi;
			
			int v = a[lo];

			while(i <= gt){

				if(a[i] < v){
					exch(a,lt++,i++);
				}else if(a[i] > v){
					exch(a,i,gt--);
				}else{
					i++;
				}
			}//����a[lo ... lt - 1] < v = a[lt ... gt] < a[gt + 1 ... hi]����
			sort(a,lo,lt - 1);
			sort(a,gt + 1,hi);
		}

		else
			System.out.print("array hasn't bean inited!"); 

	}
}
public class Quick3way {
	public static void main(String[] args) {

		test t = new test();
		int[] array = t.getA();

		t.init();
		System.out.print("before sort ");
		t.show(array);

		t.sort(array,0,array.length - 1);//����

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
