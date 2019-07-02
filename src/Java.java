import java.sql.*;
import javax.swing.JOptionPane;
public class Java {
    Connection conn=null;
    
    public static Connection ConnecrDb(){
        try{
         Class.forName("org.sqlite.JDBC");
         Connection conn=DriverManager.getConnection("jdbc:sqlite:E:\\4th Sem\\ankit\\OOPJ\\New folder\\Student\\DBSTUDENT.sqlite");
                 return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
