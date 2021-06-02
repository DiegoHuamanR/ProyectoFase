
public class Test {

	public static void main(String[] args) {
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
   	 	Pastillas.add(e);
   	 	System.out.println(Pastillas);
   	 	Pastillas.remove(c);
   	 	System.out.println(Pastillas);
   	 	Pastillas.add2(0,b);
   	 	System.out.println(Pastillas);
   	 	Pastillas.empty();
   	 	Pastillas.length();
   	 	Pastillas.clear();
        System.out.println(Pastillas);
        
        Verificacion receta = new Verificacion();
		
		System.out.println("La receta es: "+ receta.veriCode(2345));
		System.out.println("La receta es: "+ receta.veriCode(3456));

	}

}
