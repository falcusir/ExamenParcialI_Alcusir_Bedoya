/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Dell Core i7
 */
public class Persona {
    //ATRIBUTOS
    private int cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private Date fechaNacimiento;
    
    //METODOS CONSTRUCTORES

    public Persona() {
    }

    public Persona(int cedula, String nombre, String apellido, String direccion, String telefono, Date fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //ENCAPSULAMIENTO

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //METODOS DE REGLA DE NEGOCIO

    @Override
    public String toString() {
         return "\n"+ "LOS DATOS DE LA PERSONA SON:\n"+
                "Nombre: "+getNombre()+"\n"+
                "Apellido: "+getApellido()+"\n"+
                "Dirección: "+getDireccion()+"\n"+
                "Teléfono: "+getTelefono()+"\n"+      
                "Fecha de Nacimiento: "+ getFechaNacimiento();}
    }
    