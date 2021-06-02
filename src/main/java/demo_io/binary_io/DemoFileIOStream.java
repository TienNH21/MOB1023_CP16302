/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_io.binary_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        try {
            FileOutputStream fos = new FileOutputStream("demo_file_io.txt");
            String txt = "Hello ong vàng";
            
            byte[] b = txt.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Ghi file thành công");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }

    private static void docFile()
    {
        try {
            FileInputStream fis = new FileInputStream("demo_file_io.txt");
            while (true) {
                int c = fis.read();
                
                if (c == -1) {
                    break;
                }
                
                System.out.printf("%c", (char) c);
            }
            System.out.println("");
            System.out.println("Đọc file thành công");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
    }
}
