
public class Vendedor {
	String Nombre;
	String Apellido;
	int dni;
	Vendedor(String nombre, String apellido, int id){
		this.Nombre=nombre;
		this.Apellido=apellido;
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
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return this.Nombre+":"+this.Apellido+":"+this.dni;
	}
	
	
}
