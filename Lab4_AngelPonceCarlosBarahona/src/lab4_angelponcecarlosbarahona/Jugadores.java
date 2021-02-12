package lab4_angelponcecarlosbarahona;

public class Jugadores {
    
    private String nombre, apodo, numcamiseta, equipofutfav, equipobalfav, jugfav, mayorEdad; //si es mayor de edad o no
    private String nacimiento;
    private int NumeroEstrellas;

    public Jugadores() {
    }

    public Jugadores(String nombre, String apodo, String numcamiseta, String equipofutfav, 
            String equipobalfav, String jugfav, String mayorEdad, String nacimiento, 
            int NumeroEstrellas) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.numcamiseta = numcamiseta;
        this.equipofutfav = equipofutfav;
        this.equipobalfav = equipobalfav;
        this.jugfav = jugfav;
        this.mayorEdad = mayorEdad;
        this.nacimiento = nacimiento;
        this.NumeroEstrellas = NumeroEstrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getNumcamiseta() {
        return numcamiseta;
    }

    public void setNumcamiseta(String numcamiseta) {
        this.numcamiseta = numcamiseta;
    }

    public String getEquipofutfav() {
        return equipofutfav;
    }

    public void setEquipofutfav(String equipofutfav) {
        this.equipofutfav = equipofutfav;
    }

    public String getEquipobalfav() {
        return equipobalfav;
    }

    public void setEquipobalfav(String equipobalfav) {
        this.equipobalfav = equipobalfav;
    }

    public String getJugfav() {
        return jugfav;
    }

    public void setJugfav(String jugfav) {
        this.jugfav = jugfav;
    }

    public String getMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(String mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getNumeroEstrellas() {
        return NumeroEstrellas;
    }

    public void setNumeroEstrellas(int NumeroEstrellas) {
        if(NumeroEstrellas>=1 && NumeroEstrellas<=5){
            this.NumeroEstrellas = NumeroEstrellas;
        }
    }

    public void Atacar(){
        System.out.println();
    }
    
    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre 
                + ", apodo=" + apodo 
                + ", numcamiseta=" + numcamiseta 
                + ", equipofutfav=" + equipofutfav 
                + ", equipobalfav=" + equipobalfav 
                + ", jugfav=" + jugfav 
                + ", mayorEdad=" + mayorEdad 
                + ", nacimiento=" + nacimiento 
                + ", NumeroEstrellas=" + NumeroEstrellas;
    }
    
    
    
}
