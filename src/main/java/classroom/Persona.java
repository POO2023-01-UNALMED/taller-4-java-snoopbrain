package classroom;

public class Persona {
    

    final long cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
        //cedula = 3;
    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = 1;
        totalPersonas++;
    }
    
    Persona(){
        this.nombre = "";
        this.cedula = 0;
        totalPersonas++;
    }
    
    long getCedula() {
        return cedula;
    }

}
