/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_io.character_io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author tiennh
 */
public class DemoFileIOStream {
    public static void main(String[] args) {
        System.out.println("Bắt đầu ghi file");
        ghiFile();
        System.out.println("Kết thúc ghi file");
        System.out.println("-------------------");
        System.out.println("Bắt đầu đọc file");
        docFile();
        System.out.println("Kết thúc đọc file");
    }
    
    private static void ghiFile()
    {
        String filename = "src/main/java/demo_io/character_io/demo_file_io.txt";
        File file = new File(filename);
        try {
            FileWriter writer = new FileWriter(file);
            
            writer.write("Hello ong vàng!");
            writer.write("TiếnNH21");
            
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }
    
    private static void docFile()
    {
        String filename = "src/main/java/demo_io/character_io/demo_file_io.txt";
        File file = new File(filename);
        
        try {
            FileReader reader = new FileReader(file);
            
            char[] result = new char[1000];
            reader.read(result);
            
            String resultStr = String.valueOf(result);
            
            System.out.println(resultStr);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
    }
}
