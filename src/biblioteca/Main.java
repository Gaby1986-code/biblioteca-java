/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author gabri
 */
public class Main {
    public static void main(String[] args){
        
        Libro[] libros = new Libro[3];
        
        libros[0] = new Libro("Cuando el viento hable", "Angela Banzas");
        libros[1] = new Libro("Cien años de soledad", "Gabriel Garcia Marquez");
        libros[2] = new Libro("Harry Potter", "J. K. Rowling");
        
        //Prestar un libro
        libros[0].prestar();
        
        for (int i = 0; i < libros.length; i++){
            System.out.println(
                    "Título: " + libros[i].titulo +
                    " - Autor: " + libros[i].autor +
                     " - Prestado: " + libros[i].estaPrestado()
            );
        }
    }
}
