package tarea2;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    String bd ="registro";
    String url="jdbc:mysql://localhost:3306/";
    String user="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection conexion = null;
    Connection con;

    public Connection conectar(String bd){
        this.bd = bd;
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url+this.bd,user,password);
            System.out.println("Se conecto a "+bd);
        } catch (Exception ex){
            // java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.println("No se conecto a "+bd);
        }
        return conexion;
    }

    public Connection getConnection(){
        return con;
    }

    public void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
}
