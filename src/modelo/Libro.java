/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Carlos
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Date fechaPublicacion;
    private String genero;
    private Autor autor;
    private boolean estado;
    
    //Métodos Constructores sin Parámetros y con Parámetros

    public Libro() {
        this.estado = true;
    }
    
    public Libro(String titulo, String isbn, Date fechaPublicacion, String genero, Autor autor, boolean estado) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
        this.genero = genero;
        this.autor = autor;
        this.estado = estado;
    }

    //MÉTODO DE ENCAPSULAMIENTO

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //REGLAS DE NEGOCIO

    @Override
    public String toString() {
        return "DATOS DEL LIBRO: "+"\n"+
                "Título del libro: "+getTitulo()+"\n"+
                "Código isbn: "+getIsbn()+"\n"+
                "Fecha de Publicación: "+getFechaPublicacion()+"\n"+
                "Género del libro: "+getGenero()+"\n"+
                "Autor: "+getAutor()+"\n"+
                "Estado del libro: "+"\n"+(getEstado() ? "Si" : "No")+"\n";           
    }
    
    
}
