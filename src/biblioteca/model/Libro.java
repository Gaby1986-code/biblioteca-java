/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model;

/**
 *Programa para gestionar una biblioteca.
 * @author gabri
 */
public class Libro {
    
   private String titulo;
   private String autor;
   private boolean prestado;
    
   public Libro (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }
       
    public void prestar(){
       this.prestado = true;
     
    }
   
     public boolean estaPrestado(){
          return this.prestado;
          
      }
      public String getTitulo(){
       return titulo;
      }

      public String getAutor(){
       return autor;
      }
}
