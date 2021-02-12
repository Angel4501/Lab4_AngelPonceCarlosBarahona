package lab4_angelponcecarlosbarahona;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_AngelPonceCarlosBarahona {
static ArrayList<Jugadores> jug = new ArrayList();
static ArrayList<Equipos> equipos = new ArrayList();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("JUEGO");
        int ptsequipo1=0;
        int ptsequipo2=0;
        System.out.println("Que jugador tendra la pelota inicialmente?: ");
        System.out.println("1. Jugador 1");
        System.out.println("2. Jugador 2");
        System.out.print("Escoja: ");
        int opc=sc.nextInt();
        while(opc!=1 && opc!=2){
            System.out.println("Por favor, ingrese una opcion valida: ");
            System.out.println("1. Jugador 1");
            System.out.println("2. Jugador 2");
            System.out.print("Escoja: ");
            opc=sc.nextInt();
        }
        System.out.println("J1 Ingrese posicion del equipo que quiere usar");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(equipos.get(i).getNombre());
        }
        System.out.println("Escoja: ");
        int pos1 = sc.nextInt();
        System.out.println("J2 Ingrese posicion del equipo que quiere usar");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(equipos.get(i).getNombre());
        }
        System.out.println("Escoja: ");
        int pos2 = sc.nextInt();
        while(pos2==pos1){
            System.out.println("Jugador 1 ya tiene ese equipo, elija otro: ");
            pos2 = sc.nextInt();
        }
        //Empezando juego
        while(ptsequipo1<11 && ptsequipo2<11){
            if(opc==1){
                System.out.println("Jugador 1 ");
                System.out.println("1. Atacar");
                System.out.println("2. Dar pase");
                System.out.println("Ingrese (1 ó 2): ");
                int op1=sc.nextInt();
                while(op1!=1 && op1!=2){
                    System.out.println("Por favor, ingrese una opcion valida: ");
                    System.out.println("1. Atacar");
                    System.out.println("2. Dar pase");
                    System.out.println("Ingrese (1 ó 2): ");
                    op1=sc.nextInt();
                }
                switch(op1){
                    case 1:
                        System.out.println("Con que jugador desea atacar? Ingrese posicion");
                        for(int i=0; i<equipos.get(pos1).getJugadores().size(); i++){
                            System.out.println(equipos.get(pos1).getJugadores().get(i).getNombre());
                        }
                        System.out.println("Ingrese: ");
                        int posjug=sc.nextInt();
                        
                        break;
                    case 2:
                        
                        break;
                        
                }
            }
        }//Fin del juego
        
        
    }
    
    public void FindelJuego(int ptsequipo1, int ptsequipo2){
        System.out.println("Puntos anotado por equipo 1: "+ptsequipo1);
        
        
        System.out.println("Puntos anotados por equipo 2: "+ptsequipo2);
        
        
    }
    
}
