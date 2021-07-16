import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args)
    {
        
    	ListLinked<Pastillas> Pastillas = new ListLinked<>();
  
    	
		 Pastillas a = new Pastillas(45672956,"Paracetamol","S./3.20",10);
    	 Pastillas b = new Pastillas(34357891,"Omeprazol","S./2.20",15);
    	 Pastillas c = new Pastillas(65431183,"Ramipril","S./5.20",20);
    	 Pastillas d = new Pastillas(88547235,"Aspirina","S./7.20",8);
    	 Pastillas e = new Pastillas(99124365,"Amlopidina","S./4.20",13);
 
 
    	 Pastillas.insertFirst(a);
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
            System.out.println("5. Tamano");
            int choice = scan.nextInt();           
            switch (choice)
            {
            case 1 : 
                System.out.println("Ingresa codigo, nombre, precio y cantidad");
                
                ht.insert(scan.next(), scan.nextInt() ); 
                
                ht.printHashTable();
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
                break; 
                
            default : 
                System.out.println("Entrada incorrecta \n ");
                break;   
            }

            System.out.println("\nQuieres continuar (Escribe s o n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 's'|| ch == 'y');  
    }
}


 

