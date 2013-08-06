package test;

import java.io.IOException;
public class ExceptionTest {
	public static void main(String args[]) {
		try {
			new ExceptionTest().methodA(5);
			
		} catch (IOException e) {
			System.out.println("caught IOException");
		} catch (Exception e) {
			System.out.println("caught Exception");
		}finally{ //总会输出的
			System.out.println("no Exception");
		}
	}

	void methodA(int i) throws IOException { //抛出IO异常
		System.out.print(i%2);//  1
		if (i%2 != 0)
			throw new IOException("methodA IOException");
	}
	
}

