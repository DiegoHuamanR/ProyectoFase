import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) throws IOException {
		/*List<Pastillas> Pastillas = new List<Pastillas>();
		Pastillas a = new Pastillas(45672956,"Paracetamol","S./3.20",10);
   	 	Pastillas b = new Pastillas(34357891,"Omeprazol","S./2.20",15);
   	 	Pastillas c = new Pastillas(65431183,"Ramipril","S./5.20",20);
   	 	Pastillas d = new Pastillas(88547235,"Aspirina","S./7.20",8);
   	 	Pastillas e = new Pastillas(99124365,"Amlopidina","S./4.20",13);


   	 	Pastillas.add(a);
   	 	Pastillas.add(b);
   	 	Pastillas.add(c);
   	 	Pastillas.add(d);
   	 	Pastillas.add(e);
   	 	System.out.println(Pastillas);
   	 	Pastillas.remove(c);
   	 	System.out.println(Pastillas);
   	 	Pastillas.add2(0,b);
   	 	System.out.println(Pastillas);
   	 	Pastillas.empty();
   	 	Pastillas.length();
   	 	Pastillas.clear();
        System.out.println(Pastillas);
        
        Verificacion receta = new Verificacion();
		
		System.out.println("La receta es: "+ receta.veriCode(2345));
		System.out.println("La receta es: "+ receta.veriCode(3456));
	    */
		VendedorInt p= new VendedorInt();
		p.setVisible(true);
		int opcionEligeUsuario = 0;
        List <Usuario> listaDePasajeros = new ArrayList<Usuario> ();
        Dialogo opcionesUsuario = new Dialogo();
        Dialogo mensajeVent = new Dialogo();

        while (opcionEligeUsuario != 5 ) {

            opcionEligeUsuario = opcionesUsuario.obtenerOpcionMenu();

            if (opcionEligeUsuario == 1) {

                Usuario tmpPasajero = new Usuario();
                tmpPasajero.SetIdentificacion(opcionesUsuario.obtenerIdentificacionPasajero());
                tmpPasajero.SetNombre(opcionesUsuario.obtenerNombrePasajero());
                tmpPasajero.SetApellidos(opcionesUsuario.obtenerApellidosPasajero());
                tmpPasajero.SetEmail(opcionesUsuario.obtenerEmailPasajero());
                tmpPasajero.SetCelular(opcionesUsuario.obtenerCelularPasajero());
                tmpPasajero.SetEdad(opcionesUsuario.obtenerEdadPasajero());
                //Terminamos guardando el objeto pasajero
                listaDePasajeros.add(tmpPasajero);
            }

            if (opcionEligeUsuario == 2) {
                String identPasajeroBuscado = opcionesUsuario.obtenerIdentificacionPasajero();
                boolean pasajeroEncontrado = false;

                Iterator<Usuario> it = listaDePasajeros.iterator();
                Usuario tmpAnalizando;

                while ( it.hasNext() ) {          

                    tmpAnalizando = it.next();              

                    if (tmpAnalizando.getIdentificacion().equals(identPasajeroBuscado) ) {
                        pasajeroEncontrado = true;
                        String mensaje = tmpAnalizando.getStringPasajero();
                        mensaje = mensaje + "\n\n\n";
                        mensaje = mensaje + "A continuación introduzca nuevos datos para este usuario";

                        mensajeVent.mostrarMensaje(mensaje);

                        mensajeVent.mostrarMensaje("La identificación no puede ser modificada, indique resto de datos");
                        tmpAnalizando.SetNombre(opcionesUsuario.obtenerNombrePasajero());
                        tmpAnalizando.SetApellidos(opcionesUsuario.obtenerApellidosPasajero());
                        tmpAnalizando.SetEmail(opcionesUsuario.obtenerEmailPasajero());
                        tmpAnalizando.SetCelular(opcionesUsuario.obtenerCelularPasajero());
                        tmpAnalizando.SetEdad(opcionesUsuario.obtenerEdadPasajero());

                        mensaje = tmpAnalizando.getStringPasajero();
                        mensajeVent.mostrarMensaje(mensaje);

                    } else { }   

                } 

                if (pasajeroEncontrado == false) {
                    mensajeVent.mostrarMensaje("No se encontró el usuario con esa identificación");
                }
            } 

            if (opcionEligeUsuario == 3) {

                String listado = "";

                Iterator<Usuario> it2 = listaDePasajeros.iterator();
                Usuario tmpAnalizando;

                while ( it2.hasNext() ) {          
                    tmpAnalizando = it2.next();            
                    listado = listado + tmpAnalizando.getStringPasajero();
                    listado = listado + "\n\n\n";
                }

                mensajeVent.mostrarMensaje(listado);

            } 

           
            if (opcionEligeUsuario == 4) {
                String identPasajeroBuscado = opcionesUsuario.obtenerIdentificacionPasajero();
                boolean pasajeroEncontrado = false;

                Iterator<Usuario> it = listaDePasajeros.iterator();
                Usuario tmpAnalizando;

                while ( it.hasNext() && pasajeroEncontrado==false ) {  

                    tmpAnalizando = it.next();               

                    if (tmpAnalizando.getIdentificacion().equals(identPasajeroBuscado) ) {
                        pasajeroEncontrado = true;
                        String mensaje = tmpAnalizando.getStringPasajero();
                        mensaje = mensaje + "\n\n\n";
                        mensaje = mensaje + "Se procede al borrado de datos de este usario\n\n";

                        mensajeVent.mostrarMensaje(mensaje);

                       
                        listaDePasajeros.remove(tmpAnalizando);
                        pasajeroEncontrado=true;

                    } else { }    

                } 

                if (pasajeroEncontrado == false) {
                    mensajeVent.mostrarMensaje("No se encontró el usuario con esa identificación");
                }
            } 

        }

	       int opcionFactura = 0;
	        Factura opcionesF = new Factura();
	        Factura mensajeF = new Factura();
	        while (opcionFactura != 2 ) {
	        	opcionFactura = opcionesF.obtenerFactura();
	        	if (opcionFactura == 1) {

	                 String listado = "";

	                 Iterator<Usuario> it2 = listaDePasajeros.iterator();
	                 Usuario tmpAnalizando;

	                 while ( it2.hasNext() ) {          
	                     tmpAnalizando = it2.next();            
	                     listado = listado + tmpAnalizando.getStringPasajero();
	                     listado = listado + "\n\n\n";
	                 }

	                 mensajeF.mostrarMensaje(listado);

	             } 
	 
	        	}
	        opcionesUsuario.cerrarPrograma();
	        

	    }
	
    
	}

