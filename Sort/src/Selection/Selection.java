package Selection;

/**
 * 
 * 程序说明：选择排序（升序排列）==》每次拿一个右边（未选）数和右边所有的数比较，选最小的
 * 设计思路：
 * 1、找到数组中最小的数min，与数组的第一个元素交换位置（min
 * 2、在剩下的元素中找到最小的数 ，与数组的第二个元素交换（tmp
 * 3、双重循环，第一重1~n，记录A，第二重A+1~n，记录B。 
 * 4、比较A与B，若 A < B 则不变，
 * 	                     若 A > B 则记录下B的位置(不是值)min，然后交换AB
 * 关键：
 * 1、循环一代表排名第几小的数，循环二代表遍历所有的数
 * 2、第一个数和所有的数比，有小的就换掉第一个数，然后继续遍历知道结束。
 * 3、交换数组的位置就行，而不是数组的实际值
 * 4、找出第一小的，找出第二小的。设置一个min保存，找到就替换。
 * 
 * 
 */
public class Selection {
	public static void main(String[] args) {

		int[] a = {0,25,15,42,16,12,36};
		int min = 0;
		int tmp = 0;

		for(int i = 0; i < a.length; i++){

			min = i;//记录最小的数的数组位置，初始为i
			
			for(int j = i + 1; j < a.length; j++){
				if(a[min] > a[j])  //只要改一个符号就能变成降序
					min = j;      //记下较小数的位置j到min替换掉i，然后交换位置
			}

			if(i != min){
				tmp = a[i];
				a[i] = a[min];
				a[min] = tmp;
			}
		}

		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");
	}
}

//for(int i = 0; i < a.length; i++){
//max = i;//
///**查找第 i大的数，直到记下第 i大数的位置***/
//for(int j=i+1;j<a.length;j++){
//	if(a[max]<a[j]) 
//		max = j;//记下较大数位置，再次比较，直到最大
//}
///***如果第 i大数的位置不在 i,则交换****/
//if(i!=max){
//	tmp = a[i];
//	a[i] = a[max];
//	a[max] = tmp;
//}
//}