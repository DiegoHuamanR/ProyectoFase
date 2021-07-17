import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		HashUsuario<String> h= new HashUsuario<String>(10);
		System.out.println("----------------------------------");
		System.out.println("---------Prueba cuadratica----------");
		System.out.println("---------Empleados----------");
		h.insertplegable(73641532,"Libni","Bored","Andres Avelino Caceres","nini4578@hotmail.com",973625325,19,"nini");
		h.insertplegable(75122532,"Diego","Arboleda","Jose Luis Bustamante y Rivero","diego8@hotmail.com",97364325,25,"nini");
		h.insertplegable(75124212,"Rosa","Cespedes","Arayanes Umcacoyo","rosa78@hotmail.com",975325325,23,"nini");
		System.out.println(h);
		Verificador<String> pasti = new Verificador<String>(50);

		pasti.insertR(pasti);
        int resp = 1;
        System.out.println("////////SEPA SU RECETA CON EL CÓDIGO DE RECETA////////\n");
        while(resp == 1) {
            System.out.print("Introduzca el código de la receta: ");
            Scanner sc = new Scanner (System.in);
            int code = sc.nextInt(); 
            if(pasti.search(code) == 0) {
                System.out.println("Código no existente.");
                System.out.print("[1]->SI   [2]->NO  ");
                System.out.print("¿Volver a ingresar código?: ");
                Scanner x = new Scanner (System.in);
                resp = x.nextInt();
            }else {break;} 
        }
	}
	
}