/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface InterfaceReservation <T>{
    public abstract void add (T t) throws SQLException;
    List<T> read() throws SQLException;
}
