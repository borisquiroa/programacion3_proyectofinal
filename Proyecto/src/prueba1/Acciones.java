package prueba1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Acciones {
    public void crearUsuario(String usuario, String contraseña){
        Conexion cx = new Conexion("bdsocialsphere");
        String sql = "INSERT INTO usuario(nombreUsuario, contraseña) values ('"+usuario+"', '"+contraseña+"');";
        Statement st;
        Connection conexion = cx.conectar();
        try{
            st = conexion.createStatement();
            int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Usuario creado");
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void accesoUsuario(String nombreUsuario, String contraseña){
        Conexion cx = new Conexion("bdsocialsphere");
        String usuarioCorrecto = null;
        String contraseñaCorrecta = null;
        
        try{
            Connection conexion = cx.conectar();
            PreparedStatement pst = conexion.prepareStatement("SELECT nombreUsuario, contraseña FROM usuario");
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                usuarioCorrecto = rs.getString(1);
                contraseñaCorrecta = rs.getString(2);
            }
            
            if(nombreUsuario.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)){
                JOptionPane.showMessageDialog(null, "Acceso correcto, Bienvenido "+nombreUsuario);
            }else if(!nombreUsuario.equals(usuarioCorrecto) || contraseña.equals(contraseñaCorrecta)){
                JOptionPane.showMessageDialog(null, "El usuario o la contraseña son incorrectos");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error "+e);
        }
    }
}
