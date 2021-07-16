import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int opcionvendedor=6;
		int opcionvendedorlogeado=6;
		int comcontra=0;
		HashC<String> h=new HashC<String>(10);
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
				while(opcionvendedorlogeado!=3) {
					System.out.println("\nBienvenido");
					System.out.println("1.-Modificar Cuenta");
					System.out.println("2.-Eliminar Cuenta");
					System.out.println("3.-Salir");
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
							opcionvendedorlogeado=3;
						}
					}
				}
				
			}
		}
		
		
	}

}
