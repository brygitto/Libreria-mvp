package com.byvillamizar.bibliotecataller.Modelos;

public class Libro {
    private int id;
    private String nombre;
    private String autor;
    private String cantidad;
    private String url;
    private String imagen;
    private String descripcion;

    public Libro() {
    }

    public Libro(int id, String nombre, String autor, String cantidad, String url, String imagen, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.cantidad = cantidad;
        this.url = url;
        this.imagen = imagen;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", cantidad='" + cantidad + '\'' +
                ", url='" + url + '\'' +
                ", imagen='" + imagen + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
