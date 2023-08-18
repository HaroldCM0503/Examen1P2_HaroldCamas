package examen1p2_haroldcamas;

import java.util.ArrayList;

public class Equipo {
    String nombre;
    String pais;
    double rating;
    ArrayList<Jugador> plantilla = new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, String pais, double rating) {
        this.nombre = nombre;
        this.pais = pais;
        this.rating = rating;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> plantilla) {
        this.plantilla = plantilla;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", pais=" + pais + ", rating=" + rating + ", plantilla=" + plantilla + '}';
    }
    
    public double promedioRatings(){
        double promedio = 0;
        for (Jugador jugador : plantilla) {
            promedio += jugador.getRating();
        }
        promedio = promedio/plantilla.size();
        return promedio;
    }
}
