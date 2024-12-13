/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Autor;
import modelo.Persona;

/**
 *
 * @author Dell Core i7
 */
public class Main {
    
    public static void main(String[] args) {
        
        Persona p1= new Persona();
        p1.setApellido("Alcusir");
        System.out.println(p1.toString());
        
        Autor a1 = new Autor();
        a1.setNumLibrosPublicados(3);
        System.out.println(a1.toString());
        
        
    }
  
    
}
