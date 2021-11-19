/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Entity.ChatLieu;
import java.util.ArrayList;
import Helper.jdbcHelper;
import java.sql.ResultSet;


public class ChatLieuDao extends DAO<ChatLieu, String>{
    
    String SQL_Insert="insert into CHATLIEU values(?,?) ";
    String SQL_Update="update CHATLIEU set MACHATLIEU=?,TENCHATLIEU=?";
    String SQL_Delete="delete from CHATLIEU WHERE MACHATLIEU =?";
    String SQL_SelectAll="select*from CHATLIEU";
    String SQL_SelectID="select*from CHATLIEU where MACHATLIEU=?";
    
    @Override
    public void them(ChatLieu entity) {
        jdbcHelper.update(SQL_Insert, entity.getMaChatLieu(), entity.getTenChatLieu());
    }

    @Override
    public void capNhat(ChatLieu entity) {
        jdbcHelper.update(SQL_Update, entity.getMaChatLieu(), entity.getTenChatLieu());
    }

    @Override
    public void xoa(String key) {
         jdbcHelper.update(SQL_Delete, key);
    }

    @Override
    public ArrayList<ChatLieu> selectAll() {
         return this.selectBySql(SQL_SelectAll);
    }

    @Override
    public ChatLieu selectByID(String key) {
        ArrayList<ChatLieu> listChatLieu = selectBySql(SQL_SelectID, key);
        if(listChatLieu.isEmpty()){
            return null;
        }
       return listChatLieu.get(0);
    }

    @Override
    protected ArrayList<ChatLieu> selectBySql(String sql, Object... args) {
        ArrayList<ChatLieu> ListChatLieu= new ArrayList<>();
        try {
            ResultSet rs=jdbcHelper.query(sql, args);
            while (rs.next()) {
ListChatLieu.add(new ChatLieu(rs.getString(1), rs.getString(2) ));          
            }
            rs.getStatement().getConnection().close();
            return ListChatLieu;
            
        } catch (Exception e) {
            throw new RuntimeException(e);
    }
    

    }
    
}
