/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_io.binary_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author tiennh
 */
public class DemoObjectIOStream {
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
            FileOutputStream fos = new FileOutputStream("demo_object_io.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            SinhVien sv1 = new SinhVien("Nguyen Van A", "PH12345"),
                sv2 = new SinhVien("Tran Thi B", "PH54321");
            
            oos.writeObject(sv1);
            oos.writeObject(sv2);
            
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ghi file thất bại!");
        }
    }

    private static void docFile() {
        try {
            FileInputStream fis = new FileInputStream("demo_object_io.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            SinhVien sv1 = (SinhVien) ois.readObject(),
                sv2 = (SinhVien) ois.readObject();
            
            System.out.printf("%s - %s\n", sv1.getHoTen(), sv1.getMaSV());
            System.out.printf("%s - %s\n", sv2.getHoTen(), sv2.getMaSV());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
    }
}
