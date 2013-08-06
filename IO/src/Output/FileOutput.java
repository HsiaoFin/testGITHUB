package Output;

/*
 * 【运行结果】：

	程序运行之后，在d盘下会有一个名字为hello.txt的文件。
 */
//lunix 下
import java.io.*;
class hello{
    public static void main(String[] args) {
        String fileName="D:"+File.separator+"hello.txt";
        File f=new File(fileName);
        try{
            f.createNewFile();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//windows下
//import java.io.*;
//class hello{
//    public static void main(String[] args) {
//        File f=new File("D:\\hello.txt");
//        try{
//            f.createNewFile();
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
