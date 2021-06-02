/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author tiennh
 */
public class DemoCollectionsUtil {
    public static void main(String[] args) {
        SinhVienPoly sv1 = new SinhVienPoly("PS12345", "Nguyen Van A"),
            sv2 = new SinhVienPoly("PK06213", "Tran Thi B"),
            sv3 = new SinhVienPoly("PH06132", "Do Van C");

        List<SinhVienPoly> listSV = new ArrayList<SinhVienPoly>();
        listSV.add(sv1);
        listSV.add(sv2);
        listSV.add(sv3);
        
        Comparator<SinhVienPoly> soSanhMaSV = new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly sv1, SinhVienPoly sv2) {
                return sv1.getMaSV().compareTo(sv2.getMaSV());
            }
        };
        
        System.out.println("List = " + listSV.toString());
        Collections.sort(listSV, soSanhMaSV);
        System.out.println("Sorted List = " + listSV.toString());
    }
}
