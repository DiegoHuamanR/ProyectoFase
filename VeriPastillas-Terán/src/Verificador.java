
public class Verificador<E extends Comparable<E>> {

	class Node{
		protected E data;
		protected Node left,right;
		
		public Node(E data) {
			this (data,null,null);
		}
		
		public Node(E data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	
	private Node root;
	
	public Verificador() {this.root = null;}
	public boolean isEmpty() { return this.root == null;}
	
	public void insert(E x) throws ItemDuplicated{
		this.root = insertRec(x, this.root);
	}
	
	public Node insertRec(E x, Node actual) throws ItemDuplicated{
		Node res = actual;
		if (actual == null)
			res = new Node(x);
		else {
			res.right =	insertRec(x, actual.right);
		}
		return res;
	}
	
	public E search(E x) throws ItemNoFound{
		Node resp = searchRec(x, this.root);
		if (resp == null)
			return null;
			//throw new ItemNoFound("La receta con código " + x + " no se encuentra. \n");
		return resp.data;
	}
	
	private Node searchRec(E x, Node actual) throws ItemNoFound{ 
		if (actual == null)
			return null;
		else {
			int resC = actual.data.compareTo(x);
			if(resC < 0)	return searchRec(x, actual.right);
			else if (resC > 0) return searchRec(x, actual.left);
			else return actual.right;
		}
	}
	
	public void remove(E x) throws ItemNoFound{
		this.root = removeRec(x, this.root);
	}
	
	public Node removeRec(E x, Node actual) throws ItemNoFound{
		Node res = actual;
		if (actual == null)
			throw new ItemNoFound("La receta con código " + x + " no se encuentra.");
		else {
			int resC = actual.data.compareTo(x);
			if(resC < 0)	res.right =	removeRec(x, actual.right);
			else if (resC > 0)	res.left = removeRec(x, actual.left);
			else { //Encontramos el nodo 
				if (actual.left != null && actual.right != null) {
					res.data = minimoIzq(actual.right).data;
					res.right = minimoRemove(actual.right);
					System.out.println("Caso 3");
					
				}	
				else {
					res = (actual.left != null) ? actual.left : actual.right;
				}
			}
		}
		return res;
	}
	
	public Node minimoRemove(Node raiz){
		
		Node aux = raiz;
		aux = minimoIzq(raiz);
		if (aux.right == null) {
			raiz.right = null;
			return raiz;
		}
		else {
			raiz.right = aux.right;
			return raiz;
		}
		
		
	}
	public Node minimoIzq(Node raiz) {
		Node aux = raiz;
		if (aux.left != null) {
			aux = minimoIzq(aux.left);
		}
		return aux;
	}
	
	public void insercion(Verificador<String> c) throws ItemDuplicated { //Los códigos y recetas estarán predefinidos.
		Verificador<String> b = new Verificador<String>();
		b = c;
		b.insert("1234");
		b.insert("[Aspirina] cada 12 horas.");
		b.insert("1235");
		b.insert("[Paracetamol] cada 6 horas.");
		b.insert("1236");
		b.insert("[Omeprazol] depués de cada almuerzo.");
	}
	
	public String toString() {
		recorrido(this.root);
		return "";
	}
	
	
	protected void recorrido(Node actual) {
		if (actual.left != null) recorrido(actual.left);
		System.out.print(actual.data.toString()+", ");
		if (actual.right != null) recorrido(actual.right);
	}
	
}