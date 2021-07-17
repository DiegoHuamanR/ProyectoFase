public class ListLinkedG<T>  {

    public NodeG<T> first;
    private NodeG<T> sorted;

    int count;

    public ListLinkedG() {
        this.first =null;//head
        this.count = 0;//contador

    }

    public NodeG<T> getFirst() {
        return first;
    }

    public void setFirst(NodeG<T> first) {
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

    void sortedInsert(NodeG<T> newnode) 
    {

        if (sorted == null || sorted.getData().equals(newnode.getData())) 
        {
            newnode.setNext(sorted);
            sorted = newnode;
        }
        else 
        {
            NodeG<T> current = sorted;

            while (current.getNext() != null && current.getNext().getData().equals(newnode.getData())) 
            {
                current = current.getNext();
            }
            newnode.setNext(current.getNext());
            current.setNext(newnode);
        }
    }

    //prerequisito
    private NodeG<T> getLastNode(){
        NodeG<T> aux = this.first;
        while(aux.getNext() != null)
            aux = aux.getNext();
        return aux;
    }

    public String toString() {
        String r="";
        NodeG<T> aux = this.first;
        while(aux != null) {
            r=r+aux.getInfo();
            aux=aux.getNext();
        }
        return r;
    }



    public void insertFirst(T x)
    {
        NodeG<T> new_node = new NodeG<T>(x);
        new_node.setNext(this.first);
        this.first = new_node;
        this.count++;
    }

    public void remove(T key)
    {
        NodeG<T> temp = this.first, prev = null;
 
        if (temp != null && temp.getData().equals(key)) {
            this.first = temp.getNext(); // Changed head
            return;
        }
 
        while (temp != null && temp.getData().equals(key)) {
            prev = temp;
            temp = temp.getNext();
        }
 
        if (temp == null)
            return;
        prev.setNext(temp.getNext());
    }



    public void insertLast(T x) {
    if(this.isEmptyList())
        this.insertFirst(x);
    else {
        NodeG<T> lastNode = getLastNode();
        lastNode.setNext(new NodeG<T>(x));
        this.count++;
        }
    }

    public boolean search(T x) {

        NodeG<T> current = first;    //Iniciar actual
        while (current != null)
        {
            if (current.getData() == x)
                return true;
            current = current.getNext();
        }
        return false;
    }

    public T searchData(T data) {
        NodeG<T> nodo =this.first;
        while (nodo!= null && !nodo.getData().equals(data)) {
            nodo=nodo.getNext();
        }
        if (nodo!=null)
            return nodo.getData();
        return null;

    }



        public Integer ocurrencias(T x)
        {
            NodeG<T> current = this.first;
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

}