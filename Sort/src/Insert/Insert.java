package Insert;
import java.util.Random;
/**
 * 
 * 程序说明：插入排序（升序排列）==》每次从右边的堆里拿出一个和左边所有的数比较
 * 设计思路：
 * 1、和选择排序一样，左边有序，右边无序。
 * 2、将右边的一个数插入到左边的有序中
 * 
 * 
 * 关键：
 * 1、第一个循环代表遍历所有的数，第二个循环表示已经遍历过的数（如：i=10时j=10已经遍历到了10个数）
 * 2、即第一个循环是还未比较的数，第二个循环是和已经排序好的数比较
 * 3、然后将第10个数A与前9个数B一一比较，若A小于B则替换，直到遇见A大于B
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
	
	//插入排序算法
	public void sort(){
		int tmp = 0;
		if(a != null){//判空
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
		t.sort();//排序
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
