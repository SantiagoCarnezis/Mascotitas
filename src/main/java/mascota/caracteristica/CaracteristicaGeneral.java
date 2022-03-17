package mascota.caracteristica;

import mascota.caracteristica.validador.ValidadorCaracteristica;

public class CaracteristicaGeneral {

  private String nombre;
  private ValidadorCaracteristica validador;
  private Boolean obligatoriedad;

  public CaracteristicaGeneral(String nombre, ValidadorCaracteristica validador, Boolean obligatoriedad) {
    this.nombre = nombre;
    this.validador = validador;
    this.obligatoriedad = obligatoriedad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public ValidadorCaracteristica getValidador() {
    return validador;
  }

  public void setValidador(ValidadorCaracteristica validador) {
    this.validador = validador;
  }

  public Boolean getObligatoriedad() {
    return obligatoriedad;
  }

  public void setObligatoriedad(Boolean obligatoriedad) {
    this.obligatoriedad = obligatoriedad;
  }
}
