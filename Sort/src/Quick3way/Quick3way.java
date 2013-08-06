package Quick3way;
import java.util.Random;
/**
 * 
 * 程序说明：三向切分快速排序（升序排列）==》
 * 设计思路：
 * 1、初始乱序很重要，所以初始要打乱顺序
 * 
 * 关键：
 * 
 */
class test{

	//私有数组，其他类不能访问
	private int[] a = new int[100];
	private Random random = null;

	//方法getA，返回数组
	public int[] getA(){
		return a;
	} 

	//数组随机。初始化
	public void init(){
		random  =  new Random();//随机排序初始化
		for(int i  =  0; i < a.length; i++){
			a[i]  =  random.nextInt(99) + 1; //从1~99里面随机挑选一个数（+1是为了排除0）
		}
	}

	//展示数组
	public void show(int a[]){
		for(int i = 0;i<a.length;i++)
			System.out.print(a[i]+" "); 
	}

	//交换数字
	public void exch(int a[],int x,int y){
		int tmp = 0;
		tmp = a[x];
		a[x] = a[y];
		a[y] = tmp;

	}

	//快速排序算法
	public void sort(int a[],int lo,int hi){
		//		int lo = 0;
		//		int hi = a.length - 1;

		if(a != null){//判空

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
			}//现在a[lo ... lt - 1] < v = a[lt ... gt] < a[gt + 1 ... hi]成立
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

		t.sort(array,0,array.length - 1);//排序

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
