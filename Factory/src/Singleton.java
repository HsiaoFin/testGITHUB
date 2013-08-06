//
////抽象工厂角色
//interface Driver{ 
//	public Car driverCar(); 
//} 
//public class BenzDriver implements Driver{ 
//	public Car driverCar(){ 
//		return new Benz(); 
//	} 
//} 
//public class BmwDriver implements Driver{ 
//	public Car driverCar() { 
//		return new Bmw(); 
//	} 
//} 
////应该和具体产品形成对应关系，这里略... 
////有请暴发户先生
//public class Factory 
//{ 
//	public static void main(String[] args) 
//	{ 
//		try{ 
//			Driver driver = new BenzDriver();
//
//			Car car = driver.driverCar(); 
//			car.drive(); 
//		}catch(Exception e) 
//		{ } 
//	} 
//}