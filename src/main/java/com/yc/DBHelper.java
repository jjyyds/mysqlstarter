package com.yc;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper implements IDBHelper{
    @Autowired
    private ConnectionProperties cp;

    @Override
    public Connection getConnection() {
        Connection con=null;
        try {
            Class.forName(cp.getDriverClassName());
            con= DriverManager.getConnection(cp.getUrl(),cp.getUsername(),cp.getPassword());
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }
}
