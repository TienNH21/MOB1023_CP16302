/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi12_oop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tiennh
 */
public class QuanLyDanhSach implements QuanLy
{
    private ArrayList<Nguoi> danhSach;
    
    public QuanLyDanhSach() {
        this.danhSach = new ArrayList<Nguoi>();
    }
    
    @Override
    public void them(Nguoi nguoi)
    {
        this.danhSach.add(nguoi);
    }

    @Override
    public boolean xoa(int viTri) {
        this.danhSach.remove(viTri);
        return true;
    }

    @Override
    public ArrayList<Nguoi> xuatDanhSach() {
        return this.danhSach;
    }

    @Override
    public Nguoi getByViTri(int viTri) {
        return this.danhSach.get(viTri);
    }
    
    @Override
    public void taoSvAo()
    {
        SinhVien sv1 = new SinhVien("PH12344", "UDPM", "Nguyen Van A", 1, "HN");
        SinhVien sv2 = new SinhVien("PH12345", "TKTW", "Nguyen Van B", 1, "HN");
        SinhVien sv3 = new SinhVien("PH12346", "UDPM", "Nguyen Thi C", 0, "HN");
        
        this.danhSach.add(sv1);
        this.danhSach.add(sv2);
        this.danhSach.add(sv3);
    }
}
