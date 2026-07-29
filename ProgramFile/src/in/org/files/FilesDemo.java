package in.org.files;

import java.io.File;

public class FilesDemo {
    public static void main(String[] args) {
        File fl = new File("C:\\Users\\Dell\\OneDrive\\Desktop\\Example\\Java\\FilesExample");
        boolean exists = fl.exists();
        System.out.println(exists);
        if(exists==false){
            fl.mkdirs();
            exists = fl.exists();
            System.out.println(exists);
        }
    }
}
