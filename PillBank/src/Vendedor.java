
public class Vendedor {
	String Nombre;
	String Apellido;
	String codigo;
	int dni;
	Vendedor(String nombre, String apellido, String cod, int id){
		this.Nombre=nombre;
		this.Apellido=apellido;
		this.codigo=cod;
		this.dni=id;
	}
	
	Vendedor(String cod, int dni){
		this.codigo=cod;
		this.dni=dni;
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
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
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
