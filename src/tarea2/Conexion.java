package tarea2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    String bd = "registro";
    private static String url = "jdbc:mysql://localhost:3306/";
    private static String user = "root";
    private static String password = "root";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection con;

    public Connection conectar() {
        System.out.println(bd);
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url + bd, user, password);
            System.out.println("Se conecto a " + bd);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.println("No se conecto a " + bd);
        }
        return con;
    }

    public void desconectar() {
        try {
            con.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void agregarBD(String pais, int oro, int plata, int bronce, int medallastotales) {
        try {
            if (con != null) {
                String sql = "INSERT INTO medallero (paises, oro, plata, bronce, medallastotales) VALUES (?, ?, ?, ?, ?)";
                java.sql.PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1, pais);
                pst.setInt(2, oro);
                pst.setInt(3, plata);
                pst.setInt(4, bronce);
                pst.setInt(5, medallastotales);

                pst.executeUpdate();
            } else {
                System.err.println("La conexión es null.");
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }

    }
    
    public void BDNatacion(String nombre, String pais, float nota1, float nota2,
                             float nota3, float nota4, float nota5, float nota6,
                             float nota7, float nota8, float factor, float nota) {

        String sql = "INSERT INTO natacion (nombre, pais, nota1, nota2, nota3, nota4, " +
                     "nota5, nota6, nota7, nota8, factor, nota) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url+bd,
                user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setString(2, pais);
            pstmt.setFloat(3, nota1);
            pstmt.setFloat(4, nota2);
            pstmt.setFloat(5, nota3);
            pstmt.setFloat(6, nota4);
            pstmt.setFloat(7, nota5);
            pstmt.setFloat(8, nota6);
            pstmt.setFloat(9, nota7);
            pstmt.setFloat(10, nota8);
            pstmt.setFloat(11, factor);
            pstmt.setFloat(12, nota);

            pstmt.executeUpdate();
            System.out.println("Datos agregados correctamente a la base de datos.");

        } catch (SQLException e) {
            System.err.println("Error al agregar datos a la base de datos: " + e.getMessage());
        }
    }
    
    public void mostrarBD() {
        try {
            if (con != null) {
                Statement st = con.createStatement();
                java.sql.ResultSet rs = st.executeQuery("SELECT * FROM medallero");

                while (rs.next()) {

                    System.out.println(rs.getString("paises") + " " + rs.getInt("oro") + " " + rs.getInt("plata") + " "
                            + rs.getInt("bronce") + " " + rs.getInt("medallastotales"));
                }
            } else {
                System.err.println("La conexión es null.");
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }

    public void verificarPais(String pais) {
        try {
            if (con != null) {
                String paisBuscado = "NombreDelPais";
                String sql = "SELECT * FROM medallero WHERE paises = ?";
                try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
                    preparedStatement.setString(1, paisBuscado);

                    try (ResultSet rs = preparedStatement.executeQuery()) {
                        while (rs.next()) {
                            // Obtener los valores de las columnas específicas
                            String paises = rs.getString("paises");
                            int oro = rs.getInt("oro");
                            int plata = rs.getInt("plata");
                            int bronce = rs.getInt("bronce");
                            int medallasTotales = rs.getInt("medallas_totales");

                            // Hacer algo con los valores, por ejemplo, imprimirlos
                            System.out.println("Pais: " + paises + ", Oro: " + oro + ", Plata: " + plata + ", Bronce: "
                                    + bronce + ", Medallas Totales: " + medallasTotales);
                        }
                    }
                }
            } else {
                System.err.println("La conexión es null.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modificarBD(String pais, int oro, int plata, int bronce, int medallastotales)
    {
        try {
            if (con != null) {
                String sql = "UPDATE medallero SET oro = ?, plata = ?, bronce = ?, medallastotales = ? WHERE paises = ?";
                java.sql.PreparedStatement pst = con.prepareStatement(sql);

                pst.setInt(1, oro);
                pst.setInt(2, plata);
                pst.setInt(3, bronce);
                pst.setInt(4, medallastotales);
                pst.setString(5, pais);

                pst.executeUpdate();
            } else {
                System.err.println("La conexión es null.");
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }

}
