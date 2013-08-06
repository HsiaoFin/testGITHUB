package test2;
import java.util.ArrayList;

class Data {
	int	val;
	int	getVal() {
		return val;
	}
	void	setVal(int val) {
		this.val = val;
	}
}

public class ListTest {

	public static void main(String argv[]) {
		Data data = new Data();
		ArrayList list = new ArrayList();

		for (int i=100; i<103; i++) {
			data.setVal(i);
			list.add(data);

		}

		int j = 0;
		while (j < list.size()) {
			Data tmp = (Data )list.get(j);
			System.out.println("list(" + j + ") = " + tmp.getVal());
			j++;
 
		}
	}
}

