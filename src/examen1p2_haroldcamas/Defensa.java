package examen1p2_haroldcamas;

public class Defensa extends Jugador{

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
