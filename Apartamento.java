
package inmuebles;

public class Apartamento extends InmuebleVivienda {
    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos){
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
    }
    void imprimio(){
        super.imprimir();
    }
}
