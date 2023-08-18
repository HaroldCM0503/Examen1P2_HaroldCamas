package examen1p2_haroldcamas;

public class Defensa extends Jugador{

    public Defensa() {
    }

    public Defensa(String nombre, int edad, String nacionalidad, String pieHabil, Equipo equipo) {
        super(nombre, edad, nacionalidad, pieHabil, equipo);
    }
    
    
    public Defensa(String nombre, int edad, String nacionalidad, String pieHabil, double rating, Equipo equipo, int agarre, int lanzamiento, int fisico, int ritmo, int entrada, int vision, int passing, int regate, int disparo) {
        super(nombre, edad, nacionalidad, pieHabil, rating, equipo, agarre, lanzamiento, fisico, ritmo, entrada, vision, passing, regate, disparo);
    }

    @Override
    public String toString() {
        return super.toString() + "Defensa{" + '}';
    }
    
    

    @Override
    public Jugador noPropias(Jugador j) {
        j.setAgarre(randomNoPropio());
        j.setLanzamiento(randomNoPropio());
        j.setPassing(randomNoPropio());
        j.setVision(randomNoPropio());
        j.setRegate(randomNoPropio());
        j.setDisparo(randomNoPropio());
        return j;
    }

    @Override
    public Jugador Propias(Jugador j) {
        j.setFisico(randomPropio());
        j.setRitmo(randomPropio());
        j.setEntrada(randomPropio());
        return j;
    }
    
}
