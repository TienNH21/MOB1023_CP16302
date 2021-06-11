/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_lt2;

import java.io.Serializable;

/**
 *
 * @author tiennh
 */
public class SanPham implements Serializable {
    private String tenSP, maSP, danhMuc;
    private int gia;
    private int tinhTrang;

    public SanPham() {
    }

    public SanPham(String tenSP, String maSP, String danhMuc, int gia, int tinhTrang) {
        this.tenSP = tenSP;
        this.maSP = maSP;
        this.danhMuc = danhMuc;
        this.gia = gia;
        this.tinhTrang = tinhTrang;
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public int getGia() {
        return gia;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    
}
