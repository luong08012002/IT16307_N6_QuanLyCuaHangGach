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
public class Gach {
    
    private String maGach,tenGach, maDv, soLuong, maChatLieu, maTheLoai, maNhaCungCap, anh;
    private boolean trangThai;

    public Gach() {
    }

    public Gach(String maGach, String tenGach, String maDv, String soLuong, String maChatLieu, String maTheLoai, String maNhaCungCap, String anh, boolean trangThai) {
        this.maGach = maGach;
        this.tenGach = tenGach;
        this.maDv = maDv;
        this.soLuong = soLuong;
        this.maChatLieu = maChatLieu;
        this.maTheLoai = maTheLoai;
        this.maNhaCungCap = maNhaCungCap;
        this.anh = anh;
        this.trangThai = trangThai;
    }

    public String getMaGach() {
        return maGach;
    }

    public void setMaGach(String maGach) {
        this.maGach = maGach;
    }

    public String getTenGach() {
        return tenGach;
    }

    public void setTenGach(String tenGach) {
        this.tenGach = tenGach;
    }

    public String getMaDv() {
        return maDv;
    }

    public void setMaDv(String maDv) {
        this.maDv = maDv;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getMaChatLieu() {
        return maChatLieu;
    }

    public void setMaChatLieu(String maChatLieu) {
        this.maChatLieu = maChatLieu;
    }

    public String getMaTheLoai() {
        return maTheLoai;
    }

    public void setMaTheLoai(String maTheLoai) {
        this.maTheLoai = maTheLoai;
    }

    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Gach{" + "maGach=" + maGach + ", tenGach=" + tenGach + ", maDv=" + maDv + ", soLuong=" + soLuong + ", maChatLieu=" + maChatLieu + ", maTheLoai=" + maTheLoai + ", maNhaCungCap=" + maNhaCungCap + ", anh=" + anh + ", trangThai=" + trangThai + '}';
    }
    
    

}
