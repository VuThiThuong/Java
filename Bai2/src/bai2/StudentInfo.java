/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author thuong
 */
public class StudentInfo {
    private String Ten;
    private String NamSinh;
    private Boolean gt;

    /**
     * @return the Ten
     */
    public String getTen() {
        return Ten;
    }

    /**
     * @param Ten the Ten to set
     */
    public void setTen(String Ten) {
        this.Ten = Ten;
    }

 
    public Boolean getGt() {
        return gt;
    }

    /**
     * @param gt the gt to set
     */
    public void setGt(Boolean gt) {
        this.gt = gt;
    }

    /**
     * @return the NamSinh
     */
    public String getNamSinh() {
        return NamSinh;
    }

    /**
     * @param NamSinh the NamSinh to set
     */
    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }

    void setGt(String nam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
