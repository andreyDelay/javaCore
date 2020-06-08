package main.java.com.andreyDelay.javacore.chapter20.streamsForChars;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" +
                " to come to the aid of their country\n" +
                " and pay their due taxes.";
        char [] buffer = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);

        try (
            FileWriter f1 = new FileWriter("C:\\Users\\Я\\Desktop\\tmp\\file1.txt");
            FileWriter f2 = new FileWriter("C:\\Users\\Я\\Desktop\\tmp\\file2.txt");
            FileWriter f3 = new FileWriter("C:\\Users\\Я\\Desktop\\tmp\\file3.txt"))
        {
            for (int i = 0; i < buffer.length; i++) {
                f1.write(buffer[i]);
            }

            f2.write(buffer);

            f3.write(buffer, buffer.length - buffer.length/4, buffer.length/4);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
