package mascota.caracteristica.validador;

import excepciones.ExcepcionCaracteristica;

public interface ValidadorCaracteristica {

  public void validar(Object valorCaracteristica) throws ExcepcionCaracteristica;
}
