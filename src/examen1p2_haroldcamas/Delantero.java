package examen1p2_haroldcamas;

public class Delantero extends Jugador{

    public Delantero() {
    }

    public Delantero(String nombre, int edad, String nacionalidad, String pieHabil, Equipo equipo) {
        super(nombre, edad, nacionalidad, pieHabil, equipo);
    }
    
    
    public Delantero(String nombre, int edad, String nacionalidad, String pieHabil, double rating, Equipo equipo, int agarre, int lanzamiento, int fisico, int ritmo, int entrada, int vision, int passing, int regate, int disparo) {
        super(nombre, edad, nacionalidad, pieHabil, rating, equipo, agarre, lanzamiento, fisico, ritmo, entrada, vision, passing, regate, disparo);
    }

    @Override
    public String toString() {
        return super.toString() + "Delantero{" + '}';
    }

    @Override
    public Jugador noPropias(Jugador j) {
        j.setAgarre(randomNoPropio());
        j.setLanzamiento(randomNoPropio());
        j.setFisico(randomNoPropio());
        j.setEntrada(randomNoPropio());
        j.setVision(randomNoPropio());
        j.setPassing(randomNoPropio());
        return j;
    }

    @Override
    public Jugador Propias(Jugador j) {
        j.setRitmo(randomPropio());
        j.setDisparo(randomPropio());
        j.setRegate(randomPropio());
        return j;
    }
    
}
