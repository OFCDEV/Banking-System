package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;

public class connect {

    Connection connection;
    java.sql.Statement statement;
    public connect(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","mysql@1928");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
