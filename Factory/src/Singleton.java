//
////���󹤳���ɫ
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
////Ӧ�ú;����Ʒ�γɶ�Ӧ��ϵ��������... 
////���뱩��������
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