import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) throws IOException {
		Scanner entrada= new Scanner(System.in);
		int opcionEligeUsuario=1;
		String DNI;
		String Contrasena;
		TDAList <Object> listadeusuarios = new ListLinked<Object>();
        Usuario tmpUsuario = new Usuario();

        while (opcionEligeUsuario != 4 ) {
    		System.out.println("MENU DE PROGRAMA PILLBANK");
    		System.out.println("1.  Insertar usuario");
    		System.out.println("2.  Listar los usuarios");
    		System.out.println("3.  Ingresar usuario");
    		System.out.println("4.  Salir");
    		System.out.println("Escoja Opción:");
        	opcionEligeUsuario=entrada.nextInt();

            if (opcionEligeUsuario == 1) {
        
            	System.out.println("Insertar usuario");
            	System.out.println("Ingresar DNI:");
                tmpUsuario.SetIdentificacion(entrada.next());
                System.out.println("Ingresar Nombre:");
                tmpUsuario.SetNombre(entrada.next());
                System.out.println("Ingresar Apellidos:");
                tmpUsuario.SetApellidos(entrada.next());
                System.out.println("Ingresar Email:");
                tmpUsuario.SetEmail(entrada.next());
                System.out.println("Ingresar Celular:");
                tmpUsuario.SetCelular(entrada.next());
                System.out.println("Ingresar Edad:");
                tmpUsuario.SetEdad(entrada.nextInt());
                System.out.println("Ingresar Contraseña:");
                tmpUsuario.SetContraseña(entrada.next());
                listadeusuarios.insertFirst(tmpUsuario);
            }


            if (opcionEligeUsuario == 2) {
            	System.out.println(listadeusuarios);
     
            } 
            if (opcionEligeUsuario == 3) {        
            	System.out.println("Ingresar DNI:");
                DNI=entrada.next();
                System.out.println("Ingresar Contraseña:");
                Contrasena=entrada.next();
            	String usuariobuscado = tmpUsuario.getIdentificacion();
            	String contrabuscado = tmpUsuario.getContraseña();
            	System.out.println(DNI);
            	System.out.println(Contrasena);
            	System.out.println(usuariobuscado);
            	System.out.println(contrabuscado);
            	if (usuariobuscado.equals(DNI) && contrabuscado.equals(Contrasena)) {
                    System.out.println("Si se logeo");
                } else {
                    System.out.println("No se logeo");
                }
            	
            }
          }
        }
	
}