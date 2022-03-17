package mascota.caracteristica;

import excepciones.ExcepcionCaracteristica;

public class CaracteristicaMascota {

  private CaracteristicaGeneral caracteristica;
  private Object valor;

  public CaracteristicaMascota(CaracteristicaGeneral caracteristica, Object valor) throws ExcepcionCaracteristica {

    caracteristica.getValidador().validar(valor);
    this.caracteristica = caracteristica;
    this.valor = valor;
  }
}
