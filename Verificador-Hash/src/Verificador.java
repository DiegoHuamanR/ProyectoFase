import java.util.ArrayList;


public class Verificador<E extends Comparable<E>> {
	
	protected class Element{
		int mark;
		CodeReceta<E> reg;
		public Element(int mark, CodeReceta<E> reg) {
			this.mark = mark;
			this.reg = reg;
		}
	}
	protected ArrayList<Element> table;
	protected int m;
	
	public Verificador(int n) {
		n = primoCercano(n); //Se calcula el primo cercano de n
		this.m = n;
		this.table = new ArrayList<Element>(m);
		for(int i=0; i<m; i++) {
			this.table.add(new Element(0,null));
		}
	}
	
	public int functionPliege(int key) {
        int y=0;
		String numCadena= String.valueOf(key);
		int lo = numCadena.length();
		if(lo<=3){
		    y = 10;
		}
		if(lo==4){
		    y = 100;
		}
		if(lo>4){
		    y = 1000;
		}
		int i = 0;
		int list[];
		int sum=0;
		list = new int[9];
		while(key > 0) {
			list[i] = key%y;
			key = key/y;
			i++;
		}
		for (int x=0; x<list.length; x++){
		    sum = sum+list[x];
		}
		return sum % m;
	}
	
	public int functionCuadrado(int key) {
		int c;
		int cuad = key*key;
		int i = 0;
		int list[];
		list = new int[3];
		while(cuad > 0) {
			list[i] = cuad%10;
			cuad = cuad/10;
			i++;
		}
		c = list[1];
		return c % m;
	}
	
	private int functionHash(int key) {
		return key % m;
	}
	
	private int linearProbing(int dressHash, int key, int x) { //Se aumnetó un parámetro para saber si la llamada es de un insert (1) o search (-1)
		int posInit = dressHash;
		do{
			if(x == 1) { //Este if funciona si la llamada es de un insert
				if(table.get(dressHash).mark == 0) 
					return dressHash;
				if(table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key)
					return -2;
				dressHash = (dressHash + 1) % m;
			}
			if(x == -1) { //Este if funciona si la llamada es de un search
				if(table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key)
					return dressHash;
				dressHash = (dressHash + 1) % m;
			}
			
		}while (dressHash != posInit);
		return -1;
	}
	public void insert(int key, E reg, E direc) {
		int dressHash = functionPliege(key);
		dressHash = linearProbing(dressHash, key, 1);
		if (dressHash == -1) {
			System.out.println("Key table hash is full...");
			return;
		}
		else if(dressHash == -2) {
			System.out.println("Key is duplucated");
			return;
		}
		else {
			Element aux = new Element(1,new CodeReceta<E>(key, reg, direc));
			table.set(dressHash, aux);
		}
	}
	
	public int search(int key) {
		E dato = null; //Se crea una variable tipo E para retornar
		E horario = null;
		int x = 0;
		int dressHash = functionPliege(key); //Se busca la posición en la tabla con la functionHash
		dressHash = linearProbing(dressHash, key, -1); //Se envía el dressHash, la key y -1 a linearProbing para saber si el dato exite en la tabla
		if (dressHash == -1) { //Si dressHash es -1 es porque recorrió toda la tabla y no encontró el dato
			return x;
		}
		else {
			System.out.println("Buscando código: "+ key);
			dato = table.get(dressHash).reg.getPastilla();
			horario = table.get(dressHash).reg.getHoras();//Se obtiene el value del registro
			x = 1;
		}
		System.out.println("\tSU RECETA ES\t");
		System.out.println("| Pastilla |"+"   "+"| Horario |");
		System.out.println(dato+" "+horario); //Se retorna el value del registro
		return x;
	}
	
	public void remove(int key) {
		int dressHash = functionPliege(key); 
		dressHash = linearProbing(dressHash, key, -1); 
		if (dressHash == -1) { 
			
			System.out.println("No se encuentra en la tabla.");
		}
		else {
			table.get(dressHash).mark = 0;
		}

	}
	
	public int primoCercano(int num) { //Este método calcula el primo más cercano
		int conte=0, conta=0;
		int menor = cercanoMenor(num);
		int mayor = cercanoMayor(num);
		
		for(int i=menor; i<num; i++) 
			conte++;
		for(int i=mayor; i>num; i--) 
			conta++;
		
		if(conte<conta) {
			System.out.println("El primo cercano a "+ num +" es: "+ menor);
			return menor;}
		System.out.println("El primo cercano a "+ num +" es: "+ mayor);
		return mayor;
		
	}
	
	private int cercanoMayor(int num) { //Este método calcula el primo mayor más cercano al número original
		int a=0;
		int prim =0;
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				a++;
			}
		}
		if (a != 2) {
			prim = cercanoMayor(num+1); //Se hace uso de recursividad. Si el num no es primo, se llama a si mismo enviando num+1
		}else {
			prim = num;
		}
		
		return prim;
	}
	
	private int cercanoMenor(int num) { //Este método calcula el primo menor más cercano al número original
		int a=0;
		int prim =0;
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				a++;
			}
		}
		if (a != 2) {
			prim = cercanoMenor(num-1); //Si el num no es primo, se llama a si mismo enviando num-1
		}else {
			prim = num;
		}
		return prim;
	}
	
	public void insertReceta(Verificador<String> r) { //Las pastillas estarán predefinidas en este método.
		Verificador<String> h = new Verificador<String>(50);
		h = r;
		h.insert(5050,"Aspirina ->", " Cada 12 Horas.");
		h.insert(5134,"Paracetamol ->", "Cada 6 Horas.");
		h.insert(9746,"Omeprazol ->", "Después de cada almuerzo.");
		h.insert(5372,"Amoxicilina ->", "Cada 24 horas.");
		h.insert(3731,"Ampicilina ->", "Cada 24 horas.");
	}
	
	public String toString() {
		String s= "D.Real\tD.Hash\tRegister\n";
		int i=0;
		for(Element item : table) {
			s += (i++) + "-->\t";
			if (item.mark == 1)
				s +=  functionPliege(item.reg.getKey())+"\t" + item.reg.toString()+ "\n";
			else
				s += "empty\n";
		}
		return s;
	}
}