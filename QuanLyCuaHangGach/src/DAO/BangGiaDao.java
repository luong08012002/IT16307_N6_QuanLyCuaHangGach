/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Entity.BangGia;
import Helper.jdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;

        
/**
 *
 * @author Administrator
 */
public class BangGiaDao extends DAO<BangGia, String>{
    
    String SQL_Insert="insert into BANGGIA values(?,?,?) ";
    String SQL_Update="update BANGGIA set MAGACH=?,GIAGACH=?,MANHACUNGCAP=?";
    String SQL_Delete="delete from BANGGIA WHERE MAGACH =?";
    String SQL_SelectAll="select*from BANGGIA";
    String SQL_SelectID="select*from BANGGIA where MAGACH=?";
    
    @Override
    public void them(BangGia entity) {
        jdbcHelper.update(SQL_Insert, entity.getMaGach(), entity.getGia(),entity.getMaNhaCungCap());
    }

    @Override
    public void capNhat(BangGia entity) {
        jdbcHelper.update(SQL_Update, entity.getMaGach(), entity.getGia(),entity.getMaNhaCungCap());
    }

    @Override
    public void xoa(String key) {
        jdbcHelper.update(SQL_Delete, key);
    }

    @Override
    public ArrayList<BangGia> selectAll() {
         return this.selectBySql(SQL_SelectAll);
    }

    @Override
    public BangGia selectByID(String key) {
        ArrayList<BangGia> listBangGia = selectBySql(SQL_SelectID, key);
        if(listBangGia.isEmpty()){
            return null;
        }
       return listBangGia.get(0);

    }

    @Override
    protected ArrayList<BangGia> selectBySql(String sql, Object... args) {
         ArrayList<BangGia> ListBangGia= new ArrayList<>();
        try {
            ResultSet rs=jdbcHelper.query(sql, args);
            while (rs.next()) {
ListBangGia.add(new BangGia(rs.getString(1), rs.getString(2), rs.getDouble(3) ));          
            }
            rs.getStatement().getConnection().close();
            return ListBangGia;
            
        } catch (Exception e) {
            throw new RuntimeException(e);
    }
    
}
}
