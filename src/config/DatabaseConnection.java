
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DatabaseConnection {

    private static final String CONFIG_FILE = "config.properties";

    public static Connection getConnection() {

        Connection connection = null;

        try {
            
            Properties properties = new Properties();
            properties.load(new FileInputStream(CONFIG_FILE));

            String host = properties.getProperty("db.host");
            String port = properties.getProperty("db.port");
            String database = properties.getProperty("db.name");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            
            String url = "jdbc:postgresql://" + host + ":" 
                       + port + "/" + database + "?sslmode=require";

            
            connection = DriverManager.getConnection(
                url, username, password
            );

            System.out.println("Koneksi ke database berhasil!");

        } catch (IOException e) {
            System.out.println("File konfigurasi tidak ditemukan!");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Koneksi ke database gagal!");
            e.printStackTrace();
        }

        return connection;
    }
}
