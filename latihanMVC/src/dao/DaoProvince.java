/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.Koneksi;
import model.Province;

/**
 *
 * @author acer
 */
public class DaoProvince {

    Connection connection = Koneksi.getConnection();

    public boolean insert(Province province) {
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement("INSERT INTO province (province_id, province_name) VALUES (?, ?);");
            statement.setInt(1, province.getProvinceId()); //set
            statement.setString(2, province.getProvinceName()); //set
            statement.executeUpdate(); //execute
            statement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public List<Province> getAll() {
        List<Province> listProvince = new ArrayList<Province>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM PROVINCE");
            while (rs.next()) {
//                Province province = new Province(rs.getInt(1),rs.getString(2));
//                province.setProvinceId(rs.getInt(1));
//                province.setProvinceName(rs.getString(2));
//                listProvince.add(province);
                listProvince.add(new Province(rs.getInt(1), rs.getString(2)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listProvince;
    }

}
