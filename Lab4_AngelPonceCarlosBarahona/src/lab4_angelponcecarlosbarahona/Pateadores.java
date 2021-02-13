package lab4_angelponcecarlosbarahona;

import java.util.Random;

public class Pateadores extends Jugadores{
    static Random r = new Random();
    private int HabilidadPateadora,fuerza,habilidadRegate; //todas de 1-100 VALIDAR

    public Pateadores(int HabilidadPateadora, int fuerza, int habilidadRegate, 
            String nombre, String apodo, String numcamiseta, String equipofutfav, String equipobalfav, 
            String jugfav, String mayorEdad, String nacimiento, int NumeroEstrellas, String atacar) {
        super(nombre, apodo, numcamiseta, equipofutfav, equipobalfav, jugfav, mayorEdad, nacimiento, 
                NumeroEstrellas);
        this.setHabilidadPateadora(HabilidadPateadora);
        this.setFuerza(fuerza);
        this.setHabilidadRegate(habilidadRegate);
    }

    public int getHabilidadPateadora() {
        return HabilidadPateadora;
    }

    public void setHabilidadPateadora(int HabilidadPateadora) {
        if(HabilidadPateadora>=1 && HabilidadPateadora<=100)
        this.HabilidadPateadora = HabilidadPateadora;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        if(fuerza>=1 && fuerza<=100)
        this.fuerza = fuerza;
    }

    public int getHabilidadRegate() {
        return habilidadRegate;
    }

    public void setHabilidadRegate(int habilidadRegate) {
        if(habilidadRegate>=1 && habilidadRegate<=100)
        this.habilidadRegate = habilidadRegate;
    }
    
    @Override
    public boolean Atacar(){
        //(HP+F+HR)*0.65 * Núm. Estrellas/10
        double prob=(getHabilidadPateadora()+getFuerza()+getHabilidadRegate())*0.65*super.getNumeroEstrellas()/10;
        int ran=1+r.nextInt(100);
        if(ran>=1 && ran<=prob){
            System.out.println("¡¡¡Anotó!!!");
            return true;
        }
        else{
            System.out.println("...No anotó...");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pateadores{" + "HabilidadPateadora=" + getHabilidadPateadora()
                + ", fuerza=" + getFuerza() 
                + ", habilidadRegate=" + getHabilidadRegate() + '}';
    }

}
