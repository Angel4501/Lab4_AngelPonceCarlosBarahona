package lab4_angelponcecarlosbarahona;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_AngelPonceCarlosBarahona {

    static ArrayList<Jugadores> jug = new ArrayList();
    static ArrayList<Equipos> equipos = new ArrayList();
    static ArrayList<String> j1 = new ArrayList(); //nombres y tipo
    static ArrayList<Integer> j1p = new ArrayList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("JUEGO");
        int ptsequipo1 = 0;
        int ptsequipo2 = 0;
        System.out.println("P1 Ingrese posicion del equipo que quiere usar");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(equipos.get(i).getNombre());
        }
        System.out.println("Escoja: ");
        int pos1 = sc.nextInt();
        System.out.println("P2 Ingrese posicion del equipo que quiere usar");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(equipos.get(i).getNombre());
        }
        System.out.println("Escoja: ");
        int pos2 = sc.nextInt();
        while (pos2 == pos1) {
            System.out.println("Jugador 1 ya tiene ese equipo, elija otro: ");
            pos2 = sc.nextInt();
        }
        //Empezando juego
        while (ptsequipo1 < 11 && ptsequipo2 < 11) {
            System.out.println("Usuario 1 ");
            System.out.println("Escoja un jugador");
            for (int i = 0; i < equipos.get(pos1).getJugadores().size(); i++) {
                System.out.println(equipos.get(pos1).getJugadores().get(i).getNombre());
            }
            System.out.println("Ingrese: ");
            int posjug = sc.nextInt();
            System.out.println("1. Atacar");
            System.out.println("2. Dar pase");
            System.out.println("Ingrese (1 ó 2): ");
            int op1 = sc.nextInt();
            while (op1 != 1 && op1 != 2) {
                System.out.println("Por favor, ingrese una opcion valida: ");
                System.out.println("1. Atacar");
                System.out.println("2. Dar pase");
                System.out.println("Ingrese (1 ó 2): ");
                op1 = sc.nextInt();
            }
            switch (op1) {
                case 1:
                    if (equipos.get(pos1).getJugadores().get(posjug) instanceof Pateadores) {
                        if (equipos.get(pos1).getJugadores().get(posjug).Atacar() == true) {
                            equipos.get(pos1).getJugadores().get(posjug).Atacar();
                            ptsequipo1++;
                            //j1.add(equipos.get(pos1).getJugadores().get(posjug).getNombre()+" "+"Pateador");

                        } 
                        else {
                            equipos.get(pos1).getJugadores().get(posjug).Atacar();

                        }
                    } 
                    else {
                        System.out.println("1. Tiro de 3");
                        System.out.println("2. Tiro de 2");
                        System.out.println("Opcion: ");
                        int op = sc.nextInt();
                        if (op == 1) {
                            if (equipos.get(pos1).getJugadores().get(posjug).Atacar() == true) {
                                equipos.get(pos1).getJugadores().get(posjug).Atacar();
                                ptsequipo1 += 3;
                                //j1.add(equipos.get(pos1).getJugadores().get(posjug).getNombre()+" "+"Pateador");
                            } else {
                                equipos.get(pos1).getJugadores().get(posjug).Atacar();

                            }
                        } 
                        else if (op == 2) {
                            if (op == 1) {
                                if (equipos.get(pos1).getJugadores().get(posjug).Atacar() == true) {
                                    equipos.get(pos1).getJugadores().get(posjug).Atacar();
                                    ptsequipo1 += 2;
                                    //j1.add(equipos.get(pos1).getJugadores().get(posjug).getNombre()+" "+"Pateador");
                                } 
                                else {
                                    equipos.get(pos1).getJugadores().get(posjug).Atacar();
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingrese posicion a quien pasarle el balon: ");
                    int posbalon1=sc.nextInt();
                    
                    break;

            }

        }//Fin del juego

    }

    public void FindelJuego(int ptsequipo1, int ptsequipo2) {
        System.out.println("Puntos anotado por equipo 1: " + ptsequipo1);

        System.out.println("Puntos anotados por equipo 2: " + ptsequipo2);

    }

}
