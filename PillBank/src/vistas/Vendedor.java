package vistas;

public class Vendedor {
	String Nombre;
	String Apellido;
	int codigo=1568;
	int dni;
	Vendedor(String nombre, String apellido, int cod, int id){
		this.Nombre=nombre;
		this.Apellido=apellido;
		this.codigo=cod;
		this.dni=id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Nombre: "+this.Nombre + " " + this.Apellido + "\n" + "Codigo: "+ this.codigo + "\n"
				+"DNI: "+this.dni;
	}
	
	
}
