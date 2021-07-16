public class ListLinked<T>implements TDAList<T>  {

	public Node<T> first;
	private Node<T> sorted;

	int count;

	public ListLinked() {
		this.first =null;//head
		this.count = 0;//contador

	}

	public Node<T> getFirst() {
		return first;
	}

	public void setFirst(Node<T> first) {
		this.first = first;
	}

	public boolean isEmptyList() {
		return this.first == null;
	}

	public int lenght() {
		return this.count;
	}

	public void destroyList() {
		while(this.first != null)
			this.first = this.first.getNext();
		this.count = 0;
	}

    void sortedInsert(Node<T> newnode) 
    {

        if (sorted == null || sorted.getData().equals(newnode.getData())) 
        {
            newnode.setNext(sorted);
            sorted = newnode;
        }
        else 
        {
            Node<T> current = sorted;

            while (current.getNext() != null && current.getNext().getData().equals(newnode.getData())) 
            {
                current = current.getNext();
            }
            newnode.setNext(current.getNext());
            current.setNext(newnode);
        }
    }

	//prerequisito
	private Node<T> getLastNode(){
		Node<T> aux = this.first;
		while(aux.getNext() != null)
			aux = aux.getNext();
		return aux;
	}

	public String toString() {
		String str="";
		Node<T> aux = this.first;
		for (int i=0; aux != null; aux = aux.getNext(), i++)
			str += "["+i+"]"+"\t"+ aux.getData()+"\n";
		return str;
	}



    public void insertFirst(T x)
    {
        Node<T> new_node = new Node<T>(x);
        new_node.setNext(this.first);
        this.first = new_node;
        this.count++;
    }



	public void insertLast(T x) {
	if(this.isEmptyList())
		this.insertFirst(x);
	else {
		Node<T> lastNode = getLastNode();
		lastNode.setNext(new Node<T>(x));
		this.count++;
		}
	}

	public boolean search(T x) {

        Node<T> current = first;    //Iniciar actual
        while (current != null)
        {
            if (current.getData() == x)
                return true;    
            current = current.getNext();
        }
        return false;    
    }	




		public Integer ocurrencias(T x)
	    {
	        Node<T> current = this.first;
	        Integer count = 0; /* index of Node we are
	                          currently looking at */
	        while (current != null)
	        {
	            if (count.equals(x ))
	                return count;
	            count++;
	            current = current.getNext();
	        }
			return count;



	}

		@Override
		public int search2(T x) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void remove(T x) {
	        Node<T> aux=this.first;
	        int pos;
	        int posi;
	        int contador=0;
	        pos=search2(x);
	        posi=pos-1;
	        while(contador<posi) {
	            aux=aux.getNext();
	            contador++;
	        }
	        aux.setNext(aux.getNext().getNext());
	        this.count--;

	    }


}