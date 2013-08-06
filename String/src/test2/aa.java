package test2;

class A {
	void fun1() {
		System.out.println(fun2());
	}
	int fun2() {
		return 123;
	}
}

class B extends A {
	int fun2() {
		return 456;
	}
	public static void main(String argv[]) {
		A a = new A();
		B b = new B();
		a.fun1();
		b.fun1();//456
		a = b;
		a.fun1();//456
	}
}
