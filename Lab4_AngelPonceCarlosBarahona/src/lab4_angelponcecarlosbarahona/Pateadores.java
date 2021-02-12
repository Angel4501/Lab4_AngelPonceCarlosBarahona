package lab4_angelponcecarlosbarahona;

public class Pateadores extends Jugadores{
    
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
    public String toString() {
        return "Pateadores{" + "HabilidadPateadora=" + HabilidadPateadora + ", fuerza=" + fuerza + ", habilidadRegate=" + habilidadRegate + '}';
    }

}
