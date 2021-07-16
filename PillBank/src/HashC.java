import java.util.ArrayList;

public class HashC<E extends Comparable<E>> {
	
	protected class Element{
		int mark;
		
		Register<E> reg;
		public Element(int mark, Register<E> reg){
			this.mark=mark;
			this.reg=reg;
		}
	}
	protected ArrayList<Element> table;
	protected int m;
	
	public HashC(int n) {
		this.m=n;  
		this.table=new ArrayList<Element>(m);
		for(int i=0; i<m;i++) {
			this.table.add(new Element(0,null));
		}
	}
	
	private int functionHash(int key) {
		return key% m;
	}
	private int linearProbing(int dressHash, int key,int x) {
		int posInit = dressHash;
        do{
            if(x == 1) {
                if(table.get(dressHash).mark == 0) 
                    return dressHash;
                if(table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key)
                    return -2;
                dressHash = (dressHash + 1) % m;
            }
            if(x == -1) {
                if(table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key)
                    return dressHash;
                dressHash = (dressHash + 1) % m;
            }

        }while (dressHash != posInit);
        return -1;
	}
	

	public void insert(int key, E reg) {
		int dressHash=functionHash(key);
		dressHash=linearProbing(dressHash, key,1);
		if(dressHash==-1) {
			System.out.println("Key table hash is full...");
			return;	
		}
		else if(dressHash==-2) {
			System.out.println("Key is duplicated...");
			return;	
		}
		else {
			Element aux=new Element(1, new Register<E>(key,reg));
			table.set(dressHash, aux);
		}
	}
	public boolean search(int key) {
		int dressHash=functionHash(key);
		dressHash=linearProbing(dressHash, key,-1);
		if(dressHash!=-1) {	
			return true;
		}
		else {
			System.out.println("No se encontro el elemento buscado");
			return false;
		}
		
		
	}
	public void remove(int key) {
		int dressHash = functionHash(key);
		dressHash=linearProbing(dressHash, key,-1);
		Element aux = table.get(dressHash);
		aux.mark=0;

    }
	@Override
	public String toString() {
		String s="D.Real\tD.Hash\tRegister\n";
		int i=0;
		for(Element item : table) {
			s+=(i++)+" -->\t";
			if(item.mark==1)
				s+=functionHash(item.reg.key)+"\t"+item.reg+"\n";
			else
				s+="empty\n";
			
		}
		return s;
	}
	
}
