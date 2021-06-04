import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) throws IOException {
		VendedorInt v=new VendedorInt();
		v.setVisible(true);
		
		Verificador<String> b = new Verificador<String>();
		
		try {
			
			//Las recetas serán predefinidas
			b.insert("1234");
			b.insert("[Aspirina] cada 12 horas.");
			b.insert("1235");
			b.insert("[Paracetamol] cada 6 horas.");
			b.insert("1236");
			b.insert("[Omeprazol] depués de cada almuerzo.");
			System.out.print("Introduzca el código de la receta: ");
			Scanner sc = new Scanner (System.in);
	        int h = sc.nextInt(); 
	        String numCadena= h+"";
			System.out.println(b.search(numCadena));
			
		}
		
		catch (Exception x) {
			System.out.println(x.getLocalizedMessage());
		}
	}

    
}

