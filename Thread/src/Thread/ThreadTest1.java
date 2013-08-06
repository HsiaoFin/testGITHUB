package Thread;

/*
 * 1、实现4个线程，2个线程+1,2个线程-1
 * 2、各执行100次
 * 
 */
public class ThreadTest1{
	private int j;
	public static void main(String args[]){
		ThreadTest1 tt=new ThreadTest1();
		
		Inc inc=tt.new Inc();
		Dec dec=tt.new Dec();
		
		for(int i=0;i<2;i++){
			Thread t=new Thread(inc);
			t.start();
			t=new Thread(dec);
			t.start();
		}
	}
	//设置线程同步：1、内容2、private synchronized void
	private synchronized void inc(){
		j++;
		System.out.println(Thread.currentThread().getName()+"-inc:"+j);
	}
	private synchronized void dec(){
		j--;
		System.out.println(Thread.currentThread().getName()+"-dec:"+j);
	}
	//Inc和Dec类必须实现Runnable接口
	class Inc implements Runnable{
		public void run(){
			for(int i=0;i<100;i++){
				inc();
			}
		}
	}
	class Dec implements Runnable{
		public void run(){
			for(int i=0;i<100;i++){
				dec();
			}
		}
	}
}

