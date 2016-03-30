package com.example.umibiox.appet_proto.Clases;

/**
 * Created by william on 30/03/2016.
 */
/*
* En este momento se están creando las clases en base a el diagrma de clases que publicamos en las
* entregas del prouyecto cualquier duda me avisan, estoy tratando de configurar el service mobile
* en azure recién tenga esa configuración les paso la token para que se puedan conctar con el service mobile
* */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String aficion;
    private String urlfoto;
    private String telefono;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getAficion() {
        return aficion;
    }
    public void setAficion(String aficion) {
        this.aficion = aficion;
    }
    public String getUrlFoto() {
        return urlfoto;
    }
    public void setUrlFoto(String urlFoto) {
        this.urlfoto = urlFoto;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
