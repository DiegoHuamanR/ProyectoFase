

public class NodeH<T> {
	private T data;//info
	private NodeH<T> next;//puntero
	public int value;
	
	public NodeH(T data ) {
		this (data,null);	
	}
	public NodeH(T data, NodeH<T> next) {
		this.data=data;
		this.next= next;
	}
	public NodeH(T data, NodeH<T> next, int value) {
		this.data=data;
		this.value = value;
		this.next= next;
	}
	   public NodeH (T data, int value) 
	{
	    	this.data=data;
	    	this.value = value;
	        this.next = null;
	}
	
    public NodeH<T> head = null;
    public NodeH<T> tail = null;
    
    
	public T getData() { return this.data;}
	public NodeH<T> getNext(){return this.next;}
	public void setData(T data) {this.data=data;}
	public void setNext(NodeH<T> next) {this.next=next;}
	
	 public void displayData(){
	      System.out.print(this.data + " ");
	    }
	
	public String toString() {
		return this.data.toString();
	}
}
