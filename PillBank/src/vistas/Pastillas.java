package vistas;

public class Pastillas {

	private Integer codigo;
	private String nombre;
	private String precio;
	private Integer cantidad;

    public Pastillas(Integer codigo,String nombre,String precio,Integer cantidad) {
        this.codigo= codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
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


	public String getPrecio() {
		return precio;
	}


	public void setPrecio(String precio) {
		this.precio = precio;
	}


	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

    public String toString() {
        return "Lista:(" + codigo + "," + nombre +","+precio+","+cantidad+")";
    }
}
