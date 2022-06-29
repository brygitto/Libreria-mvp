package com.byvillamizar.bibliotecataller.Modelos;

public class Usuario {
    int id;
    int idlib;
    String nombre;
    String correo;
    String telefono;
    String direccion;
    String clave;

    public Usuario() {
    }

    public Usuario(int id, int idlib, String nombre, String correo, String telefono, String direccion, String clave) {
        this.id = id;
        this.idlib = idlib;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdlib() {
        return idlib;
    }

    public void setIdlib(int idlib) {
        this.idlib = idlib;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", idlib=" + idlib +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }
}
