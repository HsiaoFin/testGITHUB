package SimpleFactory;

//定义接口car
interface Car{
	public void run();
	public void stop();
}
//具体实现类1
class Benz implements Car{
	public void run(){
		System.out.println("Benz开始启动了。。。。。");
	}
	public void stop(){
		System.out.println("Benz停车了。。。。。");
	}
}
//具体实现类2
class Ford implements Car{
	public void run(){
		System.out.println("Ford开始启动了。。。");
	}
	public void stop(){
		System.out.println("Ford停车了。。。。");
	}
}
//简单工厂
class Factory{
	public static Car getCarInstance(){
		return new Benz();//生产一辆福特
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
