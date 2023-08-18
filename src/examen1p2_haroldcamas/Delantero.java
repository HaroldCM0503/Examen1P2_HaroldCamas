package examen1p2_haroldcamas;

public class Delantero extends Jugador{

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
