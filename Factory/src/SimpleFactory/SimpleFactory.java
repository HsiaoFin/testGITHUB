package SimpleFactory;

//����ӿ�car
interface Car{
	public void run();
	public void stop();
}
//����ʵ����1
class Benz implements Car{
	public void run(){
		System.out.println("Benz��ʼ�����ˡ���������");
	}
	public void stop(){
		System.out.println("Benzͣ���ˡ���������");
	}
}
//����ʵ����2
class Ford implements Car{
	public void run(){
		System.out.println("Ford��ʼ�����ˡ�����");
	}
	public void stop(){
		System.out.println("Fordͣ���ˡ�������");
	}
}
//�򵥹���
class Factory{
	public static Car getCarInstance(){
		return new Benz();//����һ������
	}
}
//mian class   
public class SimpleFactory {
	public static void main(String[] args) {
		Car c=Factory.getCarInstance();
		c.run();
		c.stop();

	}

}
