package test;

public class ThreadTest{
	public static void main(String argv[]) {
		MyThread t = new MyThread();
		t.run(); //����run����
		t.start(); //start����
		System.out.println("A");
	  }
}
class MyThread extends Thread{ //�̳�Thread��
	public void run(){
		try {
			Thread.currentThread().sleep(3000);  //��ǰ�߳�����3��
		} catch (InterruptedException e) {//catch����쳣
		}
		System.out.println("B");
	}
}
