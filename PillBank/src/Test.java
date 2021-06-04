
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		VendedorInt v=new VendedorInt();
		v.setVisible(true);
		InterfazUsuario u=new InterfazUsuario();
		u.setVisible(true);
		Verificador<String> r = new Verificador<String>();
		
		try {
			
			//Las recetas serán predefinidas
			r.insert("1234");
			r.insert("[Aspirina] cada 12 horas.");
			r.insert("1235");
			r.insert("[Paracetamol] cada 6 horas.");
			r.insert("1236");
			r.insert("[Omeprazol] depués de cada almuerzo.");
			System.out.print("Introduzca el código de la receta: ");
			Scanner sc = new Scanner (System.in);
	        int h = sc.nextInt(); 
	        String numCadena= h+"";
			System.out.println(r.search(numCadena));
			
		}
		
		catch (Exception x) {
			System.out.println(x.getLocalizedMessage());
		}
	}

    
}

