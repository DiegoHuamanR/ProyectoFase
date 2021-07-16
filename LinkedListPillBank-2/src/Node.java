

public class Node<T> {
	private T data;//info
	private Node<T> next;//puntero
	public int value;
	
	public Node(T data ) {
		this (data,null);	
	}
	public Node(T data, Node<T> next) {
		this.data=data;
		this.next= next;
	}
	public Node(T data, Node<T> next, int value) {
		this.data=data;
		this.value = value;
		this.next= next;
	}
	   public Node (T data, int value) 
	{
	    	this.data=data;
	    	this.value = value;
	        this.next = null;
	}
	
    public Node<T> head = null;
    public Node<T> tail = null;
    
    
	public T getData() { return this.data;}
	public Node<T> getNext(){return this.next;}
	public void setData(T data) {this.data=data;}
	public void setNext(Node<T> next) {this.next=next;}
	
	 public void displayData(){
	      System.out.print(this.data + " ");
	    }
	
	public String toString() {
		return this.data.toString();
	}
}
