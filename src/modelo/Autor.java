/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dell Core i7
 */
public class Autor extends Persona{
    //Atributos
    private int numLibrosPublicados;
    //Constructores

    public Autor() {
    }

    public Autor(int numLibrosPublicados) {
        this.numLibrosPublicados = numLibrosPublicados;
    }
    //encapsulamiento

    public int getNumLibrosPublicados() {
        return numLibrosPublicados;
    }

    public void setNumLibrosPublicados(int numLibrosPublicados) {
        this.numLibrosPublicados = numLibrosPublicados;
    }
    //REglas de Negocio

    @Override
    public String toString() {
        return "\n"+ "LOS DATOS DE LA AUTOR SON:\n"+
                "Cédula: "+getCedula()+"\n"+
                "Nombre: "+getNombre()+"\n"+
                "Apellido: "+getApellido()+"\n"+
                "Dirección: "+getDireccion()+"\n"+
                "Teléfono: "+getTelefono()+"\n"+      
                "Fecha de Nacimiento: "+ getFechaNacimiento()+ "\n"+
                "Cantidad de Libros Publicados: "+ getNumLibrosPublicados();}
    }
   