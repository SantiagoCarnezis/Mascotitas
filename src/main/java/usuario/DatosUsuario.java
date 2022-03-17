package usuario;

import java.time.LocalDate;
import java.util.ArrayList;

public class DatosUsuario {

  private String nombre;
  private String apellido;
  private LocalDate fechaNacimiento;
  private String numeroDni;
  private ArrayList<Contacto> contactos;
  private Ubicacion direccion;
  private String email;

  public DatosUsuario(String nombre, String apellido, LocalDate fechaNacimiento,
                      String numeroDni, ArrayList<Contacto> contactos, Ubicacion direccion, String email) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.numeroDni = numeroDni;
    this.contactos = contactos;
    this.direccion = direccion;
    this.email = email;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public String getNumeroDni() {
    return numeroDni;
  }

  public void setNumeroDni(String numeroDni) {
    this.numeroDni = numeroDni;
  }

  public ArrayList<Contacto> getContactos() {
    return contactos;
  }

  public void setContactos(ArrayList<Contacto> contactos) {
    this.contactos = contactos;
  }

  public Ubicacion getDireccion() {
    return direccion;
  }

  public void setDireccion(Ubicacion direccion) {
    this.direccion = direccion;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
