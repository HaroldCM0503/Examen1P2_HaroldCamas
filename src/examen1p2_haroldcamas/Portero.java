package examen1p2_haroldcamas;

public class Portero extends Jugador{

    public Portero() {
    }

    public Portero(String nombre, int edad, String nacionalidad, String pieHabil, Equipo equipo) {
        super(nombre, edad, nacionalidad, pieHabil, equipo);
    }
    
    
    public Portero(String nombre, int edad, String nacionalidad, String pieHabil, double rating, Equipo equipo, int agarre, int lanzamiento, int fisico, int ritmo, int entrada, int vision, int passing, int regate, int disparo) {
        super(nombre, edad, nacionalidad, pieHabil, rating, equipo, agarre, lanzamiento, fisico, ritmo, entrada, vision, passing, regate, disparo);
    }

    @Override
    public String toString() {
        return super.toString() + " Portero";
    }
    
    @Override
    public Jugador noPropias(Jugador j) {
        j.setFisico(randomNoPropio());
        j.setRitmo(randomNoPropio());
        j.setEntrada(randomNoPropio());
        j.setVision(randomNoPropio());
        j.setRegate(randomNoPropio());
        j.setDisparo(randomNoPropio());
        return j;
    }

    @Override
    public Jugador Propias(Jugador j) {
        j.setAgarre(randomPropio());
        j.setLanzamiento(randomPropio());
        j.setPassing(randomPropio());
        return j;
    }
    
}
