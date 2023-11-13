package tarea2;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    String bd ="registro";
    String url="jdbc:mysql://localhost:3306/";
    String user="root";
    String password="root";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection conexion = null;
    Connection con;

    public Connection conectar(String bd){
        System.out.println(bd);
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url + bd, user, password);
            System.out.println("Se conecto a "+bd);
        } catch (Exception ex){
            // java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.println("No se conecto a "+bd);
        }
        return conexion;
    }

    public void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void agregarBD(String pais, int oro, int plata, int bronce, int medallastotales)
    {
        try 
        {
            String sql = "INSERT INTO medallero (paises, oro, plata, bronce, medallastotales) VALUES (?, ?, ?, ?, ?)";
            java.sql.PreparedStatement pst = conexion.prepareStatement(sql);

            pst.setString(1, pais);
            pst.setInt(2, oro);
            pst.setInt(3, plata);
            pst.setInt(4, bronce);
            pst.setInt(5, medallastotales);

            pst.executeUpdate();

        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
        
    }
    
}
