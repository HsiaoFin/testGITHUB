package Output;

/*
 * �����н������

	��������֮����d���»���һ������Ϊhello.txt���ļ���
 */
//lunix ��
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
//windows��
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
