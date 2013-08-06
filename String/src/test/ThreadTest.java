package test;

public class ThreadTest{
	public static void main(String argv[]) {
		MyThread t = new MyThread();
		t.run(); //调用run方法
		t.start(); //start方法
		System.out.println("A");
	  }
}
class MyThread extends Thread{ //继承Thread类
	public void run(){
		try {
			Thread.currentThread().sleep(3000);  //当前线程休眠3秒
		} catch (InterruptedException e) {//catch打断异常
		}
		System.out.println("B");
	}
}
