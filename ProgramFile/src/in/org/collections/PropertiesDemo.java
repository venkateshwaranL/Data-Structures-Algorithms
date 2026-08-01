package in.org.collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties pr = new Properties();
        FileInputStream fil = new FileInputStream("E:\\Internship\\Data-Structures-Algorithms\\ProgramFile\\src\\in\\org\\collections\\text.properties");
        pr.load(fil);
        System.out.println(pr);
    }
}
