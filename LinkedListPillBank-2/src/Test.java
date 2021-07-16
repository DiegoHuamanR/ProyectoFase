
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
    }
}
