import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CoppyfileText {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\Pham Duyet\\Desktop\\New folder\\test.txt");
            fileOutputStream = new FileOutputStream("C:\\Users\\Pham Duyet\\Desktop\\New folder\\result.txt");
            int check;
            while ((check = fileInputStream.read()) != -1) {
                System.out.println((char) check);
                fileOutputStream.write(check);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
