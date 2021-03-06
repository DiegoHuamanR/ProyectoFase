
public class Usuario<E> implements Comparable<Usuario<E>> {
	protected int key,DNI,celular,edad;
	protected E nombre,apellido,email,contraseņa,direccion;
	public Usuario(int key,E nombre,E apellido,E email,E contraseņa,int celular,int edad,E direccion) {
		this.key= key;
		this.celular= celular;
		this.edad=edad;
		this.nombre=nombre;
		this.apellido=apellido;
		this.email=email;
		this.contraseņa=contraseņa;
		this.direccion=direccion;
	}
	public int compareTo(Usuario<E> r) {
		return this.key - r.key;
	}
	public boolean equals(Object o) {
		if(o instanceof Usuario) {
			Usuario<E> r = (Usuario<E>)o;
			return r.key==this.key;
		}
		return false;
	}
	public int getKey() {
	    return this.key;
	}
	public String toString() {
		return this.key+":"+this.nombre.toString()+":"+this.apellido.toString()
		+":"+this.direccion.toString()+":"+this.email.toString()+":"+this.celular+":"
		+this.edad+":"+this.contraseņa.toString();
	} 

}
