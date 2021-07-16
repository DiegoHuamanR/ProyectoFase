
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class HashC<E extends Comparable<E>> {

	public class Element{
		int mark;
		Usuario<E> reg;
		public Element(int mark,Usuario<E> reg) {
			this.mark=mark;
			this.reg=reg;
		}
	}
	protected ArrayList<Element>table;
	protected int m;
	public int a=0;

	public HashC(int n) {
		this.m=n;
		this.table = new ArrayList<Element>(m);
		for(int i=0;i<m;i++) {
			this.table.add(new Element(0,null));
		}
	}
	public int functionHash(int key) {
		return key %m;	
	}
		
	private int linearProbing(int dressHash,int key) {
        int posInit = dressHash;
        do {
            if(table.get(dressHash).mark == 0)
                return dressHash;
            if(table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key)
                return -2; 
            dressHash=(dressHash + 1 )% m;
        }while (dressHash != posInit);
        return -1;
    }
    public void insert(int key,int key2,E nom,E apell,E direcc,E email,int cel,int edad,E contra) {
		a=1;
        int dressHash=functionHash(key);
        dressHash=linearProbing(dressHash,key);
        if (dressHash==-1) {
            System.out.println("Key table hash is full...");
            return;
        }
        if (dressHash==-2) {
            System.out.println("Key is duplicated");
            return;
        }
        else {
            Element aux =new Element(1,new Usuario<E>(key,key2,nom,apell,direcc,email,cel,edad,contra));
            table.set(dressHash,aux);
        }

    }
    
    public int remove(int key,int key2,E nom,E apell,E direcc,E email,int cel,int edad,E contra) {
        int posicion=functionHash(key);
        do {
        if (table.get(posicion).mark == 0) {
            return -2;
            }
        if (table.get(posicion).mark == 1 && table.get(posicion).reg.getKey() == key) {
            System.out.println("Se encontro el dato "+table.get(posicion).reg);
            Element aux =new Element(0,new Usuario<E>(key,key2,nom,apell,direcc,email,cel,edad,contra));
            table.set(posicion,aux);
            }
        posicion=(posicion + 1 )% m;
        }while (functionHash(key) != posicion);
            return -1;

    }
    public String toString(){
    	String s="D.Real\tD.Hash\tUsuario: DNI:Nombre:Apellidos:Direccion:Email:Celular:Edad:Contraseña\n";
    	int i=0;
    	if(a==1) {
    		for (Element item:table) {
      		  s+=(i++)+"-->\t";
      		  if(item.mark== 1) 
      			s+=functionHash(item.reg.getKey())+"\t"+item.reg.toString()+"\n";
      		  else
      	     	s+= "empty\n";
      		}
      		return s;
      		}
    	if(a==2) {
    		for (Element item:table) {
        		  s+=(i++)+"-->\t";
        		  if(item.mark== 1) 
        			s+=metodopliegue(item.reg.getKey())+"\t"+item.reg.toString()+"\n";
        		   else
        	     	s+= "empty\n";
        		}
        		return s;
    	}
    	else {
    		for (Element item:table) {
      		  s+=(i++)+"-->\t";
      		  if(item.mark== 1) 
      			s+=functionHash(item.reg.getKey())+"\t"+item.reg.toString()+"\n";
      		   else
      	     	s+= "empty\n";  
      		}
      		return s;
    	}
    }
    public int metodopliegue(int key){
      a=0;
      int digitos =1; 
      int longarreglo =300; 
      int hashVal =0; 
      while(longarreglo >0 ){ 
          digitos *= 10;
          longarreglo /= 10;
      }
      while(key>0){  
          hashVal +=key%digitos;
          key /= digitos;
      }
      int dressHash=functionHash(hashVal);
      return dressHash;
    }
    public void insertplegable(int key,int key2,E nom,E apell,E direcc,E email,int cel,int edad,E contra) {
    	int dressHash=metodopliegue(key);
        dressHash=linearProbing(dressHash,key);
        if (dressHash==-1) {
            System.out.println("Key table hash is full...");
            return;
        }
        if (dressHash==-2) {
            System.out.println("Key is duplicated");
            return;
        }
        else {
            Element aux =new Element(1,new Usuario<E>(key,key2,nom,apell,direcc,email,cel,edad,contra));
            table.set(dressHash,aux);
        }
    }
    public void mostrarDatos(String nombreArchivo) {
    	
    		try {
    			FileReader archivo = new FileReader("empleado.txt");
    	    	BufferedReader buffer = new BufferedReader(archivo);
    	    	String temp="";
    	    	
    	    	while (temp!=null) {
    	    		temp= buffer.readLine();
    	    		
    	    		if(temp==null)
    	    			break;
    	    		System.out.println(temp);
    	    	};
    			
    		}catch(Exception e) {
    			System.out.println(e.getMessage());
    		};
    }
    
    private int cuadraticProbing(int dressHash,int key) {
        int posInit = dressHash; 
        int conta = 0,cuadra=0,sum=0;
        do {
            if(table.get(dressHash).mark == 0)
                return dressHash;
            if(table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key)
                return -2; 
            conta=conta+1;
            cuadra=(int) (Math.pow(conta, 2));
            sum=posInit + cuadra;
            dressHash=(sum% m);
            posInit=sum-cuadra;
        }while (dressHash != posInit); 
        return -1;
    }
    public void insertcuadratic(int key,int key2,E nom,E apell,E direcc,E email,int cel,int edad,E contra) {
    	a=3;
    	int dressHash=functionHash(key);
        dressHash=cuadraticProbing(dressHash,key);
        if (dressHash==-1) {
            System.out.println("Key table hash is full...");
            return;
        }
        if (dressHash==-2) {
            System.out.println("Key is duplicated");
            return;
        }
        else {
            Element aux =new Element(1,new Usuario<E>(key,key2,nom,apell,direcc,email,cel,edad,contra));
            table.set(dressHash,aux);
        }
    }
}
    