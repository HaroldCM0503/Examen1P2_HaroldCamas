package examen1p2_haroldcamas;

import java.util.Random;

public abstract class Jugador {
    protected String nombre;
    protected int edad;
    protected String nacionalidad;
    protected String pieHabil;
    protected double rating;
    protected Equipo equipo;
    
    int agarre,lanzamiento,fisico,ritmo,entrada,vision,passing,regate,disparo;

    public Jugador() {
    }

    public Jugador(String nombre, int edad, String nacionalidad, String pieHabil, double rating, Equipo equipo, int agarre, int lanzamiento, int fisico, int ritmo, int entrada, int vision, int passing, int regate, int disparo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.pieHabil = pieHabil;
        this.rating = rating;
        this.equipo = equipo;
        this.agarre = agarre;
        this.lanzamiento = lanzamiento;
        this.fisico = fisico;
        this.ritmo = ritmo;
        this.entrada = entrada;
        this.vision = vision;
        this.passing = passing;
        this.regate = regate;
        this.disparo = disparo;
    }

    public Jugador(String nombre, int edad, String nacionalidad, String pieHabil, Equipo equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.pieHabil = pieHabil;
        this.equipo = equipo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPieHabil() {
        return pieHabil;
    }

    public void setPieHabil(String pieHabil) {
        this.pieHabil = pieHabil;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getAgarre() {
        return agarre;
    }

    public void setAgarre(int agarre) {
        this.agarre = agarre;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        this.ritmo = ritmo;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
        this.regate = regate;
    }

    public int getDisparo() {
        return disparo;
    }

    public void setDisparo(int disparo) {
        this.disparo = disparo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", pieHabil=" + pieHabil + ", rating=" + rating + ", equipo=" + equipo + ", agarre=" + agarre + ", lanzamiento=" + lanzamiento + ", fisico=" + fisico + ", ritmo=" + ritmo + ", entrada=" + entrada + ", vision=" + vision + ", passing=" + passing + ", regate=" + regate + ", disparo=" + disparo + '}';
    }
    
    public abstract Jugador noPropias(Jugador j);
    
    public abstract Jugador Propias(Jugador j);
    
    public double calcularRating(){
        return (agarre + lanzamiento + fisico + ritmo + entrada + vision + passing + regate + disparo)/9;
    }
    
    public int randomNoPropio(){
        Random rand = new Random();
        int rtg = rand.nextInt(5) + 1;
        rtg *= 13;
        return rtg;
    }
    
    public int randomPropio(){
        Random rand = new Random();
        int rtg = 0;
        
        while(rtg > 100 || rtg < 70){
            rtg = rand.nextInt(12) + 1;
            rtg *= 12;
        }
        return rtg;
    }
}
