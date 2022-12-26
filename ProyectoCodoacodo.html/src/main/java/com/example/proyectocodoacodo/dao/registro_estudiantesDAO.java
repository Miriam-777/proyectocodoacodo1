package ar.com.proyectocodoacodo.daos;

import ar.com.ProyectoCodoacodo.dto.registro_estudiantes;
import connexion.AdministradorDeConexiones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class registro_estudiantesDAO {

    /*metodos del crud*/
    public registro_estudiantes obtenerPorId(Long id) {
        String sql = "SELECT * FROM registro_estudiantes WHERE ID="+id;

        //Connection
        Connection con = AdministradorDeConexiones.getConnection();

        registro_estudiantes reg_estFromDb = null;

        //Statement
        try {
            Statement st = con.createStatement();

            //resultset
            ResultSet rs = st.executeQuery(sql);

            //VIENE UN SOLO REGISTRO!!!

            if(rs.next()) {//si existe, hay uno solo
                // rs > sacando los datos
                int id_persona = rs.getInt(1);//tomar la primer columna
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                int edad = rs.getInt(4);

                //campos crear un objeto????
                reg_estFromDb = new registro_estudiantes(id_persona,nombre,apellido,edad);
            }
        } catch (SQLException e) {
            // ERRORES
            e.printStackTrace();
        }
        return reg_estFromDb;
    }


    /*metodos del crud*/
    public List<registro_estudiantes> listarregistro_estudiantes() {
        String sql = "SELECT * FROM registro_estudiantes ";

        //Connection
        Connection con = AdministradorDeConexiones.getConnection();

        List<registro_estudiantes> list = new ArrayList<>();

        //Statement
        try {
            Statement st = con.createStatement();

            //resultset
            ResultSet rs = st.executeQuery(sql);

            //VIENE UN SOLO REGISTRO!!!

            while(rs.next()) {//
                // rs > sacando los datos
                int id_persona = rs.getInt(1);//tomar la primer columna
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                int edad = rs.getInt(4);

                //campos crear un objeto????
                registro_estudiantes reg_estFromDb = new registro_estudiantes(id_persona,nombre,apellido,edad);

                //agrego a la lista
                list.add(reg_estFromDb);
            }

            //cierro la conexion
            con.close();
        } catch (SQLException e) {
            // ERRORES
            e.printStackTrace();
        }
        return list;
    }

    /*crear un producto en la db*/
    public void crearregistro_estudiantes(String nombre, String apellido, int edad) {

        Connection con = AdministradorDeConexiones.getConnection();

        if(con != null) {
            // insert en la db > SQL: INSERT INTO....
            String sql = "INSERT INTO Registro_estudiantes (id_persona, nombre, apellido,edad) ";
            sql += "VALUES("+nombre+","+apellido+",	"+edad+")";

            //control de errores
            try {
                Statement st = con.createStatement();
                st.execute(sql);

                //cierre de conexion
                con.close();

            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void actualizarRegistro_estudiantes(int id_persona, String nombre, String apellido, int edad) {
        Connection con = AdministradorDeConexiones.getConnection();
        if(con != null) {
            String sql = "UPDATE Registro_estudiantes "
                    + " set nombre='"+nombre+"',"
                    + " set apellido='"+apellido+"'"
                    + " WHERE id_persona = '"+id_persona+"'";

            try {
                Statement st = con.createStatement();
                st.executeUpdate(sql);

                con.close();

            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /*metodos del crud*/
    public List<registro_estudiantes> buscar(String clave) {
        String sql = "SELECT * FROM Registro_estudiantes WHERE nombre LIKE '%"+clave+"%' ";

        //Connection
        Connection con = AdministradorDeConexiones.getConnection();

        List<registro_estudiantes> listado = new ArrayList<registro_estudiantes>();

        //Statement
        try {
            Statement st = con.createStatement();

            //resultset
            ResultSet rs = st.executeQuery(sql);

            //VIENE UN SOLO REGISTRO!!!

            if(rs.next()) {//si existe, hay uno solo
                // rs > sacando los datos
                int id_personas = rs.getInt(1);//tomar la primer columna
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                int edad = rs.getInt(4);

                //campos crear un objeto????
                registro_estudiantes reg_estFromDb = new registro_estudiantes(id_personas,nombre,apellido,edad);

                listado.add(reg_estFromDb);
            }
        } catch (SQLException e) {
            // ERRORES
            e.printStackTrace();
        }

        return listado;
    }
}
