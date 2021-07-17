public class GraphLink<E> {
    protected ListLinkedG<Vertex<E>> listVertex;
    int i=0;

    public GraphLink( ) {
        listVertex = new ListLinkedG<Vertex<E>>();
    }

    public void insertVertex(E data) {
        Vertex<E> nuevo = new Vertex<E>(data);
        if (this.listVertex.searchData(nuevo)!= null) {
            System.out.println("Vertice ya fue usado anteriormente...");
            return;
        }
        this.listVertex.insertFirst(nuevo);
    }

    public void insertEdge(E verOri, E verDes) {
        insertEdge(verOri,verDes,-1);
    }

    public void insertEdge(E verOri, E verDes, int weight) {
        Vertex<E> refOri=this.listVertex.searchData(new Vertex<E>(verOri));
        Vertex<E> refDes=this.listVertex.searchData(new Vertex<E>(verDes));
        if (refOri ==null || refDes==null) {
            System.out.println("Vertice de origen o destino no existen...");
            return;
        }
        if (refOri.listAdj.searchData(new Edge<E>(refDes))!= null) {
            System.out.println("Arista ya fue insertada anteriormente...");
            return;
        }
        refOri.listAdj.insertFirst(new Edge<E>(refDes,weight));
        refDes.listAdj.insertFirst(new Edge<E>(refOri,weight));
    }
    public String toString( ) {
        return this. listVertex. toString( );
    }
    public int[] shortpath(E v, E z) {
        int suma=0;
        int[ ] lista;
        lista = new int[20];
        Vertex<E> vb1=this.listVertex.searchData(new Vertex<E>(v));
        Vertex<E> vb2=this.listVertex.searchData(new Vertex<E>(z));
        Edge<E> e1 =vb1.listAdj.searchData(new Edge<E>(vb2));
        Vertex<E> aux=vb1;
        NodeG<Edge<E>> aux1;
        aux1=aux.listAdj.getFirst();
        Vertex<E> aux2=vb2;
        NodeG<Edge<E>> aux3;
        aux3=aux2.listAdj.getFirst();
        if(e1==null) {
            while(aux1.getData().equals(aux3.getData())) {
                suma=aux3.getData().getWeight();

                lista[this.i]=suma;
                this.i++;
                if(aux1.getNext()!=null) {
                    suma=aux1.getData().getWeight();
                     lista[this.i]=suma;
                     this.i++;
                     aux1=aux1.getNext();

                 }
                 if(aux3.getNext()!=null) {
                     aux3=aux3.getNext();
                 }
                 aux1.setData(aux1.getData());
                 aux3.setData(aux3.getData());
            }

        }
        else {
            System.out.println("El camino mas corto desde su direccion actual hasta el hospital esta a: "+e1.getWeight()+" km");
        }
        return lista;
    }

}