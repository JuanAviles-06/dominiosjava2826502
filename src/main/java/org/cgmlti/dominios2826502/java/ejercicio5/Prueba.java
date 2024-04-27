package org.cgmlti.dominios2826502.java.ejercicio5;



public class Prueba {
    public static void main(String[] args) {




        Ciudades c1 = new Ciudades("Bogota DC");
        Ciudades c2 = new Ciudades("Buenos aires");
        Ciudades c3 = new Ciudades("La paz");

        Pais p1 = new Pais("colombia");

        Rutas r1 = new Rutas(10);

        r1.numero = 10;
        r1.listaCiudades.add(c1);
        r1.listaCiudades.add(c2);
        r1.listaCiudades.add(c3);


        for(Ciudades ciudadRuta:r1.listaCiudades){
            System.out.println("ciudad:" + 
                                ciudadRuta.nombre);
        }

       


        




        

        


        
        
    }

}
