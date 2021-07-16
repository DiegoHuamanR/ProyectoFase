
public class Usuario {
    private String identificacion;
    private String nombre;
    private String apellidos;
    private String email;
    private String celular;
    private int edad;
    private String contrase�a;

    /**
     * Constructor
     */
    public Usuario()    {
        // Inicializaci�n
        identificacion = "desconocido";
        nombre = "desconocido";
        apellidos = "desconocido";
        email = "desconocido";
        celular = "desconocido";
        edad = 0;
        contrase�a = "desconocido";
    }

    public void SetIdentificacion(String identificacion) {this.identificacion = identificacion;   }
    public void SetNombre(String nombre) {this.nombre = nombre; }
    public void SetApellidos(String apellidos) {this.apellidos = apellidos; }
    public void SetEmail(String email) { this.email = email; }
    public void SetCelular(String celular) {this.celular = celular; }
    public void SetEdad(int edad) {this.edad = edad; }
    public void SetContrase�a(String contrase�a) {this.contrase�a = contrase�a; }

    public String getIdentificacion() {return identificacion; }
    public String getNombre() {return nombre; }
    public String getApellidos() { return apellidos; }
    public String getEmail() {return email; }
    public String getCelular() { return celular;}
    public int getEdad() {return edad;}
    public String getContrase�a() { return contrase�a;}
    public String toString() {
        String mensaje = "Informaci�n actual de Usuario: \n";
        mensaje = mensaje + "DNI: " + this.getIdentificacion()+"\n";
        mensaje = mensaje + "Nombre: " + this.getNombre()+"\n";
        mensaje = mensaje + "Apellidos: " + this.getApellidos() + "\n";
        mensaje = mensaje + "Email: " + this.getEmail() + "\n";
        mensaje = mensaje + "Celular: " + this.getCelular() + "\n";
        mensaje = mensaje + "Edad: " + this.getEdad() + "\n";
        mensaje = mensaje + "Contrase�a: " + this.getContrase�a() + "\n";
        mensaje = mensaje + "\n";
        return mensaje;
    }
}