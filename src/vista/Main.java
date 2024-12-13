/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import modelo.Autor;
import modelo.Libro;
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
        
        Libro l1 = new Libro("100 aAños de Soledad", "ABC1", 2011, "Drama", a1, false);
        System.out.println(l1.toString());
        
        
    }
  
    
}
