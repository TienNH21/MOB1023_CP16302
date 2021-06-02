/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_io.binary_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author tiennh
 */
public class DemoDataIOStream {
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
        try {
            FileOutputStream fos = new FileOutputStream("demo_data_io.txt");
            DataOutputStream dataOS = new DataOutputStream(fos);
            
            int i1 = 5, i2 = 7;
            char c = 'a';
            
            dataOS.writeInt(i1);
            dataOS.writeInt(i2);
            dataOS.writeChar((int) c);
            
            dataOS.flush();
            dataOS.close();
            fos.close();

            System.out.println("Ghi file thành công.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }
    
    private static void docFile() {
        try {
            FileInputStream fis = new FileInputStream("demo_data_io.txt");
            DataInputStream dataIS = new DataInputStream(fis);
            
            int i1 = dataIS.readInt();
            int i2 = dataIS.readInt();
            char c = dataIS.readChar();
            
            dataIS.close();
            fis.close();

            System.out.printf("%d - %d - %c\n", i1, i2, c);
            System.out.println("Đọc file thành công");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
    }
}
