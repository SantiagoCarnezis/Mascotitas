package mascota;

import mascota.caracteristica.CaracteristicaMascota;

import java.util.ArrayList;

public class Mascota {

  private Boolean esPerro;
  private String nombre;
  private String apodo;
  private Integer edad;
  private Boolean esMacho;
  private String descripcionFisica;
  private String fotos;
  private ArrayList<CaracteristicaMascota> caracteristicas;

  public Mascota(Boolean esPerro, String nombre, String apodo, Integer edad,
                 Boolean esMacho, String descripcionFisica, String fotos,
                 ArrayList<CaracteristicaMascota> caracteristicas) {
    this.esPerro = esPerro;
    this.nombre = nombre;
    this.apodo = apodo;
    this.edad = edad;
    this.esMacho = esMacho;
    this.descripcionFisica = descripcionFisica;
    this.fotos = fotos;
    this.caracteristicas = caracteristicas;
  }


}
