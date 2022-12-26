package ar.com.ProyectoCodoacodo.dto;

import java.util.Date;

public class registro_estudiantes {
    private int Id_persona;
    private String nombre;
    private String apellido;
    private int edad;

    public registro_estudiantes(int id_persona, String nombre, String apellido, int Edad) {
        super();
        this.Id_persona = Id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }


    public int getId_persona() {
        return Id_persona;
    }


    public void setId_persona(int id_persona) {
        this.Id_persona = id_persona;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public int getedad() {
        return edad;
    }


    public void setedad(int edad) {
        this.edad = edad;
    }

}
