package org.cgmlti.dominios2826502.java.ejercicio2;

public class PruebaEjercicio2 {

    public static void main(String[] args) {
        
        //Crear 2 instancias de cada Entidad
        //Instanciar 2 veces cada Entidad 
        //Crear 2 objetos de cad Entidad
        //1. Nombre de la clase a Instanciar
        //2. nombre del objeto(identificador)
        //3. operador de asignacion 
        //4. palabra(referencia) new
        //5. otra vez, el nombre de la clase 
        //6. parentesis(constructor)  
        Hospital hospital1 = new Hospital();
        Hospital h1 = new Hospital();


        //acceder a los atributos del objeto:
        //operador .
        //1. identificador del objeto
        //2. el punto 
        //3. el atributo a trabajar
        //4. el operador de asignacion
        //5. el valor a asignar al atributo  
        hospital1.direccion = "Caracas con 52";
        h1.nombre = "San Rafael";
        h1.telefono = 123456789L;

        //crear 3 Medicos:
        Medico medico1 = new Medico();
        medico1.nombre="Carlos Rodriguez";
        medico1.cedula=123412353L;
        medico1.especialidad="CARDIOLOGIA";

        //medico 2

        Medico medico2 = new Medico();
        medico2.nombre="Panguanito Rodriguez";
        medico2.cedula=657454545L;
        medico2.especialidad="OPTOMETRA";

        //crear sala 1;
        SalaHospital sala1 = new SalaHospital();
        sala1.cantidadCamas = 156;
        sala1.numero = 5656546;

        //crear sala 2;
        SalaHospital sala2 = new SalaHospital();
        sala2.cantidadCamas = 174;
        sala2.numero = 9874562;


        //añadir medicos al hospital
        hospital1.listaMedicos.add(medico1);
        hospital1.listaMedicos.add(medico2);
        sala1.listaSala.add(sala1);
        sala1.listaSala.add(sala2);

        //recorrer la lista de medicos
        //del hospital 1;
        for(Medico medicoRecorrer:hospital1.listaMedicos ){
            System.out.println("Medico:" + 
                                medicoRecorrer.cedula);

        }

        for(SalaHospital salaRecorrer:sala1.listaSala ){
            System.out.println("Sala:" + 
                                salaRecorrer.cantidadCamas);

        }

    }

}
