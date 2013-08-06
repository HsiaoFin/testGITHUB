package test;

public class Test {
	static boolean isTrue() {
		System.out.println("isTrue");
		return true;
	}

	static boolean isFalse() {
		System.out.println("isFalse");
		return false;
	}

	public static void main(String[] args) {
		if (isTrue() || isFalse()) {
			System.out.println(" || operate return true");
		}
		if (isFalse() & isTrue()) {
			System.out.println(" & operate return true");
		}
	}
}

