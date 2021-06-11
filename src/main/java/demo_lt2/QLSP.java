/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_lt2;

import java.util.ArrayList;

/**
 *
 * @author tiennh
 */
public class QLSP {
    private ArrayList<SanPham> listSP;
    
    public QLSP () {
        this.listSP = new ArrayList<>();
    }

    public ArrayList<SanPham> getListSP() {
        return listSP;
    }

    public void setListSP(ArrayList<SanPham> listSP) {
        this.listSP = listSP;
    }
    
    public void add(SanPham sp) {
        this.listSP.add(sp);
    }
}
