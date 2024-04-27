package org.cgmlti.dominios2826502.java.ejercicio4;

import java.time.LocalDate;

public class Prueba {

    public static void main(String[] args) {

        //crear una instancia de vehiculo:
        Vehiculo vehiculo1 = new Vehiculo(334567L, 
                                true,
                                45 );
        
        //crear un objeto viaje
        Viaje v = new Viaje();
        v.fechaInicio = 
        v.fechaFin = LocalDate.of(2024, 4, 28);
        //Invocacion llamado, ejecucion, utilizacion
        v.calcularDuracionViaje(LocalDate.of(2024, 4, 26),
                                LocalDate.of(2024, 4, 28));

        //invocacion de la sobrecarga
        System.out.println("duracion en dias del viaje: "
                        + v.calcularDuracionViaje());


        //instanciar un ejemplar 
        //de cada tipo de vehiculo
        Camion c1 = new Camion();
        c1.estaDisponible = true;

        //establecer el viaje
        //del camion:
        
        c1.elTalViajeQueHizoElCamion = v;
        

        CamionConRemolque cr1 = 
                    new CamionConRemolque();
        cr1.capacidadCargaExtra = 9;
        cr1.capacidadCarga = 10;

        //invocar el metodo creado
        
        System.out.println("total carga:" + cr1.calcularTotalCarga());



        System.out.println("el viaje del camion" + "tiene fecha de inicio:" + c1.elTalViajeQueHizoElCamion.fechaInicio);
        System.out.println("el viaje del camion" + "tiene fecha de fin:" + c1.elTalViajeQueHizoElCamion.fechaFin);

    }

}
