package mascota.rescate;

import mascota.Mascota;
import usuario.DatosUsuario;

public class Rescate {

  private DatosUsuario datosUsuario;
  private DatosMascotaPerdida datosMascotaPerdida;
  private Mascota mascota;

  public Rescate(DatosUsuario datosUsuario, DatosMascotaPerdida datosMascotaPerdida, Mascota mascota) {
    this.datosUsuario = datosUsuario;
    this.datosMascotaPerdida = datosMascotaPerdida;
    this.mascota = mascota;
  }
}
