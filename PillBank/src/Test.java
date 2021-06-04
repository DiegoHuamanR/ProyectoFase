
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		VendedorInt v=new VendedorInt();
		v.setVisible(true);
		InterfazUsuario u=new InterfazUsuario();
		u.setVisible(true);
		List<Pastillas> Pastillas = new List<>();
	    Pastillas a = new Pastillas(45672956,"Paracetamol","S./3.20",10);
	    Pastillas b = new Pastillas(34357891,"Omeprazol","S./2.20",15);
	    Pastillas c = new Pastillas(65431183,"Ramipril","S./5.20",20);
	    Pastillas d = new Pastillas(88547235,"Aspirina","S./7.20",8);
	    Pastillas e = new Pastillas(99124365,"Amlopidina","S./4.20",13);

	    Pastillas.add(a);
	    Pastillas.add(b);
	    Pastillas.add(c);
	    Pastillas.add(d);
	    Pastillas.search(a);

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

