import java.util.Scanner;

public class Test {
	public static void main(String [] args) {
		Verificador<String> h = new Verificador<String>(50);
		
		h.insertReceta(h);
        int resp = 1;
        System.out.println("////////SEPA SU RECETA CON EL CÓDIGO DE RECETA////////\n");
        while(resp == 1) {
        	System.out.print("Introduzca el código de la receta: ");
    		Scanner sc = new Scanner (System.in);
            int code = sc.nextInt(); 
        	if(h.search(code) == 0) {
        		System.out.println("Código no existente.");
        		System.out.print("[1]->SI   [2]->NO  ");
        		System.out.print("¿Volver a ingresar código?: ");
        		Scanner x = new Scanner (System.in);
    			resp = x.nextInt();
    		}else {break;} 
        }	
	}
}

