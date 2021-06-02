/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7_collection;

/**
 *
 * @author tiennh
 */
public class SinhVienPoly {
    private String maSV;
    private String hoten;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String maSV, String hoten) {
        this.maSV = maSV;
        this.hoten = hoten;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    
    @Override
    public String toString()
    {
        return this.getHoten() + " - " + this.getMaSV();
    }
}
