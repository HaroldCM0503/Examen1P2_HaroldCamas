package examen1p2_haroldcamas;

public class MedioCampo extends Jugador{

    public MedioCampo() {
    }

    public MedioCampo(String nombre, int edad, String nacionalidad, String pieHabil, Equipo equipo) {
        super(nombre, edad, nacionalidad, pieHabil, equipo);
    }

    
    public MedioCampo(String nombre, int edad, String nacionalidad, String pieHabil, double rating, Equipo equipo, int agarre, int lanzamiento, int fisico, int ritmo, int entrada, int vision, int passing, int regate, int disparo) {
        super(nombre, edad, nacionalidad, pieHabil, rating, equipo, agarre, lanzamiento, fisico, ritmo, entrada, vision, passing, regate, disparo);
    }

    @Override
    public String toString() {
        return super.toString() + " MedioCampo";
    }
    
    

    @Override
    public Jugador noPropias(Jugador j) {
        j.setAgarre(randomNoPropio());
        j.setLanzamiento(randomNoPropio());
        j.setDisparo(randomNoPropio());
        j.setFisico(randomNoPropio());
        j.setRitmo(randomNoPropio());
        j.setEntrada(randomNoPropio());
        return j;
    }

    @Override
    public Jugador Propias(Jugador j) {
        j.setVision(randomPropio());
        j.setPassing(randomPropio());
        j.setRegate(randomPropio());
        return j;
    }
    
}
