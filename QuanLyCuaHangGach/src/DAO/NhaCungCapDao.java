/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Helper.jdbcHelper;
import java.util.ArrayList;
import Entity.NhaCungCap;
import java.awt.List;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class NhaCungCapDao extends DAO<NhaCungCap, String>{
    String SQL_Insert="insert into NHACUNGCAP values(?,?,?,?,?,?,?) ";
    String SQL_Update="update NHACUNGCAP set MANHACUNGCAP=?,TENHACUNGCAP=?,DIACHI=?,SODIENTHOAI=?,EMAIL=?,THONGTINKHAC=?,TRANGTHAI=?";
    String SQL_Delete="delete from NHACUNGCAP WHERE MANHACUNGCAP=?";
    String SQL_SelectAll="select*from NHACUNGCAP";
    String SQL_SelectID="select*from NHACUNGCAP where MANHACUNGCAP=?";

    @Override
    public void them(NhaCungCap entity) {
         jdbcHelper.update(SQL_Insert, entity.getMaNhaCungCap(),entity.getTenNhaCungCap(),entity.getDiaChi(),entity.getSDT(),entity.getEmail(),entity.getThongTinKhac(),entity.isTrangThai()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void capNhat(NhaCungCap entity) {
       jdbcHelper.update(SQL_Update, entity.getMaNhaCungCap(),entity.getTenNhaCungCap(),entity.getDiaChi(),entity.getSDT(),entity.getEmail(),entity.getThongTinKhac(),entity.isTrangThai());
    }

    @Override
    public void xoa(String key) {
     jdbcHelper.update(SQL_Delete, key); 
    }

    @Override
    public ArrayList<NhaCungCap> selectAll() {
       return this.selectBySql(SQL_SelectAll);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NhaCungCap selectByID(String key) {
     ArrayList<NhaCungCap> listNCC= this.selectByID(SQL_SelectID,key); 
if(listNCC.isEmpty()){
return null;
}else
{
return listNCC.get(0);
}

    }

    @Override
    protected ArrayList<NhaCungCap> selectBySql(String sql, Object... args) {
      ArrayList<NhaCungCap> listNCC= new ArrayList<>();
        try {
            ResultSet rs=jdbcHelper.query(sql, args);
            while (rs.next()) {
listNCC.add(new NhaCungCap(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getBoolean(7)));          
            }
            rs.getStatement().getConnection().close();
            return listNCC;
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList<NhaCungCap> selectByID(String SQL_SelectID, String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    

    
}
