package usuario;

public class Cuenta {

  private String nombreUsuario;
  private String contrasenia;
  private DatosUsuario usuario;

  public Cuenta(String nombreUsuario, String contrasenia, DatosUsuario usuario) {

    validarContrasenia(contrasenia);

    this.nombreUsuario = nombreUsuario;
    this.contrasenia = contrasenia;
    this.usuario = usuario;
  }

  private void validarContrasenia(String contrasenia) {
  }


}
