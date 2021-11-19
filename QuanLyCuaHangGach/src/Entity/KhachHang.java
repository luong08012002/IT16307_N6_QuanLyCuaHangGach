
package Entity;


public class KhachHang {
    private String maKhachHang,tenKhachHang,diaChi,SDT,email,thongTinKhac;
    private boolean trangThai;

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String tenKhachHang, String diaChi, String SDT, String email, String thongTinKhac, boolean trangThai) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.email = email;
        this.thongTinKhac = thongTinKhac;
        this.trangThai = trangThai;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getThongTinKhac() {
        return thongTinKhac;
    }

    public void setThongTinKhac(String thongTinKhac) {
        this.thongTinKhac = thongTinKhac;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKhachHang=" + maKhachHang + ", tenKhachHang=" + tenKhachHang + ", diaChi=" + diaChi + ", SDT=" + SDT + ", email=" + email + ", thongTinKhac=" + thongTinKhac + ", trangThai=" + trangThai + '}';
    }
    
}
