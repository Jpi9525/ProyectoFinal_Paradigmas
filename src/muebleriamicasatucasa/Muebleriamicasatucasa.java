package muebleriamicasatucasa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Muebleriamicasatucasa {

    public static void main(String[] args) {
        Connection con;
        String usuario = "root";
        String clave = "12345";
        String url2 = "";
        
        try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection(url2, usuario, clave);
                }
              catch (ClassNotFoundException | SQLException ex)
              {
                Logger.getLogger(Muebleriamicasatucasa.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null,"Error al conectar a la BDD!!");
              }
    )
           JOptionPane.showMessageDialog(null,"Conectaste!!");
    }
}



