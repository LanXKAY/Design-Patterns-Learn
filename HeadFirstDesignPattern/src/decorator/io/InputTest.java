package decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InputTest {
    public static void main(String[] args) {
        int c;
        String filePath = "HeadFirstDesignPattern/DecoratorIoTest.txt";
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    Files.newInputStream(Paths.get(filePath))));

            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
