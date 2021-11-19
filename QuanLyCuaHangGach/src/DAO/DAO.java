/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public abstract class DAO<E,K> {
    abstract public void them(E entity);
     abstract public void capNhat(E entity);
     abstract public void xoa(K key);
     abstract public ArrayList<E> selectAll();
     abstract public E selectByID(K key);
     abstract protected ArrayList<E> selectBySql(String sql,Object...args);
}
