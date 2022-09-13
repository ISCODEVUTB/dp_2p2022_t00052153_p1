package com.mycompany.videogame;

public class Aliens extends Personajes implements IFichaA {
    
    /*
    Clase que representa el tipo de personaje Alien
    */

    public int fuerzaAlien;

    public Aliens(int fuerzaAlien, String nombre, int vida, int defensa, int fuerza) {
        super(nombre, vida, defensa, fuerza);
        this.fuerzaAlien = fuerzaAlien;
    }

    public int getFuerzaAlien() {
        return fuerzaAlien;
    }

    public void setFuerzaAlien(int fuerzaAlien) {
        this.fuerzaAlien = fuerzaAlien;
    }

    @Override
    public int setVida(int a, int b) {
        int vida=100;
        if((a-b) > 0 ){
            vida= vida-(a-b);
        }else{
            vida=0;
        }
        return vida;        
    }

    @Override
    public int ataque() {
        int fuerza_total=0;
        fuerza_total= fuerza + fuerzaAlien + AtaqueMultiple();
        return fuerza_total;
    }

    @Override
    public int AtaqueMultiple() {
        int extrapoder=0;
        extrapoder = Humanos.Fuerzaextra;
        System.out.println("Alien Esta realizando un ataque multiple, con danio "+extrapoder);
        return extrapoder;
    }

    @Override
    public int Defensadebil() {
        int defensaextra=0;
        
        defensaextra = SuperHumanos.defensaExtra + defensa;
        System.out.println("Alien esta realizando una defensa ferrea, con efecto de "+ defensaextra);
        return defensaextra;
    }

    
    
}
