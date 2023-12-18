package mypack;

import java.sql.Connection;
import java.sql.DriverManager;

public class MedicalConnection {
    Connection connection;

    public MedicalConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/medical?useSSL=false&allowPublicKeyRetrieval=true";
            connection = DriverManager.getConnection(url, "root", "root");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
