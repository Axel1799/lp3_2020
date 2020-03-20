package aplicacion;
/**
 *
 * @author intel
 */

import java.util.Scanner;

public class Persona {
   
    String nombre, apellido, R;
    int edad;


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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getR() {
        return R;
    }

    public void setR(String R) {
        this.R = R;
    }

    
    public void imprimir (){
        Scanner teclado = new Scanner (System.in);
        System.out.println(" ===================================== ");
        System.out.println("Ingrese su nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = teclado.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = teclado.nextInt();
        System.out.println(" ===================================== ");
        System.out.println(" Nombre:   "+nombre);
        System.out.println(" Apellido: "+apellido);
        System.out.println(" Edad:     "+edad);

    }

    
}
