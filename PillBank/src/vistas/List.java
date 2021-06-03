package vistas;

public class List<T> {

	node<T> head;
    private int length = 0;
    // constructor
    List() { 
    	this.head = null;
    	
    }

    //add
    void add(T data)
    {
        node<T> temp = new node<>(data);
        if (this.head == null) {
            head = temp;
        }
        else {
            node<T> X = head;
              while (X.next != null) {
                X = X.next;
            }
            X.next = temp;
        }
         length++;
    }
  
    
    
    // add en la posicion dada
    void add2(int position, T data)
    {
        if (position > length + 1) {
  
            System.out.println( "Position Unavailable in LikedList");
            return;
        }
        if (position == 1) {
            node<T> temp = head;
            head = new node<T>(data);
            head.next = temp;
              return;
        }
        node<T> temp = head;
        node<T> prev = new node<T>(null);
        while (position - 1 > 0) {
            prev = temp;
            temp = temp.next;
            position--;
        }
        prev.next = new node<T>(data);
        prev.next.next = temp;
    }
    
    // remove
    void remove(T key)
    {
        node<T> prev = new node<>(null);
        prev.next = head;
        node<T> next = head.next;
        node<T> temp = head;
        boolean exists = false;
        if (head.data == key) {
            head = head.next;
            exists = true;
        }
        while (temp.next != null) {
            if (String.valueOf(temp.data).equals(
                    String.valueOf(key))) {
                prev.next = next;
                exists = true;
                break;
            }
            prev = temp;
            temp = temp.next;
            next = temp.next;
        }
        if (exists == false
            && String.valueOf(temp.data).equals(
                String.valueOf(key))) {
            prev.next = null;
            exists = true;
        }
        if (exists) {
            length--;
        }
        else {
            System.out.println(
                "Given Value is not present in linked list");
        }
    }
    //  clear 
    void clear()
    {
        head = null;
        length = 0;
    }
  
   // si esta vacia o no
    boolean empty()
    {
        if (head == null) {
            return true;
        }
        return false;
    }
    
    // retornar lenght
    int length() { return this.length; }
  
    // Method
    // To display the LinkedList
    // @Override
    public String toString()
    {
  
        String S = "{ ";
  
        node<T> X = head;
  
        if (X == null)
            return S + " }";
  
        while (X.next != null) {
            S += String.valueOf(X.data) + " -> ";
            X = X.next;
        }
  
        S += String.valueOf(X.data);
        return S + " }";
    }
}
