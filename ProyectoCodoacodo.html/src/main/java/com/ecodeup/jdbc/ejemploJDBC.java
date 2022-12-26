package com.ecodeup.jdbc;

import com.sun.source.tree.WhileLoopTree;

import java.sql.*;

public class ejemploJDBC {
    public static void main(String[] args) throws SQLException {
        String url = "estudiante:mysql://localhost:3306/Estudiante?serverTimezone=UTC";
        String username= "admin";
        String password = "admin";


        try{
            String sql = null;
            Connection connection = java.sql.DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM registro_estudiantes");

            while (resultSet.next()){
                System.out.println(resultSet.getString("Id_persona") + " | "+ resultSet.getString("Nombre")+" | "+resultSet.getString("Apellido")+" | "+resultSet.getString("Edad"));
            }
            connection.close();
            statement.close();
            resultSet.close();

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}








