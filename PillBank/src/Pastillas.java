

public class Pastillas {

	private Integer codigo;
	private String nombre;
	private double precio;
	private Integer cantidad;
	public List <Pastillas>p1= new List<Pastillas>();

    public Pastillas() {
        this.codigo= 0;
        this.nombre = "Desconocido";
        this.precio = 0.0;
        this.cantidad = 0;
    }
    
    public List<Pastillas> getP1() {
		return p1;
	}

	public void setP1(List<Pastillas> p1) {
		this.p1 = p1;
	}

	public void guardar(Pastillas p) {
    	this.p1.add(p);
    }
	public void mostrar() {
		System.out.println(this.p1);
	}
    public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

    public String toString() {
    	String mensaje = "Información actual de Pastilla: \n";
        mensaje = mensaje + "Codigo: " + this.getCodigo()+"\n";
        mensaje = mensaje + "Nombre: " + this.getNombre()+"\n";
        mensaje = mensaje + "Precio: " + this.getPrecio() + "\n";
        mensaje = mensaje + "Cantidad: " + this.getCantidad() + "\n";
        mensaje = mensaje + "\n\n";
        return mensaje;
    }

}
