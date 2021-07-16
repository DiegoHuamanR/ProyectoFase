	import java.util.ArrayList;
	
	public class HashC<E extends Comparable<E>> {
		protected class Element{
			int mark;
			Register<E> reg;
			public Element(int mark,Register<E> reg) {
				this.mark=mark;
				this.reg=reg;
			}
			
		}
		protected ArrayList<Element> table;
		protected int m;
		
		public HashC(int n) {
			this.m=n;//Capacidad tabla	
			this.table=new ArrayList<Element>(m);
			for (int i=0;i<m;i++) {
				this.table.add(new Element(0,null));
				
			}
		}
		
	private int functionHash(int key) {
		return key % m;
	}
	
	private int linearProbing(int dressHash,int key) {//direccion hash y clave
		int posInit = dressHash;
		do {
			if(table.get(dressHash).mark == 0)
				return dressHash; //posicion vacia
			if(table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key)
				return -2; 
			dressHash=(dressHash + 1 )% m;
		}while (dressHash != posInit);
		return -1;
	}
	
	public void insert(int key,E reg) {
		int dressHash=functionHash(key);
		dressHash=linearProbing(dressHash,key);
		if (dressHash==-1) {
			System.out.println("Key table hash is full...");
			return;
		}
		if (dressHash==-2) {
			System.out.println("Key is duplicated");
			return;
		}
		else {
			Element aux =new Element(1,new Register<E>(key,reg));
			table.set(dressHash,aux);
		}
		
	}
	
	public long Cuadrado(long seed) {
		 long s2 = seed*seed;
		 System.out.println("Para 8 digitos:");
		    long middle = (s2 % 100000) / 1000;
		    seed = middle;
		    System.out.println(middle);
		    return middle;
		       
    }
	
	public int search(int key) {
        int posInit =functionHash(key);
        do {
            if (table.get(posInit).mark == 0) {
                System.out.println("No se encontro el dato");
                return -2;
                }
            if (table.get(posInit).mark == 1 && table.get(posInit).reg.getKey() == key) {
                System.out.println("Se encontro el dato "+table.get(posInit).reg);
                }
            posInit=(posInit + 1 )% m;
            }while (functionHash(key) != posInit);
                return -1; 
    }
	
	public int remove(int key,E reg) {
        int posicion=functionHash(key);
        do {
        if (table.get(posicion).mark == 0) {
            return -2;
            }
        if (table.get(posicion).mark == 1 && table.get(posicion).reg.getKey() == key) {
            System.out.println("Se encontro el dato "+table.get(posicion).reg);
            Element aux =new Element(0,new Register<E>(key,reg));
            table.set(posicion,aux);
            }
        posicion=(posicion + 1 )% m;
        }while (functionHash(key) != posicion);
        	System.out.println("No se encontro el dato");
            return -1;
            

    }
 
	
	public String toString() {
		String s= "D.Real\tD.Hash\tRegister\n";
		int i=0;
		for (Element item: table) {
			s+=(i++) +"-->\t";
			if (item.mark==1)
				s+=functionHash(item.reg.getKey())+"\t"+item.reg.toString()+"\n";
			else
				s+= "empty\n";
			
			
		}
		return s;
	}
	
}
