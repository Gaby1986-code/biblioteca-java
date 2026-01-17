/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author gabri
 */
import java.util.Scanner;
import biblioteca.model.Libro;
public class Main {
    public static void main(String[] args){
        
        Libro[] libros = new Libro[3];
        
        libros[0] = new Libro("Cuando el viento hable", "Ángela Banzas");
        libros[1] = new Libro("Cien años de soledad", "Gabriel Garcia Marquez");
        libros[2] = new Libro("Harry Potter", "J. K. Rowling");
        

        
        for (int i = 0; i < libros.length; i++){
            Scanner sc = new Scanner(System.in);

            System.out.println("Elige el número del libro a prestar: ");
            int opcion = sc.nextInt();

            libros[opcion].prestar();

            System.out.println(
                  i + " - Título: " + libros[i].getTitulo() +
                    " - Autor: " + libros[i].getAutor() +
                     " - Prestado: " + libros[i].estaPrestado()
            );
        }
    }
}
