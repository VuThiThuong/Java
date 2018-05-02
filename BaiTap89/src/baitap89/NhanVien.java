/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap89;

import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author THUONG THUONG
 */
public class NhanVien {
    private String maNV;
    private String phanXuong;
    private int soSP;
    public NhanVien(){
        maNV = "";
        phanXuong = "";
        soSP = 0;
    }

    /**
     * @return the maNV
     */
    public String getMaNV() {
        return maNV;
    }

    /**
     * @param maNV the maNV to set
     */
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    /**
     * @return the phanXuong
     */
    public String getPhanXuong() {
        return phanXuong;
    }

    /**
     * @param phanXuong the phanXuong to set
     */
    public void setPhanXuong(String phanXuong) {
        this.phanXuong = phanXuong;
    }

    /**
     * @return the soSP
     */
    public int getSoSP() {
        return soSP;
    }

    /**
     * @param soSP the soSP to set
     */
    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }
    public int getChuan(){
        if(getPhanXuong() == "A")
            return 300;
        else return 500;
    }
    
    public boolean vuotChuan(){
        if(getSoSP() > getChuan())
            return true;
        else return false;
    }
    public double tinhLuong(){
        if(vuotChuan()==true)
            return getChuan()*20000 + (getSoSP()-getChuan())*30000;
        else
            return getSoSP()*20000;
    }
    public String toString(){
        return getMaNV();
    }
}
