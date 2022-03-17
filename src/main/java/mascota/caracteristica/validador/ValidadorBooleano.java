package mascota.caracteristica.validador;

import excepciones.ExcepcionCaracteristica;

public class ValidadorBooleano implements ValidadorCaracteristica{

  public void validar(Object valorCaracteristica) throws ExcepcionCaracteristica {
    if(!esBooleano(valorCaracteristica)){
      throw new ExcepcionCaracteristica("El valor de la caracteristica no es booleano");
    }
  }

  private boolean esBooleano(Object valorCaracteristica) {
    return valorCaracteristica.toString().equals("true") || valorCaracteristica.toString().equals("false");
  }
}
