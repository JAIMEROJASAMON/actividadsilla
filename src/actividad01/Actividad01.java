
package actividad01;

public class Actividad01 {

    public static void main(String[] args) {
       int pendiente= 7;
       Escalones escalon1 = new Escalones(2,13);
       int numeroEscalones = escalon1.ingresarNumeroEsc();
       int alturaEscalon =escalon1.ingresaralturaEsc();
       Rampa rampa1 = new Rampa(pendiente,numeroEscalones,alturaEscalon);
       rampa1.mostrarLongitud();
       
    }
    
}
;