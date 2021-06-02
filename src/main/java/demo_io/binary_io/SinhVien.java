/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_io.binary_io;

import java.io.Serializable;

/**
 *
 * @author tiennh
 */
public class SinhVien implements Serializable {
    private String hoTen;
    private String maSV;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSV) {
        this.hoTen = hoTen;
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    
    
}
