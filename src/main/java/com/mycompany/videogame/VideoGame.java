package com.mycompany.videogame;

public class VideoGame {

    public static void main(String[] args) {
        
    /*
        Ejemplo de un combate entre 2 personajes con ficha diferente.
    */
    Humanos humano = new Humanos(75,"Juan Pablo",100,40,50);
    SuperHumanos shumanos = new SuperHumanos(80,"Albeiro",100,50,70);
        
    int ataque = humano.AtaqueMultiple();    
    int defensa = humano.Defensadebil();
    int ataque2 = shumanos.Ataquesimple();
    int defensa2 = shumanos.Defensaferreo(); 
    
    int vida = shumanos.setVida(ataque, defensa2);
    int vida2 = shumanos.setVida(ataque2, defensa);
    
    System.out.println("Vida del super Humano"+vida);
    System.out.println("Vida del humano"+vida2);
    }
}
