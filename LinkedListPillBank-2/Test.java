import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int opcionvendedor=6;
		int opcionvendedorlogeado=6;
		int comcontra=0;
		HashCV<String> h=new HashCV<String>(10);
		System.out.println("\tBienvenidos a PillBank\n");
		String Nombre="";
		String Apellido="";
		int contraseña;
		int dni;
		Scanner entrada= new Scanner(System.in);
		while(opcionvendedor!=4) {
			System.out.println("\tVendedor ");
			System.out.println("1.-Registro Vendedor");
			System.out.println("2.-Ingreso Vendedor");
			System.out.println("3.-Mostrar Vendedores");
			System.out.println("4.-Salir");
			System.out.println("¿Que desea hacer?");
			opcionvendedor=entrada.nextInt();
			if(opcionvendedor==1) {
				System.out.println("\tRegistro de Vendedor ");
				System.out.println("Ingrese su Nombre: ");
				Nombre=entrada.next();
				System.out.println("Ingrese su Apellido: ");
				Apellido=entrada.next();
				System.out.println("Ingrese su DNI: ");
				dni=entrada.nextInt();
				System.out.println("Cree un PIN: ");
				contraseña=entrada.nextInt();
				Vendedor v;
				v=new Vendedor(Nombre,Apellido,dni);
				h.insert(contraseña,v.toString());
				opcionvendedor=5;
			}
			if(opcionvendedor==2) {
				boolean resp=false;
				while (resp==false){
					int comdni;
					System.out.println("Ingrese su DNI: ");
					comdni=entrada.nextInt();
					System.out.println("Ingrese su PIN: ");
					comcontra=entrada.nextInt();
					resp=h.search(comcontra);
					if(resp==true) {
						opcionvendedor=5;
						
					}else {
						System.err.println("No se encontro el usario");
						resp=false;
					}
				}
				

					
				}
			if(opcionvendedor==3) {
				System.out.println("\tTodos los vendedores ");
				System.out.println(h);
				
			}
			if(opcionvendedor==5) {
				int ping;
				String letra;
				Vendedor v2;
				while(opcionvendedorlogeado!=4) {
					System.out.println("\nBienvenido");
					System.out.println("1.-Modificar Cuenta");
					System.out.println("2.-Eliminar Cuenta");
					System.out.println("3.-Pastillas");
					System.out.println("4.-Salir");
					System.out.println("¿Que desea hacer?");
					opcionvendedorlogeado=entrada.nextInt();
					if(opcionvendedorlogeado==1) {
						System.out.println("Ingrese su ping para confirmar modificacion");
						ping=entrada.nextInt();
						if(h.search(ping)==true) {
							h.remove(ping);
							System.out.println("Ingrese su Nombre: ");
							Nombre=entrada.next();
							System.out.println("Ingrese su Apellido: ");
							Apellido=entrada.next();
							System.out.println("Ingrese su DNI: ");
							dni=entrada.nextInt();
							v2=new Vendedor(Nombre,Apellido,dni);
							System.out.println("¿Desea modificar su ping?-S/N");
							letra=entrada.next();
							if(letra.equals("S")||letra.equals("s")) {
								System.out.println("Ingrese su nuevo ping");
								contraseña=entrada.nextInt();
								
								h.insert(contraseña, v2.toString());
							}
							else {
								h.insert(ping, v2.toString());
							}
							System.out.println(h);
						}
					}
					if(opcionvendedorlogeado==2) {
						System.out.println("Ingrese su ping para confirmar la eliminacion de la cuenta");
						ping=entrada.nextInt();
						if(h.search(ping)==true) {
							h.remove(ping);
							System.out.println("Se elimino correctamente la cuenta");
							opcionvendedorlogeado=4;
						}
					}
					if(opcionvendedorlogeado==3) {
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
				        Scanner ent = new Scanner(System.in);
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
				                codigo = ent.nextInt();
				                
				                System.out.println("Ingresa Nombre");
				                nombre = ent2.nextLine();
				                
				                System.out.println("Ingresa Precio");
				                precio = ent2.nextLine();
				                
				                System.out.println("Ingresa Cantidad");
				                cantidad = ent.nextInt();
				                
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
				}
				
			}
		}
		
		
	}

