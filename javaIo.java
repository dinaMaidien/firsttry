import java.io.File;
import java.io.FileReader;


public class javaIo {

    public  static void main(String[]args){
        try {
            File file = new File("newText.txt");
            FileReader fr = new FileReader(file);

        } catch (Exception e){
            System.out.println("Caught checkeck' = " + e.getMessage());
        }

    }
    
}
