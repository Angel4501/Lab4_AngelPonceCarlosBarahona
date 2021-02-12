package lab4_angelponcecarlosbarahona;

import java.util.Random;
import java.util.Scanner;
import static lab4_angelponcecarlosbarahona.Pateadores.r;

public class Tiradores extends Jugadores {

    static Scanner sc = new Scanner(System.in);
    private int tirodetres, tirodedos, manejodebalon; //todas del 1-100 VALIDAR

    public Tiradores(int tirodetres, int tirodedos, int manejodebalon,
            String nombre, String apodo, String numcamiseta, String equipofutfav, String equipobalfav,
            String jugfav, String mayorEdad, String nacimiento, int NumeroEstrellas, String atacar) {
        super(nombre, apodo, numcamiseta, equipofutfav, equipobalfav, jugfav, mayorEdad, nacimiento,
                NumeroEstrellas, atacar);
        this.tirodetres = tirodetres;
        this.tirodedos = tirodedos;
        this.manejodebalon = manejodebalon;
    }

    public int getTirodetres() {
        return tirodetres;
    }

    public void setTirodetres(int tirodetres) {
        this.tirodetres = tirodetres;
    }

    public int getTirodedos() {
        return tirodedos;
    }

    public void setTirodedos(int tirodedos) {
        this.tirodedos = tirodedos;
    }

    public int getManejodebalon() {
        return manejodebalon;
    }

    public void setManejodebalon(int manejodebalon) {
        this.manejodebalon = manejodebalon;
    }

    @Override
    public void Atacar() {
        System.out.println("Tiro de dos o de 3 puntos?");
        System.out.println("1. De 2");
        System.out.println("2. De 3");
        System.out.println("Ingrese opcion (1. o 2.): ");
        int opc = sc.nextInt();
        while (opc != 1 && opc != 2) {
            System.out.println("Opcion invalida, ingresela nuevamente: ");
            opc = sc.nextInt();
        }
        if (opc == 1) {
            //(T2P+MB)*0.95 * Núm. Estrellas/10
            double prob = (getTirodedos() + getManejodebalon()) * 0.95 * super.getNumeroEstrellas() / 10;
            int ran=1+r.nextInt(100);
            if (ran >= 1 && ran <= prob) {
                System.out.println("¡¡¡Anotó!!!");
            } else {
                System.out.println("...No anotó...");
            }
        } 
        else if (opc == 2) {
            // (TT+MB)*0.90 * Núm. Estrellas/10
            double prob = (getTirodetres() + getManejodebalon()) * 0.90 * super.getNumeroEstrellas() / 10;
            int ran=1+r.nextInt(100);
            if (ran >= 1 && ran <= prob) {
                System.out.println("¡¡¡Anotó!!!");
            } else {
                System.out.println("...No anotó...");
            }
        }
    }

    @Override
    public String toString() {
        return "Tiradores{" + "tirodetres=" + tirodetres + ", tirodedos=" + tirodedos + ", manejodebalon=" + manejodebalon + '}';
    }

}
