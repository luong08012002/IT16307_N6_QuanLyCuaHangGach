/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Asus
 */
public class TaiKhoan {
    private String taiKhoan;    
    private String matKhau;
    private String vaiTro;
    private String tenQuanLi;
    private String CCCD;
    private String email;

    public TaiKhoan() {
    }

    public TaiKhoan(String taiKhoan, String matKhau, String vaiTro, String tenQuanLi, String CCCD, String email) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
        this.tenQuanLi = tenQuanLi;
        this.CCCD = CCCD;
        this.email = email;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getTenQuanLi() {
        return tenQuanLi;
    }

    public void setTenQuanLi(String tenQuanLi) {
        this.tenQuanLi = tenQuanLi;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
