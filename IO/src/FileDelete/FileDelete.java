package FileDelete;

/**
 * ɾ��һ���ļ�
 * */
import java.io.*;
class hello{
    public static void main(String[] args) {
        String fileName="D:"+File.separator+"hello.txt";
        File f=new File(fileName);
        if(f.exists()){
            f.delete();
        }else{
            System.out.println("�ļ�������");
        }
         
    }
}
