package com.mycompany.videogame;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AliensTest {
    @Test
    public void testSetvida(){
        Aliens aliens = new Aliens(30,"Alien32",50,30,40);
        int esperado = aliens.setVida(40,20);
        int resultado = aliens.setVida(40,20);
        Assert.assertEquals(esperado,resultado);
    }

    @Test
    public void testataque(){
        Aliens aliens = new Aliens(30,"Alien32",50,30,40);
        int poder = aliens.AtaqueMultiple();
        int esperado = aliens.ataque(poder);
        int resultado = aliens.ataque(poder);

        Assert.assertEquals(esperado,resultado);

    }

    @Test
    public void testataquemultiple(){
        Aliens aliens = new Aliens(30,"Alien32",50,30,40);
        int esperado = aliens.getFuerzaAlien();
        aliens.setFuerzaAlien(30);
        int resultado = aliens.getFuerzaAlien();
        assertEquals(esperado,resultado);
    }

    @Test
    public void testdefensadebil(){
        Aliens aliens = new Aliens(30,"Alien32",50,30,40);

        int esperado = aliens.Defensadebil();
        int resultado = (aliens.defensa + 10); // "10" Es la constante de la interfaz ficha 1

        assertEquals(esperado,resultado);
    }
}