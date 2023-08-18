package examen1p2_haroldcamas;

public class MedioCampo extends Jugador{

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
