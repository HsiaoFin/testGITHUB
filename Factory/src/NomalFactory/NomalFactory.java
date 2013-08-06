package NomalFactory;
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

//��ͨ�����࣬ʹ�÷������
//Class.forName����//��JVM���Ҳ�����ָ�����࣬��NomalFactory.Car
class Factory{
    public static Car getCarInstance(String type){
        Car c=null;
        try {
            c = (Car)Class.forName("NomalFactory."+type).newInstance();//���÷���õ��������͡�
//              Car c = new Car();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    
        return c;
    }
}
//mian class   
public class NomalFactory {
    public static void main(String[] args) {
        Car c=Factory.getCarInstance("Benz");
        if(c!=null){
            c.run();
            c.stop();
        }else{
            System.out.println("�첻����������������");
        }
    }

}