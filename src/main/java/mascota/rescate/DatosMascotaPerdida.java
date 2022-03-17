package mascota.rescate;

import usuario.Ubicacion;

public class DatosMascotaPerdida {

  private String fotos;
  private String descripcion;
  private Ubicacion ubicacion;

  public DatosMascotaPerdida(String fotos, String descripcion, Ubicacion ubicacion) {
    this.fotos = fotos;
    this.descripcion = descripcion;
    this.ubicacion = ubicacion;
  }
}
