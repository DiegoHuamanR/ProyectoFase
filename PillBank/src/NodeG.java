import java.util.List;

public class NodeG<Type> {
	private Type data;//info
	private NodeG<Type> next;//puntero
	
	boolean visited;

   void visit() {
        visited = true;
    }

    void unvisit() {
        visited = false;
    }
	
	
	public NodeG(Type data ) {
		this.data=data;
		this.next=null;
	}
	public NodeG(Type data, NodeG<Type> next) {
		this.data=data;
		this.next= next;
	}
	
    public Node<Type> head = null;
    public Node<Type> tail = null;
    
    public Type getInfo() {return data;}
	public Type getData() { return this.data;}
	public NodeG<Type> getNext(){return this.next;}
	public void setData(Type data) {this.data=data;}
	public void setNext(NodeG<Type> next) {this.next=next;}
	
	 public void displayData(){
	      System.out.print(this.data + " ");
	    }
	
	public String toString() {
		return this.data.toString();
	}

	public boolean isVisited() {
		// TODO Auto-generated method stub
		return false;
	}
}