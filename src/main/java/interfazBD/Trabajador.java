package interfazBD;
import java.sql.Date;

public class Trabajador {

    private String dni;
    private String nombre;
    private String puesto;
    private Date fechaNacimiento;
    private String direccion;
    private String telefono;
    private double salario;
    private Date fechaComienzoEmpresa;
    private boolean verificar;


    public Trabajador(String dni, String nombre, String puesto, Date fechaNacimiento, String direccion, String telefono, double salario, Date fechaComienzoEmpresa, boolean verificar) {
        this.dni = dni;
        this.nombre = nombre;
        this.puesto = puesto;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.fechaComienzoEmpresa = fechaComienzoEmpresa;
        this.verificar = verificar;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaComienzoEmpresa() {
        return fechaComienzoEmpresa;
    }

    public void setFechaComienzoEmpresa(Date fechaComienzoEmpresa) {
        this.fechaComienzoEmpresa = fechaComienzoEmpresa;
    }

    public boolean isVerificar() {
        return verificar;
    }

    public void setVerificar(boolean verificar) {
        this.verificar = verificar;
    }
}
