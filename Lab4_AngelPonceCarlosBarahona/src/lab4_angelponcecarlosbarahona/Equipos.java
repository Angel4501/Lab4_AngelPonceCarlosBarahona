package lab4_angelponcecarlosbarahona;

import java.util.ArrayList;

public class Equipos {
    private String nombre, estadio, pais, nombreEntrenador, nombreDuen, nombreMascota, fechaCreacion, color;
    ArrayList<Jugadores> jugadores = new ArrayList();
    
    public Equipos(String nombre, String estadio, String pais, String nombreEntrenador, String nombreDuen, 
            String nombreMascota, String fechaCreacion, String Color, ArrayList<Jugadores> jugadores) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.pais = pais;
        this.nombreEntrenador = nombreEntrenador;
        this.nombreDuen = nombreDuen;
        this.nombreMascota = nombreMascota;
        this.fechaCreacion = fechaCreacion;
        this.color = Color;
        this.jugadores=jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getNombreDuen() {
        return nombreDuen;
    }

    public void setNombreDuen(String nombreDuen) {
        this.nombreDuen = nombreDuen;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String Color) {
        this.color = Color;
    }

    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }
    
    
    
}
