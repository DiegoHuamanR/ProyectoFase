import java.util.Scanner; 
public class Test {
	
	public static void main(String[] args) {
		
		Verificador<String> b = new Verificador<String>();
	
		try {
			
			//Las recetas serán insertadas
			b.insercion(b);
			System.out.print("Introduzca el código de la receta: ");
			Scanner sc = new Scanner (System.in);
	        int h = sc.nextInt(); 
	        String numCadena= h+"";
	        String aux;
			//System.out.println(b.search(numCadena));
			while(b.search(numCadena) == null) {
				System.out.print("Código no existente, vuelva introducir: ");
				Scanner x = new Scanner (System.in);
				aux = x.nextLine();
				numCadena = aux;
			}
			System.out.println(b.search(numCadena));
		}
		
		catch (Exception x) {
			System.out.println(x.getLocalizedMessage());
		}
	}
}
