import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		HashUsuario<String> h= new HashUsuario<String>(10);
		System.out.println("----------------------------------");
		System.out.println("---------Plegable----------");
		System.out.println("---------Empleados----------");
		h.insertplegable(73641532,"Libni","Bored","Andres Avelino Caceres","nini4578@hotmail.com",973625325,19,"nini");
		h.insertplegable(75122532,"Diego","Arboleda","Jose Luis Bustamante y Rivero","diego8@hotmail.com",97364325,25,"nini");
		h.insertplegable(75124212,"Rosa","Cespedes","Arayanes Umcacoyo","rosa78@hotmail.com",975325325,23,"nini");
		System.out.println(h);
		Scanner entrada= new Scanner(System.in);
        int opcionEligeUsuario=1;
        while (opcionEligeUsuario != 3 ) {
    		System.out.println("MENU DE PROGRAMA PILLBANK");
    		System.out.println("1.  Buscar receta");
    		System.out.println("2.  Hospital mas cercano");
    		System.out.println("3.  Salir");
    		System.out.println("Escoja Opción:");
        	opcionEligeUsuario=entrada.nextInt();

            if (opcionEligeUsuario == 1) {
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


            if (opcionEligeUsuario == 2) {
            	  GraphLink<String>g=new GraphLink<String>();
                  g.insertVertex("Hunter");
                  g.insertVertex("Bustamante");
                  g.insertVertex("Paucarpata");
                  g.insertVertex("Yanahuara");
                  g.insertVertex("CColorado");
                  g.insertEdge("Hunter","Bustamante",16);
                  g.insertEdge("Hunter","Paucarpata",25);
                  g.insertEdge("Hunter","Yanahuara",20);
                  g.insertEdge("Hunter","CColorado",22);
                  g.insertEdge("Bustamante","Paucarpata",15);
                  g.insertEdge("Bustamante","CColorado",23);
                  g.insertEdge("Bustamante","Yanahuara",18);
                  g.insertEdge("Paucarpata","CColorado",24);
                  g.insertEdge("Paucarpata","Yanahuara",29);
                  g.insertEdge("Yanahuara","CColorado",34);

                  System.out.println("Grafo ciudades:\n"+g);
                  int[ ] lista;
                  lista = new int[20];
                  lista=g.shortpath("CColorado","Yanahuara");
                  for(int i=0;i<lista.length;i++) {
                      if(lista[i]!=0) {
                          System.out.println("Shortpath: "+lista[i]);
                      }
              } 
            }
            	

           
            if (opcionEligeUsuario == 3) {


            } 
            if (opcionEligeUsuario == 4) {      
            	
            }
          }
        }
	
	
}