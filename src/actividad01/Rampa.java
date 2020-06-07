
package actividad01;

public class Rampa {
    private int alturaEscalon,numeroEscalones,pendiente;
    private float longitud;
    public void calcularLongitud(){
        longitud = ((float)(numeroEscalones*alturaEscalon)*100/pendiente);
    }
    public void mostrarLongitud(){
        calcularLongitud();
        System.out.println("El valor de la longitud de la rampa es :"+longitud+"cm");
       }
    //defino constructor,parametros pend, numer es,altura
    public Rampa(int pendiente, int numeroEscalones, int alturaEscalon){
        this.pendiente = pendiente;
        this.numeroEscalones = numeroEscalones;
        this.alturaEscalon = alturaEscalon;
    }
}
