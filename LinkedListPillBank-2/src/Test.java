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
            	ListLinked<Pastillas> Pastillas = new ListLinked<>();
            	  
            	
        		
           	 Pastillas b = new Pastillas(34357891,"Omeprazol","S./2.20",15);
           	 Pastillas c = new Pastillas(65431183,"Ramipril","S./5.20",20);
           	 Pastillas d = new Pastillas(88547235,"Aspirina","S./7.20",8);
           	 Pastillas e = new Pastillas(99124365,"Amlopidina","S./4.20",13);
        
        
           	 //Pastillas.insertFirst(a);
           	 Pastillas.insertFirst(b);
           	 Pastillas.insertFirst(c);
           	 Pastillas.insertFirst(d);
           	 Pastillas.insertFirst(e);
           	 System.out.println(Pastillas);
           	 Pastillas.remove(c);
           	 System.out.println(Pastillas);
           	 System.out.println(Pastillas);
           	 Pastillas.lenght();
           	 Pastillas.isEmptyList();
                System.out.println(Pastillas);
                Pastillas.destroyList();
                System.out.println(Pastillas);
                
        		List<String> testList = new ArrayList<String>();
               Scanner scan = new Scanner(System.in);
               System.out.println("///////////////////////////BIENVENIDO/////////////////////////////");
               System.out.println("Sistema de pastillas");
               System.out.println("Ingresa tamano de tu lista");
               Integer codigo;
               String nombre;
               String precio;
               Integer cantidad;
               Scanner ent1 = new Scanner(System.in);
               Scanner ent2 = new Scanner(System.in);
        
               Encadenamiento ht = new Encadenamiento(scan.nextInt() );;
               char ch;
       		int p = 0;
               do    
               {
                   System.out.println("\nOperaciones encadenamiento\n");
                   System.out.println("1. Insertar nueva pastilla ");
                   System.out.println("2. Eliminar pastilla ");
                   System.out.println("3. Buscar pastilla");            
                   System.out.println("4. Eliminar toda la lista de pastillas");
                   System.out.println("5. Tamano lista y Mostrar datos");

                   int choice = scan.nextInt();           
                   switch (choice)
                   {
                   case 1 : 
                       System.out.println("Ingresa codigo, nombre, precio y cantidad");
                       //El data de encadenamiento sera un objeto pastilla
                       int i;
                       for( i=0;i<=ht.getSize();i+=1)
                       {
                           System.out.println(" ");
                       }
                       
                       System.out.println("Ingresa Codigo");
                       codigo = ent1.nextInt();
                       
                       System.out.println("Ingresa Nombre");
                       nombre = ent2.nextLine();
                       
                       System.out.println("Ingresa Precio");
                       precio = ent2.nextLine();
                       
                       System.out.println("Ingresa Cantidad");
                       cantidad = ent1.nextInt();
                       
                       Pastillas a = new Pastillas(codigo,nombre,precio,cantidad);
       				ht.insert2(a, i );                
                       ht.printHashTable();
                       //a.
                       break;                          
                   case 2 :                 
                       System.out.println("Ingresa el dato");
                       ht.remove( scan.next() ); 
                       break;                        
                   case 3 : 
                       System.out.println("Ingresa el dato");
                       System.out.println("Valor = "+ ht.get( scan.next() )); 
                       break;                                   
                   case 4 : 
                       ht.vaciart();
                       System.out.println("Tabla vacia\n");
                       break;
                   case 5 : 
                       System.out.println("Tamano = "+ ht.getSize() );
                       //Mostrar dato de algun numero
                       ht.getSize();
                       System.out.println(ht.mostrardato(1));
                       break; 
                       
                   default : 
                       System.out.println("Entrada incorrecta \n ");
                       break;   
                   }

                   System.out.println("\nQuieres continuar (Escribe s o n) \n");
                   ch = scan.next().charAt(0);                        
               } while (ch == 's'|| ch == 'S');  
           }
            		

            } 
            if (opcionEligeUsuario == 4) {      
            	
            }
          }
        }
	
	
