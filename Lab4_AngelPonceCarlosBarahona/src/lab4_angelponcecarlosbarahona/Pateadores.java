package lab4_angelponcecarlosbarahona;

import java.util.Random;

public class Pateadores extends Jugadores{
    static Random r = new Random();
    private int HabilidadPateadora,fuerza,habilidadRegate; //todas de 1-100 VALIDAR

    public Pateadores(int HabilidadPateadora, int fuerza, int habilidadRegate, 
            String nombre, String apodo, String numcamiseta, String equipofutfav, String equipobalfav, 
            String jugfav, String mayorEdad, String nacimiento, int NumeroEstrellas, String atacar) {
        super(nombre, apodo, numcamiseta, equipofutfav, equipobalfav, jugfav, mayorEdad, nacimiento, 
                NumeroEstrellas, atacar);
        this.HabilidadPateadora = HabilidadPateadora;
        this.fuerza = fuerza;
        this.habilidadRegate = habilidadRegate;
    }

    public int getHabilidadPateadora() {
        return HabilidadPateadora;
    }

    public void setHabilidadPateadora(int HabilidadPateadora) {
        this.HabilidadPateadora = HabilidadPateadora;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getHabilidadRegate() {
        return habilidadRegate;
    }

    public void setHabilidadRegate(int habilidadRegate) {
        this.habilidadRegate = habilidadRegate;
    }
    
    @Override
    public void Atacar(){
        //(HP+F+HR)*0.65 * Núm. Estrellas/10
        double prob=(getHabilidadPateadora()+getFuerza()+getHabilidadRegate())*0.65*super.getNumeroEstrellas()/10;
        int ran=1+r.nextInt(100);
        if(ran>=1 && ran<=prob){
            System.out.println("¡¡¡Anotó!!!");
        }
        else{
            System.out.println("...No anotó...");
        }
    }

    @Override
    public String toString() {
        return "Pateadores{" + "HabilidadPateadora=" + HabilidadPateadora + ", fuerza=" + fuerza + ", habilidadRegate=" + habilidadRegate + '}';
    }

}
