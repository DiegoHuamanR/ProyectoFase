import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) throws IOException {
		HashC<String> h= new HashC<String>(10);
		System.out.println("----------------------------------");
		System.out.println("---------Prueba cuadratica----------");
		System.out.println("---------Empleados----------");
		h.insertcuadratic(73641532,73641532,"Libni","Bored","Andres Avelino Caceres","nini4578@hotmail.com",973625325,19,"nini");
		h.insertcuadratic(75122532,75122532,"Diego","Arboleda","Jose Luis Bustamante y Rivero","diego8@hotmail.com",97364325,25,"nini");
		h.insertcuadratic(74633432,74633432,"Rosa","Cespedes","Arayanes Umcacoyo","rosa78@hotmail.com",975325325,23,"nini");
		System.out.println(h);
	}
	
}