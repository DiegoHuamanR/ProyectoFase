public class Encadenamiento<T> {
	   private int tamanotabla;
	   protected Node[] HashTable; 
	   protected int tamano;
	 
	   public Encadenamiento(int tt)
	   {
	      tamano = 0;
	      tamanotabla=tt;
	      HashTable = new  Node[tamanotabla];
	      for (int i = 0; i < tamanotabla; i++)
	    	  HashTable[i] = null;
	    } 

	   public void vaciart()
	    {
	       for (int i = 0; i < tamanotabla; i++)
	            HashTable[i] = null;
	    }
	   public int getSize() {
		  return tamano; 
	   }

	    private int myhash(String x )
	    {
	        int hashVal = x.hashCode( );

	        hashVal %= tamanotabla;
	        if (hashVal < 0)
	            hashVal += tamanotabla;
	        return hashVal;
	    }
	    
	   public int get(String data) 
	    {
	        int hash = (myhash( data ) % tamanotabla);
	        if (HashTable[hash] == null)
	            return -1;
	        else 
	        {
	            Node entry = HashTable[hash];
	            while (entry != null && !entry.getData().equals(data))
	                entry = entry.getNext();	
	            if (entry == null)
	                return -1;
	            else
	                return entry.value;
	        }
	    }

	   
	   public void insert(String data, int value) 
	    {
	        int hash = (myhash( data ) % tamanotabla);
	        if (HashTable[hash] == null)
	            HashTable[hash] = new Node(data, value);
	        else 
	        {
	            Node entry = HashTable[hash];
	            while (entry.getNext() != null && !entry.getData().equals(data))
	            	entry = entry.getNext();
	            if (entry.getData().equals(data))
	                entry.value = value;
	            else
	            	entry.setNext(new Node(data, value));
	        }
	        tamano++;
	    }
	
	   
	   public void insert2(T data, int value) 
	    {
	        int hash = (myhash2( data ) % tamanotabla);
	        if (HashTable[hash] == null)
	            HashTable[hash] = new Node(data, value);
	        else 
	        {
	            Node entry = HashTable[hash];
	            while (entry.getNext() != null && !entry.getData().equals(data))
	            	entry = entry.getNext();
	            if (entry.getData().equals(data))
	                entry.value = value;
	            else
	            	entry.setNext(new Node(data, value));
	        }
	        tamano++;
	    }
	   private int myhash2(T x )
	    {
	        int hashVal = x.hashCode( );

	        hashVal %= tamanotabla;
	        if (hashVal < 0)
	            hashVal += tamanotabla;
	        return hashVal;
	    }
	   
	   

	   public void remove(String data) 
	    {
	        int hash = (myhash( data ) % tamanotabla);
	        if (HashTable[hash] != null) 
	        {
	            Node prevEntry = null;
	            Node entry = HashTable[hash];
	            while (entry.getNext() != null && !entry.getData().equals(data)) 
	            {
	                prevEntry = entry;
	                entry = entry.getNext();
	            }
	            if (entry.getData().equals(data)) 
	            {
	                if (prevEntry == null)
	                    HashTable[hash] = entry.getNext();
	                else
	                    prevEntry.setNext(entry.getNext());
	                tamano--;
	            }
	        }
	    } 
	   
	   public void printHashTable()
	    {
	        for (int i = 0; i < tamanotabla; i++)
	        {
	            System.out.print("\nEspacio "+ (i + 1) +" : ");
	            Node entry = HashTable[i];
	            while (entry != null)
	            {
	                System.out.print(entry.value +" ");
	                entry = entry.getNext();
	            }            
	        }
	    }

	

	   
	   
	   
}
