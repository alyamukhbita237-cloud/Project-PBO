
import java.sql.Connection;
import config.DatabaseConnection;

public class App {

    public static void main(String[] args) {

        // Memanggil koneksi database
        Connection connection = DatabaseConnection.getConnection();

        // Memeriksa apakah koneksi berhasil
        if (connection != null) {

            System.out.println("Aplikasi berhasil terhubung ke Supabase!");

            try {
                connection.close();
                System.out.println("Koneksi database ditutup.");

            } catch (Exception e) {
                System.out.println("Gagal menutup koneksi.");
                e.printStackTrace();
            }

        } else {
            System.out.println("Aplikasi gagal terhubung ke Supabase.");
        }
    }
}
