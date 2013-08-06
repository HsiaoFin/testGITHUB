package FileDelete;

/**
 * 删除一个文件
 * */
import java.io.*;
class hello{
    public static void main(String[] args) {
        String fileName="D:"+File.separator+"hello.txt";
        File f=new File(fileName);
        if(f.exists()){
            f.delete();
        }else{
            System.out.println("文件不存在");
        }
         
    }
}
