package com.example.test_gui.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Database {
    private static final String URL = "jdbc:postgresql://aws-1-ap-southeast-1.pooler.supabase.com:6543/postgres?sslmode=require";
    private static final String USER = "postgres.mckasvsmqsmzhzzlubki";
    private static final String PASSWORD = "O9PcEFY4oF7uhmAm";

    private Database() {
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
