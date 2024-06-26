package org.cgmlti.dominios2826502.java.ejercicio4;

import java.time.LocalDate;
import java.time.Period;

public class Viaje {

    LocalDate fechaInicio;
    LocalDate fechaFin;


    //crear un metodo que imprima 
    //la duracion del viaje 
    //dada la fecha de nicio y fn 
    //ingresadas con inputs

    public void calcularDuracionViaje(
        LocalDate fechaInicio,
        LocalDate fechaFin



    )
    {
        //asignar las fechas parametro
        //a los atributos del viaje 
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        Period diferencia = Period.between(fechaInicio, 
                              fechaFin);

        System.out.println("duracion del viaje:" + 
                            diferencia.getDays()+
                            "dias");  
        


    }

    //sobrecarga del metodo calcularDuracion:
    int calcularDuracionViaje(){
        Period diferencia = Period.between(fechaInicio, 
                              fechaFin);
        return diferencia.getDays();

    }
}
