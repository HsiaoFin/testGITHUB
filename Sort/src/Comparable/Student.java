package Comparable;

import java.util.TreeSet;
import java.util.Iterator;

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student (int id, String name) {//���캯��
		this.id = id;
		this.name = name;
	}

	public void setId (int id) {
		this.id = id;
	}

	public void setName (String name) {
		this.name = name;
	}

	public int getId () {
		return id;
	}

	public String getName () {
		return name;
	}

	/* Student ����ַ������ʽ�����磺
	 * 2   ���� */

	 public String toString () {
		 return (id + "\t" + name);
	 }

	 /* ʵ�� Comparable �ӿ��е� compareTo ������
	  * ͨ������ʱ����һ��������С��ʱ����һ��������
	  * ����ʱ�����㣬��������������о�����
	  *********************************************************
	  * �����Ҹ��� id �ŵĴ�С�����˱Ƚϡ����� TreeSet
	  * ����� compareTo �Ľ�����������������
	  * Ӧ���ǰ��� id �Ŵ�С��������ġ�
	  * ���Ҫ����������������ֻ����������������Ӧ���޸ġ�*/

	 public int compareTo (Student arg) {
		 if (id > arg.id)
			 return 1;
		 else if (id == arg.id)
			 return 0;
		 else
			 return -1;
	 }

	 /* ����Ϊ���������������ǣ�
	  * 3     John
	  * 5     Tom
	  * 7     Alice
	  * 9     David
	  * ���Կ�����ͬ������˳��
	  * TreeSet �Ѿ����������ˡ�*/

	 public static void main (String args[]) {
		 TreeSet<Student> tset = new TreeSet<Student>();
		 tset.add(new Student(5, "Tom"));
		 tset.add(new Student(3, "John"));
		 tset.add(new Student(9, "David"));
		 tset.add(new Student(7, "Alice"));

		 Iterator<Student> itor = tset.iterator();
		 while (itor.hasNext()) {
			 System.out.println(itor.next().toString());
		 }
	 }
}
