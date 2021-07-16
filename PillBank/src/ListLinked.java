import java.util.ArrayList;
import java.util.List;

public class ListLinked <T> implements TDAList<T> {
	List<Vendedor> lista = new ArrayList<Vendedor>();
	Vendedor ingresado=null;
	private Node<T> first;
	private int count;
	public ListLinked() {
		this.first=null;
		this.count=0;
	}
	
	public boolean isEmptyList() {
		return this.first==null;
	}
	public int length() {
		return this.count;
	}
	public void destroyList() {
		while(this.first!=null)
			this.first=this.first.getNext();
	}
	public boolean search(Vendedor x) {
		Vendedor ingreso=x;
        Node<T> current = first;
        for(int i=0;i<lista.size();i++) {
        	System.out.println(lista.get(i));
        	if(lista.get(i).equals(x)) {
        		ingreso=lista.get(i);
        	}
        }
        while (current != null)
        {
            if (ingreso.getDni()==x.getDni())
                return true;
            current = current.getNext();
        }
        return false;
    }
	public int searchData(T x) {
		Node<T> aux=this.first;
		for(int i=0; aux!=null;aux=aux.getNext(), i++) 
			if(aux.getData().equals(x)) {
				System.out.println(aux.getData());
				return i;
			}
		return -1;
	}
	public Node<T> getFirst() {
		return first;
	}

	public void setFirst(Node<T> first) {
		this.first = first;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void insertFirst(T x) {
		lista.add((Vendedor) x);
		this.first = new Node<T>(x,this.first);
		this.count++;
	}
	public void insertLast(T x) {
		if(this.isEmptyList())
			this.insertFirst(x);
		else {
			Node<T> lastNode= getLastNode();
			lastNode.setNext(new Node<T>(x));
			this.count++;
		}
	}
	//PreCondition: List is not empty
	private Node<T> getLastNode(){
		Node<T> aux=this.first;
		while(aux.getNext()!=null)
			aux=aux.getNext();
		return aux;
		
	}

	/*public void remove(T x) {
		
		
	}
	*/
	public String toString() {
		String str="";
		Node<T> aux=this.first;
		for(int i=0; aux!=null; aux=aux.getNext(), i++)
			str+= "["+i+"] =  "+aux.getData()+"\n";
		return str;
	}

	@Override
	public void remove(T x) {
		Node<T> aux=this.first;
		int pos;
		int posi;
		int contador=0;
		pos=searchData(x);
		
		posi=pos-1;
		while(contador<posi) {
			aux=aux.getNext();
			contador++;
		}
		aux.setNext(aux.getNext().getNext());
		this.count--;
		
	}
	

		


}
