package NomalFactory;
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

//普通工厂类，使用反射机制
//Class.forName（）//让JVM查找并加载指定的类，即NomalFactory.Car
class Factory{
    public static Car getCarInstance(String type){
        Car c=null;
        try {
            c = (Car)Class.forName("NomalFactory."+type).newInstance();//利用反射得到汽车类型　
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
            System.out.println("造不了这种汽车。。。");
        }
    }

}