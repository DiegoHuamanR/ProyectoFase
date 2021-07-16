import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int opcionvendedor=6;
		
		TDAList <Object> l1 = new ListLinked<Object>();
		System.out.println("\tBienvenidos a PillBank\n");
		String Nombre="";
		String Apellido="";
		String contraseña;
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
				contraseña=entrada.next();
				Vendedor v;
				v=new Vendedor(Nombre,Apellido,contraseña,dni);
				l1.insertFirst(v);
			}
			if(opcionvendedor==2) {
				boolean resp=false;
				while (resp==false){
					int comdni;
					String comcontra;
					System.out.println("Ingrese su DNI: ");
					comdni=entrada.nextInt();
					System.out.println("Ingrese su PIN: ");
					comcontra=entrada.next();
					
					Vendedor v1;
					System.out.println(Nombre+" "+Apellido);
					System.out.println(comcontra+" "+comdni);
					v1=new Vendedor(comcontra,comdni);
					resp=l1.search(v1);
					
					if(resp==true) {
						opcionvendedor=4;
						
					}else {
						System.err.println("No se encontro el usario");
						resp=false;
					}
				}
				

					
				}
			if(opcionvendedor==3) {
				System.out.println("\tTodos los vendedores ");
				System.out.println(l1);
				
			}
		}
		
		
	}

}
