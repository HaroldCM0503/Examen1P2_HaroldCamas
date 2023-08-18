package examen1p2_haroldcamas;

public class Portero extends Jugador{

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
