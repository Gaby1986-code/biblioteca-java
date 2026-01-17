/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *Programa para gestionar una biblioteca.
 * @author gabri
 */
public class Libro {
    
    String titulo;
    String autor;
    boolean prestado;
    
    Libro (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }
       
    public void prestar(){
       this.prestado = true;
     
    }
   
      boolean estaPrestado(){
          return this.prestado;
          
      }
}
