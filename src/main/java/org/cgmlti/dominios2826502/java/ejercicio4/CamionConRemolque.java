package org.cgmlti.dominios2826502.java.ejercicio4;

public class CamionConRemolque extends Vehiculo {

    Integer capacidadCargaExtra;
    String descripcion;

    //crear un metodo que permita 
    //calcular el total de carga maximo
    //soportado en un camion con remolque
    //declaracion de metodo
    
    public Integer calcularTotalCarga(){
        Integer totalCarga = capacidadCarga +
                        capacidadCargaExtra;
        return totalCarga;
    
    
    }
}
