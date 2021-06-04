/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_io.character_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author tiennh
 */
public class DemoBufferIOStream {
    public static void main(String[] args) {
        System.out.println("Bắt đầu ghi file");
        ghiFile();
        System.out.println("Kết thúc ghi file");
        System.out.println("-------------------");
        System.out.println("Bắt đầu đọc file");
        docFile();
        System.out.println("Kết thúc đọc file");
    }

    private static void ghiFile() {
        String filename = "src/main/java/demo_io/character_io/demo_buffer_io.txt";
        try {
            FileWriter writer = new FileWriter(filename);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            
            bufferWriter.write("Hello ong vàng SU2021\n");
            bufferWriter.write("Hello Poly\n");
            bufferWriter.flush();
            bufferWriter.close();
            writer.close();
        } catch (Exception e) {
            System.out.println("Ghi file thất bại");
            e.printStackTrace();
        }
    }

    private static void docFile() {
        String filename = "src/main/java/demo_io/character_io/demo_buffer_io.txt";
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader bufferReader = new BufferedReader(reader);
            
            String text;
            do {
                text = bufferReader.readLine();
                
                if (text == null) {
                    break;
                }

                System.out.println(text);
            } while (true);
            
            bufferReader.close();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
    }
}
